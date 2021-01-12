package escribirJson;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import ComprobarPagina.comprobarPagina;

public class escribirJson {
	boolean PrimeraVez=true;
	private int contador=0;
	public void escribirJsonDiarios(String urlmandado, String NombreFichero) {

		comprobarPagina comprobar = new comprobarPagina();

		try {
			StringBuilder resultado = new StringBuilder();
			comprobar.comprobarPagina(urlmandado);
			URL url = new URL(urlmandado);

			HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
			conexion.setRequestMethod("GET");
			BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			String linea;
			FileWriter fichero = null;
			PrintWriter pw = null;
			try {
				fichero = new FileWriter(NombreFichero);
				pw = new PrintWriter(fichero);
				
				while ((linea = rd.readLine()) != null) {
					
					if (PrimeraVez) {
						
						if(contador==2) {
							pw.println("//["+linea);
							PrimeraVez=false;
						}
						contador++;
					} else if(linea.contains("//[")){
						pw.println(linea);
						PrimeraVez=true;
						contador=0;
					} else{
						pw.println(linea);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fichero)
						fichero.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("El link no existe");
		}

	}
	
	
	
	
	
	public void escribirJson(String urlmandado, String NombreFichero) {

		comprobarPagina comprobar = new comprobarPagina();

		try {
			StringBuilder resultado = new StringBuilder();
			comprobar.comprobarPagina(urlmandado);
			URL url = new URL(urlmandado);

			HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
			conexion.setRequestMethod("GET");
			BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			String linea;
			FileWriter fichero = null;
			PrintWriter pw = null;
			try {
				fichero = new FileWriter(NombreFichero);
				pw = new PrintWriter(fichero);
				while ((linea = rd.readLine()) != null) {
					if (linea.contains("jsonCallback")) {
						pw.println(linea.split("jsonCallback" + "\\(")[1]);
					} else if (linea.contains("]);")) {
						pw.println(linea.split("\\)" + "\\;")[0]);
					} else {
						pw.println(linea);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fichero)
						fichero.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("El link no existe");
		}

	}
}
