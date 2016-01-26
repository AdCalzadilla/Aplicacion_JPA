package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VENTA_ONLINE database table.
 * 
 */
@Entity
@Table(name="VENTA_ONLINE")
@NamedQuery(name="VentaOnline.findAll", query="SELECT v FROM VentaOnline v")
public class VentaOnline implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int VENTA_ID_Venta;

	private String url;

	//bi-directional one-to-one association to Pedido
	@OneToOne
	@JoinColumn(name="VENTA_ID_Venta")
	private Pedido pedido;

	public VentaOnline() {
	}

	public int getVENTA_ID_Venta() {
		return this.VENTA_ID_Venta;
	}

	public void setVENTA_ID_Venta(int VENTA_ID_Venta) {
		this.VENTA_ID_Venta = VENTA_ID_Venta;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}