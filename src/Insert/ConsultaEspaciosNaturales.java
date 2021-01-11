package Insert;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ConsultaEspaciosNaturales {
	public boolean insertEspaciosNaturales(ArrayList<Tablas.EspaciosNaturales> espacios) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
			for (int x=0;x<espacios.size();x++) {
			try {
		
			session.beginTransaction();
			
			

			
			session.save(espacios.get(x));
			session.getTransaction().commit();
			

			System.out.println("Espacio CREADO");
		
			}catch(Exception e) {
				System.out.println("valor repetido Espacios");
			}	
			}
			session.close();
			return true;

		}
}
