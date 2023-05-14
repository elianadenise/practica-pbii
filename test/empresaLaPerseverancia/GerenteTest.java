package empresaLaPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTest {

	@Test
	public void queSePuedaCrearUnEmpleadoCon160hsEsposa1Hijo10antiguedad() {
		Gerente gerente;
		
		gerente = new Gerente(160, 1, true, 10);
		Double resultado = gerente.calcularSueldo();
		Double resultadoEsperado = 65800.0;
		
		assertEquals(resultadoEsperado, resultado, 0.01);
	}
}
