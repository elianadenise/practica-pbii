package figura;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanguloTest {

	@Test
	public void queSePuedaCrearUnRectangulo() {
		Rectangulo rectangulo;
		
		rectangulo = new Rectangulo(4.0, 8.0, 3.0, 6.0);
		
		assertNotNull(rectangulo);
	}
	
	@Test
	public void queSePuedaMoverElRectangulo() {
		Rectangulo rectangulo;
		Double medidaUno = 5.0;
		Double medidaDos = 10.0;
		
		rectangulo = new Rectangulo(4.0, 8.0, 3.0, 6.0);
		Double nuevoPuntoUnoX = rectangulo.getPuntoUno().getX() + medidaUno;
		Double nuevoPuntoUnoY = rectangulo.getPuntoUno().getY() + medidaDos;
		Double nuevoPuntoDosX = rectangulo.getPuntoDos().getX() + medidaUno;
		Double nuevoPuntoDosY = rectangulo.getPuntoDos().getY() + medidaDos;
		rectangulo.mover(medidaUno, medidaDos);
		
		assertEquals(nuevoPuntoUnoX, rectangulo.getPuntoUno().getX());
		assertEquals(nuevoPuntoUnoY, rectangulo.getPuntoUno().getY());
		assertEquals(nuevoPuntoDosX, rectangulo.getPuntoDos().getX());
		assertEquals(nuevoPuntoDosY, rectangulo.getPuntoDos().getY());
	}
	
	@Test
	public void queSePuedaCalcularAltoYAncho() {
		Rectangulo rectangulo;
		
		rectangulo = new Rectangulo(4.0, 8.0, 3.0, 6.0);
		
		assertEquals(2.0, rectangulo.getAltura(), 0.01);
		assertEquals(1.0, rectangulo.getAncho(), 0.01);
	}

}
