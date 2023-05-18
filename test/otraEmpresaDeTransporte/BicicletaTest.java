package otraEmpresaDeTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletaTest {

	@Test
	public void queSePuedaCrearUnaBicicleta() {
		Bicicleta bicicleta;
		
		bicicleta = new Bicicleta();
		
		assertNotNull(bicicleta);
	}
	
	@Test
	public void queSePuedaAgregarPaquete() {
		Bicicleta bicicleta;
		Paquete paquete;
		
		bicicleta = new Bicicleta();
		paquete = new Paquete(0.1,0.1,0.1, "madero");
		Boolean resultado = bicicleta.agregarPaquete(paquete);
		
		assertTrue(resultado);
	}
	
	@Test
	public void queSePuedaAgregarPaqueteConMismoDestino() {
		Bicicleta bicicleta;
		Paquete paquete;
		Paquete paqueteDos;
		// FALTA VOLUMEN
		bicicleta = new Bicicleta();
		paquete = new Paquete(0.1,0.1,0.1, "madero");
		paqueteDos = new Paquete(0.1,0.1,0.1, "madero");
		Boolean resultado = bicicleta.agregarPaquete(paquete);
		
		assertTrue(resultado);
	}

}
