package Insert;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Tablas.Estaciones;
import Tablas.Municipios;

public class ConsultasEstaciones {
	public boolean insertEstaciones(ArrayList<Tablas.Estaciones> estaciones) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
			for (int x=0;x<estaciones.size();x++) {
			try {
		
			session.beginTransaction();			
			session.save(estaciones.get(x));
			session.getTransaction().commit();
			}catch(Exception e) {
				System.out.println("valor repetido");
			}	
			}
			System.out.println("Estacion CREADO");
			session.close();
			return true;

		}
	Estaciones estacion;
	public List recogerEstaciones(ArrayList<Estaciones> esta,String datos) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		boolean agregar = true;
		String hql= "From Estaciones where municipios.codMunicipio = (Select codMunicipio from Municipios where nombre ='" + datos + "')";
		System.out.println("holaaaaaa");
		Query q= (Query) session.createQuery(hql);
		return q.list();
		
	}
}
