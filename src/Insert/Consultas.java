package Insert;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Tablas.DatosCalidad;
import Tablas.EspaciosNaturales;
import Tablas.Estaciones;
import Tablas.Favoritos;
import Tablas.HashJson;
import Tablas.Municipios;
import Tablas.Provincias;
import Tablas.Usuarios;

public class Consultas {
	

	

	public boolean insertProvincias() {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		Provincias provincia = provincia();

		
		session.save(provincia);
		session.getTransaction().commit();
		

		
		System.out.println("PROVINCIA CREADA");
		session.close();
		
		return true;

	}
	
	public boolean insertMunicipios() {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		Municipios municipio = municipio();

		
		session.save(municipio);
		session.getTransaction().commit();
		

		System.out.println("MUNICIPIO CREADO");
		session.close();
		
		return true;

	}
	
	public boolean insertEstaciones() {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
				
		Estaciones estacion = estacion();
		
		session.save(estacion);
		session.getTransaction().commit();
		

		
		System.out.println("ESTACION CREADA");
		session.close();
		
		return true;

	}
	
	public boolean insertDatosCalidad() {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		DatosCalidad datos = datos();
		
		session.save(datos);
		session.getTransaction().commit();
		

		
		System.out.println("DATOS CREADOS");
		session.close();
		
		return true;

	}
	
	
	public boolean insertEspaciosNaturales() {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
				
		EspaciosNaturales espacios = espacios();
		
		session.save(espacios);
		session.getTransaction().commit();
		

		
		System.out.println("ESTACION CREADA");
		session.close();
		
		return true;

	}
	
	public boolean insertUsuarios() {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		

		 Usuarios usuario = usuario();
		
		session.save(usuario);
		session.getTransaction().commit();
		

		
		System.out.println("USUARIO CREADO");
		session.close();
		
		return true;

	}
	
	public boolean insertFavoritos() {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		Favoritos favorito = favorito();
		
		session.save(favorito);
		session.getTransaction().commit();
		

		
		System.out.println("FAVORITO CREADO");
		session.close();
		
		return true;

	}
	
	public boolean insertHash() {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		
		 HashJson hash = hash();
		
		session.save(hash);
		session.getTransaction().commit();
		

		System.out.println("HASH CREADO");
		session.close();
		
		return true;

	}
	
	
	public Provincias provincia() {
		
		Provincias provincia = new Provincias();
		provincia.setNombre("Bizkaia");
		provincia.setCodProvincia(48);
		
		return provincia;
	}
	
	public Municipios municipio() {
		Municipios municipio = new Municipios();
		municipio.setCodMunicipio(013);
		municipio.setNombre("Barakaldo");
		municipio.setProvincias(provincia());
		
		return municipio;
		
	}
	
	public Estaciones estacion() {
		Estaciones estacion = new Estaciones();
		estacion.setNombre("MUNOA");
		estacion.setDireccion("C/ Llano, 55. CEP Munoa. Bº Lutxana");
		estacion.setCoordenadaX((float) 501728.39);
		estacion.setCoordenadaY((float) 4792529.8721);
		estacion.setLatitud((float) 43.28558799716144);
		estacion.setLongitud((float) -2.978696000976749);
		estacion.setMunicipios(municipio());
		
		return estacion;
	}

	public DatosCalidad datos() {
		java.util.Date utilDate = new java.util.Date();
		java.sql.Date fecha = new java.sql.Date(utilDate.getTime());
		Time hora = new Time(11,00,00);

		
		DatosCalidad datos = new DatosCalidad();

		datos.setFecha(fecha);
		datos.setHora(hora);
		datos.setComgM3((float) 0.23);
		datos.setCo8hmgM3((float) 0.21);
		datos.setNogm3(3);
		datos.setNo2(10);
		datos.setNo2ica("muy bueno / oso ona");
		datos.setNoxgm3(14);
		datos.setPm10((float) 5.33);
		datos.setPm10ica("muy bueno / oso ona");
		datos.setPm25((float) 3.58);
		datos.setPm25ica("muy bueno / oso ona");
		datos.setSo2(4);
		datos.setSo2ica("muy bueno / oso ona");
		datos.setIcastation("muy bueno / oso ona");
		datos.setEstaciones(estacion());
		
		return datos;
	}
	
	public EspaciosNaturales espacios() {
		EspaciosNaturales espacios = new EspaciosNaturales();
		espacios.setNombreEspacio("Barakaldo");
		espacios.setMarca("Bilbao");
		espacios.setNatureType("Ciudad");
		espacios.setLatwgs84((float) 43.28066802127562);
		espacios.setLongwgs84((float) -1.947645730688464);

		return espacios;
	}
	
	public Usuarios usuario() {
		Usuarios usuario = new Usuarios();
		usuario.setNombre("Perry");
		usuario.setPass("reto");
		
		return usuario;
	}
	
	public Favoritos favorito() {
		Favoritos favorito = new Favoritos();
		favorito.setUsuarios(usuario());
		favorito.setCodUbicacion(1);
		favorito.setTipoUbicacion(true);
		
		return favorito;
	}
	
	public HashJson hash() {
		HashJson hash = new HashJson();

		hash.setHash("8b9248a4e0b64bbccf82e7723a3734279bf9bbc4");
		hash.setUrl("https://opendata.euskadi.eus/contenidos/ds_informes_estudios/calidad_aire_2020/es_def/adjuntos/datos_indice/BARAKALDO.json");
		return hash;
	}

}
