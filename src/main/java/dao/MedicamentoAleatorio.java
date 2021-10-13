package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;

import modelo.Medicamento;

public class MedicamentoAleatorio implements MedicamentoDAO {

	public final static int TAM_NOMBRE = 50;
	public final static int TAM_REGISTRO = 128;
	public final static String ruta = "medicamentosRandom.txt";

	@Override
	public boolean guardar(Medicamento medicamento) {
		File archivo = new File(ruta);
		try (RandomAccessFile raf = new RandomAccessFile(archivo, "rw")) {

			if (!archivo.exists())
				archivo.createNewFile();
			raf.seek(raf.length());
			raf.writeInt(medicamento.getCod());
			raf.writeChars(medicamento.getNombre());
			raf.writeDouble(medicamento.getPrecio());
			raf.writeInt(medicamento.getStock());
			raf.writeInt(medicamento.getStockMaximo());
			raf.writeInt(medicamento.getStockMinimo());
			raf.writeInt(medicamento.getCodProveedor());
		} catch (IOException e) {
			System.err.println("error al guardar.");
			return false;
		}
		return true;
	}

	@Override
	public Medicamento buscar(String nombre) {
		File archivo = new File(ruta);
		String nombreMed;
		Double precio;
		int cod, stock, stockMaximo, stockMinimo, codProveedor;
		try (RandomAccessFile raf = new RandomAccessFile(archivo, "r")) {

			int numMedicamentos = (int) (raf.length() / TAM_REGISTRO);
			for (int i = 0; i < numMedicamentos - 1; i++) {
				nombreMed = "";
				raf.seek(TAM_REGISTRO * (i));
				cod = raf.readInt();
				for (int j = 0; j < TAM_NOMBRE; j++) {
					nombreMed += raf.readChar();
				}
				nombreMed = nombreMed.replace("\u0000", "");
				precio = raf.readDouble();
				stock = raf.readInt();
				stockMaximo = raf.readInt();
				stockMinimo = raf.readInt();
				codProveedor = raf.readInt();
				if (nombre.equals(nombreMed))
					return new Medicamento(cod, nombreMed, precio, stock, stockMaximo, stockMinimo, codProveedor);
			}

		} catch (IOException e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public boolean actualizar(Medicamento medicamento) {

		return false;
	}

	@Override
	public boolean borrar(Medicamento medicamento) {

		return false;
	}

	@Override
	public List<Medicamento> leerTodos() {
		return null;
	}

}
