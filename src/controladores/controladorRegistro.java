package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import vistas.Registro;

public class controladorRegistro implements ActionListener {

	Registro vistaRegistro;
	DataInputStream entrada = null;
	DataOutputStream salida = null;

	public controladorRegistro(Registro vistaRegistro) {

		this.vistaRegistro = vistaRegistro;
		iniciarControlador();
	}
	
	private void iniciarControlador() {
		this.vistaRegistro.getBtnNewButton().addActionListener(this);
		this.vistaRegistro.getBtnNewButton().setActionCommand("");
	}

	
	
	
	public int ValidarDatos(){
		
		String usuario = this.vistaRegistro.getTextField().getText();
		char[] pass1 = this.vistaRegistro.getPasswordField().getPassword();
		char[] pass2 = this.vistaRegistro.getPasswordField_1().getPassword();

		if(usuario.length() == 0) {
			this.vistaRegistro.getLblNewLabel_3().setText("El campo de usuario no puede estar vacio");
			return -1;
		}
		if(pass1.length == 0) {
			this.vistaRegistro.getLblNewLabel_3().setText("El campo de Contrase�a no puede estar vacio");
			return -1;
		}
		if(pass2.length == 0) {
			this.vistaRegistro.getLblNewLabel_3().setText("El campo de Repetir Contrase�a no puede estar vacio");
			return -1;
		}
		if(pass1.equals(pass2)) {
			this.vistaRegistro.getLblNewLabel_3().setText("Las contrase�as no coinciden");
			return -1;
		}
		String res = "";
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
			
			salida.writeUTF("1");
			salida.writeUTF(usuario+":"+ resu);
			res = entrada.readUTF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(res.equals("ok")) {
			this.vistaRegistro.getLblNewLabel_3().setText("Usuario creado correctamente");
			try {
			Thread.sleep(2000);
			this.vistaRegistro.dispose();
			return 1;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}else {
			this.vistaRegistro.getLblNewLabel_3().setText("error: Usuario ya existe");
			return -1;
		}
		return -1;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
