package figura;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void queSePuedaCrearUnCuadrado() {
		Cuadrado cuadrado;
		
		cuadrado = new Cuadrado(5.0, 10.0, 15.0);
		
		assertNotNull(cuadrado);
	}
	
	@Test
	public void queSePuedaMoverUnElipse() {
		Cuadrado cuadrado;
		Double x = 4.0;
		Double y = 2.0;
		
		cuadrado = new Cuadrado(5.0, 10.0, 15.0);
		cuadrado.mover(x, y);
		
		assertEquals(x, cuadrado.getPunto().getX(), 0.01);
		assertEquals(y, cuadrado.getPunto().getY(), 0.01);
	}

}
