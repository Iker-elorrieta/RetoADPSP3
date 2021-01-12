package hilos;

import java.util.ArrayList;

import Insert.ConsultaEspaciosNaturales;
import Insert.ConsultaMunicipios;
import Insert.ConsultasDatosCalidad;
import Insert.ConsultasEstaEn;
import Insert.ConsultasEstaciones;
import Insert.ConsultasProvincias;
import Objetos.Links;
import Tablas.EspaciosNaturales;
import Tablas.EstaEn;
import XML.EscribirXml;

public class HiloActualizarBaseDeDatos extends Thread {

	private ArrayList<Objetos.Links> links;

	public HiloActualizarBaseDeDatos(ArrayList<Links> links) {
		super();
		this.links = links;
	}

	private Hash.Diarios diario = new Hash.Diarios();
	private Hash.Estaciones estaciones = new Hash.Estaciones();
	private Hash.Playas playas = new Hash.Playas();
	private Hash.Pueblos pueblos = new Hash.Pueblos();
	private Hash.Links link = new Hash.Links();
	private ConsultasProvincias consultaProvincia = new ConsultasProvincias();
	private ConsultasEstaciones consultasEstaciones = new ConsultasEstaciones();
	private ConsultaEspaciosNaturales consultasEspacios = new ConsultaEspaciosNaturales();
	private ConsultasEstaEn consultasEstaEn = new ConsultasEstaEn();
	private ConsultaMunicipios consultaMunicipios = new ConsultaMunicipios();
	private ConsultasDatosCalidad consultaDatosCalidad = new ConsultasDatosCalidad();
	private ArrayList<Tablas.DatosCalidad> datosCalidad = new ArrayList<Tablas.DatosCalidad>();
	private ArrayList<Tablas.Provincias> provincias;
	private ArrayList<Tablas.Municipios> municipios;
	private ArrayList<Tablas.Estaciones> estacion;
	private ArrayList<EspaciosNaturales> espacios;
	private ArrayList<EstaEn> estanEn;
	private EscribirXml escribirXML = new EscribirXml();
	
	public void run() {
		municipios = new ArrayList<Tablas.Municipios>();
		provincias = new ArrayList<Tablas.Provincias>();
		System.out.println("he entrado al hilo");
		estacion=new ArrayList<Tablas.Estaciones>(); 
		espacios=new ArrayList<EspaciosNaturales>();
		estanEn=new ArrayList<EstaEn>();
		pueblos.comprobarHashPueblos(municipios, provincias);
		
		
		//Añadimos Provincias y municipios a la base de datos.
		consultaProvincia.insertProvincia(provincias);
		consultaMunicipios.insertMunicipio(municipios);
		
		
		estaciones.comprobarHashEstaciones(estacion);
		
		
		//Añadimos Estacion a la base de datos.
		consultasEstaciones.insertEstaciones(estacion);
		
		playas.comprobarHashPlayas(espacios,estanEn);
		consultasEspacios.insertEspaciosNaturales(espacios);
		//escribirXML.escribirXmlEspacios(espacios);
		consultasEstaEn.insertEstaEn(estanEn);
		
		diario.comprobarHashDiarios(links);
		link.comprobarHashLinks(links,datosCalidad);
		consultaDatosCalidad.insertDatosCalidad(datosCalidad);
		System.out.println("fin del hiloActualizar");

	}
}
