package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Listado extends JFrame {


	private JPanel contentPane;
	private JTable table_1;
	private JComboBox comboBoxMunicipio,comboBoxEstaciones;
	private JButton btnBizkaia,btnGipuzkoa,btnArabalaba;
	private JTextArea textArea;
	private JComboBox comboBoxFecha,comboBoxHora;
	private JButton btnTop;
	private JButton btnNewButton;
	private JComboBox BoxTipoDeDato;
	private JComboBox comboBoxTopProv;
	private JLabel lblTop5;
	private JLabel lblNewLabel_2;
	public static enum enumAcciones {
		ARABA,GIPUZKOA,BIZKAIA,TOP,CAMBIAR
	}
	public Listado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1120, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btnBizkaia = new JButton("Bizkaia");
		 btnBizkaia.setIcon(new ImageIcon("Fotos/BizkaiaBoton.png"));
		btnBizkaia.setBounds(10, 64, 142, 69);
		contentPane.add(btnBizkaia);
		
		btnGipuzkoa = new JButton("Gipuzkoa");
		btnGipuzkoa.setIcon(new ImageIcon("Fotos/GipuzkoaBoton.png"));
		btnGipuzkoa.setBounds(10, 176, 142, 69);
		contentPane.add(btnGipuzkoa);
		
		btnArabalaba = new JButton("Araba/Álaba");
		btnArabalaba.setIcon(new ImageIcon("Fotos/ArabaBoton.png"));
		btnArabalaba.setBounds(10, 277, 142, 69);
		contentPane.add(btnArabalaba);
		
		comboBoxMunicipio = new JComboBox();
		comboBoxMunicipio.setBounds(243, 227, 148, 20);
		contentPane.add(comboBoxMunicipio);
		
		comboBoxEstaciones = new JComboBox();
		
		comboBoxEstaciones.setBounds(243, 378, 148, 20);
		contentPane.add(comboBoxEstaciones);
		
		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setForeground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setBounds(746, 130, 285, 253);
		contentPane.add(textArea);
		
		comboBoxFecha = new JComboBox();
		comboBoxFecha.setBounds(550, 227, 148, 20);
		contentPane.add(comboBoxFecha);
		
		comboBoxHora = new JComboBox();
		comboBoxHora.setBounds(550, 375, 148, 20);
		contentPane.add(comboBoxHora);
		
		
		JLabel lblNewLabel = new JLabel("Municipio");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(249, 203, 80, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEstaciones = new JLabel("Estaciones");
		lblEstaciones.setForeground(Color.WHITE);
		lblEstaciones.setBounds(243, 353, 104, 14);
		contentPane.add(lblEstaciones);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setBounds(550, 202, 104, 14);
		contentPane.add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setForeground(Color.WHITE);
		lblHora.setBounds(550, 350, 104, 14);
		contentPane.add(lblHora);
		
		btnTop = new JButton("Top_5");	
		btnTop.setIcon(new ImageIcon("Fotos/top5.png"));
		btnTop.setBounds(10, 378, 142, 69);
		contentPane.add(btnTop);
		
		btnNewButton = new JButton("Espacios Naturales");
		btnNewButton.setIcon(new ImageIcon("Fotos/EspaciosNaturales.png"));
		btnNewButton.setBounds(817, 449, 142, 64);
		contentPane.add(btnNewButton);
		
		BoxTipoDeDato = new JComboBox();
		BoxTipoDeDato.setModel(new DefaultComboBoxModel(new String[] {"comgM3", "co8hmgM3", "nogm3", "no2", "no2ica", "noxgm3", "pm10", "pm10ica", "pm25", "pm25ica", "so2", "so2ica", "icastation"}));
		BoxTipoDeDato.setBounds(10, 458, 159, 22);
		contentPane.add(BoxTipoDeDato);
		
		comboBoxTopProv = new JComboBox();
		comboBoxTopProv.setBounds(366, 137, 148, 20);
		contentPane.add(comboBoxTopProv);
		
		lblTop5 = new JLabel("Municipio");
		lblTop5.setForeground(Color.WHITE);
		lblTop5.setBounds(366, 113, 217, 14);
		contentPane.add(lblTop5);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("Fotos/Opacidad.png"));
		lblNewLabel_2.setBounds(746, 130, 285, 253);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("Fotos/fondo2.png"));
		lblNewLabel_1.setBounds(0, 0, 1124, 535);
		contentPane.add(lblNewLabel_1);
		
	}
		/*table_1 = new JTable();
		table_1.setShowHorizontalLines( false );
		table_1.setRowSelectionAllowed( true );
		table_1.setColumnSelectionAllowed( true );
	    // Cambiamos el color de la zona seleccionada (rojo/blanco)
		table_1.setSelectionForeground( Color.white );
		table_1.setSelectionBackground( Color.red );
	    // Incorporamos la tabla a un panel que incorpora ya una barra
	    // de desplazamiento, para que la visibilidad de la tabla sea
	    // automática
		scrollPane_1.setViewportView(table_1);
		contentPane.add(table_1);
	}

	public JTable getTable_1() {
		return table_1;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
		
	}*/
	
	

	public JComboBox getComboBoxMunicipio() {
		return comboBoxMunicipio;
	}

	public JComboBox getComboBoxFecha() {
		return comboBoxFecha;
	}



	public JComboBox getComboBoxTopProv() {
		return comboBoxTopProv;
	}



	public void setComboBoxTopProv(JComboBox comboBoxTopProv) {
		this.comboBoxTopProv = comboBoxTopProv;
	}



	public JLabel getLblTop5() {
		return lblTop5;
	}



	public void setLblTop5(JLabel lblTop5) {
		this.lblTop5 = lblTop5;
	}



	public void setComboBoxFecha(JComboBox comboBoxFecha) {
		this.comboBoxFecha = comboBoxFecha;
	}



	public JComboBox getComboBoxHora() {
		return comboBoxHora;
	}



	public JButton getBtnTop() {
		return btnTop;
	}



	public void setBtnTop(JButton btnTop) {
		this.btnTop = btnTop;
	}



	public JComboBox getBoxTipoDeDato() {
		return BoxTipoDeDato;
	}



	public void setBoxTipoDeDato(JComboBox boxTipoDeDato) {
		BoxTipoDeDato = boxTipoDeDato;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}



	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}



	public void setComboBoxHora(JComboBox comboBoxHora) {
		this.comboBoxHora = comboBoxHora;
	}



	public void setComboBoxMunicipio(JComboBox comboBoxMunicipio) {
		this.comboBoxMunicipio = comboBoxMunicipio;
	}

	public JComboBox getComboBoxEstaciones() {
		return comboBoxEstaciones;
	}

	public void setComboBoxEstaciones(JComboBox comboBoxEstaciones) {
		this.comboBoxEstaciones = comboBoxEstaciones;
	}

	public JButton getBtnBizkaia() {
		return btnBizkaia;
	}

	public void setBtnBizkaia(JButton btnBizkaia) {
		this.btnBizkaia = btnBizkaia;
	}

	public JButton getBtnGipuzkoa() {
		return btnGipuzkoa;
	}

	public void setBtnGipuzkoa(JButton btnGipuzkoa) {
		this.btnGipuzkoa = btnGipuzkoa;
	}

	public JButton getBtnArabalaba() {
		return btnArabalaba;
	}

	public void setBtnArabalaba(JButton btnArabalaba) {
		this.btnArabalaba = btnArabalaba;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
}

