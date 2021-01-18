package hilos;

import java.util.ArrayList;

import Insert.ConsultasDatosCalidad;
import Tablas.DatosCalidad;

public class HiloAnadirDatosCalidad extends Thread{

	ArrayList<Tablas.DatosCalidad> datosCalidad;
	ConsultasDatosCalidad consulta = new ConsultasDatosCalidad();
	
	public HiloAnadirDatosCalidad(ArrayList<DatosCalidad> datosCalidad) {
		super();
		this.datosCalidad = datosCalidad;
	}


	public void run() {
		consulta.insertDatosCalidad(datosCalidad);
		System.out.println(datosCalidad.get(0).getEstaciones().getCodEstacion());
	}
}
