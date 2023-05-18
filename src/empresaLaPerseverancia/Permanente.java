package empresaLaPerseverancia;

public class Permanente extends Empleado{
	
	protected Integer antiguedad;
	protected Double sueldoPorAntiguedad;
	
	public Permanente(Integer cantidadHoras, Integer cantidadHijos, Boolean estaCasado, Integer antiguedad) {
		super(cantidadHoras, cantidadHijos, estaCasado);
		this.antiguedad = antiguedad;
		this.sueldoPorAntiguedad = 100.0;
		this.sueldoPorHora = 300.0;
	}
	
	public Double calcularSueldo() {
		if(this.cantidadDeHijos >= 0 && this.estaCasado) {
			this.sueldoTotal = this.sueldoPorHora * this.cantidadDeHorasTrabajadas + this.sueldoPorAntiguedad * this.antiguedad 
					+ this.cantidadDeHijos * this.SALARIO_FAMILIAR_POR_HIJO + this.SALARIO_FAMILIAR_POR_CONYUGE;
		} else if(this.cantidadDeHijos >= 0 && !this.estaCasado) {
			this.sueldoTotal = this.sueldoPorHora * this.cantidadDeHorasTrabajadas + this.sueldoPorAntiguedad * this.antiguedad 
					+ this.cantidadDeHijos * this.SALARIO_FAMILIAR_POR_HIJO;
		}
		return this.sueldoTotal;
	}
	
	
}
