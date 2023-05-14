package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class HipertensoTest {

	@Test
	public void queSePuedaCrearUnDCeliaco() {
		// preparacion
		Hipertenso hipertenso;
		// ejecucion
		hipertenso = new Hipertenso("Eliana", "Navarro");
		// verificacion
		assertNotNull(hipertenso);
	}
	@Test
	public void queSePuedaAgregarUnPlatoSinSal() {
		// preparacion
		Hipertenso hipertenso;
		Plato plato;
		final Integer cantidadDePlatos = 1;
		// ejecucion
		hipertenso = new Hipertenso("Eliana", "Navarro");
		plato = new Plato(true, true, true, false);
		Boolean resultado = hipertenso.agregarPlato(plato);
		Integer cantidad = hipertenso.cantidadDePlatosAgregados();
		// verificacion
		assertTrue(resultado);
		assertEquals(cantidadDePlatos, cantidad);
	}
	@Test
	public void queNoSePuedaAgregarUnPlatoConSal() {
		// preparacion
		Hipertenso hipertenso;
		Plato plato;
		final Integer cantidadDePlatos = 0;
		// ejecucion
		hipertenso = new Hipertenso("Eliana", "Navarro");
		plato = new Plato(true, true, true, true);
		Boolean resultado = hipertenso.agregarPlato(plato);
		Integer cantidad = hipertenso.cantidadDePlatosAgregados();
		// verificacion
		assertFalse(resultado);
		assertEquals(cantidadDePlatos, cantidad);
	}
}
