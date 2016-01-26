package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CARNET database table.
 * 
 */
@Entity
@NamedQuery(name="Carnet.findAll", query="SELECT c FROM Carnet c")
public class Carnet implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CarnetPK id;

	private byte alta;

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to Artesano
	@ManyToOne
	private Artesano artesano;

	public Carnet() {
	}

	public CarnetPK getId() {
		return this.id;
	}

	public void setId(CarnetPK id) {
		this.id = id;
	}

	public byte getAlta() {
		return this.alta;
	}

	public void setAlta(byte alta) {
		this.alta = alta;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Artesano getArtesano() {
		return this.artesano;
	}

	public void setArtesano(Artesano artesano) {
		this.artesano = artesano;
	}

}