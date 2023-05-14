package empresaDeTransporte;

public class Motocicleta extends Vehiculo{

	private Persona acompaniante;
	
	public Motocicleta() {
		super();
	}
	
	public Boolean agregarPasajero(Persona persona) {
		if(this.acompaniante == null && !persona.getEsChofer()) {
			this.acompaniante = persona;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	public Boolean cambiarChofer(Persona persona) {
		if(this.acompaniante == null && persona.getEsChofer()) {
			this.asignarChofer(persona);
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
		
}
