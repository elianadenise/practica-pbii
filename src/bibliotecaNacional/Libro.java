package bibliotecaNacional;

public abstract class Libro {
	
	protected Integer codigo = 0;
	protected String nombre;
	protected String autor;
	protected Boolean esFotocopiable;
	
	public Libro(Integer codigo, String nombre, String autor) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
	}

	public Integer getCodigo() {
		return codigo;
	}
	
	public String imprimir() {
		if(this.esFotocopiable) {
			return this.nombre + " de " + this.autor + ". Versión fotocopiable.";
		}
		return "Prohibida su fotocopia";
	}
}
