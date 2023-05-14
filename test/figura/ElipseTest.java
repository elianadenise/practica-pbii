package figura;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElipseTest {

	@Test
	public void queSePuedaCrearUnElipse() {
		Elipse elipse;
		
		elipse = new Elipse(2.0, 4.0, 6.0, 8.0);
		
		assertNotNull(elipse);
	}
	
	@Test
	public void queSePuedaMoverUnElipse() {
		Elipse elipse;
		Double x = 4.0;
		Double y = 2.0;
		
		elipse = new Elipse(2.0, 4.0, 6.0, 8.0);
		elipse.mover(x, y);
		
		assertEquals(x, elipse.getPunto().getX(), 0.01);
		assertEquals(y, elipse.getPunto().getY(), 0.01);
	}

}
