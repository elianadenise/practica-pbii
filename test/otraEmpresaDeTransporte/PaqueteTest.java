package otraEmpresaDeTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaqueteTest {

	@Test
	public void queSePuedaCrearUnPaquete() {
		Paquete paquete;
		
		paquete = new Paquete(1.0, 1.0, 1.0, "madero");
		
		assertNotNull(paquete);
	}
	
	@Test
	public void queSeCalculeElVolumenAlInicializar() {
		Paquete paquete;
		
		paquete = new Paquete(1.0, 1.0, 1.0, "madero");
		Double resultado = paquete.getVolumen();
		Double resultadoEsperado = 1.0;
		
		assertEquals(resultadoEsperado, resultado, 0.01);
	}

}
