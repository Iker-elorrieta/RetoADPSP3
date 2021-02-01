package Insert;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Tablas.DatosCalidad;
import Tablas.Estaciones;

public class ConsultasDatosCalidad {
	String nombreMuni,nombreEsta,Fecha;
	
	public int separardatos(String dat) {
		try {
			String inf[] = dat.split(":");
			nombreMuni = inf[0];
			nombreEsta = inf[1];
			return 1;
		} catch (Exception e) {
			return -1;
		}

	}
	public int separardatos2(String dat) {
		try {
			String inf[] = dat.split(":");
			nombreMuni = inf[0];
			nombreEsta = inf[1];
			Fecha = inf[2];
			return 1;
		} catch (Exception e) {
			return -1;
		}

	}
	public boolean insertDatosCalidad(DatosCalidad datoCalidad) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
			
			try {
		
			session.beginTransaction();
			session.save(datoCalidad);
			session.getTransaction().commit();
			
		
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("valor repetido");
			}	
			
			
			session.close();
			return true;

	}
	DatosCalidad dato;
	public List recogerDatosCalidad(ArrayList<DatosCalidad> datos) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		boolean agregar = true;
		System.out.println(nombreEsta);
		System.out.println(nombreMuni);
		String hql= "From DatosCalidad where estaciones.codEstacion = (select codEstacion from Estaciones where nombre='" + nombreEsta + "')";
		System.out.println("holaaaaaa");
		Query q= (Query) session.createQuery(hql);
		return q.list();
		
			
		
		
	}
	
	public List recogerDatosCalidadHora(ArrayList<DatosCalidad> datos) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		boolean agregar = true;
		System.out.println(nombreEsta);
		System.out.println(nombreMuni);
		String hql= "From DatosCalidad where estaciones.codEstacion = (select codEstacion from Estaciones where nombre='" + nombreEsta + "') and fecha=" + Fecha ;
		
		Query q= (Query) session.createQuery(hql);
		return q.list();
		
			
		
		
	}
}
