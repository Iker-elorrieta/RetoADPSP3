package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Listado extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JComboBox comboBoxMunicipio,comboBoxEstaciones;
	private JButton btnBizkaia,btnGipuzkoa,btnArabalaba;
	
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(416, 104, 190, 292);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		comboBoxEstaciones = new JComboBox();
		comboBoxEstaciones.setBounds(630, 239, 148, 20);
		contentPane.add(comboBoxEstaciones);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(828, 104, 190, 292);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTable getTable_1() {
		return table_1;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}

	public JComboBox getComboBoxMunicipio() {
		return comboBoxMunicipio;
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
	
	
	
	
	
	
}
