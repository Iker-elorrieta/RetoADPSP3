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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listado frame = new Listado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Listado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1120, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Bizkaia");
		btnNewButton.setBounds(10, 66, 159, 69);
		contentPane.add(btnNewButton);
		
		JButton btnGipuzkoa = new JButton("Gipuzkoa");
		btnGipuzkoa.setBounds(10, 203, 159, 69);
		contentPane.add(btnGipuzkoa);
		
		JButton btnArabalaba = new JButton("Araba/Álaba");
		btnArabalaba.setBounds(10, 340, 159, 69);
		contentPane.add(btnArabalaba);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(243, 227, 148, 20);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(416, 104, 190, 292);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(630, 239, 148, 20);
		contentPane.add(comboBox_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(828, 104, 190, 292);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
	}
}
