package pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaBorrarBaseDeDatos {

	borrarBaseDeDatos.borrar borrar = new borrarBaseDeDatos.borrar();

	@Test
	public void Prueba0BorrarBaseDeDatos() {
		assertTrue(borrar.borrado());
	}

}
