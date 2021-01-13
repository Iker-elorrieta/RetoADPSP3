package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import javax.crypto.SealedObject;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Cliente.Cliente;
import ComprobarPagina.comprobarPagina;
import Hash.Diarios;
import Hash.Links;
import Hash.Playas;
import Hash.Pueblos;
import Insert.ConsultaEspaciosNaturales;
import Insert.ConsultaMunicipios;
import Insert.Consultas;
import Insert.ConsultasDatosCalidad;
import Insert.ConsultasEstaEn;
import Insert.ConsultasEstaciones;
import Insert.ConsultasHash;
import Insert.ConsultasProvincias;
import Insert.HibernateUtil;
import Servidor.Servidor;
import Tablas.DatosCalidad;
import Tablas.EspaciosNaturales;
import Tablas.EstaEn;
import Tablas.EstaEnId;
import Tablas.Estaciones;
import Tablas.Favoritos;
import Tablas.HashJson;
import Tablas.Municipios;
import Tablas.Provincias;
import Tablas.Usuarios;
import XML.EscribirXml;
import escribirJson.escribirJson;
import hilos.Control;
import hilos.HiloActualizarBaseDeDatos;
import hilos.HiloActualizarLinks;
import hilos.HiloActualizarPlayas;
import hilos.HiloCrearXml;
import leerJson.leerJson;

class ConsultasTest {
	Cliente cliente = new Cliente();
	private ArrayList<Objetos.Links> links;
	Control control = new Control(links);
	HiloActualizarBaseDeDatos HiloABase = new HiloActualizarBaseDeDatos(links);
	HiloActualizarLinks HiloALinks = new HiloActualizarLinks(links);
	HiloActualizarPlayas HiloAPlayas = new HiloActualizarPlayas();
	HiloCrearXml HiloCXml = new HiloCrearXml("Diarios.json", "Datos_de_Calidad", "Dato_de_Calidad");
	
	ConsultaEspaciosNaturales consultaENatura = new ConsultaEspaciosNaturales();
	ConsultaMunicipios conMuni = new ConsultaMunicipios();
	Consultas con=new Consultas();
	ConsultasDatosCalidad conDatCalidad = new ConsultasDatosCalidad();
	ConsultasEstaciones conEstac = new ConsultasEstaciones();
	ConsultasEstaEn conEstaEn = new ConsultasEstaEn();
	ConsultasHash conHash = new ConsultasHash();
	ConsultasProvincias conProv = new ConsultasProvincias();
	HibernateUtil hiberUtil = new HibernateUtil();
	Links lInks = new Links();
	principal.init init = new principal.init();
	Servidor servidor = new Servidor();
	DatosCalidad datCal = new DatosCalidad();
	EspaciosNaturales espNat = new EspaciosNaturales();
	Estaciones est = new Estaciones();
	EstaEn estaEn=new EstaEn();
	EstaEnId estaEnId= new EstaEnId();
	Favoritos fav = new Favoritos();
	HashJson hash = new HashJson();
	Municipios muni = new Municipios();
	Provincias provin = new Provincias();
	Usuarios usu = new Usuarios();
	EscribirXml esxXml = new EscribirXml();
	comprobarPagina compPagina=new comprobarPagina();
	escribirJson escriJson = new escribirJson();
	Diarios diari = new Diarios();
	Estaciones estac=new Estaciones();
	Links zelda = new Links();
	Playas playa = new Playas();
	Pueblos pueblo = new Pueblos();
	leerJson leerJson = new leerJson();
	Estaciones estacion2 = new Estaciones(null,"","",1.1f,1.2f,1.3f,1.4f);
	Estaciones estacion3 = new Estaciones(null,"","",1.1f,1.2f,1.3f,1.4f,null);
	EspaciosNaturales espacio2 = new EspaciosNaturales(1,"","","",1.5f,1.6f);
	EspaciosNaturales espacio3 = new EspaciosNaturales(1,"","","",1.5f,1.6f,null);
	Municipios municipio2 = new Municipios(1,null,"");
	Municipios municipio3 = new Municipios(1,null,"",null,null);
	Favoritos fav2 = new Favoritos(null,1,true);
	Provincias provincia2 = new Provincias(1,"");
	Provincias provincia3 = new Provincias(1,"",null);
	EstaEn estaEn2 = new EstaEn(null,null,null);
	HashJson hash2 = new HashJson("", "");
	DatosCalidad datos2 = new DatosCalidad(1,null,null,null);
	DatosCalidad datos3 = new DatosCalidad(1,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
	Usuarios usu2 = new Usuarios(1,"",null);
	Usuarios usu3 = new Usuarios(1,"",null,null);
	
	
	
	
//	
//	@Test
//	void consulta1() {
//		Consultas consulta = new Consultas();
//		assertTrue(consulta.insertProvincias());
//	}
//	
//	@Test
//	void consulta2() {
//		Consultas consulta = new Consultas();
//		assertTrue(consulta.insertMunicipios());
//	}
//	
//	@Test
//	void consulta3() {
//		Consultas consulta = new Consultas();
//		assertTrue(consulta.insertEstaciones());
//	}
//	
//	@Test
//	void consulta4() {
//		Consultas consulta = new Consultas();
//		assertTrue(consulta.insertDatosCalidad());
//	}
//	
//	@Test
//	void consulta5() {
//		Consultas consulta = new Consultas();
//		assertTrue(consulta.insertEspaciosNaturales());
//	}
//	
//	@Test
//	void consulta6() {
//		Consultas consulta = new Consultas();
//		assertTrue(consulta.insertUsuarios());
//	}
//	
//	@Test
//	void consulta7() {
//		Consultas consulta = new Consultas();
//		assertTrue(consulta.insertFavoritos());
//	}
//	
//	@Test
//	void consulta8() {
//		Consultas consulta = new Consultas();
//		assertTrue(consulta.insertHash());
//	}
//	
//	@Test
//	void consulta9() {
//		Consultas consulta = new Consultas();
//		assertTrue(consulta.insertEstaEn());
//	}
	
	

	@Test
	void IniciarTodoPrueba() {
		
		assertTrue(init.iniciarTodo());
	}

	@Test
	void IniciarTodoPruebaConHashCreado() {
		
		assertTrue(init.iniciarTodo());
	}
}
