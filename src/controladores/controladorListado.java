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
		
		vistaListado.getComboBoxMunicipio().addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if(!rellenandoBoxEsta) {
					RellenarComboBoxEstac(vistaListado.getComboBoxMunicipio().getSelectedItem().toString());
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
		vistaListado.getComboBoxMunicipio().removeAllItems();
		rellenandoBoxMuni = true;
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
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	private boolean rellenandoBoxMuni = true;
	private boolean rellenandoBoxEsta = true;
	public void RellenarComboBoxEstac(String Nombre){
		vistaListado.getComboBoxEstaciones().removeAllItems();
		rellenandoBoxEsta = true;
		try {
			
			salida.writeUTF("5");
			salida.writeUTF(Nombre);
			Estaciones esta = (Estaciones)entradaf.readObject();
			while(esta!=null) {
				vistaListado.getComboBoxEstaciones().addItem(esta.getNombre());
				 esta = (Estaciones)entradaf.readObject();
			}
			rellenandoBoxEsta=false;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
