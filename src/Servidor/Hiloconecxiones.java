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
				if(cr.ConsultarDatos()) {
				salida.writeUTF("ok");
				}else {
				salida.writeUTF("error");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break;//	case 1
			
		case 2: // tras logearse Inicia la aplicacion
			try {
				String datos = entrada.readUTF();
				ConsultaInicial ci = new ConsultaInicial(datos);
				ci.separardatos();
				salida.writeBoolean(ci.CambiarVentana());
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break; //	case 2
		case 3: //tras comprobar usuario y contraseña correcta cambia la contraseña
			try {
				String datos = entrada.readUTF();
				ConsultaInicial ci = new ConsultaInicial(datos);
				ci.separardatos();
//				salida.writeUTF(ci.CambiarVentana());
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break;//	case 3
		case 4: // Carga las provincias en el jcombobox 
			
			break;//	case 4
		case 5: // Tras seleccionar una provincia Cargamos el nombre de los espacios correspondientes
			
			break;//	case 5
		case 6: // Tras seleccionar el boton de buscar Cargaremos los datos del espacio natural para mostrarlo;
			
			break;
		}
	}

}
