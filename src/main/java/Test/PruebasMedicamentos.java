package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.MedicamentoAleatorio;
import modelo.Medicamento;

public class PruebasMedicamentos {
	MedicamentoAleatorio ma= new MedicamentoAleatorio();

	@Test
	public void testguardarMedicamento() {
		
		Medicamento md1=new Medicamento(0,"Paracetamol", 23, 45, 109, 1, 0);
		Medicamento md2=new Medicamento(1,"Ibruprofeno", 16, 23, 140, 2, 1);
		Medicamento md3=new Medicamento(2,"Acelerator", 10, 25, 137, 4, 0);
		assertEquals(true, ma.guardar(md1));
		assertEquals(true, ma.guardar(md2));
		assertEquals(true, ma.guardar(md3));
	}

}
