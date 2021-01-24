package pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import controladores.controladorcliente;

public class PruebasCliente {
	
	
	
	@Test
	public void testCliente() {
		controladorcliente ctr = new controladorcliente();
		ctr.pruebaRegistro();
		ctr.pruebainiciarSesionCliente();
		ctr.pruebaAñadirDatosCerrar();
	}

}
