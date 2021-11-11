package Test;


import dao.MedicamentoAleatorio;
import modelo.Medicamento;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class PruebasMedicamentos {
	MedicamentoAleatorio ma= new MedicamentoAleatorio();

	@Test
	public void testguardarMedicamento() {
		
		Medicamento md1=new Medicamento("Paracetamol",0, 23, 45, 109, 1, 0);
		Medicamento md2=new Medicamento("Ibruprofeno",1, 16, 23, 140, 2, 1);
		Medicamento md3=new Medicamento("Acelerator",2, 10, 25, 137, 4, 0);
		assertTrue(ma.guardar(md1));
		assertTrue(ma.guardar(md2));
		assertTrue(ma.guardar(md3));
	}

}
