package Insert;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Tablas.Municipios;
import Tablas.Usuarios;

public class ConsultaMunicipios {
public boolean insertMunicipio(ArrayList<Tablas.Municipios> municipios) {
	SessionFactory sesion = HibernateUtil.getSessionFactory();
	Session session = sesion.openSession();
		for (int x=0;x<municipios.size();x++) {
		try {
	
		session.beginTransaction();
		
		

		
		session.save(municipios.get(x));
		session.getTransaction().commit();
		

		
	
		}catch(Exception e) {
			System.out.println("valor repetido");
		}	
		}
		System.out.println("MUNICIPIO CREADO");
		session.close();
		return true;

	}
Municipios municipio;
public List recogermunicipios(ArrayList<Municipios> muni,String datos) {
	SessionFactory sesion = HibernateUtil.getSessionFactory();
	Session session = sesion.openSession();
	boolean agregar = true;
	String hql= "From Municipios where codMunicipio in (select municipios.codMunicipio from Estaciones) and provincias.nombre = '"+ datos +"'";
	System.out.println("holaaaaaa");
	Query q= (Query) session.createQuery(hql);
	return q.list();
	
	
}
}
