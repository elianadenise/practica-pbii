package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiabeticoTest {

	@Test
	public void queSePuedaCrearUnDiabetico() {
		// preparacion
		Diabetico diabetico;
		// ejecucion
		diabetico = new Diabetico("Eliana", "Navarro",1);
		// verificacion
		assertNotNull(diabetico);
	}
	@Test
	public void queSePuedaAgregarUnPlatoSinAzucar() {
		// preparacion
		Diabetico diabetico;
		Plato plato;
		final Integer cantidadDePlatos = 1;
		// ejecucion
		diabetico = new Diabetico("Eliana", "Navarro",1);
		plato = new Plato(false, true, true, true);
		Boolean resultado = diabetico.agregarPlato(plato);
		Integer cantidad = diabetico.cantidadDePlatosAgregados();
		// verificacion
		assertTrue(resultado);
		assertEquals(cantidadDePlatos, cantidad);
	}
	@Test
	public void queNoSePuedaAgregarUnPlatoConAzucar() {
		// preparacion
		Diabetico diabetico;
		Plato plato;
		final Integer cantidadDePlatos = 0;
		// ejecucion
		diabetico = new Diabetico("Eliana", "Navarro",1);
		plato = new Plato(true, true, true, true);
		Boolean resultado = diabetico.agregarPlato(plato);
		Integer cantidad = diabetico.cantidadDePlatosAgregados();
		// verificacion
		assertFalse(resultado);
		assertEquals(cantidadDePlatos, cantidad);
	}
	@Test
	public void queRecibaDosisInsulinaDiabeticoTipo2() {
		// preparacion
		Diabetico diabetico;
		// ejecucion
		diabetico = new Diabetico("Eliana", "Navarro",2);
		Boolean resultado = diabetico.getDosisInsulina();
		// verificacion
		assertTrue(resultado);
	}
	@Test
	public void queNoRecibaDosisInsulinaDiabeticoTipo1() {
		// preparacion
		Diabetico diabetico;
		// ejecucion
		diabetico = new Diabetico("Eliana", "Navarro",1);
		Boolean resultado = diabetico.getDosisInsulina();
		// verificacion
		assertFalse(resultado);
	}

}
