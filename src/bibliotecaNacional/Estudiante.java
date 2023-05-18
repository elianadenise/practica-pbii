package bibliotecaNacional;

import java.util.*;

public class Estudiante {
	
	private Integer dni;
	private String nombre;
	private String apellido;
	private List<Libro> enPrestamo;
	
	public Estudiante(Integer dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.enPrestamo = new ArrayList<Libro>();
	}
	public Integer librosEnPrestamo() {
		return enPrestamo.size();
	}
	public Boolean agregarEnPrestamo(Libro libro) {
		return this.enPrestamo.add(libro);
	}
	public Boolean devolverABiblioteca(Libro libro) {
		return this.enPrestamo.remove(libro);
	}
}
