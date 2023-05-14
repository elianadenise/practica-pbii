package empresaDeTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class MotocicletaTest {

	@Test
	public void queSePuedaCrearUnMotocicleta() {
		Motocicleta motocicleta;
		
		motocicleta = new Motocicleta();
		
		assertNotNull(motocicleta);
	}
	
	@Test
	public void queSePuedaAsignarUnChofer() {
		Motocicleta motocicleta;
		Persona persona;
		
		motocicleta = new Motocicleta();
		persona = new Persona(true);
		Boolean resultado = motocicleta.asignarChofer(persona);
		
		assertTrue(resultado);
	}

	@Test
	public void queSeNoPuedaAsignarUnChoferSiendoAcompaniante() {
		Motocicleta motocicleta;
		Persona persona;
		
		motocicleta = new Motocicleta();
		persona = new Persona(false);
		Boolean resultado = motocicleta.asignarChofer(persona);
		
		assertFalse(resultado);
	}
	
	@Test
	public void queSePuedaAsignarUnAcompañante() {
		Motocicleta motocicleta;
		Persona persona;
		
		motocicleta = new Motocicleta();
		persona = new Persona(false);
		Boolean resultado = motocicleta.agregarPasajero(persona);
		
		assertTrue(resultado);
	}
	
	@Test
	public void queNoSePuedaAsignarMasDeUnAcompaniante() {
		Motocicleta motocicleta;
		Persona persona;
		Persona personaDos;
		
		motocicleta = new Motocicleta();
		persona = new Persona(false);
		personaDos = new Persona(false);
		Boolean resultado = motocicleta.agregarPasajero(persona);
		Boolean resultadoDos = motocicleta.agregarPasajero(personaDos);
		
		assertTrue(resultado);
		assertFalse(resultadoDos);
	}
	
	@Test 
	public void queNoSePuedaAsignarAcompanianteSiendoChofer() {
		Motocicleta motocicleta;
		Persona persona;
		
		motocicleta = new Motocicleta();
		persona = new Persona(true);
		Boolean resultado = motocicleta.agregarPasajero(persona);
		
		assertFalse(resultado);
	}
	
	@Test
	public void queSePuedaCambiarDeChofer() {
		Motocicleta motocicleta;
		Persona persona;
		Persona personaDos;
		
		motocicleta = new Motocicleta();
		persona = new Persona(true);
		personaDos = new Persona(true);
		Boolean resultado = motocicleta.asignarChofer(persona);
		Boolean resultadoDos = motocicleta.cambiarChofer(personaDos);
		
		assertTrue(resultado);
		assertTrue(resultadoDos);
	}
	
	@Test
	public void queNoSePuedaCambiarChoferConAcompaniante() {
		Motocicleta motocicleta;
		Persona persona;
		Persona personaDos;
		Persona personaTres;
		
		motocicleta = new Motocicleta();
		persona = new Persona(true);
		personaDos = new Persona(true);
		personaTres = new Persona(false);
		Boolean resultado = motocicleta.asignarChofer(persona);
		Boolean resultadoDos = motocicleta.agregarPasajero(personaTres);
		Boolean resultadoTres = motocicleta.cambiarChofer(personaDos);
		
		assertTrue(resultado);
		assertTrue(resultadoDos);
		assertFalse(resultadoTres);
	}
}
