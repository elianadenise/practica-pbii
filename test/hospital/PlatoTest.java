package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlatoTest {

	@Test
	public void queSePuedaCrearUnPlato() {
		// preparacion
		Plato plato;
		// ejecucion
		plato = new Plato(false, true, false, true);
		// verificacion
		assertNotNull(plato);
	}

}
