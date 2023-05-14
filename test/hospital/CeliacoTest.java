package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class CeliacoTest {

	@Test
	public void queSePuedaCrearUnDCeliaco() {
		// preparacion
		Celiaco celiaco;
		// ejecucion
		celiaco = new Celiaco("Eliana", "Navarro");
		// verificacion
		assertNotNull(celiaco);
	}
	@Test
	public void queSePuedaAgregarUnPlatoSinTacc() {
		// preparacion
		Celiaco celiaco;
		Plato plato;
		final Integer cantidadDePlatos = 1;
		// ejecucion
		celiaco = new Celiaco("Eliana", "Navarro");
		plato = new Plato(false, true, true, true);
		Boolean resultado = celiaco.agregarPlato(plato);
		Integer cantidad = celiaco.cantidadDePlatosAgregados();
		// verificacion
		assertTrue(resultado);
		assertEquals(cantidadDePlatos, cantidad);
	}
	@Test
	public void queNoSePuedaAgregarUnPlatoConTacc() {
		// preparacion
		Celiaco celiaco;
		Plato plato;
		final Integer cantidadDePlatos = 0;
		// ejecucion
		celiaco = new Celiaco("Eliana", "Navarro");
		plato = new Plato(true, true, true, true);
		Boolean resultado = celiaco.agregarPlato(plato);
		Integer cantidad = celiaco.cantidadDePlatosAgregados();
		// verificacion
		assertFalse(resultado);
		assertEquals(cantidadDePlatos, cantidad);
	}

}
