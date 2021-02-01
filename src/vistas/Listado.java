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

public class Listado extends JFrame {


	private JPanel contentPane;
	private JTable table_1;
	private JComboBox comboBoxMunicipio,comboBoxEstaciones;
	private JButton btnBizkaia,btnGipuzkoa,btnArabalaba;
	private JTextArea textArea;
	private JComboBox comboBoxFecha,comboBoxHora;
	
	public static enum enumAcciones {
		ARABA,GIPUZKOA,BIZKAIA
	}
	public Listado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1120, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btnBizkaia = new JButton("Bizkaia");
		btnBizkaia.setBounds(10, 66, 159, 69);
		contentPane.add(btnBizkaia);
		
		btnGipuzkoa = new JButton("Gipuzkoa");
		btnGipuzkoa.setBounds(10, 203, 159, 69);
		contentPane.add(btnGipuzkoa);
		
		btnArabalaba = new JButton("Araba/Álaba");
		btnArabalaba.setBounds(10, 340, 159, 69);
		contentPane.add(btnArabalaba);
		
		comboBoxMunicipio = new JComboBox();
		comboBoxMunicipio.setBounds(243, 227, 148, 20);
		contentPane.add(comboBoxMunicipio);
		
		comboBoxEstaciones = new JComboBox();
		
		comboBoxEstaciones.setBounds(243, 378, 148, 20);
		contentPane.add(comboBoxEstaciones);
		
		textArea = new JTextArea();
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
		lblNewLabel.setBounds(249, 203, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEstaciones = new JLabel("Estaciones");
		lblEstaciones.setBounds(243, 353, 61, 14);
		contentPane.add(lblEstaciones);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(550, 202, 46, 14);
		contentPane.add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(550, 350, 46, 14);
		contentPane.add(lblHora);
		
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



	public void setComboBoxFecha(JComboBox comboBoxFecha) {
		this.comboBoxFecha = comboBoxFecha;
	}



	public JComboBox getComboBoxHora() {
		return comboBoxHora;
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

