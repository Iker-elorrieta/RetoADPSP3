package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Insert.ConsultaMunicipios;
import Insert.ConsultasDatosCalidad;
import Insert.ConsultasEstaciones;
import Tablas.DatosCalidad;
import Tablas.Estaciones;
import Tablas.Municipios;

public class Hiloconecxiones extends Thread {

	DataInputStream entrada = null;
	DataOutputStream salida = null;
	ObjectOutputStream salidaf = null;
	boolean activo = true;

	public Hiloconecxiones(DataInputStream in, DataOutputStream out, ObjectOutputStream outf) {
		entrada = in;
		salida = out;
		salidaf = outf;
	}

	@Override
	public void run() {
		try {
			salida.writeUTF("Bienvenido al servidor del equipo 3");
			while (activo) {
				String cod = entrada.readUTF();		
				accion(cod);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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

	private ArrayList<Municipios> muni;
	private ArrayList<Estaciones> esta;
	private ArrayList<DatosCalidad> dato;

	public void accion(String codigo) {
		int cod = Integer.parseInt(codigo);
		switch (cod) {
		case 1:// buscar usuario en BBDD si existe error sino creamos y devolvemos "ok"
			try {
				String datos = entrada.readUTF();
				CrearUsuario cr = new CrearUsuario(datos);
				cr.separardatos();
				if (cr.ConsultarDatos()) {
					salida.writeUTF("ok");
				} else {
					salida.writeUTF("error");
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
			break;// case 1

		case 2: // tras logearse Inicia la aplicacion
			try {
				String datos = entrada.readUTF();
				ConsultaInicial ci = new ConsultaInicial(datos);
				ci.separardatos();
				salida.writeBoolean(ci.CambiarVentana());

			} catch (IOException e) {

				e.printStackTrace();
			}
			break; // case 2
//		case 3: //tras comprobar usuario y contraseña correcta cambia la contraseña
//			try {
//				String datos = entrada.readUTF();
//				ConsultaInicial ci = new ConsultaInicial(datos);
//				ci.separardatos();
////				salida.writeUTF(ci.CambiarVentana());
//				
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//			break;//	case 3
		case 4: // Tras seleccionar una provincia Cargamos el nombre de los espacios
				// correspondientes
			try {
				muni = new ArrayList<Municipios>();
				String datos = entrada.readUTF();
				ConsultaMunicipios consulta = new ConsultaMunicipios();

				salidaf.writeObject(consulta.recogermunicipios(muni, datos));
//				salida.writeUTF(ci.CambiarVentana());

			} catch (IOException e) {

				e.printStackTrace();
			}
			break;// case 4
		case 5: //
			try {
				esta = new ArrayList<Estaciones>();
				String datos = entrada.readUTF();
				ConsultasEstaciones consulta = new ConsultasEstaciones();

				salidaf.writeObject(consulta.recogerEstaciones(esta, datos));
//				salida.writeUTF(ci.CambiarVentana());

			} catch (IOException e) {

				e.printStackTrace();
			}
			break;// case 5

		case 6: // Tras seleccionar la estacion cargaremos la Fecha;
			try {
				dato = new ArrayList<DatosCalidad>();
				String datos = entrada.readUTF();
				ConsultasDatosCalidad consulta = new ConsultasDatosCalidad();
				consulta.separardatos(datos);

				salidaf.writeObject(consulta.recogerDatosCalidadFecha(dato));

//				salida.writeUTF(ci.CambiarVentana());

			} catch (IOException e) {

				e.printStackTrace();
			}
			break;// case 6
		case 7: // Tras seleccionar la fecha cargaremos la informacion;
			try {
				dato = new ArrayList<DatosCalidad>();
				String datos = entrada.readUTF();
				ConsultasDatosCalidad consulta = new ConsultasDatosCalidad();
				consulta.separardatos2(datos);

				salidaf.writeObject(consulta.recogerDatosCalidadHora(dato));

//				salida.writeUTF(ci.CambiarVentana());

			} catch (IOException e) {

				e.printStackTrace();
			}
			break;// case 7
		case 8: // Tras seleccionar la Hora cargaremos los Datos;
			try {
				dato = new ArrayList<DatosCalidad>();
				String datos = entrada.readUTF();
				ConsultasDatosCalidad consulta = new ConsultasDatosCalidad();
				consulta.separardatos3(datos);

				salidaf.writeObject(consulta.recogerDatosCalidad(dato));

//				salida.writeUTF(ci.CambiarVentana());

			} catch (IOException e) {

				e.printStackTrace();
			}
			break;// case 8
//		case 9: // Cargamos el top
//			try {
//				
//				String datos = entrada.readUTF();
//				
//				ConsultaMunicipios consulta = new ConsultaMunicipios();
//
//				List<DatosCalidad> datosCali = consulta.recogermunicipiosTop(datos);
//				 int x=0;
//				 int contador = 0;
//				 ArrayList<String> nombresMuni = new ArrayList<String>();
//				 boolean mismoNombre = false;
//				while (x<datosCali.size() -1 && contador<5) {
//					mismoNombre=false;
//					for(int y = 0;y<nombresMuni.size();y++) {
//						
//						if(nombresMuni.get(y).equals(datosCali.get(x).getEstaciones().getMunicipios().getNombre())) {
//							mismoNombre=true;
//						}
//					}
//					
//					
//					if(!mismoNombre) {
//					
//					contador++;
//					nombresMuni.add(datosCali.get(x).getEstaciones().getMunicipios().getNombre().toString());
//					}
//					
//					x++;
//				}
//				salidaf.writeObject(nombresMuni);
//
////				salida.writeUTF(ci.CambiarVentana());
//
//			} catch (IOException e) {
//
//				e.printStackTrace();
//			}
//			break;// case 9
		
		case 0:// Cerrar
			activo = false;
			Servidor.activo = false;
			// Servidor.CerrarServer();
			break;
		}
	}

}
