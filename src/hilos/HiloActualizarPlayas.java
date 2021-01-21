package hilos;

import java.util.ArrayList;

import Insert.ConsultaEspaciosNaturales;
import Insert.ConsultasEstaEn;
import Tablas.EspaciosNaturales;
import Tablas.EstaEn;

public class HiloActualizarPlayas  extends Thread{
	
	private Hash.Playas playas = new Hash.Playas();
	private ArrayList<EspaciosNaturales> espacios;
	private ArrayList<EstaEn> estanEn;
	private ConsultaEspaciosNaturales consultasEspacios = new ConsultaEspaciosNaturales();
	private ConsultasEstaEn consultasEstaEn = new ConsultasEstaEn();
	
	public void run() {
		
		espacios=new ArrayList<EspaciosNaturales>();
		estanEn=new ArrayList<EstaEn>();
		playas.comprobarHashPlayas(espacios,estanEn);
		consultasEspacios.insertEspaciosNaturales(espacios);
		//escribirXML.escribirXmlEspacios(espacios);
		consultasEstaEn.insertEstaEn(estanEn);
	}
}
