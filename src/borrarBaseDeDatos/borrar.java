package borrarBaseDeDatos;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Insert.HibernateUtil;

public class borrar {

	public static void main(String[] args) {
		
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Query q = (Query) session.createQuery("delete from DatosCalidad");
		q.executeUpdate();
		Query q1 = (Query) session.createQuery("delete from EspaciosNaturales");
		q1.executeUpdate();
		Query q2 = (Query) session.createQuery("delete from Estaciones");
		q2.executeUpdate();
		Query q3 = (Query) session.createQuery("delete from Favoritos");
		q3.executeUpdate();
		Query q4 = (Query) session.createQuery("delete from HashJson");
		q4.executeUpdate();
		Query q5 = (Query) session.createQuery("delete from Municipios");
		q5.executeUpdate();
		Query q6 = (Query) session.createQuery("delete from Provincias");
		q6.executeUpdate();
		Query q7 = (Query) session.createQuery("delete from Usuarios");
		q7.executeUpdate();
		
		session.close();
		sesion.close();
		
	}

}
