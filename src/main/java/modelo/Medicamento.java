package modelo;

import java.io.Serializable;
import java.nio.charset.IllegalCharsetNameException;

public class Medicamento implements Serializable {

	private static final long serialVersionUID = 1L;
	public final static float IVA = 0.04f;

	private String nombre; // tama�o 50, 100 bytes
	private double precio; // 8 bytes
	private int cod; // 4 bytes
	private int stock; // 4 bytes
	private int stockMaximo; // 4 bytes
	private int stockMinimo; // 4 bytes
	private int codProveedor; // 4 bytes

	public Medicamento(int cod, String nombre, double precio, int stock, int stockMaximo, int stockMinimo,
			int codProveedor) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cod = cod;
		this.stock = stock;
		this.stockMaximo = stockMaximo;
		this.stockMinimo = stockMinimo;
		this.codProveedor = codProveedor;
	}

	public String getNombre() {
		StringBuilder sb = new StringBuilder(nombre);
		sb.setLength(50);
		return sb.toString();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStockMaximo() {
		return stockMaximo;
	}

	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public int getCodProveedor() {
		return codProveedor;
	}

	public void setCodProveedor(int codProveedor) {
		this.codProveedor = codProveedor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static float getIva() {
		return IVA;
	}

	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", precio=" + precio + ", cod=" + cod + ", stock=" + stock
				+ ", stockMaximo=" + stockMaximo + ", stockMinimo=" + stockMinimo + ", codProveedor=" + codProveedor
				+ "]";
	}

}
