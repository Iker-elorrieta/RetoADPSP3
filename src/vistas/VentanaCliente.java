package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class VentanaCliente extends JFrame {

	private JPanel contentPane;
	JLabel LBL1 = new JLabel("Desconectado");
	private JTextField textField;
	private JPasswordField passwordField;
	
	DataInputStream entrada = null;
	DataOutputStream salida = null;

	public VentanaCliente(DataInputStream in, DataOutputStream out) {
		
		entrada = in;
		salida = out;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		LBL1.setBounds(10, 11, 414, 14);
		contentPane.add(LBL1);
		
		textField = new JTextField();
		textField.setBounds(93, 94, 356, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(10, 97, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(10, 129, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(92, 126, 357, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrar();
			}
		});
		btnNewButton.setBounds(93, 212, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrate");
		btnNewButton_1.setBounds(262, 212, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro reg = new Registro(entrada, salida);
				reg.setVisible(true);
			}
		});
		
	}
	
	public void entrar() {
		
	}
	
	
	public JLabel getLBL1() {
		return LBL1;
	}


	public DataInputStream getEntrada() {
		return entrada;
	}


	public void setEntrada(DataInputStream entrada) {
		this.entrada = entrada;
	}


	public DataOutputStream getSalida() {
		return salida;
	}


	public void setSalida(DataOutputStream salida) {
		this.salida = salida;
	}
	
	
}
