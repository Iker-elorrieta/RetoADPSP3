package pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import Servidor.Servidor;

public class pruebasServidor {

	private Servidor servidor = new Servidor();
	
	@Test
	public void testServidor() {
		servidor.iniciar();
		servidor.activo=false;
	}


}
