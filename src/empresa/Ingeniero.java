package empresa;

public class Ingeniero extends Empleado{
	
	private Double adicionalDeProductividad;
	
	public Ingeniero(String nombre, String apellido, Double salario, Integer anio, Integer mes, Integer dia) {
		super(nombre, apellido, salario, anio, mes, dia);
		this.tieneCochera = true;
		this.adicionalDeProductividad = 0.2;
		this.salarioFinal();
	}
	
	public void salarioFinal() {
		this.salario = this.salario + this.salario * this.adicionalDeProductividad;
	}

}
