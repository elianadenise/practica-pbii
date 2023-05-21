package montacargas;

import static org.junit.Assert.*;

import org.junit.Test;

public class MontacargasTest {

	@Test
	public void queSePuedaCrearMontacargasConPesoMaximo() {
		Montacargas montacargas;
		
		montacargas = new Montacargas(100.0);
		
		assertNotNull(montacargas);
	}

	@Test
	public void queSePuedaAgregarUnaCarga() {
		Montacargas montacargas;
		Carga carga;
		
		montacargas = new Montacargas(100.0);
		carga = new Carga(90.0);
		Boolean resultado = montacargas.agregarCarga(carga);
		
		assertTrue(resultado);
	}
	
	@Test 
	public void queSePuedaObtenerCarga() {
		Montacargas montacargas;
		Carga carga;
		Carga cargaDos;
		
		montacargas = new Montacargas(100.0);
		carga = new Carga(80.0);
		cargaDos = new Carga(5.0);
		montacargas.agregarCarga(carga);
		montacargas.agregarCarga(cargaDos);
		Double resultado = montacargas.obtenerCarga();
		Double resultadoEsperado = 85.0;
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void queSePuedaDescargar() {
		Montacargas montacargas;
		Carga carga;
		Carga cargaDos;
		
		montacargas = new Montacargas(100.0);
		carga = new Carga(80.0);
		cargaDos = new Carga(5.0);
		montacargas.agregarCarga(carga);
		montacargas.agregarCarga(cargaDos);
		Boolean descargar = montacargas.descargar();
		Integer resultado = montacargas.cantidadDeCargas();
		Integer resultadoEsperado = 0;
		
		assertTrue(descargar);
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void obtenerCargaPromedio() {
		Montacargas montacargas;
		Carga carga;
		Carga cargaDos;
		
		montacargas = new Montacargas(100.0);
		carga = new Carga(80.0);
		cargaDos = new Carga(4.0);
		montacargas.agregarCarga(carga);
		montacargas.agregarCarga(cargaDos);
		Double resultado = montacargas.obtenerCargaPromedio();
		Double resultadoEsperado = 42.0;
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void queNoSePuedaCargarMasQueElMaximo() {
		Montacargas montacargas;
		Carga carga;
		Carga cargaDos;
		
		montacargas = new Montacargas(100.0);
		carga = new Carga(80.0);
		cargaDos = new Carga(30.0);
		Boolean resultadoUno = montacargas.agregarCarga(carga);
		Boolean resultadoDos = montacargas.agregarCarga(cargaDos);
		
		assertTrue(resultadoUno);
		assertFalse(resultadoDos);
	}
}
