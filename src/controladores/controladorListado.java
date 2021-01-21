package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import vistas.Listado;

public class controladorListado implements ActionListener {

	Listado vistaListado;
	DataInputStream entrada = null;
	DataOutputStream salida = null;
	
	public controladorListado(Listado vistaListado,DataInputStream in,DataOutputStream out) {
		super();
		this.vistaListado = vistaListado;
		entrada = in;
		salida = out;
		iniciarControlador();
	}
	
	private void iniciarControlador() {
		
		
		this.vistaListado.getBtnArabalaba().addActionListener(this);
		this.vistaListado.getBtnArabalaba().setActionCommand(Listado.enumAcciones.ARABA.toString());
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}
	
}
