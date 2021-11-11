package Tests;

import dao.MedicamentoAleatorio;
import modelo.Medicamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoAleatorioTest {
    MedicamentoAleatorio ma=new MedicamentoAleatorio();
    public final static String ruta = "medicamentosRandom.txt";
    Medicamento md1=new Medicamento("Paracetamol",10, 0, 45, 109, 1, 0);
    Medicamento md2=new Medicamento("Ibuprofeno",16, 1, 23, 140, 2, 1);
    Medicamento md3=new Medicamento("Acelerator",23, 2, 25, 137, 4, 0);
    @Test
    public void testGuardarMedicamento(){
        assertTrue(ma.guardar(md1));
        assertTrue(ma.guardar(md2));
        assertTrue(ma.guardar(md3));

    }
    @Test
    public void testBuscarMedicamento(){
        assertEquals(md1,ma.buscar("Paracetamol"));
        assertNotEquals(md3, ma.buscar("Acelerator"));

    }
    @Test
    public void testActualizarMedicamento(){
        assertTrue(ma.actualizar(md1));
        assertTrue(ma.actualizar(md2));
        assertTrue(ma.actualizar(new Medicamento("No es Acelerator",23, 2, 25, 137, 4, 0)));
    }
    @Test
    public void testBorrarMedicamentos(){
        assertTrue(ma.borrar(md1));
        assertTrue(ma.borrar(md2));
        assertTrue(ma.borrar(md3));
    }
}