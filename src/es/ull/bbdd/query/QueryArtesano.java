package es.ull.bbdd.query;

import javax.persistence.Query;

import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class QueryArtesano {
	
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	
	public QueryArtesano(){
		emf = Persistence.createEntityManagerFactory("Aplicacion_JPA");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	public void artesanoDatos(){
		Query query = em.createQuery("SELECT * FROM ARTESANOS");
		query.setMaxResults(10);
		Vector<String> list = (Vector<String>) query.getResultList();
		
		System.out.println(list);
	}
	
	public void close(){
		em.close();
		emf.close();
	}

}
