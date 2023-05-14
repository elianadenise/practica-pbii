package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PacienteTest {
	@Test
	public void queSePuedaCrearPaciente() {
		// preparacion
		Paciente paciente;
		// ejecucion
		paciente = new Paciente("Eliana", "Navarro");
		// verificacion
		assertNotNull(paciente);
	}
	@Test
	public void queSePuedaAgregarUnPlato() {
		// preparacion
		Paciente paciente;
		Plato plato;
		final Integer cantidadDePlatos = 1;
		// ejecucion
		paciente = new Paciente("Eliana", "Navarro");
		plato = new Plato(false, true, true, true);
		Boolean resultado = paciente.agregarPlato(plato);
		Integer cantidad = paciente.cantidadDePlatosAgregados();
		// verificacion
		assertTrue(resultado);
		assertEquals(cantidadDePlatos, cantidad);
	}
}
