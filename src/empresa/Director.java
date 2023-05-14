package empresa;

public class Director extends Empleado{

	private Double sueldoAdicional;

	public Director(String nombre, String apellido, Double salario, Integer anio, Integer mes, Integer dia) {
		super(nombre, apellido, salario, anio, mes, dia);
		this.tieneCochera = true;
		this.sueldoAdicional = 2000.0;
		this.salarioFinal();
	}
	
	public void salarioFinal() {
		this.salario = this.salario + this.sueldoAdicional;
	}
	
}
