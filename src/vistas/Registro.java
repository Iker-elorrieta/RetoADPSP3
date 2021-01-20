package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnNewButton = new JButton("Registrar");
	private JLabel lblNewLabel_3 = new JLabel("");
	DataInputStream entrada = null;
	DataOutputStream salida = null;

	public Registro(DataInputStream in, DataOutputStream out) {
		
		entrada = in;
		salida = out;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(162, 30, 245, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(10, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(10, 64, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Repite contrtase\u00F1a");
		lblNewLabel_2.setBounds(10, 95, 93, 14);
		contentPane.add(lblNewLabel_2);
		
		
		lblNewLabel_3.setBounds(10, 156, 500, 14);
		contentPane.add(lblNewLabel_3);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValidarDatos();
			}
		});
		
		
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(162, 61, 245, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(162, 92, 245, 20);
		contentPane.add(passwordField_1);
	}
	
	
	
	public int ValidarDatos(){
		
		String usuario = textField.getText();
		char[] pass1 = passwordField.getPassword();
		char[] pass2 = passwordField_1.getPassword();

		if(usuario.length() == 0) {
			lblNewLabel_3.setText("El campo de usuario no puede estar vacio");
			return -1;
		}
		if(pass1.length == 0) {
			lblNewLabel_3.setText("El campo de Contrase�a no puede estar vacio");
			return -1;
		}
		if(pass2.length == 0) {
			lblNewLabel_3.setText("El campo de Repetir Contrase�a no puede estar vacio");
			return -1;
		}
		if(pass1.equals(pass2)) {
			lblNewLabel_3.setText("Las contrase�as no coinciden");
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
			lblNewLabel_3.setText("Usuario creado correctamente");
			try {
			Thread.sleep(2000);
			dispose();
			return 1;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}else {
			lblNewLabel_3.setText("error: Usuario ya existe");
			return -1;
		}
		return -1;
		
		
	}
	
}
