package hilos;

import java.util.ArrayList;

import com.google.gson.JsonElement;

import Insert.ConsultasDatosCalidad;
import Tablas.DatosCalidad;
import Tablas.Estaciones;
import borrarBaseDeDatos.borrar;
import leerJson.leerJson;

public class HiloAnadirDatosCalidad extends Thread{

	private JsonElement elemento;
	private Estaciones estaciones;
	private leerJson leer = new leerJson();
	


	public HiloAnadirDatosCalidad(JsonElement elemento, Estaciones estaciones) {
		
		super();
		this.elemento = elemento;
		this.estaciones = estaciones;
	}




	public void run() {
		//borrar.borrar(estaciones.getNombre());
		leer.LeerJsonLinks(elemento, "", estaciones);
	}
}
