package database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import shareifo.User;

public class DataBaseConnector {

	
	
	public static void main(String[] args) {
		getTestConnection();
	}
	
	public static void getTestConnection() {
		
		System.out.println("START");
	
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("mysql-database");
		EntityManager entitymanager = emfactory.
				createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		
		User user = new User(); 
		user.setId( 1201 );
		user.setUsername("test");
		user.setPassword("asdf");
		user.setActive(false);
		entitymanager.persist( user );
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
		return;
	    
	}
}
