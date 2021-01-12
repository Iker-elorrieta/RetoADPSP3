package Insert;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Tablas.Municipios;

public class ConsultasProvincias {
public boolean insertProvincia(ArrayList<Tablas.Provincias> provincias) {
	SessionFactory sesion = HibernateUtil.getSessionFactory();
	Session session = sesion.openSession();

		for (int x=0;x<provincias.size()-1;x++) {
		try {
		session.beginTransaction();
		session.save(provincias.get(x));
		session.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("valor repetido");
			
		}
		}
		System.out.println("Provincia CREADA");
		session.close();
		return true;

	}
}
