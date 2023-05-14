package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class OncologicoTest {

	@Test
	public void queSePuedaCrearUnOncologico() {
		// preparacion
		Oncologico oncologico;
		// ejecucion
		oncologico = new Oncologico("Eliana", "Navarro");
		// verificacion
		assertNotNull(oncologico);
	}
	@Test
	public void queSePuedaAgregarUnPlatoCocico() {
		// preparacion
		Oncologico oncologico;
		Plato plato;
		final Integer cantidadDePlatos = 1;
		// ejecucion
		oncologico = new Oncologico("Eliana", "Navarro");
		plato = new Plato(false, true, true, true);
		Boolean resultado = oncologico.agregarPlato(plato);
		Integer cantidad = oncologico.cantidadDePlatosAgregados();
		// verificacion
		assertTrue(resultado);
		assertEquals(cantidadDePlatos, cantidad);
	}
	@Test
	public void queNoSePuedaAgregarUnPlatoCrudo() {
		// preparacion
		Oncologico oncologico;
		Plato plato;
		final Integer cantidadDePlatos = 0;
		// ejecucion
		oncologico = new Oncologico("Eliana", "Navarro");
		plato = new Plato(true, false, true, true);
		Boolean resultado = oncologico.agregarPlato(plato);
		Integer cantidad = oncologico.cantidadDePlatosAgregados();
		// verificacion
		assertFalse(resultado);
		assertEquals(cantidadDePlatos, cantidad);
	}

}
