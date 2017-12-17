package com.sample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestDB {
	 private static final String PERSISTENCE_UNIT_NAME = "AnalizaFinanciara";
     private static EntityManagerFactory factory;
     
	public static void main(String[] args) {
		 try {

	            Class.forName("org.postgresql.Driver");

	        } catch (ClassNotFoundException e) {

	            System.out.println("Where is your PostgreSQL JDBC Driver? "
	                    + "Include in your library path!");
	            e.printStackTrace();
	            return;

	        }

	        System.out.println("PostgreSQL JDBC Driver Registered!");
		
		// TODO Auto-generated method stub
		  factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
          EntityManager em = factory.createEntityManager();
          // Read the existing entries and write to console
          Query q = em.createQuery("SELECT u FROM ContClient u");
          List<ContClient> contClientList = q.getResultList();
          for (ContClient cont : contClientList) {
               System.out.println(cont.getDenumire());
          }
          System.out.println("Size: " + contClientList.size());

          // Create new user
          em.getTransaction().begin();
          ContClient contClient = new ContClient();
          //contClient.setId(11L);
          contClient.setDenumire("Test");
          contClient.setSuma(400.0);
          em.persist(contClient);
          em.getTransaction().commit();

          em.close();

	}

}
