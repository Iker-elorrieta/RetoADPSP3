package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	private final static int PUERTO = 5000;
	
	public static void main(String[] args) {
		iniciar();
	}
	
public static void iniciar() {
		ServerSocket servidor = null;
		Socket cliente = null;
		DataInputStream entrada = null;
		DataOutputStream salida = null;
		try {
			servidor = new ServerSocket(PUERTO);
			System.out.println("Esperando conexiones del cliente...");
			cliente = servidor.accept();
			System.out.println("Cliente conectado");
			salida = new DataOutputStream (cliente.getOutputStream());
			entrada = new DataInputStream(cliente.getInputStream());
			
			salida.writeUTF("Bienvenido al servidor del equipo 3");
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
		try {
		if (servidor != null)
			servidor.close();
		if (cliente != null)
			cliente.close();
		if (entrada != null)
			entrada.close();
		if (salida != null)
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fin servidor");
		}
	}
}
