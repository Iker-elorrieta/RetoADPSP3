package Hash;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import ComprobarPagina.comprobarPagina;
import Insert.ConsultasHash;
import Insert.HibernateUtil;
import Tablas.DatosCalidad;
import Tablas.Estaciones;
import Tablas.Municipios;
import XML.EscribirXml;
import escribirJson.escribirJson;
import hilos.HiloAnadirDatosCalidad;
import hilos.HiloCrearXml;
import leerJson.leerJson;

public class Links {
	private String nombreFichero = "";
	private String linkS = "";
	private comprobarPagina comprobar = new comprobarPagina();
	private escribirJson escribir = new escribirJson();
	private leerJson leer = new leerJson();
	private ConsultasHash consulta = new ConsultasHash();
	private EscribirXml escribirXML = new EscribirXml();
	private HiloAnadirDatosCalidad hiloAnadir;
	public static int codigoCalidad=0;
	
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }


	public boolean comprobarHashLinks(ArrayList<Objetos.Links> links,ArrayList<Tablas.DatosCalidad> datosCalidad) {
		
		for (Objetos.Links link : links) {
			try {
				linkS=link.getLink();
				nombreFichero=link.getNombreFichero();
				comprobar.comprobarPagina(linkS);
				URL url;

				url = new URL(linkS);

				HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
				conexion.setRequestMethod("GET");
				InputStream is = new URL(linkS).openStream();
				BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			    String jsonText = readAll(rd);
			    

				MessageDigest md = MessageDigest.getInstance("SHA");
				byte dataBytes[] = jsonText.getBytes();
				md.update(dataBytes);
				byte resumen[] = md.digest();
				String hash = new String(resumen);
				if (!consulta.comprobarHash(linkS, hash)) {
					Tablas.Estaciones estacion=new Estaciones();
					escribir.escribirJson(linkS, nombreFichero);
					JsonParser parser = new JsonParser();
					FileReader fr = new FileReader(nombreFichero);
					JsonElement datos = parser.parse(fr);
					SessionFactory sesion = HibernateUtil.getSessionFactory();
					 Session session = sesion.openSession();
					 session.beginTransaction();
					 if(link.getNombrePueblo().contains("M_DIAZ_HARO")) {
						 String hql = "from Estaciones as est where Nombre = '"+link.getNombrePueblo().replace("M_DIAZ_HARO", "Mª DIAZ HARO") + "'";
						 Query q = session.createQuery(hql);
						 estacion = (Tablas.Estaciones) q.uniqueResult();
					 }
					 else if(link.getNombrePueblo().contains("_")) {
					 String hql = "from Estaciones as est where Nombre = '"+link.getNombrePueblo().replace("_", " ") + "'";
					 Query q = session.createQuery(hql);
					 estacion = (Tablas.Estaciones) q.uniqueResult();
					 if(estacion == null) {
						 String hql2 = "from Estaciones as est where Nombre = '"+link.getNombrePueblo().replace("_", " (") + ")" + "'";
						 Query q2 = session.createQuery(hql2);
						 estacion = (Tablas.Estaciones) q2.uniqueResult();
						 if(estacion == null) {
							 String hql3 = "from Estaciones as est where Nombre = '"+link.getNombrePueblo().replace("_", ". ") + "'";
							 Query q3 = session.createQuery(hql3);
							 estacion = (Tablas.Estaciones) q3.uniqueResult();
						 }
					 }
					 }else {
						 String hql = "from Estaciones as est where Nombre = '"+link.getNombrePueblo() + "'";
						 Query q = session.createQuery(hql);
						 estacion = (Tablas.Estaciones) q.uniqueResult();

					 }
					
					 HiloCrearXml crearXml = new HiloCrearXml(nombreFichero, "Datos_De_Calidad", "Dato_De_Calidad");
						crearXml.start();
						leer.LeerJsonLinks(datos,"",datosCalidad,estacion);
						
						
					
					}
				

			} catch (IOException e) {
				System.out.println("el link no existe");

			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();

			}
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
