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
	
	public String artesanoDatos(){
		Query query = em.createQuery("SELECT a FROM Artesano a");
		query.setMaxResults(10);
		Vector<model.Artesano> list = (Vector<model.Artesano>) query.getResultList();
		
		String datos = "";
		
		for (int i=0; i< list.size(); i++){
			
			/*System.out.print("Nombre: " + list.get(i).getNombre() + " ");
			System.out.print("Apellidos: " + list.get(i).getApellido1() + " ");
			System.out.print(" " + list.get(i).getApellido2() + " ");
			System.out.print("NIF:" + list.get(i).getNif() + "\n");
			System.out.print("Oficio " + list.get(i).getOficio() + "\n");
			System.out.print("Dirección:\n Calle: " + list.get(i).getCalle() + " ");
			System.out.print("CP: " + list.get(i).getCp() + " ");
			System.out.print("Municipio: " + list.get(i).getMunicipio() + " ");
			System.out.print("Telef: " + list.get(i).getTeléfono() + "\n\n"); */
			
			datos = datos + "Nombre: " + list.get(i).getNombre() + " "
					+ "Apellidos: " + list.get(i).getApellido1() + " " +
					" " + list.get(i).getApellido2() + " " +
					"NIF:" + list.get(i).getNif() + "\n" +
					"Oficio " + list.get(i).getOficio() + "\n" +
					"Dirección:\nCalle: " + list.get(i).getCalle() + " " +
					"CP: " + list.get(i).getCp() + " " +
					"Municipio: " + list.get(i).getMunicipio() + " " +
					"Telef: " + list.get(i).getTeléfono() + "\n\n";
					
		}
		
		System.out.println(datos);
		
		return datos;
	}
	
	public String artesanoFabrica(){
		
		Query query = em.createQuery("SELECT f FROM Fabrica f");
		query.setMaxResults(10);
		Vector<model.Fabrica> list = (Vector<model.Fabrica>) query.getResultList();
		
		String datos = "";
		
		for (int i=0; i< list.size(); i++){
			
			/*System.out.print("\n\nNombre: " + list.get(i).getProducto().getNombre() + ":\n");
			System.out.print("Tipo: " + list.get(i).getProducto().getTipo() + "\n\n");*/
			
			datos = datos + "\n\nNombre: " + list.get(i).getProducto().getNombre() + ":\n" +
					"Tipo: " + list.get(i).getProducto().getTipo() + "\n\n";
		}
		
		System.out.println(datos);
		
		return datos;
	}
	
	public String artesanoVenta(){
		
		Query query = em.createQuery("SELECT v FROM Vende v");
		query.setMaxResults(10);
		Vector<model.Vende> list = (Vector<model.Vende>) query.getResultList();
		
		String datos = "";
		
		for (int i=0; i< list.size(); i++){
			
			/*System.out.print("\n\nPedido " + i + ":\n");
			System.out.print("Producto: " + list.get(i).getProducto().getNombre() + " ");
			System.out.print("Cantidad: " + list.get(i).getCantidad() + "\n");
			System.out.print("Fecha:" + list.get(i).getFecha() + "\n");
			System.out.print("Precio: " + list.get(i).getPedido().getPrecio()+ "€\n\n"); */
			
			datos =  datos + "Pedido " + i + ":\n" +
					"Producto: " + list.get(i).getProducto().getNombre() + " " +
					"Cantidad: " + list.get(i).getCantidad() + "\n" +
					"Fecha:" + list.get(i).getFecha() + "\n" +
					"Precio: " + list.get(i).getPedido().getPrecio()+ "€\n\n";
		}
		
		System.out.println(datos);
		
		return datos;
	}
	
	
	public String artesanoProducto(){
		
		Query query = em.createQuery("SELECT p FROM Producto p");
		query.setMaxResults(10);
		Vector<model.Producto> list = (Vector<model.Producto>) query.getResultList();
		
		String datos = "";
		
		for (int i=0; i< list.size(); i++){
			
			/*System.out.print("\n\nID " + i + ":\n");
			System.out.print("Horas: " + list.get(i).getHoras() + " ");
			System.out.print("Coste: " + list.get(i).getCoste() + "€\n");
			System.out.print("Tipo:" + list.get(i).getTipo() + "\n");
			System.out.print("Nombre: " + list.get(i).getNombre()+ "\n\n"); */
			
			datos =  datos + "ID Producto:" + i + ":\n" +
					"Horas: " + list.get(i).getHoras() + " \n" +
					"Coste: " + list.get(i).getCoste() + "€\n" +
					"Tipo:" + list.get(i).getTipo() + "\n" +
					"Nombre: " + list.get(i).getNombre()+ "\n\n";
		}
		
		System.out.println(datos);
		
		return datos;
	}

	public String artesanoMateriales(){
	
	Query query = em.createQuery("SELECT m FROM Materiale m");
	query.setMaxResults(10);
	Vector<model.Materiale> list = (Vector<model.Materiale>) query.getResultList();
	
	String datos = "";
	
	for (int i=0; i< list.size(); i++){
		
		/*
		System.out.print(""Id Material " + i + ":\n");
		System.out.print(""Coste: " + list.get(i).getCoste() + "€\n ");
		System.out.print(""Nombre: " + list.get(i).getNombre() + "\n");
		System.out.print(""Tipo:" + list.get(i).getTipo() + "\n\n"); */
		
		datos =  datos + "Id Material " + i + ":\n" +
				"Coste: " + list.get(i).getCoste() + "€\n " +
				"Nombre: " + list.get(i).getNombre() + "\n" +
				"Tipo:" + list.get(i).getTipo() + "\n\n";
	}
	
	System.out.println(datos);
	
	return datos;
	}
	public void close(){
		em.close();
		emf.close();
	}

}
