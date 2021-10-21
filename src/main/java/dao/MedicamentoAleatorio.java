package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import modelo.Medicamento;

public class MedicamentoAleatorio implements MedicamentoDAO {
	/**
	 * @author Oscar Gonzalez
	 **/

	public final static int TAM_NOMBRE = 30;
	public final static int TAM_REGISTRO = 88;
	public final static String ruta = "medicamentosRandom.txt";

	@Override
	public boolean guardar(Medicamento medicamento) {
		File archivo = new File(ruta);
		try (RandomAccessFile raf = new RandomAccessFile(archivo, "rw")) {

			if (!archivo.exists()) // Verificar si el archivo existe, y crearlos en caso que no.
				archivo.createNewFile();

			raf.seek(raf.length()); // Nos posicionamos al final del archivo.
			// Por cada parametro, escribimos segun el tipo de dato.
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
		Medicamento medicamento = new Medicamento();
		String nombreFormateado;
		Double precio;
		int cod, stock, stockMaximo, stockMinimo, codProveedor;

		try (RandomAccessFile raf = new RandomAccessFile(archivo, "r")) {

			// Calculamos el numero de medicamentos que existen.
			int numMedicamentos = (int) (raf.length() / TAM_REGISTRO);
			for (int i = 0; i < numMedicamentos - 1; i++) { // Loopeamos todos los medicamentos hasta encontrarlo
				raf.seek(TAM_REGISTRO * (i));
				cod = raf.readInt();
				nombreFormateado = "";
				for (int j = 0; j < TAM_NOMBRE; j++) {
					nombreFormateado += raf.readChar();
				}

				// Eliminamos los caracteres no deseados creados por el StringBuilder
				nombreFormateado = nombreFormateado.replace("\u0000", "");
				// Si coincide, creamos un nuevo medicamento.
				if (nombre.equals(nombreFormateado)) {
					precio = raf.readDouble();
					stock = raf.readInt();
					stockMaximo = raf.readInt();
					stockMinimo = raf.readInt();
					codProveedor = raf.readInt();
					medicamento = new Medicamento(nombreFormateado, precio, cod, stock, stockMaximo, stockMinimo,
							codProveedor);
				}
			}

		} catch (IOException e) {
			System.err.println("Error al buscar el medicamento");
		}
		return medicamento;
	}

	@Override
	public boolean actualizar(Medicamento medicamento) {
		File archivo = new File(ruta);
		int cod;
		try (RandomAccessFile raf = new RandomAccessFile(archivo, "rw")) {

			int numMedicamentos = (int) (raf.length() / TAM_REGISTRO);
			for (int i = 0; i < numMedicamentos - 1; i++) {
				raf.seek(TAM_REGISTRO * (i));
				cod = raf.readInt();
				// Buscamos
				if (cod == medicamento.getCod()) {
					raf.writeChars(medicamento.getNombre());
					raf.writeDouble(medicamento.getPrecio());
					raf.writeInt(medicamento.getStock());
					raf.writeInt(medicamento.getStockMaximo());
					raf.writeInt(medicamento.getStockMinimo());
					raf.writeInt(medicamento.getCodProveedor());
				}
			}
		} catch (IOException e) {
			System.err.println("Error al actualizar el medicamento");
			return false;
		}
		return true;
	}

	@Override
	public boolean borrar(Medicamento medicamento) {
		File archivo = new File(ruta);
		int cod;
		try (RandomAccessFile raf = new RandomAccessFile(archivo, "rw")) {

			int numMedicamentos = (int) (raf.length() / TAM_REGISTRO);

			for (int i = 0; i < numMedicamentos - 1; i++) {
				raf.seek(TAM_REGISTRO * (i));
				cod = raf.readInt();

				if (medicamento.getCod() == (cod)) {
					raf.seek(TAM_REGISTRO * (i));

					for (int j = 0; j < TAM_REGISTRO; j++) // Lo rellenamos con carateres vacios
						raf.writeBytes("\u0000");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public List<Medicamento> leerTodos() {
		ArrayList<Medicamento> list = new ArrayList<Medicamento>();
		File archivo = new File(ruta);
		String nombreMed;
		Double precio;
		int cod, stock, stockMaximo, stockMinimo, codProveedor;
		try (RandomAccessFile raf = new RandomAccessFile(archivo, "r")) {

			int numMedicamentos = (int) (raf.length() / TAM_REGISTRO);
			for (int i = 0; i <= numMedicamentos - 1; i++) {
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
				if (!nombreMed.equals(""))
					list.add(new Medicamento(nombreMed, precio, cod, stock, stockMaximo, stockMinimo, codProveedor));
			}

		} catch (FileNotFoundException e) {
			System.err.println("El archivo no existe");
			
		} catch (IOException e) {
			System.err.println("error al mostrar todos los medicamentos");

		}
		return list;
	}

}