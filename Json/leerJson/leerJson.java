package leerJson;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import Insert.HibernateUtil;
import Objetos.Links;
import Tablas.DatosCalidad;
import Tablas.EspaciosNaturales;
import Tablas.EstaEn;
import Tablas.EstaEnId;
import Tablas.Estaciones;
import Tablas.Municipios;
import Tablas.Provincias;

public class leerJson {
	private static boolean seguir = true;
	private String Atributo;
	private boolean atributoName;
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
	
	
	public String LeerJsonDiarios(JsonElement elemento, ArrayList<Links> enlazes, String nombre) {

		Links link = new Links();
		if (elemento.isJsonObject()) {
			JsonObject obj = elemento.getAsJsonObject();
			java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
			java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
			while (iter.hasNext()) {

				java.util.Map.Entry<String, JsonElement> entrada = iter.next();
				Atributo = entrada.getKey();
				if (Atributo.equals(name)) {
					atributoName = true;
				}
				nombre = LeerJsonDiarios(entrada.getValue(), enlazes, nombre);
			}

		} else if (elemento.isJsonArray()) {
			JsonArray array = elemento.getAsJsonArray();
			System.out.println("Array. Numero de elementos: " + array.size());
			java.util.Iterator<JsonElement> iter = array.iterator();
			while (iter.hasNext()) {
				JsonElement entrada = iter.next();
				nombre = LeerJsonDiarios(entrada, enlazes, nombre);
			}
		} else if (elemento.isJsonPrimitive()) {
			JsonPrimitive valor = elemento.getAsJsonPrimitive();
			if (valor.isBoolean()) {
				
			} else if (valor.isNumber()) {
				
			} else if (valor.isString()) {

				if (atributoName) {
					link = new Links();
					nombre = valor.getAsString();
					atributoName = false;
				}
					if (valor.getAsString().contains("datos_indice")) {
						link.setNombreFichero("datos_indice/" + nombre + ".json");
						link.setLink(valor.getAsString());
						
						link.setNombrePueblo(nombre);
						
						enlazes.add(link);
						System.out.println(" Enlaze guardado: " + valor.getAsString());
					}
					
				}
			
		} else if (elemento.isJsonNull()) {
			System.out.println("Es NULL");
		} else {
			System.out.println("Es otra cosa");
		}
		return nombre;
	}

	private int codEstacion = 1;
	private Estaciones estacion = new Estaciones();

	public String LeerJsonEstaciones(JsonElement elemento, String nombre, ArrayList<Estaciones> estaciones) {

		Links link = null;
		if (elemento.isJsonObject()) {
			
			JsonObject obj = elemento.getAsJsonObject();
			java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
			java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
			while (iter.hasNext()) {
				java.util.Map.Entry<String, JsonElement> entrada = iter.next();
				Atributo = entrada.getKey();
				nombre = Atributo.toString();
				nombre = LeerJsonEstaciones(entrada.getValue(), nombre, estaciones);
			}

		} else if (elemento.isJsonArray()) {
			JsonArray array = elemento.getAsJsonArray();
			java.util.Iterator<JsonElement> iter = array.iterator();
			while (iter.hasNext()) {
				JsonElement entrada = iter.next();
				nombre = LeerJsonEstaciones(entrada, nombre, estaciones);
			}


		} else if (elemento.isJsonPrimitive()) {
			JsonPrimitive valor = elemento.getAsJsonPrimitive();
			if (valor.isBoolean()) {
				
			} else if (valor.isNumber()) {
				
			} else if (valor.isString()) {
				switch(nombre) {
				case Name:
					estacion.setNombre(valor.getAsString());
					break;
				case Town:
					SessionFactory sesion = HibernateUtil.getSessionFactory();
					Session session = sesion.openSession();
					session.beginTransaction();
					String hql = "from Municipios as mun where nombre = '" + valor.getAsString() + "'";
					Query q = session.createQuery(hql);
					Municipios municipio = (Municipios) q.uniqueResult();
					estacion.setMunicipios(municipio);
					session.close();
					break;
				case Address:
					estacion.setDireccion(valor.getAsString());
					break;
				case CoordenatesXETRS89:
					estacion.setCoordenadaX(Float.parseFloat(valor.getAsString().replace(",", ".")));
					break;
				case CoordenatesYETRS89:
					estacion.setCoordenadaY(Float.parseFloat(valor.getAsString().replace(",", ".")));
					break;
				case Latitude:
					estacion.setLatitud(Float.parseFloat(valor.getAsString().replace(",", ".")));
					break;
				case Longitude:
					estacion.setLongitud(Float.parseFloat(valor.getAsString().replace(",", ".")));
					estacion.setCodEstacion(codEstacion);

					estaciones.add(estacion);
					estacion = new Estaciones();
					codEstacion++;
					break;
				}
				
			
			}

		} else if (elemento.isJsonNull()) {
			System.out.println("Es NULL");
		} else {
			System.out.println("Es otra cosa");
		}
		return nombre;
	}

	private EspaciosNaturales espaciosNaturales = new EspaciosNaturales();
	private EstaEn estaEn = new EstaEn();
	private EstaEnId estaEnId = new EstaEnId();
	private int codigoEspacio = 1;
	private boolean estaVacio = false;

	public String LeerJsonPlayas(JsonElement elemento, String nombre, ArrayList<EspaciosNaturales> espacios,
			ArrayList<EstaEn> estanEn) {

		Links link = null;
		if (elemento.isJsonObject()) {
			JsonObject obj = elemento.getAsJsonObject();
			java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
			java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
			while (iter.hasNext()) {
				java.util.Map.Entry<String, JsonElement> entrada = iter.next();
				Atributo = entrada.getKey();
				nombre = Atributo.toString();
				nombre = LeerJsonPlayas(entrada.getValue(), nombre, espacios, estanEn);
			}

		} else if (elemento.isJsonArray()) {
			JsonArray array = elemento.getAsJsonArray();
			System.out.println("Array. Numero de elementos: " + array.size());
			java.util.Iterator<JsonElement> iter = array.iterator();
			while (iter.hasNext()) {
				JsonElement entrada = iter.next();
				nombre = LeerJsonPlayas(entrada, nombre, espacios, estanEn);
			}
		} else if (elemento.isJsonPrimitive()) {
			JsonPrimitive valor = elemento.getAsJsonPrimitive();
			if (valor.isBoolean()) {
				
			} else if (valor.isNumber()) {
				
			} else if (valor.isString()) {
				
				switch(nombre) {
				case documentName:
					espaciosNaturales.setNombreEspacio(valor.getAsString());
					break;
				case marks:
					espaciosNaturales.setMarca(valor.getAsString());
					break;
				case templateType:
					espaciosNaturales.setNatureType(valor.getAsString());
					break;
				case latwgs84:
					if (valor.getAsString().equals("")) {
						estaVacio = true;
					} else {
						espaciosNaturales.setLatwgs84(valor.getAsFloat());
					}
					break;
				case lonwgs84:
					if (!valor.getAsString().equals(""))
						espaciosNaturales.setLongwgs84(valor.getAsFloat());
					break;
				case municipality:
					if (!estaVacio) {
						espaciosNaturales.setCodEspacio(codigoEspacio);
						SessionFactory sesion = HibernateUtil.getSessionFactory();
						Session session = sesion.openSession();
						session.beginTransaction();
						String hql = "from Municipios as mun where nombre = '" + valor.getAsString() + "'";
						Query q = session.createQuery(hql);
						Municipios municipio = (Municipios) q.uniqueResult();
						estaEn.setMunicipios(municipio);
						estaEn.setEspaciosNaturales(espaciosNaturales);
						estaEnId.setCodCiudad(estaEn.getMunicipios().getCodMunicipio());
						estaEnId.setCodEspacio(estaEn.getEspaciosNaturales().getCodEspacio());
						estaEn.setId(estaEnId);
						espacios.add(espaciosNaturales);
						estanEn.add(estaEn);
						session.close();
						codigoEspacio++;
					}
					espaciosNaturales = new EspaciosNaturales();
					estaEn = new EstaEn();
					estaEnId = new EstaEnId();
					estaVacio = false;
					break;
				}
				
			}

		} else if (elemento.isJsonNull()) {
			System.out.println("Es NULL");
		} else {
			System.out.println("Es otra cosa");
		}
		return nombre;
	}

	private int CodMunicipio = 1;
	private Municipios municipio = new Municipios();
	private Provincias provincia = new Provincias();
	private String[] nombreMuni;
	boolean mismoNombre = false;

	public String LeerJsonPueblos(JsonElement elemento, String nombre,ArrayList<Tablas.Municipios> municipios,ArrayList<Tablas.Provincias> provincias) {
			
			int x=1;
			if (elemento.isJsonObject()) {
				JsonObject obj = elemento.getAsJsonObject();
				java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
				java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
				while (iter.hasNext()) {
					java.util.Map.Entry<String, JsonElement> entrada = iter.next();
					Atributo = entrada.getKey();
					nombre = Atributo.toString();
					nombre=LeerJsonPueblos(entrada.getValue(),nombre,municipios,provincias);
				}

			} else if (elemento.isJsonArray()) {
				JsonArray array = elemento.getAsJsonArray();
				System.out.println("Array. Numero de elementos: " + array.size());
				java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonElement entrada = iter.next();
					nombre=LeerJsonPueblos(entrada,nombre,municipios,provincias);
				}
			} else if (elemento.isJsonPrimitive()) {
				JsonPrimitive valor = elemento.getAsJsonPrimitive();
				if (valor.isBoolean()) {
					
				} else if (valor.isNumber()) {
					
					if(nombre.equals("municipalitycode")) {
						municipio.setCodMunicipio(Integer.parseInt(valor.getAsString().split(" ")[0]));
					}//fin if municipality code.
				} else if (valor.isString()) {
					
						
					
					switch(nombre){
						case municipality:
							mismoNombre=false;
							nombreMuni= valor.getAsString().split(" ");
							nombre = nombreMuni[0];
							x=1;
							//Revision de que el nombre no se repita
							if(nombreMuni.length!=x) {
							while(x<nombreMuni.length-1 && !mismoNombre){
								if(nombreMuni[0].equals(nombreMuni[x])){
									mismoNombre=true;
								}else {
									nombre=nombre+" "+nombreMuni[x];
								}
								
								x++;
							}
							}
							
						
							
							municipio.setNombre(nombre);
							
					
							
							break;
						case municipalitycode:
							municipio.setCodMunicipio(CodMunicipio);
							CodMunicipio++;
							break;
						case territory:
							mismoNombre=false;
							nombreMuni= valor.getAsString().split(" ");
							nombre = nombreMuni[0];
							x=1;
							//Revision de que el nombre no se repita
							if(nombreMuni.length!=x) {
							while(x<nombreMuni.length-1 && !mismoNombre){
								if(nombreMuni[0].equals(nombreMuni[x])){
									mismoNombre=true;
								}else {
									nombre=nombre+" "+nombreMuni[x];
								}
								
								x++;
							}}
							provincia.setNombre(nombre);
							
						break;
						case territorycode:
							provincia.setCodProvincia(Integer.parseInt(valor.getAsString().split(" ")[0]));
							municipio.setProvincias(provincia);
							provincias.add(provincia);
							municipios.add(municipio);
							provincia=new Provincias();
							municipio=new Municipios();
							break;
					}
				}

			} else if (elemento.isJsonNull()) {
				System.out.println("Es NULL");
			} else {
				System.out.println("Es otra cosa");
			}
			return nombre;
		}

	private DatosCalidad datosDeCalidad = new DatosCalidad();
	
	public String v(JsonElement elemento, String nombre, ArrayList<DatosCalidad> datosCalidad,
			Estaciones estaciones) {
		if (seguir) {
			Links link = null;
			if (elemento.isJsonObject()) {
				JsonObject obj = elemento.getAsJsonObject();
				java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
				java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
				while (iter.hasNext()) {
					java.util.Map.Entry<String, JsonElement> entrada = iter.next();
					Atributo = entrada.getKey();
					nombre = Atributo.toString();
					nombre = LeerJsonLinks(entrada.getValue(), nombre, datosCalidad, estaciones);
				}

			} else if (elemento.isJsonArray()) {
				JsonArray array = elemento.getAsJsonArray();
				System.out.println("Array. Numero de elementos: " + array.size());
				java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonElement entrada = iter.next();
					nombre = LeerJsonLinks(entrada, nombre, datosCalidad, estaciones);
				}
			} else if (elemento.isJsonPrimitive()) {
				JsonPrimitive valor = elemento.getAsJsonPrimitive();
				if (valor.isBoolean()) {
					
				} else if (valor.isNumber()) {
					
				} else if (valor.isString()) {
					if (valor.getAsString().contains("07/01/2021")) {

						seguir = false;
					} else {
						switch (nombre) {
						case Date:
							if (datosDeCalidad.getFecha() != null) {
								datosDeCalidad.setEstaciones(estaciones);
								datosCalidad.add(datosDeCalidad);
								datosDeCalidad = new DatosCalidad();
								
							}
							SimpleDateFormat parseador = new SimpleDateFormat("dd/MM/yyyy");
							Date date = null;
							try {
								date = parseador.parse(valor.getAsString());
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								
							}
							datosDeCalidad.setFecha(date);
							break;

						case Hour:
							SimpleDateFormat parseador2 = new SimpleDateFormat("hh:mm");
							Date date2 = null;
							try {
								date2 = parseador2.parse(valor.getAsString());
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								
							}
							datosDeCalidad.setHora(date2);
							break;
						case COmgm3:
							datosDeCalidad.setComgM3(Float.parseFloat(valor.getAsString().replace(",", ".")));
							break;
						case CO8hmgm3:
							datosDeCalidad.setCo8hmgM3(Float.parseFloat(valor.getAsString().replace(",", ".")));
							break;
						case NOgm3:
							datosDeCalidad.setNogm3(valor.getAsInt());
							break;
						case NO2:
							datosDeCalidad.setNo2(valor.getAsInt());
							break;
						case NO2gm3:
							datosDeCalidad.setNo2(valor.getAsInt());
							break;
						case NO2ICA:
							datosDeCalidad.setNo2ica(valor.getAsString());
							break;
						case NOXgm3:
							datosDeCalidad.setNoxgm3(valor.getAsInt());
							break;
						case PM10:
							datosDeCalidad.getPm10();
							break;
						case PM10ICA:
							datosDeCalidad.setPm10ica(valor.getAsString());
							break;
						case PM25:
							datosDeCalidad.setPm25(Float.parseFloat(valor.getAsString().replace(",", ".")));
							break;
						case PM25ICA:
							datosDeCalidad.setPm25ica(valor.getAsString());
							break;
						case SO2:
							datosDeCalidad.setSo2(Float.parseFloat(valor.getAsString().replace(",", ".")));
							break;
						case SO2ICA:
							datosDeCalidad.setSo2ica(valor.getAsString());
							break;
						case ICAEstacion:
							datosDeCalidad.setIcastation(valor.getAsString());
							break;

						}
					} // fin de Date

				}

			} else if (elemento.isJsonNull()) {
				System.out.println("Es NULL");
			} else {
				System.out.println("Es otra cosa");
			}
		}
		return nombre;
	}

}



