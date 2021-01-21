package Insert;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Tablas.HashJson;

import java.net.URL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Tablas.HashJson;

public class ConsultasHash {

	public boolean comprobarHash(String link, String Hash) {
		
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		String hql = "from HashJson where url = '" + link + "'";
		System.out.println(hql);
		Query q = session.createQuery(hql);
		try {
		HashJson hash1 = (HashJson) q.uniqueResult();
	
			if (hash1.getHash().equals(Hash)) {
				session.close();
				System.out.println("No hay cambios en el hash");
				return true;
			} else {
			
							HashJson hashJson = new HashJson();
							hashJson.setHash(Hash);
							session.save(hashJson);
							System.out.println("Hash cambiado");
							session.getTransaction().commit();
					}
		

		

		
		session.close();
		}catch (Exception e) {
			try {
			HashJson hashJson = new HashJson();
			hashJson.setHash(Hash);
			hashJson.setUrl(link);
			session.save(hashJson);
			session.getTransaction().commit();
			session.close();
			}catch(Exception e1) {
				System.out.println("No hay cambios en el hash");
				}
			}
		
			
	
		return false;

	}
}
