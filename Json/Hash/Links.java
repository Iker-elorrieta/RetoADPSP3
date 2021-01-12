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
import Tablas.Municipios;
import XML.EscribirXml;
import escribirJson.escribirJson;
import leerJson.leerJson;

public class Links {
	private String nombreFichero = "";
	private String link = "";
	private comprobarPagina comprobar = new comprobarPagina();
	private escribirJson escribir = new escribirJson();
	private leerJson leer = new leerJson();
	private ConsultasHash consulta = new ConsultasHash();
	private EscribirXml escribirXML = new EscribirXml();
	
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }


	public boolean comprobarHashLinks(ArrayList<Objetos.Links> links,ArrayList<Tablas.DatosCalidad> datosCalidad) {
		
		for (int x = 0; x < links.size() - 1; x++) {
			try {
				link=links.get(x).getLink();
				nombreFichero=links.get(x).getNombreFichero();
				comprobar.comprobarPagina(link);
				URL url;

				url = new URL(link);

				HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
				conexion.setRequestMethod("GET");
				InputStream is = new URL(link).openStream();
				BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			    String jsonText = readAll(rd);
			    

				MessageDigest md = MessageDigest.getInstance("SHA");
				byte dataBytes[] = jsonText.getBytes();
				md.update(dataBytes);
				byte resumen[] = md.digest();
				String hash = new String(resumen);
				if (!consulta.comprobarHash(link, hash)) {
					escribir.escribirJson(link, nombreFichero);
					JsonParser parser = new JsonParser();
					FileReader fr = new FileReader(nombreFichero);
					JsonElement datos = parser.parse(fr);
					SessionFactory sesion = HibernateUtil.getSessionFactory();
					 Session session = sesion.openSession();
					 session.beginTransaction();
					 String hql = "from Estaciones as est where Nombre = '" + links.get(x).getNombrePueblo().replace("_", " ") +"'";
					 Query q = session.createQuery(hql);
					 Tablas.Estaciones estacion = (Tablas.Estaciones) q.uniqueResult();
					leer.LeerJsonLinks(datos,"",datosCalidad,estacion);
					escribirXML.convertJsonToXml(nombreFichero, "Datos_De_Calidad", "Dato_De_Calidad", nombreFichero.replace(".json", ".xml"), "");
				}

			} catch (IOException e) {
				System.out.println("el link no existe");

			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();

			}
		}
		return true;
	}

}
