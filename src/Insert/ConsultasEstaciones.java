package Insert;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ConsultasEstaciones {
	public boolean insertEstaciones(ArrayList<Tablas.Estaciones> estaciones) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
			for (int x=0;x<estaciones.size()-1;x++) {
			try {
		
			session.beginTransaction();
			
			

			
			session.save(estaciones.get(x));
			session.getTransaction().commit();
			

			System.out.println("Estacion CREADO");
		
			}catch(Exception e) {
				System.out.println("valor repetido");
			}	
			}
			session.close();
			return true;

		}
}
