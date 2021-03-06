package modelo;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Objects;

public class Medicamento implements Serializable {
	
	/**
	 * @author Radek Lekston
	 */
	private static final long serialVersionUID = 1L;

	public final static float IVA = 0.04f;
	
	private String nombre; // tamaño 30, 60 bytes
	private double precio; // 8 bytes
	private int cod; // 4 bytes
	private int stock; // 4 bytes
	private int stockMaximo; // 4 bytes
	private int stockMinimo; // 4 bytes
	private int codProveedor; // 4 bytes

	public Medicamento(String nombre, double precio, int cod, int stock, int stockMaximo, int stockMinimo, int codProveedor) {
		this.nombre = nombre;
		this.precio = precio;
		this.cod = cod;
		this.stock = stock;
		this.stockMaximo = stockMaximo;
		this.stockMinimo = stockMinimo;
		this.codProveedor = codProveedor;
	}

	public Medicamento() {
	}

	public String getNombre() {
		StringBuilder name=new StringBuilder(nombre);
		name.setLength(30);
		return name.toString();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		double sinIVA=Double.parseDouble(new DecimalFormat("##.##").format(precio));
		this.precio = (sinIVA+(sinIVA*IVA));
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

	@Override
	public String toString() {
		return "Código: "+cod+ "\nNombre: "+nombre
				+"\nPrecio: "+ precio+"€ \nStock: "
				+ stock+"\nProveedor: "+codProveedor ;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Medicamento that = (Medicamento) o;
		return Double.compare(that.precio, precio) == 0 && cod == that.cod && stock == that.stock && stockMaximo == that.stockMaximo && stockMinimo == that.stockMinimo && codProveedor == that.codProveedor && Objects.equals(nombre, that.nombre);
	}
}