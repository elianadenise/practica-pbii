package empresaDeTransporte;

import java.util.LinkedList;

public class Autobus extends Vehiculo{
	private LinkedList<Persona> pasajeros;
	private final Integer CANTIDAD_MAXIMA_PASAJEROS;
	
	public Autobus() {
		super();
		this.pasajeros = new LinkedList<Persona>();
		this.CANTIDAD_MAXIMA_PASAJEROS = 20;
	}
	
	public Boolean agregarPasajero(Persona persona) {
		if(this.pasajeros.size() < this.CANTIDAD_MAXIMA_PASAJEROS && !persona.getEsChofer()) {
			this.pasajeros.add(persona);
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	public Boolean cambiarChofer(Persona persona) {
		if(this.pasajeros.size() == 0 && persona.getEsChofer()) {
			this.asignarChofer(persona);
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
}