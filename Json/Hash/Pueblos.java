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

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import ComprobarPagina.comprobarPagina;
import Insert.ConsultasHash;
import XML.EscribirXml;
import escribirJson.escribirJson;
import hilos.HiloCrearXml;
import leerJson.leerJson;

//https://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/pueblos_euskadi_turismo/opendata/pueblos.json
public class Pueblos {
	private final String nombreFichero="Pueblos.json";
	private final String link = "https://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/pueblos_euskadi_turismo/opendata/pueblos.json";
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

	
	public boolean comprobarHashPueblos(ArrayList<Tablas.Municipios> municipios,ArrayList<Tablas.Provincias> provincias) {
		
		try {
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
				HiloCrearXml crearXml = new HiloCrearXml(nombreFichero, "Pueblo", "Pueblos");
				crearXml.start();
				leer.LeerJsonPueblos(datos, "",municipios,provincias);
				
			}

			return true;

		} catch (IOException e) {
			return false;

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			return false;
		}

	}
}
