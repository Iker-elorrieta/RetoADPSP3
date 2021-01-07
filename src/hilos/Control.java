package hilos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Control extends Thread{
	
	boolean seguir = true;
	
public void run() {
		
		while(seguir) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String horactual = sdf.format(date);
			if (horactual.substring(3).equals("00:00")) {
				HiloActualizarBaseDeDatos Actualizar = new HiloActualizarBaseDeDatos();
				Actualizar.start();
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
