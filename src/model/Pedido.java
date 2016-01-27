package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Pedido database table.
 * 
 */
@Entity
@NamedQuery(name="Pedido.findAll", query="SELECT p FROM Pedido p")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_Venta;

	private String precio;

	//bi-directional many-to-one association to Vende
	@OneToMany(mappedBy="pedido")
	private List<Vende> vendes;

	public Pedido() {
	}

	public int getID_Venta() {
		return this.ID_Venta;
	}

	public void setID_Venta(int ID_Venta) {
		this.ID_Venta = ID_Venta;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public List<Vende> getVendes() {
		return this.vendes;
	}

	public void setVendes(List<Vende> vendes) {
		this.vendes = vendes;
	}

	public Vende addVende(Vende vende) {
		getVendes().add(vende);
		vende.setPedido(this);

		return vende;
	}

	public Vende removeVende(Vende vende) {
		getVendes().remove(vende);
		vende.setPedido(null);

		return vende;
	}

}