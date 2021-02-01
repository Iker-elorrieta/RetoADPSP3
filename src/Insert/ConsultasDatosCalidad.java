package Insert;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Tablas.DatosCalidad;
import Tablas.Estaciones;

public class ConsultasDatosCalidad {
	String nombreMuni,nombreEsta,Fecha,Hora;
	
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
	public int separardatos3(String dat) {
		try {
			String inf[] = dat.split("_");
			nombreMuni = inf[0];
			nombreEsta = inf[1];
			Fecha = inf[2];
			Hora = inf[3];
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
	
		String hql= "From DatosCalidad where estaciones.municipios.nombre= '"+ nombreMuni +"' and estaciones.nombre = '" + nombreEsta + "' and fecha = '" + Fecha + "' and hora = '" + Hora + "'" ;
		System.out.println(hql);
		Query q= (Query) session.createQuery(hql);
		return q.list();
		
			
		
		
	}
	
	public List recogerDatosCalidadHora(ArrayList<DatosCalidad> datos) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		boolean agregar = true;
		String hql= "From DatosCalidad where estaciones.municipios.nombre= '"+ nombreMuni +"' and estaciones.nombre = '" + nombreEsta + "' and fecha = '" + Fecha + "'" ;
		
		Query q= (Query) session.createQuery(hql);
		return q.list();
		
			
		
		
	}
	public List recogerDatosCalidadFecha(ArrayList<DatosCalidad> datos) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		boolean agregar = true;
		String hql= "From DatosCalidad where estaciones.municipios.nombre= '"+ nombreMuni +"' and estaciones.nombre ='" + nombreEsta + "')";
		
		Query q= (Query) session.createQuery(hql);
		return q.list();
		
			
		
		
	}
}
