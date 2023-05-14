package hospital;

import java.util.ArrayList;

public class Diabetico extends Paciente{
	
	private Integer tipo;
	private Boolean dosisInsulina;

	public Diabetico(String nombre, String apellido, Integer tipo) {
		super(nombre, apellido);
		this.tipo = tipo;
		this.dosisInsulinaDiaria();
	}
	
	public void dosisInsulinaDiaria() {
		if(tipo.equals(2)) {
			this.dosisInsulina = true;
		} else {
			this.dosisInsulina = false;
		}
	}

	@Override
	public Boolean agregarPlato(Plato plato) {
		if(!plato.getTieneAzucar()) {
			return platosDelDia.add(plato);
		}
		return false;
	}

	public Boolean getDosisInsulina() {
		return dosisInsulina;
	}
	
}
