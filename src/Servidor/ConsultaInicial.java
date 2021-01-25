package Servidor;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Insert.HibernateUtil;
import Tablas.Municipios;
import Tablas.Usuarios;
import controladores.controladorListado;
import controladores.controladorcliente;
import vistas.Listado;

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
//	
//	public Boolean CambiarContraseña() {
//		boolean agregar = true;
//		String hql= "From Usuarios";
//		Query q= (Query) session.createQuery(hql);
//		List <Usuarios> dep= q.list();
//		
//		for(int i=0;i<dep.size();i++) {
//			Usuarios d = dep.get(i);
//			if(d.getNombre().equals(usuario) && d.getPass().equals(pass) ) {
//				agregar = false;
//			}
//		}
//		if(!agregar) {
//			
//		return true;
//		}
//		return false;
//	}
//	
	public boolean CambiarVentana() {
		
		boolean agregar = true;
		String hql= "From Usuarios";
		Query q= (Query) session.createQuery(hql);
		List <Usuarios> dep= q.list();
		
		for(Tablas.Usuarios usu : dep) {
			
			if(usu.getNombre().equals(usuario) && usu.getPass().equals(pass) ) {
				return true;
			}
		}
		
		return false;
	}

}
