package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Vende database table.
 * 
 */
@Embeddable
public class VendePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int pedido_ID_Venta;

	@Column(insertable=false, updatable=false)
	private int PRODUCTOS_ID_Productos;

	public VendePK() {
	}
	public int getPedido_ID_Venta() {
		return this.pedido_ID_Venta;
	}
	public void setPedido_ID_Venta(int pedido_ID_Venta) {
		this.pedido_ID_Venta = pedido_ID_Venta;
	}
	public int getPRODUCTOS_ID_Productos() {
		return this.PRODUCTOS_ID_Productos;
	}
	public void setPRODUCTOS_ID_Productos(int PRODUCTOS_ID_Productos) {
		this.PRODUCTOS_ID_Productos = PRODUCTOS_ID_Productos;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VendePK)) {
			return false;
		}
		VendePK castOther = (VendePK)other;
		return 
			(this.pedido_ID_Venta == castOther.pedido_ID_Venta)
			&& (this.PRODUCTOS_ID_Productos == castOther.PRODUCTOS_ID_Productos);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pedido_ID_Venta;
		hash = hash * prime + this.PRODUCTOS_ID_Productos;
		
		return hash;
	}
}