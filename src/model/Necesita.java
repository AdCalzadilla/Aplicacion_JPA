package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the NECESITA database table.
 * 
 */
@Entity
@NamedQuery(name="Necesita.findAll", query="SELECT n FROM Necesita n")
public class Necesita implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NecesitaPK id;

	private String cantidad;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="PRODUCTOS_ID_Productos")
	private Producto producto;

	//bi-directional many-to-one association to Materiale
	@ManyToOne
	@JoinColumn(name="MATERIALES_ID_Materiales")
	private Materiale materiale;

	public Necesita() {
	}

	public NecesitaPK getId() {
		return this.id;
	}

	public void setId(NecesitaPK id) {
		this.id = id;
	}

	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Materiale getMateriale() {
		return this.materiale;
	}

	public void setMateriale(Materiale materiale) {
		this.materiale = materiale;
	}

}