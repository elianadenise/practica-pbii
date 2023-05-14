package empresa;

public class Gerente extends Empleado{

	public Gerente(String nombre, String apellido, Double salario, Integer anio, Integer mes, Integer dia) {
		super(nombre, apellido, salario, anio, mes, dia);
		this.tieneCochera = true;
	}
	
}
