package figura;

public class Cuadrado extends Figura{

	private Double lado;

	public Cuadrado(Double x, Double y, Double lado) {
		super(x,y);
		this.lado = lado;
	}
	
	public Double calcularArea() {
		this.area = this.lado * this.lado;
		return this.area;
	}


	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	
}
