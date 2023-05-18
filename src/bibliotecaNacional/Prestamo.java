package bibliotecaNacional;

public class Prestamo {

	private Integer codigo;
	private Libro libro;
	private Estudiante estudiante;
	
	public Prestamo(Integer codigo, Libro libro, Estudiante estudiante) {
		this.codigo = codigo;
		this.libro = libro;
		this.estudiante = estudiante;
	}

	public Libro getLibro() {
		return libro;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}
	
	
}
