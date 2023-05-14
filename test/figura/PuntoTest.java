package figura;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void queSePuedaCrearUnPunto() {
		Punto punto;
		
		punto = new Punto(2.4, 4.2);
		
		assertNotNull(punto);
	}

}
