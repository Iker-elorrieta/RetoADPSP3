package Servidor;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Insert.HibernateUtil;
import Tablas.Municipios;
import Tablas.Usuarios;

public class ConsultaInicial {
	
	String usuario;
	String pass;
	String dat ="";
	public SessionFactory sesion= HibernateUtil.getSessionFactory();
	public Session session= sesion.openSession();
	
	public ConsultaInicial(String datos) {
		dat = datos;
	}
	
	public int separardatos(){
		try {
			String inf[] = dat.split(":");
			usuario = inf[0];
			pass = inf[1];
			return 1;
		}catch(Exception e) {
			return -1;
		}
		
	}
	
	public String pedirciudad() {
		
		boolean agregar = true;
		String hql= "From Usuarios";
		Query q= (Query) session.createQuery(hql);
		List <Usuarios> dep= q.list();
		
		for(int i=0;i<dep.size();i++) {
			Usuarios d = dep.get(i);
			if(d.getNombre().equals(usuario) && d.getPass().equals(pass) ) {
				agregar = false;
			}
		}
		
		if(!agregar) {
			String hql2= "From Municipios";
			Query q2= (Query) session.createQuery(hql2);
			List <Municipios> ciudades= q2.list();
			if(ciudades.size()>0) {
				Municipios muni = ciudades.get(0);
				return "Ciudad : " + muni.getNombre() ;
			}
			
		}
		
		return "Error";
	}

}
