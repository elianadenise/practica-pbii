package empresaLaPerseverancia;

public abstract class Empleado {

	protected Double sueldoPorHora;
	protected Integer cantidadDeHorasTrabajadas;
	protected Double salarioFamiliarPorHijo;
	protected Double salarioFamiliarPorParejaCasada;
	protected Integer cantidadDeHijos;
	protected Boolean estaCasado;
	protected Double sueldoTotal;
	
	public Empleado(Integer cantidadHoras, Integer cantidadHijos, Boolean estaCasado) {
		this.salarioFamiliarPorHijo = 200.0;
		this.salarioFamiliarPorParejaCasada = 100.0;
		this.cantidadDeHorasTrabajadas = cantidadHoras;
		this.cantidadDeHijos = cantidadHijos;
		this.estaCasado = estaCasado;
	}
	
	public abstract Double calcularSueldo();
	
}
