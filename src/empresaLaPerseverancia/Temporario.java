package empresaLaPerseverancia;

public class Temporario extends Empleado{
	
	public Temporario(Integer cantidadHoras, Integer cantidadHijos, Boolean estaCasado) {
		super(cantidadHoras, cantidadHijos, estaCasado);
		this.sueldoPorHora = 200.0;
	}
	
	public Double calcularSueldo() {
		if(this.cantidadDeHijos >= 0 && this.estaCasado) {
			this.sueldoTotal = this.sueldoPorHora * this.cantidadDeHorasTrabajadas
					+ this.cantidadDeHijos * this.SALARIO_FAMILIAR_POR_HIJO + this.SALARIO_FAMILIAR_POR_CONYUGE;
		} else if(this.cantidadDeHijos >= 0 && !this.estaCasado) {
			this.sueldoTotal = this.sueldoPorHora * this.cantidadDeHorasTrabajadas
					+ this.cantidadDeHijos * this.SALARIO_FAMILIAR_POR_HIJO;
		}
		return this.sueldoTotal;
	}
}
