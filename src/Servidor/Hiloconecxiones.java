package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hiloconecxiones extends Thread{
	
	DataInputStream entrada = null;
	DataOutputStream salida = null;
	boolean activo = true;
	
	public Hiloconecxiones(DataInputStream in, DataOutputStream out){
		entrada = in;
		salida = out;
	}
	
	@Override
	public void run() {
		try {
			salida.writeUTF("Bienvenido al servidor del equipo 3");
			while(activo) {
				String cod = entrada.readUTF();
				accion(cod);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (entrada != null)
					entrada.close();
				if (salida != null)
					salida.close();
				} catch (IOException e) {
					e.printStackTrace();
			}
		}
	}
	
	public void accion(String codigo) {
		int cod = Integer.parseInt(codigo);
		switch (cod) {
		case 1://buscar usuario en BBDD si existe error sino creamos y devolvemos "ok"
			try {
				String datos = entrada.readUTF();
				CrearUsuario cr = new CrearUsuario(datos);
				cr.separardatos();
				salida.writeUTF(cr.ConsultarDatos());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;//	case 1
			
		case 2: // tras logearse muestra una ciudad en un label
			try {
				String datos = entrada.readUTF();
				ConsultaInicial ci = new ConsultaInicial(datos);
				ci.separardatos();
				salida.writeUTF(ci.pedirciudad());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break; //	case 2
		}
	}

}
