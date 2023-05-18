package bibliotecaNacional;

public class Historia extends Libro{

	public Historia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		this.esFotocopiable = Boolean.TRUE;
	}
	
}
