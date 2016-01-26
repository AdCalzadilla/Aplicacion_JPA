package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CARNET database table.
 * 
 */
@Embeddable
public class CarnetPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int ID_Carnet;

	@Column(name="ARTESANO_NIF", insertable=false, updatable=false)
	private int artesanoNif;

	public CarnetPK() {
	}
	public int getID_Carnet() {
		return this.ID_Carnet;
	}
	public void setID_Carnet(int ID_Carnet) {
		this.ID_Carnet = ID_Carnet;
	}
	public int getArtesanoNif() {
		return this.artesanoNif;
	}
	public void setArtesanoNif(int artesanoNif) {
		this.artesanoNif = artesanoNif;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CarnetPK)) {
			return false;
		}
		CarnetPK castOther = (CarnetPK)other;
		return 
			(this.ID_Carnet == castOther.ID_Carnet)
			&& (this.artesanoNif == castOther.artesanoNif);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ID_Carnet;
		hash = hash * prime + this.artesanoNif;
		
		return hash;
	}
}