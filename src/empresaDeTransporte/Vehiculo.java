package empresaDeTransporte;

public abstract class Vehiculo {

	protected Double kmRecorridos;
	protected Persona chofer;
	
	public Vehiculo() {
		this.kmRecorridos = 0.0;
	}
	
	public Boolean asignarChofer(Persona persona) {
		if(persona.getEsChofer()) {
			this.chofer = persona;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	public Double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(Double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public abstract Boolean agregarPasajero(Persona persona);
	public abstract Boolean cambiarChofer(Persona persona);
	
}
