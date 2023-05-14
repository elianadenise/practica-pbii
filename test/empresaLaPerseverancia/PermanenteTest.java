package empresaLaPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermanenteTest {

	@Test
	public void queSePuedaCrearUnEmpleadoPermanente() {
		Permanente permanente;
		
		permanente = new Permanente(80, 0, true, 0);
		
		assertNotNull(permanente);
	}
	
	@Test
	public void queSePuedaCrearUnEmpleadoCon80hsEsposaSinHijos6antiguedad() {
		Permanente permanente;
		
		permanente = new Permanente(80, 2, true, 6);
		Double resultado = permanente.calcularSueldo();
		Double resultadoEsperado = 25100.0;
		
		assertEquals(resultadoEsperado, resultado, 0.01);
	}
	
	@Test
	public void queSePuedaCrearUnEmpleadoCon160hsEsposa1Hijo10antiguedad() {
		Permanente permanente;
		
		permanente = new Permanente(160, 0, false, 4);
		Double resultado = permanente.calcularSueldo();
		Double resultadoEsperado = 48400.0;
		
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

}
