package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Vende database table.
 * 
 */
@Entity
@NamedQuery(name="Vende.findAll", query="SELECT v FROM Vende v")
public class Vende implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VendePK id;

	private String cantidad;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to Pedido
	@ManyToOne
	private Pedido pedido;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="PRODUCTOS_ID_Productos")
	private Producto producto;

	public Vende() {
	}

	public VendePK getId() {
		return this.id;
	}

	public void setId(VendePK id) {
		this.id = id;
	}

	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}