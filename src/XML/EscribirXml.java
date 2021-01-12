package XML;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import Tablas.EspaciosNaturales;
import Tablas.Estaciones;
import Tablas.Municipios;
import Tablas.Provincias;

public class EscribirXml {
     public void escribirXmlMunicipios(ArrayList<Municipios> municipios) {
    	 try {
 			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
 			DocumentBuilder db = dbf.newDocumentBuilder();
 			Document doc = db.newDocument();

 			// definimos el elemento raíz del documento
 			Element eMunicipios = doc.createElement("Municipios");
 			doc.appendChild(eMunicipios);

 			for (Municipios municipio : municipios) {

 				// definimos el nodo que contendrá los elementos
 				Element eMunicipio = doc.createElement("Municipio");
 				eMunicipios.appendChild(eMunicipio);

 				

 				// definimos cada uno de los elementos y le asignamos un valor
 				Element eNombre = doc.createElement("Nombre");
 				eNombre.appendChild(doc.createTextNode(municipio.getNombre()));
 				eMunicipio.appendChild(eNombre);

 				Element eCodMunicipio = doc.createElement("CodMunicipio");
 				eCodMunicipio.appendChild(doc.createTextNode(String.valueOf(municipio.getCodMunicipio())));
 				eMunicipio.appendChild(eCodMunicipio);

 				Element eCodProvincia = doc.createElement("CodProvincia");
 				eCodProvincia.appendChild(doc.createTextNode(String.valueOf(municipio.getProvincias().getCodProvincia())));
 				eMunicipio.appendChild(eCodProvincia);
 				
 				
 			}

 			// clases necesarias finalizar la creación del archivo XML

 			TransformerFactory transformerFactory = TransformerFactory.newInstance();
 			Transformer transformer = (Transformer) transformerFactory.newTransformer();
 			DOMSource source = new DOMSource(doc);
 			StreamResult result = new StreamResult(new File("Municipio" + ".xml"));

 			((javax.xml.transform.Transformer) transformer).transform(source, result);
 		} catch (Exception e) {
 			System.out.println("!ERROR AL CREAR DOCUMENTO¡");
 			e.printStackTrace();
 			
 		}
     }
     
     public void escribirXmlProvincia(ArrayList<Provincias> provincia) {
    	 try {
 			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
 			DocumentBuilder db = dbf.newDocumentBuilder();
 			Document doc = db.newDocument();

 			// definimos el elemento raíz del documento
 			Element eProvincias = doc.createElement("Provincias");
 			doc.appendChild(eProvincias);

 			for (Provincias provin : provincia) {

 				// definimos el nodo que contendrá los elementos
 				Element eProvincia = doc.createElement("Provincia");
 				eProvincias.appendChild(eProvincia);

 				

 				// definimos cada uno de los elementos y le asignamos un valor
 				Element eNombre = doc.createElement("Nombre");
 				eNombre.appendChild(doc.createTextNode(provin.getNombre()));
 				eProvincia.appendChild(eNombre);

 				Element eCodProvincia = doc.createElement("CodProvincia");
 				eCodProvincia.appendChild(doc.createTextNode(String.valueOf(provin.getCodProvincia())));
 				eProvincia.appendChild(eCodProvincia);
 				
 				
 			}

 			// clases necesarias finalizar la creación del archivo XML

 			TransformerFactory transformerFactory = TransformerFactory.newInstance();
 			Transformer transformer = (Transformer) transformerFactory.newTransformer();
 			DOMSource source = new DOMSource(doc);
 			StreamResult result = new StreamResult(new File("Municipio" + ".xml"));

 			((javax.xml.transform.Transformer) transformer).transform(source, result);
 		} catch (Exception e) {
 			System.out.println("!ERROR AL CREAR DOCUMENTO¡");
 			e.printStackTrace();
 			
 		}
     }
     public void escribirXmlEstaciones(ArrayList<Estaciones> estaciones) {
    	 try {
 			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
 			DocumentBuilder db = dbf.newDocumentBuilder();
 			Document doc = db.newDocument();

 			// definimos el elemento raíz del documento
 			Element eEstaciones = doc.createElement("Estaciones");
 			doc.appendChild(eEstaciones);

 			for (Estaciones estacion : estaciones) {

 				// definimos el nodo que contendrá los elementos
 				Element eEstacion = doc.createElement("Estacion");
 				eEstaciones.appendChild(eEstacion);

 				

 				// definimos cada uno de los elementos y le asignamos un valor
 				Element eNombre = doc.createElement("Nombre");
 				eNombre.appendChild(doc.createTextNode(estacion.getNombre()));
 				eEstacion.appendChild(eNombre);

 				Element eCodEstacion = doc.createElement("CodEstacion");
 				eCodEstacion.appendChild(doc.createTextNode(String.valueOf(estacion.getCodEstacion())));
 				eEstacion.appendChild(eCodEstacion);
 				
 				Element eCodMunicipio = doc.createElement("Cod_Municipio");
 				eCodMunicipio.appendChild(doc.createTextNode(String.valueOf(estacion.getCodEstacion())));
 				eEstacion.appendChild(eCodMunicipio);
 				
 				Element eDireccion = doc.createElement("Direccion");
 				eDireccion.appendChild(doc.createTextNode(String.valueOf(estacion.getDireccion())));
 				eEstacion.appendChild(eDireccion);
 				
 				Element eCoordenadaX = doc.createElement("Coordenada X");
 				eCoordenadaX.appendChild(doc.createTextNode(String.valueOf(estacion.getCoordenadaX())));
 				eEstacion.appendChild(eCoordenadaX);
 				
 				Element eCoordenadaY = doc.createElement("Coordenada Y");
 				eCoordenadaY.appendChild(doc.createTextNode(String.valueOf(estacion.getCoordenadaY())));
 				eEstacion.appendChild(eCoordenadaY);
 			
 				Element eLatitud = doc.createElement("Latitud");
 				eLatitud.appendChild(doc.createTextNode(String.valueOf(estacion.getLatitud())));
 				eEstacion.appendChild(eLatitud);
 				
 				Element eLongitud = doc.createElement("Longitud");
 				eLongitud.appendChild(doc.createTextNode(String.valueOf(estacion.getLongitud())));
 				eEstacion.appendChild(eLongitud);
 			
 			}

 			// clases necesarias finalizar la creación del archivo XML

 			TransformerFactory transformerFactory = TransformerFactory.newInstance();
 			Transformer transformer = (Transformer) transformerFactory.newTransformer();
 			DOMSource source = new DOMSource(doc);
 			StreamResult result = new StreamResult(new File("Municipio" + ".xml"));

 			((javax.xml.transform.Transformer) transformer).transform(source, result);
 		} catch (Exception e) {
 			System.out.println("!ERROR AL CREAR DOCUMENTO¡");
 			e.printStackTrace();
 			
 		}
    	 }
    	 
    	  public void escribirXmlEspacios(ArrayList<EspaciosNaturales> espaciosNaturales) {
    	    	 try {
    	 			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    	 			DocumentBuilder db = dbf.newDocumentBuilder();
    	 			Document doc = db.newDocument();

    	 			// definimos el elemento raíz del documento
    	 			Element eEspacios = doc.createElement("Espacios_Naturales");
    	 			doc.appendChild(eEspacios);

    	 			for (EspaciosNaturales espacios : espaciosNaturales) {

    	 				// definimos el nodo que contendrá los elementos
    	 				Element eEspacio = doc.createElement("Espacio_Natural");
    	 				eEspacios.appendChild(eEspacio);

    	 				

    	 				// definimos cada uno de los elementos y le asignamos un valor
    	 				Element eNombre = doc.createElement("Nombre");
    	 				eNombre.appendChild(doc.createTextNode(espacios.getNombreEspacio()));
    	 				eEspacio.appendChild(eNombre);

    	 				Element eCodEspacio = doc.createElement("CodEspacio_Natural");
    	 				eCodEspacio.appendChild(doc.createTextNode(String.valueOf(espacios.getCodEspacio())));
    	 				eEspacio.appendChild(eCodEspacio);
    	 				
    	 				Element eMarca = doc.createElement("Marca");
    	 				eMarca.appendChild(doc.createTextNode(String.valueOf(espacios.getMarca())));
    	 				eEspacio.appendChild(eMarca);
    	 				
    	 				Element eNatureType = doc.createElement("Tipo de Espacio Natural");
    	 				eNatureType.appendChild(doc.createTextNode(String.valueOf(espacios.getNatureType())));
    	 				eEspacio.appendChild(eNatureType);
    	 				
    	 				Element elatwgs = doc.createElement("latwgs");
    	 				elatwgs.appendChild(doc.createTextNode(String.valueOf(espacios.getLatwgs84())));
    	 				eEspacio.appendChild(elatwgs);
    	 				
    	 				Element eLongwgs = doc.createElement("Longwgs");
    	 				eLongwgs.appendChild(doc.createTextNode(String.valueOf(espacios.getLongwgs84())));
    	 				eEspacio.appendChild(eLongwgs);
    	 			}

    	 			// clases necesarias finalizar la creación del archivo XML

    	 			TransformerFactory transformerFactory = TransformerFactory.newInstance();
    	 			Transformer transformer = (Transformer) transformerFactory.newTransformer();
    	 			DOMSource source = new DOMSource(doc);
    	 			StreamResult result = new StreamResult(new File("Municipio" + ".xml"));

    	 			((javax.xml.transform.Transformer) transformer).transform(source, result);
    	 		} catch (Exception e) {
    	 			System.out.println("!ERROR AL CREAR DOCUMENTO¡");
    	 			e.printStackTrace();
    	 			
    	 		}
    	
     }
    	  
}
