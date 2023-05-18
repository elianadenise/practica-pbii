package bibliotecaNacional;

import java.util.*;

public class Biblioteca {
	private List<Libro> disponibles;
	private List<Prestamo> prestamos;
	private Integer contadorPrestamos;
	
	public Biblioteca() {
		this.disponibles = new ArrayList<Libro>();
		this.prestamos = new ArrayList<Prestamo>();
		this.contadorPrestamos = 0;
	}
	
	public String imprimir(Libro libro) {
		return libro.imprimir();
	}
	
	public Boolean agregarLibro(Libro libro) {
		return disponibles.add(libro);
	}
	
	public Boolean devolverLibro(Prestamo prestamo) {
		this.prestamos.remove(prestamo);
		prestamo.getEstudiante().devolverABiblioteca(prestamo.getLibro());
		return this.agregarLibro(prestamo.getLibro());
	}
	
	public Prestamo prestar(Libro libro, Estudiante estudiante) {
		if(estudiante.librosEnPrestamo() < 2 && this.disponibles.contains(libro)) {
			Prestamo prestamo = new Prestamo(contadorPrestamos++, libro, estudiante);
			this.prestamos.add(prestamo);
			this.disponibles.remove(libro);
			estudiante.agregarEnPrestamo(libro);
			return prestamo;
		}
		return null;
	}
	
	public Integer cantidadDeLibrosDisponibles() {
		return this.disponibles.size();
	}
	
	public Integer cantidadDePrestamos() {
		return this.prestamos.size();
	}
	
	public Boolean prestarDeOtraForma(Libro libro, Estudiante estudiante) {
		Integer contador = 0;
		for(Prestamo p : this.prestamos) {
			if(p.getEstudiante().equals(estudiante)) {
				contador++;
			}
		}
		
		if(contador < 2 && this.disponibles.contains(libro)) {
			Prestamo prestamo = new Prestamo(contadorPrestamos++, libro, estudiante);
			this.prestamos.add(prestamo);
			this.disponibles.remove(libro);
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
