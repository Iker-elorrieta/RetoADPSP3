package Insert;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ConsultasEstaEn {
	public boolean insertEstaEn(ArrayList<Tablas.EstaEn> estaEn) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
			for (int x=0;x<estaEn.size();x++) {
			try {
		
			session.beginTransaction();
			
			

			
			session.save(estaEn.get(x));
			session.getTransaction().commit();
			

			
		
			}catch(Exception e) {
				System.out.println("valor repetido EstaEn");
			}	
			}
			System.out.println("EstaEn CREADO");
			session.close();
			return true;

		}
}
