package hilos;

import XML.EscribirXml;

public class HiloCrearXml extends Thread{
	
	private String nombreFichero;
	private String nombreRaiz;
	private String nombreSecundario;

	private EscribirXml escribirXML = new EscribirXml();
	
	
	
	public HiloCrearXml(String nombreFichero, String nombreRaiz, String nombreSecundario) {
		super();
		this.nombreFichero = nombreFichero;
		this.nombreRaiz = nombreRaiz;
		this.nombreSecundario = nombreSecundario;
	}



	public void run() {
		
		escribirXML.convertJsonToXml(nombreFichero, nombreRaiz, nombreSecundario, nombreFichero.replace(".json", ".xml"), "");
	}
}
