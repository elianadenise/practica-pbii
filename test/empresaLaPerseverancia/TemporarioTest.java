package empresaLaPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemporarioTest {

	@Test
	public void queSePuedaCrearUnTemporario80horasCasadoSinHijos() {
		Temporario temporario;
		
		temporario = new Temporario(80, 0, true);
		Double resultado = temporario.calcularSueldo();
		Double resultadoEsperado = 16100.0;
		
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

}
