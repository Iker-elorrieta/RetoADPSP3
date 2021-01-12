package principal;

import java.util.ArrayList;

import Insert.Consultas;
import hilos.Control;
import hilos.HiloActualizarBaseDeDatos;

public class init {
	private static ArrayList<Objetos.Links> links;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		links=new ArrayList<Objetos.Links>();
		
		

		
		/*
		Consultas consultas = new Consultas();
		
		//INSERTAR PROVINCIAS
		consultas.insertProvincias();
		System.out.println();
		
		//INSERTAR MUNICIPIO
		consultas.insertMunicipios();
		System.out.println();
		
		//INSERTAR ESTACIONES
		consultas.insertEstaciones();
		System.out.println();
		
		//INSERTAR DATOS CALIDAD
		consultas.insertDatosCalidad();
		System.out.println();
		
		//INSERTAR ESPACIOS NATURALES
		consultas.insertEspaciosNaturales();
		System.out.println();
		
		//INSERTAR USUARIOS
		consultas.insertUsuarios();
		System.out.println();
		
		//INSERTAR FAVORITOS
		consultas.insertFavoritos();
		System.out.println();
		
		//INSERTAR HASH
		consultas.insertHash();
		*/
		
		HiloActualizarBaseDeDatos Actualizar = new HiloActualizarBaseDeDatos(links);
		Actualizar.start();
		
		Control ControlTiempo = new Control(links);
		ControlTiempo.start();
		System.out.println("fin de programa");

		//INSERTAR ESTA EN
	//	consultas.insertEstaEn();

	}

}
