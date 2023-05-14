package figura;

public class Rectangulo extends Figura{
	
	private Punto puntoUno;
	private Punto puntoDos;
	private Double altura;
	private Double ancho;
	
	
	public Rectangulo(Double xUno, Double yUno, Double xDos, Double yDos) {
		super();
		this.puntoUno = new Punto(xUno, yUno);
		this.puntoDos = new Punto(xDos, yDos);
		this.altoAncho();
	}
	
	public Double calcularArea() {
		this.area = this.altura * this.ancho;
		return this.area;
	}
	
	@Override
	public void mover(Double medidaX, Double medidaY) {
		this.puntoUno.setX(this.puntoUno.getX() + medidaX);
		this.puntoUno.setY(this.puntoUno.getY() + medidaY);
		this.puntoDos.setX(this.puntoDos.getX() + medidaX);
		this.puntoDos.setY(this.puntoDos.getY() + medidaY);
	}

	public void altoAncho() {
		this.ancho = Math.abs(puntoUno.getX() - puntoDos.getX());
		this.altura = Math.abs(puntoUno.getY() - puntoDos.getY());
	}
	public Punto getPuntoUno() {
		return puntoUno;
	}

	public void setPuntoUno(Punto puntoUno) {
		this.puntoUno = puntoUno;
	}

	public Punto getPuntoDos() {
		return puntoDos;
	}

	public void setPuntoDos(Punto puntoDos) {
		this.puntoDos = puntoDos;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}
	
	
}
