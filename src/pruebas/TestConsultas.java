package pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

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
import Servidor.ConsultaInicial;
import Servidor.CrearUsuario;
import Servidor.Hiloconecxiones;
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
import controladores.controladorcliente;
import escribirJson.escribirJson;
import hilos.Control;
import hilos.HiloActualizarBaseDeDatos;
import hilos.HiloActualizarLinks;
import hilos.HiloActualizarPlayas;
import hilos.HiloCrearXml;
import init.Init;
import leerJson.leerJson;
import vistas.Registro;
import vistas.VentanaCliente;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestConsultas {

	Init init2 = new Init();
	private ArrayList<Objetos.Links> links;
	Control control = new Control(links);
	HiloActualizarBaseDeDatos HiloABase = new HiloActualizarBaseDeDatos(links);
	HiloActualizarLinks HiloALinks = new HiloActualizarLinks(links);
	HiloActualizarPlayas HiloAPlayas = new HiloActualizarPlayas();
	HiloCrearXml HiloCXml = new HiloCrearXml("Diarios.json", "Datos_de_Calidad", "Dato_de_Calidad");

	ConsultaEspaciosNaturales consultaENatura = new ConsultaEspaciosNaturales();
	ConsultaMunicipios conMuni = new ConsultaMunicipios();
	Consultas con = new Consultas();
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
	EstaEn estaEn = new EstaEn();
	EstaEnId estaEnId = new EstaEnId();
	Favoritos fav = new Favoritos();
	HashJson hash = new HashJson();
	Municipios muni = new Municipios();
	Provincias provin = new Provincias();
	Usuarios usu = new Usuarios();
	EscribirXml esxXml = new EscribirXml();
	comprobarPagina compPagina = new comprobarPagina();
	escribirJson escriJson = new escribirJson();
	Diarios diari = new Diarios();
	Estaciones estac = new Estaciones();
	Links zelda = new Links();
	Playas playa = new Playas();
	Pueblos pueblo = new Pueblos();
	leerJson leerJson = new leerJson();
	Estaciones estacion2 = new Estaciones(null, "", "", 1.1f, 1.2f, 1.3f, 1.4f);
	Estaciones estacion3 = new Estaciones(null, "", "", 1.1f, 1.2f, 1.3f, 1.4f, null);
	EspaciosNaturales espacio2 = new EspaciosNaturales(1, "", "", "", 1.5f, 1.6f);
	EspaciosNaturales espacio3 = new EspaciosNaturales(1, "", "", "", 1.5f, 1.6f, null);
	Municipios municipio2 = new Municipios(1, null, "");
	Municipios municipio3 = new Municipios(1, null, "", null, null);
	Favoritos fav2 = new Favoritos(null, 1, true);
	Provincias provincia2 = new Provincias(1, "");
	Provincias provincia3 = new Provincias(1, "", null);
	EstaEn estaEn2 = new EstaEn(null, null, null);
	HashJson hash2 = new HashJson("", "");
	DatosCalidad datos2 = new DatosCalidad(null, null, null);
	DatosCalidad datos3 = new DatosCalidad(null, null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null);
	Usuarios usu2 = new Usuarios("", null);
	Usuarios usu3 = new Usuarios("", null, null);

	Registro registo = new Registro(null, null);
	VentanaCliente venClien = new VentanaCliente(null, null);
	CrearUsuario crearusuario = new CrearUsuario("Hola:Adios");
	ConsultaInicial consultaInicial = new ConsultaInicial("Hola:Adios");
	ConsultaInicial consultaInicial2 = new ConsultaInicial("Hola:Adios2");
	Hiloconecxiones hiloConexiones = new Hiloconecxiones(null, null);
	Servidor servidor2 = new Servidor();
	borrarBaseDeDatos.borrar borrar = new borrarBaseDeDatos.borrar();

	@Test
	public void Prueba8BorrarBaseDeDatos() {
		assertTrue(borrar.borrado());
	}

	@Test	
	public void Prueba1IniciarTodoPrueba() {

		assertTrue(init.iniciarTodo());
	}

	@Test
	public void Prueba2IniciarTodoPruebaConHashCreado() {

		assertTrue(init.iniciarTodo());
	}

	@Test
	public void Prueba3controladorClienteprueba() {

		controladorcliente controlador = new controladorcliente();
		assertTrue(controlador.desconectar());
	}

	@Test
	public void Prueba4CrearClienteprueba() {
		crearusuario.separardatos();
		assertTrue(crearusuario.ConsultarDatos());
	}

	@Test
	public void Prueba5CrearClientepruebaError() {
		crearusuario.separardatos();

		assertFalse(crearusuario.ConsultarDatos());
	}

	@Test
	public void Prueba6CrearConsultaInicial() {
		consultaInicial.separardatos();

		assertEquals("Ciudad : Abaltzisketa", consultaInicial.CambiarVentana());
	}

	@Test
	public void Prueba7CrearConsultaInicialError() {
		consultaInicial2.separardatos();

		assertNotEquals("Abaltzisketa", consultaInicial.CambiarVentana());
	}

}
