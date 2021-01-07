package Insert;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Tablas.HashJson;

public class ConsultasHash {

	public boolean comprobarHash(String link, String Hash) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		session.beginTransaction();
		String hql = "from HashJson where url = " + link;
		Query q = session.createQuery(hql);
		HashJson hash1 = (HashJson) q.uniqueResult();
		if (hash1.getHash() != null) {
			if (hash1.getHash().equals(Hash)) {
				session.close();
				return true;
			} else {
				hash1.setHash(Hash);
			}
		} else {
			hash1.setHash(Hash);
		}

		session.getTransaction().commit();

		System.out.println("Hash cambiado");
		session.close();

		return false;

	}
}
