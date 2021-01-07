package leerJson;

import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import Objetos.Links;

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
	
	
	public void LeerJsonEstaciones(JsonElement elemento) {
	
			Links link = null;
			if (elemento.isJsonObject()) {
				System.out.println("Objeto");
				JsonObject obj = elemento.getAsJsonObject();
				java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
				java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
				while (iter.hasNext()) {
					java.util.Map.Entry<String, JsonElement> entrada = iter.next();
					Atributo = entrada.getKey();
					LeerJsonEstaciones(entrada.getValue());
				}

			} else if (elemento.isJsonArray()) {
				JsonArray array = elemento.getAsJsonArray();
				System.out.println("Array. Numero de elementos: " + array.size());
				java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonElement entrada = iter.next();
					LeerJsonEstaciones(entrada);
				}
			} else if (elemento.isJsonPrimitive()) {
				JsonPrimitive valor = elemento.getAsJsonPrimitive();
				if (valor.isBoolean()) {
					System.out.println("       Boolean " + valor.getAsBoolean());
				} else if (valor.isNumber()) {
					System.out.println("       Numero: " + valor.getAsNumber());
				} else if (valor.isString()) {
						System.out.println(" Enlaze guardado: " + valor.getAsString());
				}

			} else if (elemento.isJsonNull()) {
				System.out.println("Es NULL");
			} else {
				System.out.println("Es otra cosa");
			}
		}
	

	public void LeerJsonPlayas(JsonElement elemento) {
	
			Links link = null;
			if (elemento.isJsonObject()) {
				System.out.println("Objeto");
				JsonObject obj = elemento.getAsJsonObject();
				java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
				java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
				while (iter.hasNext()) {
					java.util.Map.Entry<String, JsonElement> entrada = iter.next();
					Atributo = entrada.getKey();
					LeerJsonEstaciones(entrada.getValue());
				}

			} else if (elemento.isJsonArray()) {
				JsonArray array = elemento.getAsJsonArray();
				System.out.println("Array. Numero de elementos: " + array.size());
				java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonElement entrada = iter.next();
					LeerJsonEstaciones(entrada);
				}
			} else if (elemento.isJsonPrimitive()) {
				JsonPrimitive valor = elemento.getAsJsonPrimitive();
				if (valor.isBoolean()) {
					System.out.println("       Boolean " + valor.getAsBoolean());
				} else if (valor.isNumber()) {
					System.out.println("       Numero: " + valor.getAsNumber());
				} else if (valor.isString()) {
						System.out.println(" Enlaze guardado: " + valor.getAsString());
				}

			} else if (elemento.isJsonNull()) {
				System.out.println("Es NULL");
			} else {
				System.out.println("Es otra cosa");
			}
		}
	

	public String LeerJsonPueblos(JsonElement elemento, String nombre) {
			Links link = null;
			if (elemento.isJsonObject()) {
				System.out.println("Objeto");
				JsonObject obj = elemento.getAsJsonObject();
				java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
				java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
				while (iter.hasNext()) {
					java.util.Map.Entry<String, JsonElement> entrada = iter.next();
					Atributo = entrada.getKey();
					nombre = Atributo.toString();
					LeerJsonEstaciones(entrada.getValue());
				}

			} else if (elemento.isJsonArray()) {
				JsonArray array = elemento.getAsJsonArray();
				System.out.println("Array. Numero de elementos: " + array.size());
				java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonElement entrada = iter.next();
					LeerJsonEstaciones(entrada);
				}
			} else if (elemento.isJsonPrimitive()) {
				JsonPrimitive valor = elemento.getAsJsonPrimitive();
				if (valor.isBoolean()) {
					System.out.println("       Boolean " + valor.getAsBoolean());
				} else if (valor.isNumber()) {
					System.out.println("       Numero: " + valor.getAsNumber());
				} else if (valor.isString()) {
						System.out.println(" Enlaze guardado: " + valor.getAsString());
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
					LeerJsonEstaciones(entrada.getValue());
				}

			} else if (elemento.isJsonArray()) {
				JsonArray array = elemento.getAsJsonArray();
				System.out.println("Array. Numero de elementos: " + array.size());
				java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					JsonElement entrada = iter.next();
					LeerJsonEstaciones(entrada);
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

