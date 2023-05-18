package bibliotecaNacional;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void queSePuedaAgregarUnLibroALaBiblioteca() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		
		matematica = new Matematica(1, "Matematica", "Einstein");
		geografia = new Geografia(2, "Geografia", "Geografia");
		historia =  new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		Boolean agregarUno = biblioteca.agregarLibro(matematica);
		Boolean agregarDos = biblioteca.agregarLibro(geografia);
		Boolean agregarTres = biblioteca.agregarLibro(historia);
		Integer cantidad = 3;
		
		assertTrue(agregarUno);
		assertTrue(agregarDos);
		assertTrue(agregarTres);
		assertEquals(cantidad, biblioteca.cantidadDeLibrosDisponibles());
	}
	
	@Test
	public void queSePuedaRealizarUnPrestamo() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		Estudiante estudiante;
		
		estudiante = new Estudiante(41334401, "Eliana", "Navarro");
		matematica = new Matematica(1, "Matematica", "Einstein");
		geografia = new Geografia(2, "Geografia", "Geografia");
		historia =  new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		Integer cantidadDisponibles = 2;
		Integer cantidadPrestamo = 1;
		Prestamo prestamo = biblioteca.prestar(historia, estudiante);

		assertNotNull(prestamo);
		assertEquals(cantidadDisponibles, biblioteca.cantidadDeLibrosDisponibles());
		assertEquals(cantidadPrestamo, biblioteca.cantidadDePrestamos());
	}
	
	@Test
	public void queNoSePuedaRealizarMasDeDosPrestamosPorEstudiante() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		Estudiante estudiante;
		
		estudiante = new Estudiante(41334401, "Eliana", "Navarro");
		matematica = new Matematica(1, "Matematica", "Einstein");
		geografia = new Geografia(2, "Geografia", "Geografia");
		historia =  new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		Integer cantidadDisponibles = 1;
		Integer cantidadPrestamo = 2;
		Prestamo prestamo = biblioteca.prestar(historia, estudiante);
		Prestamo prestamoDos = biblioteca.prestar(geografia, estudiante);
		Prestamo prestamoTres = biblioteca.prestar(matematica, estudiante);

		assertNotNull(prestamo);
		assertNotNull(prestamoDos);
		assertNull(prestamoTres);
		assertEquals(cantidadDisponibles, biblioteca.cantidadDeLibrosDisponibles());
		assertEquals(cantidadPrestamo, biblioteca.cantidadDePrestamos());
	}
	
	@Test
	public void queNoSePuedaPrestarUnLibroQueYaFuePrestado() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		Estudiante estudiante;
		
		estudiante = new Estudiante(41334401, "Eliana", "Navarro");
		matematica = new Matematica(1, "Matematica", "Einstein");
		geografia = new Geografia(2, "Geografia", "Geografia");
		historia =  new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		Integer cantidadDisponibles = 2;
		Integer cantidadPrestamo = 1;
		Prestamo prestamo = biblioteca.prestar(historia, estudiante);
		Prestamo prestamoDos = biblioteca.prestar(historia, estudiante);

		assertNotNull(prestamo);
		assertNull(prestamoDos);
		assertEquals(cantidadDisponibles, biblioteca.cantidadDeLibrosDisponibles());
		assertEquals(cantidadPrestamo, biblioteca.cantidadDePrestamos());
	}
	@Test
	public void queSePuedaImprimirLibroDeHistoriaYGeografia() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		
		matematica = new Matematica(1, "Matematica", "Einstein");
		geografia = new Geografia(2, "Geografia", "Geografia");
		historia =  new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		String libroHistoria = "Historia argentina de Domingo Sarmiento. Versión fotocopiable.";
		String libroGeografia = "Geografia de Geografia. Versión fotocopiable.";
		String resultadoHistoria = biblioteca.imprimir(historia);
		String resultadoGeografia = biblioteca.imprimir(geografia);
		
		assertEquals(libroHistoria, resultadoHistoria);
		assertEquals(libroGeografia, resultadoGeografia);
	}
	
	@Test
	public void queNoSePuedaImprimirLibroDeMatematica() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		
		matematica = new Matematica(1, "Matematica", "Einstein");
		geografia = new Geografia(2, "Geografia", "Geografia");
		historia =  new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		String libroMatematica = "Prohibida su fotocopia";
		String resultadoHistoria = biblioteca.imprimir(matematica);
		
		assertEquals(libroMatematica, resultadoHistoria);
	}
	
	@Test
	public void queSePuedaRealizarUnPrestamoConOtraForma() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		Estudiante estudiante;
		
		estudiante = new Estudiante(41334401, "Eliana", "Navarro");
		matematica = new Matematica(1, "Matematica", "Einstein");
		geografia = new Geografia(2, "Geografia", "Geografia");
		historia =  new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		Integer cantidadDisponibles = 2;
		Integer cantidadPrestamo = 1;
		Boolean prestamo = biblioteca.prestarDeOtraForma(historia, estudiante);

		assertTrue(prestamo);
		assertEquals(cantidadDisponibles, biblioteca.cantidadDeLibrosDisponibles());
		assertEquals(cantidadPrestamo, biblioteca.cantidadDePrestamos());
	}
	
	@Test
	public void queNoSePuedaRealizarMasDeDosPrestamosPorEstudianteConOtraForma() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		Estudiante estudiante;
		
		estudiante = new Estudiante(41334401, "Eliana", "Navarro");
		matematica = new Matematica(1, "Matematica", "Einstein");
		geografia = new Geografia(2, "Geografia", "Geografia");
		historia =  new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		Integer cantidadDisponibles = 1;
		Integer cantidadPrestamo = 2;
		Boolean prestamo = biblioteca.prestarDeOtraForma(historia, estudiante);
		Boolean prestamoDos = biblioteca.prestarDeOtraForma(geografia, estudiante);
		Boolean prestamoTres = biblioteca.prestarDeOtraForma(matematica, estudiante);

		assertTrue(prestamo);
		assertTrue(prestamoDos);
		assertFalse(prestamoTres);
		assertEquals(cantidadDisponibles, biblioteca.cantidadDeLibrosDisponibles());
		assertEquals(cantidadPrestamo, biblioteca.cantidadDePrestamos());
	}
	
	@Test
	public void queSePuedaDevolverUnLibro() {
		Biblioteca biblioteca;
		Matematica matematica;
		Geografia geografia;
		Historia historia;
		Estudiante estudiante;
		
		estudiante = new Estudiante(41334401, "Eliana", "Navarro");
		matematica = new Matematica(1, "Matematica", "Einstein");
		geografia = new Geografia(2, "Geografia", "Geografia");
		historia =  new Historia(3, "Historia argentina", "Domingo Sarmiento");
		biblioteca = new Biblioteca();
		biblioteca.agregarLibro(matematica);
		biblioteca.agregarLibro(geografia);
		biblioteca.agregarLibro(historia);
		Integer cantidadDisponibles = 2;
		Integer cantidadPrestamo = 1;
		Prestamo prestamo = biblioteca.prestar(historia, estudiante);
		Prestamo prestamoDos = biblioteca.prestar(geografia, estudiante);
		Boolean devolver = biblioteca.devolverLibro(prestamoDos);

		assertTrue(devolver);
		assertEquals(cantidadDisponibles, biblioteca.cantidadDeLibrosDisponibles());
		assertEquals(cantidadPrestamo, biblioteca.cantidadDePrestamos());
	}
}
