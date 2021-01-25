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
	final private String name = "name";
	final private String Name = "Name";
	final private String Town = "Town";
	final private String Address = "Address";
	final private String CoordenatesXETRS89 = "CoordenatesXETRS89";
	final private String CoordenatesYETRS89 = "CoordenatesYETRS89";
	final private String Latitude = "Latitude";
	final private String Longitude = "Longitude";
	final private String documentName = "documentName";
	final private String marks = "marks";
	final private String templateType = "templateType";
	final private String latwgs84 = "latwgs84";
	final private String municipality = "municipality";
	final private String municipalitycode = "municipalitycode";
	final private String territory = "territory";
	final private String territorycode = "territorycode";
	final private String Date = "Date";
	final private String Hour = "Hour";
	final private String COmgm3 = "COmgm3";
	final private String CO8hmgm3 = "CO8hmgm3";
	final private String lonwgs84 = "lonwgs84";
	final private String NOgm3 = "NOgm3";
	final private String NO2 = "NO2";
	final private String NO2gm3 = "NO2gm3";
	final private String NO2ICA = "NO2ICA";
	final private String NOXgm3 = "NOXgm3";
	final private String PM10 = "PM10";
	final private String PM10ICA = "PM10ICA";
	final private String PM25 = "PM25";
	final private String PM25ICA = "PM25ICA";
	final private String SO2 = "SO2";
	final private String SO2ICA = "SO2ICA";
	final private String ICAEstacion = "ICAEstacion";
	final private String URL = "url";
	final private String O3gm3 = "O3gm3";
	final private String O3ICA = "O3ICA";
	final private String O38hgm3 = "O38hgm3";
	//Ibai revisa con contains para agregar los datos que quieres guardar.
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
						
						if(contador==3) {
							pw.println("["+linea);
							PrimeraVez=false;
						}
						contador++;
					} else if(linea.contains("]")){
						pw.println(linea);
						PrimeraVez=true;
						contador=0;
					} else{
						if (linea.contains(URL)) {
							pw.println(linea);
						}else if(linea.contains(name)) {
							pw.println(linea);
						}else if (linea.contains("}")) {
							pw.println(linea);
						}else if (linea.contains("{")) {
							pw.println(linea);
						}
						
					}
				}

			} catch (Exception e) {
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fichero)
						fichero.close();
				} catch (Exception e2) {
				}
			}

		} catch (MalformedURLException e) {
		} catch (IOException e) {
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
					} else if (linea.contains("},")) {
						pw.println(linea);
					} else if(linea.contains(Name)) {
						pw.println(linea);
					}else if (linea.contains(Town)) {
						pw.println(linea);
					}else if(linea.contains(Address)) {
						pw.println(linea);
					}else if(linea.contains(CoordenatesXETRS89)) {
						pw.println(linea);
					}else if(linea.contains(CoordenatesYETRS89)) {
						pw.println(linea);
					}else if(linea.contains(Latitude)) {
						pw.println(linea);
					}else if(linea.contains(Longitude)) {
						pw.println(linea);
					}else if (linea.contains(marks)) {
						pw.println(linea);
					}else if (linea.contains(templateType)) {
						pw.println(linea);
					}else if (linea.contains(latwgs84)) {
						pw.println(linea);
					}else if (linea.contains(lonwgs84)) {
						pw.println(linea);
					}else if (linea.contains(municipalitycode)) {
						pw.println(linea);
					}else if (linea.contains(municipality)) {
						pw.println(linea);
					}else if (linea.contains(territorycode)) {
						pw.println(linea.split(",")[0]);
					}else if (linea.contains(territory)) {
						pw.println(linea);
					}else if (linea.contains(Date)) {
						pw.println(linea);
					}else if (linea.contains(Hour)) {
						pw.println(linea);
					}else if (linea.contains(COmgm3)) {
						pw.println(linea);
					}else if (linea.contains(CO8hmgm3)) {
						pw.println(linea);
					}else if (linea.contains(lonwgs84)) {
						pw.println(linea);
					}else if (linea.contains(NOgm3)) {
						pw.println(linea);
					}else if (linea.contains(NO2)) {
						pw.println(linea);
					}else if (linea.contains(NO2gm3)) {
						pw.println(linea);
					}else if (linea.contains(NO2ICA)) {
						pw.println(linea);
					}else if (linea.contains(NOXgm3)) {
						pw.println(linea);
					}else if (linea.contains(PM10)) {
						pw.println(linea);
					}else if (linea.contains(PM10ICA)) {
						pw.println(linea);
					}else if (linea.contains(PM25)) {
						pw.println(linea);
					}else if (linea.contains(PM25ICA)) {
						pw.println(linea);
					}else if (linea.contains(SO2)) {
						pw.println(linea);
					}else if (linea.contains(SO2ICA)) {
						pw.println(linea);
					}else if (linea.contains(ICAEstacion)) {
						pw.println(linea);
					}else if (linea.contains(O3gm3)) {
						pw.println(linea);
					}else if (linea.contains(O3ICA)) {
						pw.println(linea);
					}else if (linea.contains(O38hgm3)) {
						pw.println(linea);
					}
				}

			} catch (Exception e) {
			} finally {
				try {
					// Nuevamente aprovechamos el finally para
					// asegurarnos que se cierra el fichero.
					if (null != fichero)
						fichero.close();
				} catch (Exception e2) {
				}
			}

		} catch (MalformedURLException e) {
		} catch (IOException e) {
		}

	}
}
