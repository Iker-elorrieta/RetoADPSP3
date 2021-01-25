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
	
	@Test
	public void testClienteError() {
		controladorcliente ctr = new controladorcliente();
		ctr.pruebaRegistro();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		ctr.desconectar();
	}

}
