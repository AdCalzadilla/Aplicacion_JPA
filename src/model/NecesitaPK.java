package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the NECESITA database table.
 * 
 */
@Embeddable
public class NecesitaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int PRODUCTOS_ID_Productos;

	@Column(insertable=false, updatable=false)
	private int MATERIALES_ID_Materiales;

	public NecesitaPK() {
	}
	public int getPRODUCTOS_ID_Productos() {
		return this.PRODUCTOS_ID_Productos;
	}
	public void setPRODUCTOS_ID_Productos(int PRODUCTOS_ID_Productos) {
		this.PRODUCTOS_ID_Productos = PRODUCTOS_ID_Productos;
	}
	public int getMATERIALES_ID_Materiales() {
		return this.MATERIALES_ID_Materiales;
	}
	public void setMATERIALES_ID_Materiales(int MATERIALES_ID_Materiales) {
		this.MATERIALES_ID_Materiales = MATERIALES_ID_Materiales;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof NecesitaPK)) {
			return false;
		}
		NecesitaPK castOther = (NecesitaPK)other;
		return 
			(this.PRODUCTOS_ID_Productos == castOther.PRODUCTOS_ID_Productos)
			&& (this.MATERIALES_ID_Materiales == castOther.MATERIALES_ID_Materiales);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.PRODUCTOS_ID_Productos;
		hash = hash * prime + this.MATERIALES_ID_Materiales;
		
		return hash;
	}
}