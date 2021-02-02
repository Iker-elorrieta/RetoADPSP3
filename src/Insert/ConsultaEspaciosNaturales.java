package Insert;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Tablas.Municipios;

public class ConsultaEspaciosNaturales {
	public boolean insertEspaciosNaturales(ArrayList<Tablas.EspaciosNaturales> espacios) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
			for (int x=0;x<espacios.size();x++) {
			try {
		
			session.beginTransaction();
			session.save(espacios.get(x));
			session.getTransaction().commit();

			session.flush();


			}catch(Exception e) {
				System.out.println("valor repetido Espacios");
			}	
			}
			System.out.println("Espacio CREADO");
			session.close();
			return true;

		}
	public List recogerEspaciosNaturales(ArrayList<Municipios> muni,String datos) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		boolean agregar = true;
		String hql= "from EstaEn where municipios.codMunicipio in (select municipios.codMunicipio from Estaciones) and municipios.provincias.nombre = '"+ datos +"'";
		System.out.println(hql);
		Query q= (Query) session.createQuery(hql);
		return q.list();
		
		
	}
}
