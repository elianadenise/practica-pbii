package figura;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void queSePuedaCrearUnCirculo() {
		Elipse elipse;
		
		elipse = new Elipse(2.0, 4.0, 6.0, 8.0);
		
		assertNotNull(elipse);
	}
	
	@Test
	public void queSePuedaMoverUnCirculo() {
		Circulo circulo;
		Double x = 4.0;
		Double y = 2.0;
		
		circulo = new Circulo(2.0, 4.0, 6.0);
		circulo.mover(x, y);
		
		assertEquals(x, circulo.getPunto().getX(), 0.01);
		assertEquals(y, circulo.getPunto().getY(), 0.01);
	}

}
