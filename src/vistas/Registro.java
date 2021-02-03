package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnNewButton = new JButton("Registrar");
	private JLabel lblNewLabel_3 = new JLabel("");
	private JLabel lblNewLabel_4;
	public static enum enumAcciones {
		Registrar
	}
	
	public Registro() {
		
		
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
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 64, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Repite contrtase\u00F1a");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 95, 93, 14);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_3.setForeground(Color.WHITE);
		
		
		lblNewLabel_3.setBounds(10, 156, 500, 14);
		contentPane.add(lblNewLabel_3);

		
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(162, 61, 245, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(162, 92, 245, 20);
		contentPane.add(passwordField_1);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("Fotos/SPOILER_NO.png"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_4);
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


	public JPasswordField getPasswordField_1() {
		return passwordField_1;
	}


	public void setPasswordField_1(JPasswordField passwordField_1) {
		this.passwordField_1 = passwordField_1;
	}


	public JButton getBtnNewButton() {
		return btnNewButton;
	}


	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}


	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}


	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}


	
	
	

	
}
