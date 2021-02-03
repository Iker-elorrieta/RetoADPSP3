package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;

import Tablas.DatosCalidad;
import Tablas.EspaciosNaturales;
import Tablas.Estaciones;
import Tablas.Municipios;
import vistas.Listado;
import vistas.ListadoEspaciosNaturales;
import vistas.Registro;
import vistas.VentanaCliente;

public class controladorListadoEspacioNatural implements ActionListener {

	ListadoEspaciosNaturales vistaListadoEspaciosNaturales;
	DataInputStream entrada = null;
	DataOutputStream salida = null;
	ObjectInputStream entradaf = null;

	public controladorListadoEspacioNatural(ListadoEspaciosNaturales vistaListadoEspaciosNaturales, DataInputStream in, DataOutputStream out, ObjectInputStream inf) {
		super();
		this.vistaListadoEspaciosNaturales = vistaListadoEspaciosNaturales;
		entrada = in;
		salida = out;
		entradaf = inf;
	
		iniciarControlador();
	}

	private void iniciarControlador() {

		
		vistaListadoEspaciosNaturales.getComboBoxMunicipio().addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (!rellenandoBoxMuni) {
					
					RellenarComboBoxEstac(vistaListadoEspaciosNaturales.getComboBoxMunicipio().getSelectedItem().toString());
				}
			}
		});

		vistaListadoEspaciosNaturales.getComboBoxEstaciones().addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (!rellenandoBoxEsta) {
					RellenarComboFecha(vistaListadoEspaciosNaturales.getComboBoxMunicipio().getSelectedItem().toString(),
							vistaListadoEspaciosNaturales.getComboBoxEstaciones().getSelectedItem().toString());
				}
			}
		});

		vistaListadoEspaciosNaturales.getComboBoxFecha().addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (!rellenandoBoxFecha) {
					RellenarComboHora(vistaListadoEspaciosNaturales.getComboBoxMunicipio().getSelectedItem().toString(),
							vistaListadoEspaciosNaturales.getComboBoxEstaciones().getSelectedItem().toString(),
							vistaListadoEspaciosNaturales.getComboBoxFecha().getSelectedItem().toString());
				}
			}
		});

		vistaListadoEspaciosNaturales.getComboBoxHora().addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				
					
						RellenarTabla(vistaListadoEspaciosNaturales.getComboBoxMunicipio().getSelectedItem().toString(),
								vistaListadoEspaciosNaturales.getComboBoxEstaciones().getSelectedItem().toString(),
								vistaListadoEspaciosNaturales.getComboBoxFecha().getSelectedItem().toString(),
								vistaListadoEspaciosNaturales.getComboBoxHora().getSelectedItem().toString());
					
				
			}
		});

		this.vistaListadoEspaciosNaturales.getBtnArabalaba().addActionListener(this);
		this.vistaListadoEspaciosNaturales.getBtnArabalaba().setActionCommand(ListadoEspaciosNaturales.enumAcciones.ARABA.toString());
		this.vistaListadoEspaciosNaturales.getBtnBizkaia().addActionListener(this);
		this.vistaListadoEspaciosNaturales.getBtnBizkaia().setActionCommand(ListadoEspaciosNaturales.enumAcciones.BIZKAIA.toString());
		this.vistaListadoEspaciosNaturales.getBtnGipuzkoa().addActionListener(this);
		this.vistaListadoEspaciosNaturales.getBtnGipuzkoa().setActionCommand(ListadoEspaciosNaturales.enumAcciones.GIPUZKOA.toString());
		this.vistaListadoEspaciosNaturales.getBtnNewButton().addActionListener(this);
		this.vistaListadoEspaciosNaturales.getBtnNewButton().setActionCommand(ListadoEspaciosNaturales.enumAcciones.CAMBIAR.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Listado.enumAcciones accion = Listado.enumAcciones.valueOf(e.getActionCommand());

		switch (accion) {
		case ARABA:
			rellenarComboBoxMuni("Araba/Álava");
			break;
		case BIZKAIA:
			rellenarComboBoxMuni("Bizkaia");
			break;
		case GIPUZKOA:
			rellenarComboBoxMuni("Gipuzkoa");
			break;
		case CAMBIAR:
			cambiar();
			break;
		}
	}
	
	public void cambiar() {
		Listado listado = new Listado();
		controladorListado controladorListado = new controladorListado(listado,entrada,salida,entradaf);
		vistaListadoEspaciosNaturales.dispose();
		listado.setVisible(true);
	}
	public void rellenarComboBoxMuni(String Nombre) {
		rellenandoBoxMuni = true;
		vistaListadoEspaciosNaturales.getComboBoxMunicipio().removeAllItems();
		try {
			salida.writeUTF("10");
			salida.writeUTF(Nombre);
			ArrayList<String> spNatu = (ArrayList<String>) entradaf.readObject();
			for (String spNat : spNatu) {
				
				vistaListadoEspaciosNaturales.getComboBoxMunicipio().addItem(spNat);

			}
			rellenandoBoxMuni = false;
			RellenarComboBoxEstac(vistaListadoEspaciosNaturales.getComboBoxMunicipio().getSelectedItem().toString());
		} catch (IOException e1) {

		} catch (ClassNotFoundException e1) {
		}

	}

	
	

	private boolean rellenandoBoxMuni = true;
	private boolean rellenandoBoxEsta = true;
	private boolean rellenandoBoxHora = true;
	private boolean rellenandoBoxFecha = true;

	public void RellenarComboBoxEstac(String Nombre) {
		rellenandoBoxEsta = true;
		vistaListadoEspaciosNaturales.getComboBoxEstaciones().removeAllItems();
		try {

			salida.writeUTF("11");
			salida.writeUTF(Nombre);
			List<Tablas.Estaciones> estac = (List<Tablas.Estaciones>) entradaf.readObject();
			for (Estaciones esta : estac) {
				vistaListadoEspaciosNaturales.getComboBoxEstaciones().addItem(esta.getNombre());

			}
			rellenandoBoxEsta = false;
			RellenarComboFecha(vistaListadoEspaciosNaturales.getComboBoxMunicipio().getSelectedItem().toString(),
					vistaListadoEspaciosNaturales.getComboBoxEstaciones().getSelectedItem().toString());
		} catch (IOException e1) {
			// TODO Auto-generated catch block

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block

		}
	}

	String[] titulo = { "Tipo De Dato", "Calculos" };
	private JTable tabla;

	public void RellenarTabla(String Nombre, String Nombre2, String Nombre3, String Nombre4) {
		int contador = 0;

		ArrayList<String> tipoDeDato = new ArrayList<String>();
		ArrayList<String> Calculos = new ArrayList<String>();
		this.vistaListadoEspaciosNaturales.getTextArea().setText("");
		try {
			salida.writeUTF("14");
			salida.writeUTF(Nombre + "_" + Nombre2 + "_" + Nombre3 + "_" + Nombre4);
			List<DatosCalidad> datosCalid = (List<DatosCalidad>) entradaf.readObject();
			
			for (DatosCalidad datosCali : datosCalid) {

				if (datosCali.getFecha() != null) {
					tipoDeDato.add("Fecha");
					Calculos.add(datosCali.getFecha().toString());
					contador++;
				}
				
				if (datosCali.getHora() != null) {
					tipoDeDato.add("Hora");
					Calculos.add(datosCali.getHora().toString());
					contador++;
				}
				if (datosCali.getComgM3() != null) {
					tipoDeDato.add("ComgM3");
					Calculos.add(datosCali.getComgM3().toString());
					contador++;
				}
				if (datosCali.getCo8hmgM3() != null) {
					tipoDeDato.add("Co8hmgM3");
					Calculos.add(datosCali.getCo8hmgM3().toString());
					contador++;
				}
				if (datosCali.getNogm3() != null) {
					tipoDeDato.add("NOgm3");
					Calculos.add(datosCali.getNogm3().toString());
					contador++;
				}
				if (datosCali.getNo2() != null) {
					tipoDeDato.add("NO2");
					Calculos.add(datosCali.getNo2().toString());
					contador++;
				}
				if (datosCali.getNo2ica() != null) {
					tipoDeDato.add("NO2ICA");
					Calculos.add(datosCali.getNo2ica().toString());
					contador++;
				}
				if (datosCali.getNoxgm3() != null) {
					tipoDeDato.add("NOXgm3");
					Calculos.add(datosCali.getNoxgm3().toString());
					contador++;
				}
				if (datosCali.getPm10() != null) {
					tipoDeDato.add("PM10");
					Calculos.add(datosCali.getPm10().toString());
					contador++;
				}
				if (datosCali.getPm10ica() != null) {
					tipoDeDato.add("PM10ICA");
					Calculos.add(datosCali.getPm10ica().toString());
					contador++;
				}
				if (datosCali.getPm25() != null) {
					tipoDeDato.add("PM25");
					Calculos.add(datosCali.getPm25().toString());
					contador++;
				}
				if (datosCali.getPm25ica() != null) {
					tipoDeDato.add("PM25ICA");
					Calculos.add(datosCali.getNo2().toString());
					contador++;
				}
				if (datosCali.getSo2() != null) {
					tipoDeDato.add("SO2");
					Calculos.add(datosCali.getSo2().toString());
					contador++;
				}
				if (datosCali.getSo2ica() != null) {
					tipoDeDato.add("SO2ICA");
					Calculos.add(datosCali.getSo2ica().toString());
					contador++;
				}
				if (datosCali.getIcastation() != null) {
					tipoDeDato.add("ICAStation");
					Calculos.add(datosCali.getIcastation().toString());
					contador++;
				}
				break;
			}
			String[][] dato = new String[tipoDeDato.size()][Calculos.size()];
			
			for (int x = 0; x < tipoDeDato.size(); x++) {
				dato[x][0] = tipoDeDato.get(x);
				dato[x][1] = Calculos.get(x);
				/*
				 * System.out.println("estoy aqui"); System.out.println(Calculos.get(x));
				 */
				this.vistaListadoEspaciosNaturales.getTextArea().append(dato[x][0] + " : " + dato[x][1] + "\n");
			}
			/*
			 * tabla =new JTable(dato,titulo); vistaListado.setTable_1(tabla);
			 */

		} catch (IOException e1) {
			// TODO Auto-generated catch block

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block

		}
	}

	private java.util.Date Fecha = null;

	public void RellenarComboFecha(String Nombre, String Nombre2) {
		rellenandoBoxFecha = true;
		int contador = 0;

		this.vistaListadoEspaciosNaturales.getTextArea().setText("");
		try {
			salida.writeUTF("12");
			salida.writeUTF(Nombre + ":" + Nombre2);
			List<Tablas.DatosCalidad> datosCali = (List<Tablas.DatosCalidad>) entradaf.readObject();

			for (DatosCalidad datoCal : datosCali) {
				
				if (Fecha == null) {
					Fecha = datoCal.getFecha();
					vistaListadoEspaciosNaturales.getComboBoxFecha().addItem(datoCal.getFecha());
				}

				else if (!Fecha.toString().equals(datoCal.getFecha().toString())) {
					Fecha = datoCal.getFecha();
					vistaListadoEspaciosNaturales.getComboBoxFecha().addItem(datoCal.getFecha());
				}
			}
			/*
			 * tabla =new JTable(dato,titulo); vistaListado.setTable_1(tabla);
			 */

		} catch (IOException e1) {
			// TODO Auto-generated catch block

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block

		}
		rellenandoBoxFecha = false;
		RellenarComboHora(vistaListadoEspaciosNaturales.getComboBoxMunicipio().getSelectedItem().toString(),
				vistaListadoEspaciosNaturales.getComboBoxEstaciones().getSelectedItem().toString(),
				vistaListadoEspaciosNaturales.getComboBoxFecha().getSelectedItem().toString());
	}

	public void RellenarComboHora(String Nombre, String Nombre2, String Nombre3) {
		rellenandoBoxHora = true;
		int contador = 0;
		rellenandoBoxEsta = true;
		this.vistaListadoEspaciosNaturales.getTextArea().setText("");
		try {
			salida.writeUTF("13");
			salida.writeUTF(Nombre + ":" + Nombre2 + ":" + Nombre3);
			List<Tablas.DatosCalidad> datosCali = (List<Tablas.DatosCalidad>) entradaf.readObject();
			for (DatosCalidad datoCal : datosCali) {

				if (Fecha == null) {
					Fecha = datoCal.getHora();
					vistaListadoEspaciosNaturales.getComboBoxHora().addItem(datoCal.getHora());
				}

				else if (!Fecha.toString().equals(datoCal.getHora().toString())) {
					Fecha = datoCal.getHora();
					vistaListadoEspaciosNaturales.getComboBoxHora().addItem(datoCal.getHora());
				}
			}
			/*
			 * tabla =new JTable(dato,titulo); vistaListado.setTable_1(tabla);
			 */

		} catch (IOException e1) {
			// TODO Auto-generated catch block

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block

		}
		rellenandoBoxHora = false;
		
			RellenarTabla(vistaListadoEspaciosNaturales.getComboBoxMunicipio().getSelectedItem().toString(),
					vistaListadoEspaciosNaturales.getComboBoxEstaciones().getSelectedItem().toString(),
					vistaListadoEspaciosNaturales.getComboBoxFecha().getSelectedItem().toString(),
					vistaListadoEspaciosNaturales.getComboBoxHora().getSelectedItem().toString());

		
	}

	public void cerrarServer() {
		try {
			salida.writeUTF("0");
		} catch (IOException e) {
			// TODO Auto-generated catch block

		}
	}

	public void pruebaMunicipiosDatos() {
		rellenarComboBoxMuni("Araba/Álava");
		rellenarComboBoxMuni("Bizkaia");
		rellenarComboBoxMuni("Gipuzkoa");
		cerrarServer();
	}
}
