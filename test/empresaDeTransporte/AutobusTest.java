package empresaDeTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutobusTest {

	@Test
	public void queSePuedaCrearUnAutobus() {
		Autobus autobus;
		
		autobus = new Autobus();
		
		assertNotNull(autobus);
	}
	
	@Test
	public void queSePuedaAsignarUnChofer() {
		Autobus autobus;
		Persona persona;
		
		autobus = new Autobus();
		persona = new Persona(true);
		Boolean resultado = autobus.asignarChofer(persona);
		
		assertTrue(resultado);
	}

	@Test
	public void queSeNoPuedaAsignarUnChoferSiendoPasajero() {
		Autobus autobus;
		Persona persona;
		
		autobus = new Autobus();
		persona = new Persona(false);
		Boolean resultado = autobus.asignarChofer(persona);
		
		assertFalse(resultado);
	}
	
	@Test
	public void queSePuedaAsignarUnPasajero() {
		Autobus autobus;
		Persona persona;
		
		autobus = new Autobus();
		persona = new Persona(false);
		Boolean resultado = autobus.agregarPasajero(persona);
		
		assertTrue(resultado);
	}
	
	@Test
	public void queNoSePuedaAsignarMasDe20Pasajeros() {
		Autobus autobus;
		Persona persona, persona2, persona3, persona4, persona5, persona6, persona7, persona8, persona9, persona10, 
		persona11, persona12, persona13, persona14, persona15, persona16, persona17, persona18, persona19, persona20, persona21;
		
		autobus = new Autobus();
		persona = new Persona(false);
		persona2 = new Persona(false);
		persona3 = new Persona(false);
		persona4 = new Persona(false);
		persona5 = new Persona(false);
		persona6 = new Persona(false);
		persona7 = new Persona(false);
		persona8 = new Persona(false);
		persona9 = new Persona(false);
		persona10 = new Persona(false);
		persona11 = new Persona(false);
		persona12 = new Persona(false);
		persona13 = new Persona(false);
		persona14 = new Persona(false);
		persona15 = new Persona(false);
		persona16 = new Persona(false);
		persona17 = new Persona(false);
		persona18 = new Persona(false);
		persona19 = new Persona(false);
		persona20 = new Persona(false);
		persona21 = new Persona(false);
		
		autobus.agregarPasajero(persona);
		autobus.agregarPasajero(persona2);
		autobus.agregarPasajero(persona3);
		autobus.agregarPasajero(persona4);
		autobus.agregarPasajero(persona5);
		autobus.agregarPasajero(persona6);
		autobus.agregarPasajero(persona7);
		autobus.agregarPasajero(persona8);
		autobus.agregarPasajero(persona9);
		autobus.agregarPasajero(persona10);
		autobus.agregarPasajero(persona11);
		autobus.agregarPasajero(persona12);
		autobus.agregarPasajero(persona13);
		autobus.agregarPasajero(persona14);
		autobus.agregarPasajero(persona15);
		autobus.agregarPasajero(persona16);
		autobus.agregarPasajero(persona17);
		autobus.agregarPasajero(persona18);
		autobus.agregarPasajero(persona19);
		
		Boolean resultado = autobus.agregarPasajero(persona20);
		
		Boolean resultadoDos = autobus.agregarPasajero(persona21);
		
		assertTrue(resultado);
		assertFalse(resultadoDos);
	}
	
	@Test 
	public void queNoSePuedaAsignarPasajeroSiendoChofer() {
		Autobus autobus;
		Persona persona;
		
		autobus = new Autobus();
		persona = new Persona(true);
		Boolean resultado = autobus.agregarPasajero(persona);
		
		assertFalse(resultado);
	}
	
	@Test
	public void queSePuedaCambiarDeChofer() {
		Autobus autobus;
		Persona persona;
		Persona personaDos;
		
		autobus = new Autobus();
		persona = new Persona(true);
		personaDos = new Persona(true);
		Boolean resultado = autobus.asignarChofer(persona);
		Boolean resultadoDos = autobus.cambiarChofer(personaDos);
		
		assertTrue(resultado);
		assertTrue(resultadoDos);
	}
	
	@Test
	public void queNoSePuedaCambiarChoferConAcompaniante() {
		Autobus autobus;
		Persona persona;
		Persona personaDos;
		Persona personaTres;
		
		autobus = new Autobus();
		persona = new Persona(true);
		personaDos = new Persona(true);
		personaTres = new Persona(false);
		Boolean resultado = autobus.asignarChofer(persona);
		Boolean resultadoDos = autobus.agregarPasajero(personaTres);
		Boolean resultadoTres = autobus.cambiarChofer(personaDos);
		
		assertTrue(resultado);
		assertTrue(resultadoDos);
		assertFalse(resultadoTres);
	}

}
