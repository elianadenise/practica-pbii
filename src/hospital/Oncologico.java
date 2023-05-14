package hospital;

import java.util.ArrayList;

public class Oncologico extends Paciente {

	public Oncologico(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	@Override
	public Boolean agregarPlato(Plato plato) {
		if(plato.getEstaCrudo()) {
			return platosDelDia.add(plato);
		}
		return false;
	}
}
