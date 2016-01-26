package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FABRICA database table.
 * 
 */
@Embeddable
public class FabricaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ARTESANO_NIF", insertable=false, updatable=false)
	private int artesanoNif;

	private int ARTESANO_SOLICITUD_CARNET_ID_Carnet;

	@Column(insertable=false, updatable=false)
	private int PRODUCTOS_ID_Productos;

	public FabricaPK() {
	}
	public int getArtesanoNif() {
		return this.artesanoNif;
	}
	public void setArtesanoNif(int artesanoNif) {
		this.artesanoNif = artesanoNif;
	}
	public int getARTESANO_SOLICITUD_CARNET_ID_Carnet() {
		return this.ARTESANO_SOLICITUD_CARNET_ID_Carnet;
	}
	public void setARTESANO_SOLICITUD_CARNET_ID_Carnet(int ARTESANO_SOLICITUD_CARNET_ID_Carnet) {
		this.ARTESANO_SOLICITUD_CARNET_ID_Carnet = ARTESANO_SOLICITUD_CARNET_ID_Carnet;
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
		if (!(other instanceof FabricaPK)) {
			return false;
		}
		FabricaPK castOther = (FabricaPK)other;
		return 
			(this.artesanoNif == castOther.artesanoNif)
			&& (this.ARTESANO_SOLICITUD_CARNET_ID_Carnet == castOther.ARTESANO_SOLICITUD_CARNET_ID_Carnet)
			&& (this.PRODUCTOS_ID_Productos == castOther.PRODUCTOS_ID_Productos);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.artesanoNif;
		hash = hash * prime + this.ARTESANO_SOLICITUD_CARNET_ID_Carnet;
		hash = hash * prime + this.PRODUCTOS_ID_Productos;
		
		return hash;
	}
}