package empresa;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

	protected String nombre;
	protected String apellido;
	protected Double salario;
	protected Date fechaDeNacimiento;
	protected Boolean tieneCochera;
	
	public Empleado(String nombre, String apellido, Double salario, Integer anio, Integer mes, Integer dia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes, dia);
		this.fechaDeNacimiento = calendario.getTime();
		this.tieneCochera = false;
	}
	
}
