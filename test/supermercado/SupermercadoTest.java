package supermercado;

import static org.junit.Assert.*;

import org.junit.Test;

public class SupermercadoTest {

	@Test
	public void queLaColaEsteVacia() {
		Supermercado supermercado;
		
		supermercado = new Supermercado();
		Integer valorObtenido = supermercado.getCantidadDeClientesEnCola();
		Integer valorEsperado = 0;
		
		assertEquals(valorEsperado, valorObtenido);
		
	}

	@Test
	public void queAlLlegarGenteLaColaNoEsteVacia() {
		Supermercado supermercado;
		Cliente cliente1;
		Cliente cliente2;
		Cliente cliente3;
		Cliente cliente4;		
		
		supermercado = new Supermercado();
		cliente1 = new Cliente(1,2);
		cliente2 = new Cliente(2,2);
		cliente3 = new Cliente(3,2);
		cliente4 = new Cliente(4,2);
		supermercado.agregarClienteACola(cliente1);
		supermercado.agregarClienteACola(cliente2);
		supermercado.agregarClienteACola(cliente3);
		supermercado.agregarClienteACola(cliente4);
		Integer valorEsperado = 4;
		Integer valorObtenido = supermercado.getCantidadDeClientesEnCola();
		
		assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void queLaColaRapidaEsteVacia() {
		Supermercado supermercado;
		
		supermercado = new Supermercado();
		Integer valorObtenido = supermercado.getCantidadDeClientesEnColaRapida();
		Integer valorEsperado = 0;
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePasenClientesALaColaRapidaConLaUbicacion() {
		Supermercado supermercado;
		Cliente cliente1;
		Cliente cliente2;
		Cliente cliente3;
		Cliente cliente4;		
		
		supermercado = new Supermercado();
		cliente1 = new Cliente(1,2);
		cliente2 = new Cliente(2,6);
		cliente3 = new Cliente(3,7);
		cliente4 = new Cliente(4,3);
		supermercado.agregarClienteACola(cliente1);
		supermercado.agregarClienteACola(cliente2);
		supermercado.agregarClienteACola(cliente3);
		supermercado.agregarClienteACola(cliente4);
		supermercado.abrirColaRapida();
		Integer valorEsperado = 2;
		Integer valorObtenido = supermercado.getCantidadDeClientesEnColaRapida();
		Integer valorEnColaA = supermercado.getCantidadDeClientesEnCola();
				
		assertEquals(valorEsperado, valorObtenido);
		assertEquals(valorEsperado, valorEnColaA);
	}
}
