package Insert;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ConsultasDatosCalidad {
	public boolean insertDatosCalidad(ArrayList<Tablas.DatosCalidad> datosCalidad) {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
			for (int x=0;x<datosCalidad.size()-1;x++) {
			try {
		
			session.beginTransaction();
			session.save(datosCalidad.get(x));
			session.getTransaction().commit();
			
		
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("valor repetido");
			}	
			}
			System.out.println("DATOS CALIDAD CREADO");
			session.close();
			return true;

		}
}
