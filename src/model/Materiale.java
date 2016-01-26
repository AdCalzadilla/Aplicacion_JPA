package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the MATERIALES database table.
 * 
 */
@Entity
@Table(name="MATERIALES")
@NamedQuery(name="Materiale.findAll", query="SELECT m FROM Materiale m")
public class Materiale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_Materiales;

	private int coste;

	private String nombre;

	private String tipo;

	//bi-directional many-to-one association to Necesita
	@OneToMany(mappedBy="materiale")
	private List<Necesita> necesitas;

	public Materiale() {
	}

	public int getID_Materiales() {
		return this.ID_Materiales;
	}

	public void setID_Materiales(int ID_Materiales) {
		this.ID_Materiales = ID_Materiales;
	}

	public int getCoste() {
		return this.coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Necesita> getNecesitas() {
		return this.necesitas;
	}

	public void setNecesitas(List<Necesita> necesitas) {
		this.necesitas = necesitas;
	}

	public Necesita addNecesita(Necesita necesita) {
		getNecesitas().add(necesita);
		necesita.setMateriale(this);

		return necesita;
	}

	public Necesita removeNecesita(Necesita necesita) {
		getNecesitas().remove(necesita);
		necesita.setMateriale(null);

		return necesita;
	}

}