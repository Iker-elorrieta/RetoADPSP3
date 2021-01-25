package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JTable;

import Tablas.DatosCalidad;
import Tablas.Estaciones;
import Tablas.Municipios;
import vistas.Listado;
import vistas.Registro;
import vistas.VentanaCliente;

public class controladorListado implements ActionListener {

	Listado vistaListado;
	DataInputStream entrada = null;
	DataOutputStream salida = null;
	ObjectInputStream entradaf = null;
	public controladorListado(Listado vistaListado,DataInputStream in,DataOutputStream out,ObjectInputStream inf) {
		super();
		this.vistaListado = vistaListado;
		entrada = in;
		salida = out;
		entradaf = inf;
		iniciarControlador();
	}
	
	private void iniciarControlador() {
		
		vistaListado.getComboBoxMunicipio().addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(!rellenandoBoxMuni) {
					RellenarComboBoxEstac(vistaListado.getComboBoxMunicipio().getSelectedItem().toString());
					}
				}
		});
		
		vistaListado.getComboBoxEstaciones().addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(!rellenandoBoxEsta) {
					RellenarTabla(vistaListado.getComboBoxMunicipio().getSelectedItem().toString(),vistaListado.getComboBoxEstaciones().getSelectedItem().toString());
					}
				}
		});
		
		
		
		this.vistaListado.getBtnArabalaba().addActionListener(this);
		this.vistaListado.getBtnArabalaba().setActionCommand(Listado.enumAcciones.ARABA.toString());
		this.vistaListado.getBtnBizkaia().addActionListener(this);
		this.vistaListado.getBtnBizkaia().setActionCommand(Listado.enumAcciones.BIZKAIA.toString());
		this.vistaListado.getBtnGipuzkoa().addActionListener(this);
		this.vistaListado.getBtnGipuzkoa().setActionCommand(Listado.enumAcciones.GIPUZKOA.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		Listado.enumAcciones accion = Listado.enumAcciones.valueOf(e.getActionCommand());
		
		
		
		
		

		switch (accion) {
		case ARABA:
			rellenarComboBoxMuni("Araba/Álava");			
			break;
		case BIZKAIA:
			rellenarComboBoxMuni("Bizkaia");
			break;
		case GIPUZKOA:
			rellenarComboBoxMuni("Gipuzkoa");
				break;
		}
	}
	
	public void rellenarComboBoxMuni(String Nombre) {
		rellenandoBoxMuni = true;
		vistaListado.getComboBoxMunicipio().removeAllItems();
		try {
			salida.writeUTF("4");
			salida.writeUTF(Nombre);
			Municipios muni = (Municipios)entradaf.readObject();
			while(muni!=null) {
				vistaListado.getComboBoxMunicipio().addItem(muni.getNombre());
				 muni = (Municipios)entradaf.readObject();
			}
			rellenandoBoxMuni=false;
			RellenarComboBoxEstac(vistaListado.getComboBoxMunicipio().getSelectedItem().toString());
		} catch (IOException e1) {
			
		} catch (ClassNotFoundException e1) {
		}
		
	}
	private boolean rellenandoBoxMuni = true;
	private boolean rellenandoBoxEsta = true;
	public void RellenarComboBoxEstac(String Nombre){
		rellenandoBoxEsta = true;
		vistaListado.getComboBoxEstaciones().removeAllItems();
		try {
			
			salida.writeUTF("5");
			salida.writeUTF(Nombre);
			Estaciones esta = (Estaciones)entradaf.readObject();
			while(esta!=null) {
				vistaListado.getComboBoxEstaciones().addItem(esta.getNombre());
				 esta = (Estaciones)entradaf.readObject();
			}
			rellenandoBoxEsta=false;
			RellenarTabla(vistaListado.getComboBoxMunicipio().getSelectedItem().toString(),vistaListado.getComboBoxEstaciones().getSelectedItem().toString());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			
		}
	}
	
	String[] titulo = {"Tipo De Dato","Calculos"};
	private JTable tabla;
	public void RellenarTabla(String Nombre,String Nombre2){
		int contador=0;
		rellenandoBoxEsta = true;
		ArrayList<String> tipoDeDato = new ArrayList<String>();
		ArrayList<String> Calculos = new ArrayList<String>();
		this.vistaListado.getTextArea().setText("");
		try {
			salida.writeUTF("6");
			salida.writeUTF(Nombre+":"+Nombre2);
			DatosCalidad datosCali= (DatosCalidad) entradaf.readObject();
			
			if(datosCali.getFecha()!=null) {
				tipoDeDato.add("Fecha") ;
				Calculos.add(datosCali.getFecha().toString());
				contador++;
			}
			System.out.println(datosCali.getHora());
			if(datosCali.getHora()!=null) {
				tipoDeDato.add("Hora") ;
				Calculos.add(datosCali.getHora().toString());
				contador++;
			}
			if(datosCali.getComgM3()!=null) {
				tipoDeDato.add("ComgM3") ;
				Calculos.add(datosCali.getComgM3().toString());
				contador++;
			}
			if(datosCali.getCo8hmgM3()!=null) {
				tipoDeDato.add("Co8hmgM3") ;
				Calculos.add(datosCali.getCo8hmgM3().toString());
				contador++;
			}
			if(datosCali.getNogm3()!=null) {
				tipoDeDato.add("NOgm3") ;
				Calculos.add(datosCali.getNogm3().toString());
				contador++;
			}
			if(datosCali.getNo2()!=null) {
				tipoDeDato.add("NO2") ;
				Calculos.add(datosCali.getNo2().toString());
				contador++;
			}
			if(datosCali.getNo2ica()!=null) {
				tipoDeDato.add("NO2ICA") ;
				Calculos.add(datosCali.getNo2ica().toString());
				contador++;
			}
			if(datosCali.getNoxgm3()!=null) {
				tipoDeDato.add("NOXgm3") ;
				Calculos.add(datosCali.getNoxgm3().toString());
				contador++;
			}
			if(datosCali.getPm10()!=null) {
				tipoDeDato.add("PM10") ;
				Calculos.add(datosCali.getPm10().toString());
				contador++;
			}
			if(datosCali.getPm10ica()!=null) {
				tipoDeDato.add("PM10ICA") ;
				Calculos.add(datosCali.getPm10ica().toString());
				contador++;
			}
			if(datosCali.getPm25()!=null) {
				tipoDeDato.add("PM25") ;
				Calculos.add(datosCali.getPm25().toString());
				contador++;
			}
			if(datosCali.getPm25ica()!=null) {
				tipoDeDato.add("PM25ICA") ;
				Calculos.add(datosCali.getNo2().toString());
				contador++;
			}
			if(datosCali.getSo2()!=null) {
				tipoDeDato.add("SO2") ;
				Calculos.add(datosCali.getSo2().toString());
				contador++;
			}
			if(datosCali.getSo2ica()!=null) {
				tipoDeDato.add("SO2ICA") ;
				Calculos.add(datosCali.getSo2ica().toString());
				contador++;
			}
			if(datosCali.getIcastation()!=null) {
				tipoDeDato.add("ICAStation") ;
				Calculos.add(datosCali.getIcastation().toString());
				contador++;
			}
			
			String[][] dato = new String[tipoDeDato.size()][Calculos.size()];
			System.out.println("aqui si");
			for(int x=0;x<tipoDeDato.size();x++) {
				dato[x][0]=tipoDeDato.get(x);
				dato[x][1]=Calculos.get(x);
				/*System.out.println("estoy aqui");
				System.out.println(Calculos.get(x));*/
				this.vistaListado.getTextArea().append(dato[x][0] + " : " + dato[x][1] + "\n");
			}
			/*tabla =new JTable(dato,titulo);
			vistaListado.setTable_1(tabla);*/
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			
		}
	}
	
	public void cerrarServer(){
		try {
			salida.writeUTF("0");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
	}
	public void pruebaMunicipiosDatos() {
		rellenarComboBoxMuni("Araba/Álava");
		rellenarComboBoxMuni("Bizkaia");
		rellenarComboBoxMuni("Gipuzkoa");
		cerrarServer();
	}
}
