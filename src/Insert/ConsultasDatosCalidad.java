package Insert;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Tablas.DatosCalidad;

public class ConsultasDatosCalidad {
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
}
