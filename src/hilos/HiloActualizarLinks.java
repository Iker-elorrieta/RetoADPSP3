package hilos;

import java.util.ArrayList;

import Objetos.Links;

public class HiloActualizarLinks extends Thread{
	
	
	private Hash.Diarios diario = new Hash.Diarios();
	
	private ArrayList<Objetos.Links> links;

	public HiloActualizarLinks(ArrayList<Links> links) {
		super();
		this.links = links;
	}

	public void run() {
		
		diario.comprobarHashDiarios(links);
	}

}
