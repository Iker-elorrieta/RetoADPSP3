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
import escribirJson.escribirJson;
import leerJson.leerJson;

public class Links {
	private String nombreFichero = "";
	private String link = "";
	private comprobarPagina comprobar = new comprobarPagina();
	private escribirJson escribir = new escribirJson();
	private leerJson leer = new leerJson();
	private ConsultasHash consulta = new ConsultasHash();

	public boolean comprobarHashLinks(ArrayList<Objetos.Links> links) {

		for (int x = 0; x < links.size() - 1; x++) {
			try {
				link=links.get(x).getLink();
				nombreFichero=links.get(x).getNombreFichero();
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
					leer.LeerJsonLinks(datos);
				}

			} catch (IOException e) {
				e.printStackTrace();

			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();

			}
		}
		return true;
	}

}
