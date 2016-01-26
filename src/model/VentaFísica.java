package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VENTA_FÍSICA database table.
 * 
 */
@Entity
@Table(name="VENTA_FÍSICA")
@NamedQuery(name="VentaFísica.findAll", query="SELECT v FROM VentaFísica v")
public class VentaFísica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int VENTA_ID_Venta;

	private String nombre;

	private String ubicación;

	//bi-directional one-to-one association to Pedido
	@OneToOne
	@JoinColumn(name="VENTA_ID_Venta")
	private Pedido pedido;

	public VentaFísica() {
	}

	public int getVENTA_ID_Venta() {
		return this.VENTA_ID_Venta;
	}

	public void setVENTA_ID_Venta(int VENTA_ID_Venta) {
		this.VENTA_ID_Venta = VENTA_ID_Venta;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicación() {
		return this.ubicación;
	}

	public void setUbicación(String ubicación) {
		this.ubicación = ubicación;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}