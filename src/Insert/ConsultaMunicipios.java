package Insert;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ConsultaMunicipios {
public boolean insertMunicipio(ArrayList<Tablas.Municipios> municipios) {
	SessionFactory sesion = HibernateUtil.getSessionFactory();
	Session session = sesion.openSession();
		for (int x=0;x<municipios.size();x++) {
		try {
	
		session.beginTransaction();
		
		

		
		session.save(municipios.get(x));
		session.getTransaction().commit();
		

		
	
		}catch(Exception e) {
			System.out.println("valor repetido");
		}	
		}
		System.out.println("MUNICIPIO CREADO");
		session.close();
		return true;

	}
}
