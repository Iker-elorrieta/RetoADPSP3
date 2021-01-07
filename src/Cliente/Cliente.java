package Cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Cliente {
	
	private final static int PUERTO = 5000;
	private final static String IP = "127.0.0.1";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iniciar();
	}
	
	public static void iniciar() {
		Socket cliente = null;
		ObjectInputStream entrada = null;
		ObjectOutputStream salida = null;
		try {
			cliente = new Socket(IP, PUERTO);
			System.out.println("Conexión realizada con servidor");
			entrada = new ObjectInputStream(cliente.getInputStream());
			salida = new ObjectOutputStream (cliente.getOutputStream());
			//Persona mensaje = new Persona();
			
			//mensaje = (Persona) entrada.readObject();
			//System.out.println(mensaje.getNombre());
			
			//mensaje.setNombre("Pepito");
			//mensaje.setApellidos("grillo");
			
			//salida.writeObject(mensaje);
			

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
		try {
			if (cliente != null)
			cliente.close();
			if (entrada != null)
			entrada.close();
			if (salida != null)
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			System.out.println("Fin cliente");
		}
	}

}
