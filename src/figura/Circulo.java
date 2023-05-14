package figura;

public class Circulo extends Figura{

	private Double radio;

	public Circulo(Double x, Double y, Double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	public Double calcularArea() {
		this.area = Math.PI * radio * radio;
		return this.area;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}
	
}
