package modelo;

import java.beans.JavaBean;
import java.io.Serializable;
import java.text.DecimalFormat;

public class Medicamento implements Serializable {
	
	public final static float IVA = 0.04f;
	
	private String nombre; // tama�o 30, 60 bytes
	private double precio; // 8 bytes
	private int cod; // 4 bytes
	private int stock; // 4 bytes
	private int stockMaximo; // 4 bytes
	private int stockMinimo; // 4 bytes
	private int codProveedor; // 4 bytes

	public Medicamento(String nombre, double precio, int cod, int stock, int stockMaximo, int stockMinimo, int codProveedor) {
		StringBuilder name=new StringBuilder(nombre);
		name.setLength(50);
		this.nombre = name.toString();
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
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre.length()>50){
			throw new IllegalArgumentException(nombre+" contiene mas caracteres de los permitidos");
		}
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = Double.parseDouble(new DecimalFormat("##.##").format(precio));
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
		return "C�digo: "+cod+ "\nNombre: "+nombre
				+"\nPrecio: "+ precio+"� \nStock: "
				+ stock+"\nProveedor: "+codProveedor ;
	}
}
