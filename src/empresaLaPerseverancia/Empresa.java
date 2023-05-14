package empresaLaPerseverancia;
import java.util.*;
public class Empresa {

	private Integer cuit;
	private String razonSocial;
	private HashSet<Empleado> empleados;
	private Double totalSueldos;
	
	public Empresa(Integer cuit, String razonSocial) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.empleados = new HashSet<Empleado>();
		this.totalSueldos = 0.0;
	}

	public Boolean agregarEmpleado(Empleado empleado) {
		return empleados.add(empleado);
	}
	
	public Double calcularTotalDeMes() {
		for(Empleado empleado : empleados) {
			this.totalSueldos += empleado.calcularSueldo();
		}
		return this.totalSueldos;
	}

}
