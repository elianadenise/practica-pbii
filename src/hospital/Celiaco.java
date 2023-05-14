package hospital;

import java.util.ArrayList;

public class Celiaco extends Paciente {
	
	public Celiaco(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	@Override
	public Boolean agregarPlato(Plato plato) {
		if(!plato.getTieneAzucar()) {
			return platosDelDia.add(plato);
		}
		return false;
	}

}
