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

	private ArrayList<Tablas.DatosCalidad> datosCalidad = new ArrayList<Tablas.DatosCalidad>();
	private Hash.Links link = new Hash.Links();
	private Hash.Pueblos pueblos = new Hash.Pueblos();
	private ConsultasProvincias consultaProvincia = new ConsultasProvincias();
	private ConsultaMunicipios consultaMunicipios = new ConsultaMunicipios();
	private ArrayList<Tablas.Provincias> provincias;
	private ArrayList<Tablas.Municipios> municipios;
	private ArrayList<Tablas.Estaciones> estacion;
	private ConsultasEstaciones consultasEstaciones = new ConsultasEstaciones();
	private ConsultasDatosCalidad consultaCalidad = new ConsultasDatosCalidad();
	private Hash.Estaciones estaciones = new Hash.Estaciones();
	
	public void run() {
		municipios = new ArrayList<Tablas.Municipios>();
		provincias = new ArrayList<Tablas.Provincias>();
		System.out.println("he entrado al hilo");
		
		
		pueblos.comprobarHashPueblos(municipios, provincias);
		
		//A�adimos Provincias y municipios a la base de datos.
		consultaProvincia.insertProvincia(provincias);
		consultaMunicipios.insertMunicipio(municipios);
		HiloActualizarPlayas actualizarPlaya = new HiloActualizarPlayas();
		actualizarPlaya.start();
		
		HiloActualizarLinks actualizarLinks = new HiloActualizarLinks(links);
		actualizarLinks.start();
		estacion=new ArrayList<Tablas.Estaciones>(); 
		estaciones.comprobarHashEstaciones(estacion);
		
		
		//A�adimos Estacion a la base de datos.
		consultasEstaciones.insertEstaciones(estacion);
		link.comprobarHashLinks(links,datosCalidad);
		consultaCalidad.insertDatosCalidad(datosCalidad);
		System.out.println("fin del hiloActualizar");

	}
	
}
