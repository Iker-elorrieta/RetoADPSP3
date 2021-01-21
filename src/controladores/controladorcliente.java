package controladores;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import vistas.VentanaCliente;

public class controladorcliente {
	
	private final static int PUERTO = 5000;
	private final static String IP = "127.0.0.1";
	Socket cliente = null;
	DataInputStream entrada = null;
	DataOutputStream salida = null;
	
	VentanaCliente ventana ;
	boolean activo = true;

	public controladorcliente() {
		
		ventana = new VentanaCliente();
		conectar();
		controladorVentanaCliente controladorVentanaCliente = new controladorVentanaCliente(ventana,entrada,salida);
		ventana.setVisible(true);
	}
	
	public void conectar() {
		try {
			cliente = new Socket(IP, PUERTO);
			System.out.println("Conexión realizada con servidor");
			ventana.getLBL1().setText("conectado con el servidor");
			entrada = new DataInputStream(cliente.getInputStream());
			salida = new DataOutputStream (cliente.getOutputStream());
			
			String mensage = entrada.readUTF();
			ventana.getLBL1().setText(mensage);
			System.out.println("mensage: " + mensage);
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
	
	public boolean desconectar() {
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
		return true;
	}
	
}
