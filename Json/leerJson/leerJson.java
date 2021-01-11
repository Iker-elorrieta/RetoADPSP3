package leerJson;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import Insert.HibernateUtil;
import Objetos.Links;
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
	public String LeerJsonDiarios(JsonElement elemento, ArrayList<Links> enlazes,String nombre) {
		
			Links link = new Links();
			if (elemento.isJsonObject()) {
				System.out.println("Objeto");
				JsonObject obj = elemento.getAsJsonObject();
				java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
				java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
				while (iter.hasNext()) {
					
					java.util.Map.Entry<String, JsonElement> entrada = iter.next();
					Atributo = entrada.getKey();
					if (Atributo.equals("name")) {
						atributoName=true;
					}
					nombre=LeerJsonDiarios(entrada.getValue(), enlazes,nombre);
				}

			} else if (elemento.isJsonArray()) {
				JsonArray array = elemento.getAsJsonArray();
				System.out.println("Array. Numero de elementos: " + array.size());
				java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonElement entrada = iter.next();
					nombre=LeerJsonDiarios(entrada, enlazes,nombre);
				}
			} else if (elemento.isJsonPrimitive()) {
				JsonPrimitive valor = elemento.getAsJsonPrimitive();
				if (valor.isBoolean()) {
					System.out.println("       Boolean " + valor.getAsBoolean());
				} else if (valor.isNumber()) {
					System.out.println("       Numero: " + valor.getAsNumber());
				} else if (valor.isString()) {
					
					if (atributoName) {
						link = new Links();
						nombre=valor.getAsString();
						atributoName=false;
					}
					if (valor.getAsString().contains("http")) {
						if (valor.getAsString().contains("datos_horarios")) {
							link.setNombreFichero("datos_horarios/" + nombre + ".json");
						} else if (valor.getAsString().contains("datos_diarios")) {
							link.setNombreFichero("datos_diarios/" + nombre + ".json");
						} else if (valor.getAsString().contains("datos_indice")) {
							link.setNombreFichero("datos_indice/" + nombre + ".json");
						}
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
	
	private int codEstacion =1;
	private Estaciones estacion= new Estaciones();
	public String LeerJsonEstaciones(JsonElement elemento,String nombre,ArrayList<Estaciones> estaciones) {
	
			Links link = null;
			if (elemento.isJsonObject()) {
				System.out.println("Objeto");
				JsonObject obj = elemento.getAsJsonObject();
				java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
				java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
				while (iter.hasNext()) {
					java.util.Map.Entry<String, JsonElement> entrada = iter.next();
					Atributo = entrada.getKey();
					nombre=Atributo.toString();
					nombre=LeerJsonEstaciones(entrada.getValue(),nombre,estaciones);
				}

			} else if (elemento.isJsonArray()) {
				JsonArray array = elemento.getAsJsonArray();
				System.out.println("Array. Numero de elementos: " + array.size());
				java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonElement entrada = iter.next();
					nombre=LeerJsonEstaciones(entrada,nombre,estaciones);
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//REVISALO IBAI GILIPOLLAS
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			} else if (elemento.isJsonPrimitive()) {
				JsonPrimitive valor = elemento.getAsJsonPrimitive();
				if (valor.isBoolean()) {
					System.out.println("       Boolean " + valor.getAsBoolean());
				} else if (valor.isNumber()) {
					System.out.println("       Numero: " + valor.getAsNumber());
				} else if (valor.isString()) {
						System.out.println(" Enlaze guardado: " + valor.getAsString());
						if (nombre.equals("Name")) {
							estacion.setNombre(valor.getAsString());
						}//Fin del if del Nombre
						else if(nombre.equals("Town")) {
							 SessionFactory sesion = HibernateUtil.getSessionFactory();
							 Session session = sesion.openSession();
							 session.beginTransaction();
							 String hql = "from Municipios as mun where nombre = '" + valor.getAsString()+"'";
							 Query q = session.createQuery(hql);
							 Municipios municipio = (Municipios) q.uniqueResult();
							 estacion.setMunicipios(municipio);
							 session.close();
						}//Fin del Town
						else if(nombre.equals("Address")) {
							estacion.setDireccion(valor.getAsString());
						}//Fin del Address
						else if(nombre.equals("CoordenatesXETRS89")) {
							estacion.setCoordenadaX(Float.parseFloat(valor.getAsString().replace(",", ".")));
						}//Fin cordenada x
						else if (nombre.equals("CoordenatesYETRS89")) {
							estacion.setCoordenadaY(Float.parseFloat(valor.getAsString().replace(",", ".")));
						}//Fin cordenada y
						else if(nombre.equals("Latitude")) {
							estacion.setLatitud(Float.parseFloat(valor.getAsString().replace(",", ".")));
						}//Fin Latitud
						else if(nombre.equals("Longitude")) {
							estacion.setLongitud(Float.parseFloat(valor.getAsString().replace(",", ".")));
							estacion.setCodEstacion(codEstacion);
							
							estaciones.add(estacion);
							estacion = new Estaciones();
							codEstacion++;
						
						}//Fin longitud		
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
	private boolean estaVacio=false;
	public String LeerJsonPlayas(JsonElement elemento,String nombre,ArrayList<EspaciosNaturales> espacios,ArrayList<EstaEn> estanEn) {
	
			Links link = null;
			if (elemento.isJsonObject()) {
				System.out.println("Objeto");
				JsonObject obj = elemento.getAsJsonObject();
				java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
				java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
				while (iter.hasNext()) {
					java.util.Map.Entry<String, JsonElement> entrada = iter.next();
					Atributo = entrada.getKey();
					nombre=Atributo.toString();
					nombre=LeerJsonPlayas(entrada.getValue(),nombre,espacios,estanEn);
				}

			} else if (elemento.isJsonArray()) {
				JsonArray array = elemento.getAsJsonArray();
				System.out.println("Array. Numero de elementos: " + array.size());
				java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonElement entrada = iter.next();
					nombre=LeerJsonPlayas(entrada,nombre,espacios,estanEn);
				}
			} else if (elemento.isJsonPrimitive()) {
				JsonPrimitive valor = elemento.getAsJsonPrimitive();
				if (valor.isBoolean()) {
					System.out.println("       Boolean " + valor.getAsBoolean());
				} else if (valor.isNumber()) {
					System.out.println("       Numero: " + valor.getAsNumber());
				} else if (valor.isString()) {
						System.out.println(" Enlaze guardado: " + valor.getAsString());
						
						if (nombre.equals("documentName")) {
							espaciosNaturales.setNombreEspacio(valor.getAsString());
						}//Fin del Nombre del espacioNatural
						else if(nombre.equals("marks")) {
							espaciosNaturales.setMarca(valor.getAsString());
						}//Fin marka
						else if(nombre.equals("templateType")) {
							espaciosNaturales.setNatureType(valor.getAsString());
						}//Fin nature type
						else if(nombre.equals("latwgs84")) {
							if (valor.getAsString().equals("")){
								estaVacio=true;
							}else {
							espaciosNaturales.setLatwgs84(valor.getAsFloat());
							}
						}//fin latwgs84
						else if(nombre.equals("lonwgs84")) {
							if (!valor.getAsString().equals(""))
							espaciosNaturales.setLongwgs84(valor.getAsFloat());
						}//fin lonwgs84
						else if(nombre.equals("municipality")) {
							if(!estaVacio) {
							espaciosNaturales.setCodEspacio(codigoEspacio);
							 SessionFactory sesion = HibernateUtil.getSessionFactory();
							 Session session = sesion.openSession();
							 session.beginTransaction();
							 String hql = "from Municipios as mun where nombre = '" + valor.getAsString()+"'";
							 Query q = session.createQuery(hql);
							 Municipios municipio = (Municipios) q.uniqueResult();
							 estaEn.setMunicipios(municipio);
							 estaEn.setEspaciosNaturales(espaciosNaturales);
							 estaEnId.setCodCiudad(CodMunicipio);
							 estaEnId.setCodEspacio(codigoEspacio);
							 estaEn.setId(estaEnId);
							 espacios.add(espaciosNaturales);
							 estanEn.add(estaEn);
							 session.close();
							}
							 espaciosNaturales=new EspaciosNaturales();
							 estaEn = new EstaEn();
							 estaEnId=new EstaEnId();
							 estaVacio=false;
							 
						}
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
				}

			} else if (elemento.isJsonNull()) {
				System.out.println("Es NULL");
			} else {
				System.out.println("Es otra cosa");
			}
			return nombre;
		}
	


	private int CodMunicipio=1;
	private Municipios municipio=new Municipios();
	private Provincias provincia=new Provincias();
	private String[] nombreMuni;
	boolean mismoNombre=false;
	public String LeerJsonPueblos(JsonElement elemento, String nombre,ArrayList<Tablas.Municipios> municipios,ArrayList<Tablas.Provincias> provincias) {
			
			int x=1;
			if (elemento.isJsonObject()) {
				System.out.println("Objeto");
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
					System.out.println("       Boolean " + valor.getAsBoolean());
				} else if (valor.isNumber()) {
					System.out.println("       Numero: " + valor.getAsNumber());
					if(nombre.equals("municipalitycode")) {
						municipio.setCodMunicipio(Integer.parseInt(valor.getAsString().split(" ")[0]));
					}//fin if municipality code.
				} else if (valor.isString()) {
					
						System.out.println(" Enlaze guardado: " + valor.getAsString());
					
					if (nombre.equals("municipality"))	{
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
						
					}//fin If municipality
					
					else if(nombre.equals("municipalitycode")) {
						municipio.setCodMunicipio(CodMunicipio);
						CodMunicipio++;
				
					}//fin if municipality code.
					
					else if(nombre.equals("territory")) {
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
						
					}//fin if territory.
					
					else if(nombre.equals("territorycode")) {
						provincia.setCodProvincia(Integer.parseInt(valor.getAsString().split(" ")[0]));
						municipio.setProvincias(provincia);
						provincias.add(provincia);
						municipios.add(municipio);
						provincia=new Provincias();
						municipio=new Municipios();
					}//Fin if territoryCode
				}

			} else if (elemento.isJsonNull()) {
				System.out.println("Es NULL");
			} else {
				System.out.println("Es otra cosa");
			}
			return nombre;
		}

	public void LeerJsonLinks(JsonElement elemento) {
		if (seguir) {
			Links link = null;
			if (elemento.isJsonObject()) {
				System.out.println("Objeto");
				JsonObject obj = elemento.getAsJsonObject();
				java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
				java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
				while (iter.hasNext()) {
					java.util.Map.Entry<String, JsonElement> entrada = iter.next();
					Atributo = entrada.getKey();
					LeerJsonLinks(entrada.getValue());
				}

			} else if (elemento.isJsonArray()) {
				JsonArray array = elemento.getAsJsonArray();
				System.out.println("Array. Numero de elementos: " + array.size());
				java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonElement entrada = iter.next();
					LeerJsonLinks(entrada);
				}
			} else if (elemento.isJsonPrimitive()) {
				JsonPrimitive valor = elemento.getAsJsonPrimitive();
				if (valor.isBoolean()) {
					System.out.println("       Boolean " + valor.getAsBoolean());
				} else if (valor.isNumber()) {
					System.out.println("       Numero: " + valor.getAsNumber());
				} else if (valor.isString()) {
					if(valor.getAsString().contains("01/12/2020")) {
		        		 System.out.println(" Text: " + valor.getAsString());
		            seguir=false;
		        	}else {
		        		System.out.println(" Text: " + valor.getAsString());
		        	}
				}

			} else if (elemento.isJsonNull()) {
				System.out.println("Es NULL");
			} else {
				System.out.println("Es otra cosa");
			}
		}
	}
}

