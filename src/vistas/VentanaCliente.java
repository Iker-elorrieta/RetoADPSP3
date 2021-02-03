package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class VentanaCliente extends JFrame {

	private JPanel contentPane;
	public static enum enumAcciones {
		ENTRAR,REGISTRO
	}
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnEntrar;
	private JButton btnRegistro;
	
	JLabel LBL1 = new JLabel("Desconectado");
	private JLabel lblNewLabel_2;
	public VentanaCliente() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		LBL1.setForeground(Color.WHITE);
		
		
		LBL1.setBounds(10, 11, 414, 14);
		contentPane.add(LBL1);
		
		textField = new JTextField();
		textField.setBounds(93, 94, 356, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 97, 73, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 129, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(92, 126, 357, 20);
		contentPane.add(passwordField);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(93, 212, 89, 23);
		contentPane.add(btnEntrar);
		
		btnRegistro = new JButton("Registrate");
		btnRegistro.setBounds(262, 212, 89, 23);
		contentPane.add(btnRegistro);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("Fotos/Inicio.png"));
		lblNewLabel_2.setBounds(0, 0, 553, 466);
		contentPane.add(lblNewLabel_2);
		
	}
	
	
	
	
	public JLabel getLBL1() {
		return LBL1;
	}




	public JTextField getTextField() {
		return textField;
	}




	public void setTextField(JTextField textField) {
		this.textField = textField;
	}




	public JPasswordField getPasswordField() {
		return passwordField;
	}




	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}




	public JButton getBtnEntrar() {
		return btnEntrar;
	}




	public void setBtnEntrar(JButton btnEntrar) {
		this.btnEntrar = btnEntrar;
	}




	public JButton getBtnRegistro() {
		return btnRegistro;
	}




	public void setBtnRegistro(JButton btnRegistro) {
		this.btnRegistro = btnRegistro;
	}




	public void setLBL1(JLabel lBL1) {
		LBL1 = lBL1;
	}


	
	
	
}
