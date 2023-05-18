package otraEmpresaDeTransporte;

public class Paquete {

	private Double alto;
	private Double ancho;
	private Double profundidad;
	private Double volumen;
	private String ciudad;
	
	public Paquete(Double alto, Double ancho, Double profundidad, String ciudad) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.ciudad = ciudad;
		this.setVolumen();
	}

	public void setVolumen() {
		this.volumen = this.alto * this.ancho * this.profundidad;
	}

	public Double getAlto() {
		return alto;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	public Double getVolumen() {
		return volumen;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
