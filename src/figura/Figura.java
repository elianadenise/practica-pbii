package figura;

public abstract class Figura {

	protected Punto punto;
	protected Double area;
	
	public Figura(Double x, Double y) {
		this.punto = new Punto(x, y);
	}
	public Figura() {};
	
	public void mover(Double medidaX, Double medidaY) {
		this.punto.setX(medidaX);
		this.punto.setY(medidaY);
	}
	
	public abstract Double calcularArea();

	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}
	
	
}
