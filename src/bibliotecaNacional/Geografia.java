package bibliotecaNacional;

public class Geografia extends Libro{
	
	public Geografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		this.esFotocopiable = Boolean.TRUE;
	}
	
}
