package figura;

public class Elipse extends Figura{
	private Double radioUno;
	private Double radioDos;

	public Elipse(Double x, Double y, Double radioUno, Double radioDos) {
		super(x, y);
		this.radioUno = radioUno;
		this.radioDos = radioDos;
	}
	
	public Double calcularArea() {
		this.area = Math.PI * this.radioUno * this.radioDos;
		return this.area;
	}
	
	public Double getRadioUno() {
		return radioUno;
	}

	public void setRadioUno(Double radioUno) {
		this.radioUno = radioUno;
	}

	public Double getRadioDos() {
		return radioDos;
	}

	public void setRadioDos(Double radioDos) {
		this.radioDos = radioDos;
	}
	
	

}
