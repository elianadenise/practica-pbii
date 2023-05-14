package empresaLaPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTest {

	@Test
	public void queSePuedaCrearEmpresa() {
		Empresa empresa;
		empresa = new Empresa(28838423, "economica");
		assertNotNull(empresa);
	}
	
	@Test
	public void queSePuedaAgregarEmpleadosALaEmpresa() {
		Empresa empresa;
		Permanente permanente;
		Permanente permanenteDos;
		Gerente gerente;
		Temporario temporario;
		
		empresa = new Empresa(28838423, "economica");
		permanente = new Permanente(80, 2, true, 6);
		permanenteDos = new Permanente(160, 0, false, 4);
		gerente = new Gerente(160, 1, true, 10);
		temporario = new Temporario(80, 0, true);
		
		Boolean agregar = empresa.agregarEmpleado(permanente);
		Boolean agregarDos = empresa.agregarEmpleado(permanenteDos);
		Boolean agregarTres = empresa.agregarEmpleado(gerente);
		Boolean agregarCuatro = empresa.agregarEmpleado(temporario);
		
		assertTrue(agregar);
		assertTrue(agregarDos);
		assertTrue(agregarTres);
		assertTrue(agregarCuatro);
	}
	
	@Test
	public void queSeCalculeElGastoTotalDeLaEmpresa() {
		Empresa empresa;
		Permanente permanente;
		Permanente permanenteDos;
		Gerente gerente;
		Temporario temporario;
		
		empresa = new Empresa(28838423, "economica");
		permanente = new Permanente(80, 2, true, 6);
		permanenteDos = new Permanente(160, 0, false, 4);
		gerente = new Gerente(160, 1, true, 10);
		temporario = new Temporario(80, 0, true);
		
		empresa.agregarEmpleado(permanente);
		empresa.agregarEmpleado(permanenteDos);
		empresa.agregarEmpleado(gerente);
		empresa.agregarEmpleado(temporario);
		
		Double resultadoTotal = empresa.calcularTotalDeMes();
		Double resultadoEsperado = 155400.0;
		
		assertEquals(resultadoEsperado, resultadoTotal);
	}

}
