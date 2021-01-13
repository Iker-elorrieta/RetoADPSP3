package Servidor;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Insert.HibernateUtil;
import Tablas.Provincias;
import Tablas.Usuarios;

public class CrearUsuario {
	String usuario;
	String pass;
	String dat = "";
	public SessionFactory sesion = HibernateUtil.getSessionFactory();
	public Session session = sesion.openSession();

	public CrearUsuario(String datos) {
		dat = datos;

	}

	public int separardatos() {
		try {
			String inf[] = dat.split(":");
			usuario = inf[0];
			pass = inf[1];
			return 1;
		} catch (Exception e) {
			return -1;
		}

	}

	public boolean ConsultarDatos() {
		boolean agregar = true;
		String hql = "From Usuarios";
		Query q = (Query) session.createQuery(hql);
		List<Usuarios> dep = q.list();

		for (int i = 0; i < dep.size(); i++) {
			Usuarios d = dep.get(i);
			if (d.getNombre().equals(usuario)) {
				agregar = false;

			}

		}

		if (agregar) {
			/*
			 * SessionFactory sesion = HibernateUtil.getSessionFactory(); Session session =
			 * sesion.openSession();
			 */
			session.beginTransaction();
			Usuarios usu = new Usuarios();
			usu.setNombre(usuario);
			usu.setPass(pass);
			usu.setCodUsuario(dep.size());
			session.save(usu);
			session.getTransaction().commit();
			System.out.println("Usuario Creado");
			session.close();
			return true;
		} else {
			return false;
		}
	}

}
