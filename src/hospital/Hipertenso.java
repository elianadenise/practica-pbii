package hospital;

import java.util.ArrayList;

public class Hipertenso extends Paciente {
	
	public Hipertenso(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	@Override
	public Boolean agregarPlato(Plato plato) {
		if(!plato.getTieneSal()) {
			return platosDelDia.add(plato);
		}
		return false;
	}
	public Integer cantidadDePlatosAgregados() {
		return this.platosDelDia.size();
	}
}
