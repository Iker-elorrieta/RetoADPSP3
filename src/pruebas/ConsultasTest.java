package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Insert.Consultas;

class ConsultasTest {
	
	@Test
	void consulta1() {
		Consultas consulta = new Consultas();
		assertTrue(consulta.insertProvincias());
	}
	
	@Test
	void consulta2() {
		Consultas consulta = new Consultas();
		assertTrue(consulta.insertMunicipios());
	}
	
	@Test
	void consulta3() {
		Consultas consulta = new Consultas();
		assertTrue(consulta.insertEstaciones());
	}
	
	@Test
	void consulta4() {
		Consultas consulta = new Consultas();
		assertTrue(consulta.insertDatosCalidad());
	}
	
	@Test
	void consulta5() {
		Consultas consulta = new Consultas();
		assertTrue(consulta.insertEspaciosNaturales());
	}
	
	@Test
	void consulta6() {
		Consultas consulta = new Consultas();
		assertTrue(consulta.insertUsuarios());
	}
	
	@Test
	void consulta7() {
		Consultas consulta = new Consultas();
		assertTrue(consulta.insertFavoritos());
	}
	
	@Test
	void consulta8() {
		Consultas consulta = new Consultas();
		assertTrue(consulta.insertHash());
	}

}
