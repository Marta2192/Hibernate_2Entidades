import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import pojo.Alumno;
import pojo.Expediente;

public class Principal {

	public static void main(String[] args) {
/*BBDD Expedientes
Relación 1 a 1
Tabla expediente y tabla alumno
En el expediente tenemos id(pk), anho(int), centro(nombre cole)
El el alumno tenemos dni(pk), nombre, telefono*/
		
		
		
		

		//Creación de los objetos
			Expediente exp1 = new Expediente(1000, 1958, "Liceo");
			Expediente exp2 = new Expediente(2000, 1976, "Maristas");
			
			Alumno al1 = new Alumno("54785496h", "Fernando", 684547621, exp2);
			Alumno al2 = new Alumno("64851271m", "Laura", 695478235, exp1);
				

				//Creación del SessionFactory
				StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
				SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
				
				//Creamos la sesión
				Session sesion = sf.openSession();
				
				//Comenzamos la transacción
				sesion.beginTransaction();
				
					sesion.save(exp1);
					sesion.save(exp2);
					sesion.save(al1);
					sesion.save(al2);
				
				
				sesion.getTransaction().commit();
				
				//Cerramos objetos
				sesion.close();
				sf.close();

	}

}
