package principal;

import java.util.ArrayList;

import Insert.Consultas;
import hilos.HiloActualizarBaseDeDatos;

public class init {
	private static ArrayList<Objetos.Links> links;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		links=new ArrayList<Objetos.Links>();
		HiloActualizarBaseDeDatos Actualizar = new HiloActualizarBaseDeDatos(links);
		Actualizar.start();
		System.out.println("fin de programa");

	}

}
