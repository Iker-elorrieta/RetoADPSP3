package hilos;

import java.util.ArrayList;

import Objetos.Links;

public class HiloActualizarBaseDeDatos extends Thread{

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

	

public void run(){

		pueblos.comprobarHashPueblos();
		estaciones.comprobarHashEstaciones();
		playas.comprobarHashPlayas();
		diario.comprobarHashDiarios(links);
		link.comprobarHashLinks(links);
		
		System.out.println("fin del hiloActualizar");
	}
}
