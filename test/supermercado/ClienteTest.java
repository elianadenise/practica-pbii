package supermercado;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void queUnClienteSepaSuPosicion() {
		Cliente cliente;
		
		cliente = new Cliente(5,5);
		Integer posicion = cliente.getPosicion();
		assertTrue(posicion.equals(5));
				
	}

}
