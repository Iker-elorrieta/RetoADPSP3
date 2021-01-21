package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
		
		
		this.vistaListado.getBtnArabalaba().addActionListener(this);
		this.vistaListado.getBtnArabalaba().setActionCommand(Listado.enumAcciones.ARABA.toString());
		this.vistaListado.getBtnBizkaia().addActionListener(this);
		this.vistaListado.getBtnBizkaia().setActionCommand(Listado.enumAcciones.BIZKAIA.toString());
		this.vistaListado.getBtnGipuzkoa().addActionListener(this);
		this.vistaListado.getBtnGipuzkoa().setActionCommand(Listado.enumAcciones.GIPUZKOA.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vistaListado.getComboBoxMunicipio().removeAllItems();
		Listado.enumAcciones accion = Listado.enumAcciones.valueOf(e.getActionCommand());

		switch (accion) {
		case ARABA:
			try {
				salida.writeUTF("4");
				salida.writeUTF("Araba/Álava");
				Municipios muni = (Municipios)entradaf.readObject();
				while(muni!=null) {
					vistaListado.getComboBoxMunicipio().addItem(muni.getNombre());
					 muni = (Municipios)entradaf.readObject();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			break;
		case BIZKAIA:
			try {
				salida.writeUTF("4");
				salida.writeUTF("Bizkaia");
				Municipios muni = (Municipios)entradaf.readObject();
				while(muni!=null) {
					vistaListado.getComboBoxMunicipio().addItem(muni.getNombre());
					 muni = (Municipios)entradaf.readObject();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			break;
		case GIPUZKOA:
			try {
				salida.writeUTF("4");
				salida.writeUTF("Gipuzkoa");
				Municipios muni = (Municipios)entradaf.readObject();
				
				while(muni!=null) {
					vistaListado.getComboBoxMunicipio().addItem(muni.getNombre());
					 muni = (Municipios)entradaf.readObject();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			break;
		}
	}
	
}
