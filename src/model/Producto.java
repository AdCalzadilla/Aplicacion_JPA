package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PRODUCTOS database table.
 * 
 */
@Entity
@Table(name="PRODUCTOS")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_Productos;

	private double coste;

	private int horas;

	private String nombre;

	private String tipo;

	//bi-directional many-to-one association to Fabrica
	@OneToMany(mappedBy="producto")
	private List<Fabrica> fabricas;

	//bi-directional many-to-one association to Necesita
	@OneToMany(mappedBy="producto")
	private List<Necesita> necesitas;

	//bi-directional many-to-one association to Vende
	@OneToMany(mappedBy="producto")
	private List<Vende> vendes;

	public Producto() {
	}

	public int getID_Productos() {
		return this.ID_Productos;
	}

	public void setID_Productos(int ID_Productos) {
		this.ID_Productos = ID_Productos;
	}

	public double getCoste() {
		return this.coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public int getHoras() {
		return this.horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
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

	public List<Fabrica> getFabricas() {
		return this.fabricas;
	}

	public void setFabricas(List<Fabrica> fabricas) {
		this.fabricas = fabricas;
	}

	public Fabrica addFabrica(Fabrica fabrica) {
		getFabricas().add(fabrica);
		fabrica.setProducto(this);

		return fabrica;
	}

	public Fabrica removeFabrica(Fabrica fabrica) {
		getFabricas().remove(fabrica);
		fabrica.setProducto(null);

		return fabrica;
	}

	public List<Necesita> getNecesitas() {
		return this.necesitas;
	}

	public void setNecesitas(List<Necesita> necesitas) {
		this.necesitas = necesitas;
	}

	public Necesita addNecesita(Necesita necesita) {
		getNecesitas().add(necesita);
		necesita.setProducto(this);

		return necesita;
	}

	public Necesita removeNecesita(Necesita necesita) {
		getNecesitas().remove(necesita);
		necesita.setProducto(null);

		return necesita;
	}

	public List<Vende> getVendes() {
		return this.vendes;
	}

	public void setVendes(List<Vende> vendes) {
		this.vendes = vendes;
	}

	public Vende addVende(Vende vende) {
		getVendes().add(vende);
		vende.setProducto(this);

		return vende;
	}

	public Vende removeVende(Vende vende) {
		getVendes().remove(vende);
		vende.setProducto(null);

		return vende;
	}

}