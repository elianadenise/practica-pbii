package empresaLaPerseverancia;

public class Temporario extends Empleado{
	
	public Temporario(Integer cantidadHoras, Integer cantidadHijos, Boolean estaCasado) {
		super(cantidadHoras, cantidadHijos, estaCasado);
		this.sueldoPorHora = 200.0;
	}
	
	public Double calcularSueldo() {
		if(this.cantidadDeHijos >= 0 && this.estaCasado) {
			this.sueldoTotal = this.sueldoPorHora * this.cantidadDeHorasTrabajadas
					+ this.cantidadDeHijos * this.salarioFamiliarPorHijo + this.salarioFamiliarPorParejaCasada;
		} else if(this.cantidadDeHijos > 0 && !this.estaCasado) {
			this.sueldoTotal = this.sueldoPorHora * this.cantidadDeHorasTrabajadas
					+ this.cantidadDeHijos * this.salarioFamiliarPorHijo;
		} /*else if(this.cantidadDeHijos == 0 && !this.estaCasado){
			this.sueldoTotal = this.sueldoPorHora * this.cantidadDeHorasTrabajadas;
		}*/
		return this.sueldoTotal;
	}
}
