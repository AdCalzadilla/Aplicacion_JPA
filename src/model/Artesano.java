package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ARTESANO database table.
 * 
 */
@Entity
@NamedQuery(name="Artesano.findAll", query="SELECT a FROM Artesano a")
public class Artesano implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int nif;

	private String apellido1;

	private String apellido2;

	private String calle;

	private int cp;

	private byte[] foto;

	private String municipio;

	private String nombre;

	private String oficio;

	private int teléfono;

	//bi-directional many-to-one association to Carnet
	@OneToMany(mappedBy="artesano")
	private List<Carnet> carnets;

	//bi-directional many-to-one association to Fabrica
	@OneToMany(mappedBy="artesano")
	private List<Fabrica> fabricas;

	public Artesano() {
	}

	public int getNif() {
		return this.nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getCp() {
		return this.cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOficio() {
		return this.oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public int getTeléfono() {
		return this.teléfono;
	}

	public void setTeléfono(int teléfono) {
		this.teléfono = teléfono;
	}

	public List<Carnet> getCarnets() {
		return this.carnets;
	}

	public void setCarnets(List<Carnet> carnets) {
		this.carnets = carnets;
	}

	public Carnet addCarnet(Carnet carnet) {
		getCarnets().add(carnet);
		carnet.setArtesano(this);

		return carnet;
	}

	public Carnet removeCarnet(Carnet carnet) {
		getCarnets().remove(carnet);
		carnet.setArtesano(null);

		return carnet;
	}

	public List<Fabrica> getFabricas() {
		return this.fabricas;
	}

	public void setFabricas(List<Fabrica> fabricas) {
		this.fabricas = fabricas;
	}

	public Fabrica addFabrica(Fabrica fabrica) {
		getFabricas().add(fabrica);
		fabrica.setArtesano(this);

		return fabrica;
	}

	public Fabrica removeFabrica(Fabrica fabrica) {
		getFabricas().remove(fabrica);
		fabrica.setArtesano(null);

		return fabrica;
	}

}