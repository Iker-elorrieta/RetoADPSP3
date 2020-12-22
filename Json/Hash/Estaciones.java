package Hash;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import ComprobarPagina.comprobarPagina;
import Insert.ConsultasHash;
import Objetos.Links;
import escribirJson.escribirJson;
import leerJson.leerJson;

//https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2020/es_def/adjuntos/estaciones.json
public class Estaciones {

	private final String nombreFichero="Estaciones.json";
	private final String link = "https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2020/es_def/adjuntos/estaciones.json";
	private comprobarPagina comprobar = new comprobarPagina();
	private escribirJson escribir = new escribirJson();
	private leerJson leer = new leerJson();
	private ConsultasHash consulta = new ConsultasHash();

	public boolean comprobarHashEstaciones() {
		try {
			comprobar.comprobarPagina(link);
			URL url;

			url = new URL(link);

			HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
			conexion.setRequestMethod("GET");
			BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));

			MessageDigest md = MessageDigest.getInstance("SHA");
			byte dataBytes[] = rd.toString().getBytes();
			md.update(dataBytes);
			byte resumen[] = md.digest();
			String hash = new String(resumen);
			if (!consulta.comprobarHash(link, hash)) {
				escribir.escribirJson(link, nombreFichero);
				JsonParser parser = new JsonParser();
				FileReader fr = new FileReader(nombreFichero);
				JsonElement datos = parser.parse(fr);
				leer.LeerJsonEstaciones(datos);
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
