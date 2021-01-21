package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import vistas.Listado;
import vistas.Registro;
import vistas.VentanaCliente;

public class controladorVentanaCliente implements ActionListener {

	VentanaCliente vistaCliente;
	DataInputStream entrada = null;
	DataOutputStream salida = null;
	ObjectInputStream entradaf=null;
	
	public controladorVentanaCliente(VentanaCliente vistaCliente,DataInputStream in, DataOutputStream out,ObjectInputStream inf) {
		super();
		entrada = in;
		salida = out;
		entradaf = inf;
		this.vistaCliente = vistaCliente;
		iniciarControlador();
	}
	
	private void iniciarControlador() {
		this.vistaCliente.getBtnEntrar().addActionListener(this);
		this.vistaCliente.getBtnEntrar().setActionCommand(VentanaCliente.enumAcciones.ENTRAR.toString());
		this.vistaCliente.getBtnRegistro().addActionListener(this);
		this.vistaCliente.getBtnRegistro().setActionCommand(VentanaCliente.enumAcciones.REGISTRO.toString());
	}
	
	public int entrar() {
		String usuario = vistaCliente.getTextField().getText();
		char[] pass1 = vistaCliente.getPasswordField().getPassword();

		if(usuario.length() == 0) {
			vistaCliente.getLBL1().setText("El campo de usuario no puede estar vacio");
			return -1;
		}
		if(pass1.length == 0) {
			vistaCliente.getLBL1().setText("El campo de Contraseña no puede estar vacio");
			return -1;
		}
		boolean res = false;
		try {			
			String resu ="";
			String texto = new String(pass1);
			MessageDigest md;
			try {
				md = MessageDigest.getInstance("SHA");
				byte dataBytes[] = texto.getBytes();
				md.update(dataBytes);
				byte resumen[] = md.digest();
				for(byte b : resumen){
					resu += b;
				}
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hola");
			salida.writeUTF("2");
			salida.writeUTF(usuario+":"+ resu);
			res = entrada.readBoolean();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!res) {
			vistaCliente.getLBL1().setText("Usuario o pass incorrectos");
			
			return -1;
				
		}else {
			Listado listado = new Listado();
			controladorListado controladorListado = new controladorListado(listado,entrada,salida,entradaf);
			vistaCliente.dispose();
			listado.setVisible(true);
			return 1;
		}

		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VentanaCliente.enumAcciones accion = VentanaCliente.enumAcciones.valueOf(e.getActionCommand());

		switch (accion) {
		case ENTRAR:
			entrar();
			break;
		case REGISTRO:
			Registro reg = new Registro();
			controladorRegistro controladorRegistro = new controladorRegistro(reg, entrada, salida);
			reg.setVisible(true);
			break;
		}
		
	}
	
}


