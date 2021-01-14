package hilos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Objetos.Links;

public class Control extends Thread{
	
	boolean seguir = true;
	private ArrayList<Objetos.Links> links;

	public Control(ArrayList<Links> links) {
		super();
		this.links = links;
	}
	
public void run() {

		while(seguir) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String horactual = sdf.format(date);
			if (horactual.substring(3).equals("00:00")) {
				HiloActualizarBaseDeDatos Actualizar = new HiloActualizarBaseDeDatos(links);
				Actualizar.start();
				try {
					join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try {
				Thread.sleep(1000);
				System.out.println("segs");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
