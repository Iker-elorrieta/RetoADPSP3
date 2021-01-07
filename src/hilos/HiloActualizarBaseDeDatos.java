package hilos;

import java.util.ArrayList;

public class HiloActualizarBaseDeDatos extends Thread{

private ArrayList<Objetos.Links> links = new ArrayList<Objetos.Links>();
private Hash.Diarios diario = new Hash.Diarios();
private Hash.Estaciones estaciones = new Hash.Estaciones();
private Hash.Playas playas = new Hash.Playas();
private Hash.Pueblos pueblos = new Hash.Pueblos();
private Hash.Links link = new Hash.Links();

	
public void run(){

		
		diario.comprobarHashDiarios(links);
		estaciones.comprobarHashEstaciones();
		playas.comprobarHashPlayas();
		pueblos.comprobarHashPueblos();
		link.comprobarHashLinks(links);
		
		
	}
}
