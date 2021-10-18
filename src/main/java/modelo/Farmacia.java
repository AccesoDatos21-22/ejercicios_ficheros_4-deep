package modelo;

import java.util.ArrayList;
import java.util.List;

import dao.MedicamentoDAO;

public class Farmacia implements MedicamentoDAO {
	private List<Medicamento> medicamentos;

	/**
	 * Constructor de la farmacia
	 */
	public Farmacia() {
		medicamentos = new ArrayList<Medicamento>();
	}

	@Override
	public boolean guardar(Medicamento medicamento) {
		for (Medicamento med : medicamentos)
			if (med.equals(medicamento))
				return false;

		medicamentos.add(medicamento);
		return true;
	}

	@Override
	public boolean borrar(Medicamento medicamento) {
		for (Medicamento med : medicamentos) {
			if (med.equals(medicamento)) {
				medicamentos.remove(medicamento);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Medicamento> leerTodos() {

		return this.medicamentos;
	}

	@Override
	public Medicamento buscar(String nombre) {
		return null;
	}

	@Override
	public boolean actualizar(Medicamento medicamento) {
		return false;
	}
}
