package empresaDeTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutoTest {

	@Test
	public void queSePuedaCrearUnAutobus() {
		Auto auto;
		
		auto = new Auto();
		
		assertNotNull(auto);
	}
	
	@Test
	public void queSePuedaAsignarUnChofer() {
		Auto auto;
		Persona persona;
		
		auto = new Auto();
		persona = new Persona(true);
		Boolean resultado = auto.asignarChofer(persona);
		
		assertTrue(resultado);
	}

	@Test
	public void queSeNoPuedaAsignarUnChoferSiendoPasajero() {
		Auto auto;
		Persona persona;
		
		auto = new Auto();
		persona = new Persona(false);
		Boolean resultado = auto.asignarChofer(persona);
		
		assertFalse(resultado);
	}
	
	@Test
	public void queSePuedaAsignarUnPasajero() {
		Auto auto;
		Persona persona;
		
		auto = new Auto();
		persona = new Persona(false);
		Boolean resultado = auto.agregarPasajero(persona);
		
		assertTrue(resultado);
	}
	
	@Test
	public void queNoSePuedaAsignarMasDe4Pasajeros() {
		Auto auto;
		Persona persona, persona2, persona3, persona4;
		
		auto = new Auto();
		persona = new Persona(false);
		persona2 = new Persona(false);
		persona3 = new Persona(false);
		persona4 = new Persona(false);
		
		auto.agregarPasajero(persona);
		auto.agregarPasajero(persona2);		
		
		Boolean resultado = auto.agregarPasajero(persona3);
		
		Boolean resultadoDos = auto.agregarPasajero(persona4);
		
		assertTrue(resultado);
		assertFalse(resultadoDos);
	}
	
	@Test 
	public void queNoSePuedaAsignarAcompanianteSiendoChofer() {
		Auto auto;
		Persona persona;
		
		auto = new Auto();
		persona = new Persona(true);
		Boolean resultado = auto.agregarPasajero(persona);
		
		assertFalse(resultado);
	}
	
	@Test
	public void queSePuedaCambiarDeChofer() {
		Auto auto;
		Persona persona;
		Persona personaDos;
		
		auto = new Auto();
		persona = new Persona(true);
		personaDos = new Persona(true);
		Boolean resultado = auto.asignarChofer(persona);
		Boolean resultadoDos = auto.cambiarChofer(personaDos);
		
		assertTrue(resultado);
		assertTrue(resultadoDos);
	}
	
	@Test
	public void queNoSePuedaCambiarChoferConAcompaniante() {
		Auto auto;
		Persona persona;
		Persona personaDos;
		Persona personaTres;
		
		auto = new Auto();
		persona = new Persona(true);
		personaDos = new Persona(true);
		personaTres = new Persona(false);
		Boolean resultado = auto.asignarChofer(persona);
		Boolean resultadoDos = auto.agregarPasajero(personaTres);
		Boolean resultadoTres = auto.cambiarChofer(personaDos);
		
		assertTrue(resultado);
		assertTrue(resultadoDos);
		assertFalse(resultadoTres);
	}

}
