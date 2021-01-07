package Insert;

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
		HashJson hash1 = (HashJson) q.uniqueResult();
		if (hash1 != null) {
			if (hash1.getHash().equals(Hash)) {
				session.close();
				System.out.println("No hay cambios en el hash");
				return true;
			} else {
				hash1.setHash(Hash);
			}
		} else {
			
							HashJson hashJson = new HashJson();
							hashJson.setHash(Hash);
							hashJson.setUrl(link);
							session.save(hashJson);
						
					}
		

		session.getTransaction().commit();

		System.out.println("Hash cambiado");
		session.close();

		return false;

}
}
