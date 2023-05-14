package hospital;

import java.util.ArrayList;

public class Paciente {
	
	protected String nombre;
	protected String apellido;
	protected ArrayList<Plato> platosDelDia = new ArrayList<Plato>();
	
	public Paciente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Integer cantidadDePlatosAgregados() {
		return this.platosDelDia.size();
	}
	
	public Boolean agregarPlato(Plato plato) {
		return this.platosDelDia.add(plato);
	}
}
