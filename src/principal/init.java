package principal;

import java.util.ArrayList;

import org.hibernate.engine.internal.JoinSequence.Join;

import Insert.Consultas;
import hilos.Control;
import hilos.HiloActualizarBaseDeDatos;

public class init {
	private static ArrayList<Objetos.Links> links;
	
	public static boolean iniciarTodo() {
		links=new ArrayList<Objetos.Links>();
		HiloActualizarBaseDeDatos Actualizar = new HiloActualizarBaseDeDatos(links);
		Actualizar.start();
		while(Actualizar.isAlive()){
			
		}
		Control ControlTiempo = new Control(links);
		ControlTiempo.start();
		System.out.println("fin de programa");
		
		return true;
	}

}
