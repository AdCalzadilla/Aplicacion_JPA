package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FABRICA database table.
 * 
 */
@Entity
@NamedQuery(name="Fabrica.findAll", query="SELECT f FROM Fabrica f")
public class Fabrica implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FabricaPK id;

	private int cantidad;

	//bi-directional many-to-one association to Artesano
	@ManyToOne
	private Artesano artesano;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="PRODUCTOS_ID_Productos")
	private Producto producto;

	public Fabrica() {
	}

	public FabricaPK getId() {
		return this.id;
	}

	public void setId(FabricaPK id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Artesano getArtesano() {
		return this.artesano;
	}

	public void setArtesano(Artesano artesano) {
		this.artesano = artesano;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}