package empresaLaPerseverancia;

public abstract class Empleado {

	protected Double sueldoPorHora;
	protected Integer cantidadDeHorasTrabajadas;
	protected final Double SALARIO_FAMILIAR_POR_HIJO;
	protected final Double SALARIO_FAMILIAR_POR_CONYUGE;
	protected Integer cantidadDeHijos;
	protected Boolean estaCasado;
	protected Double sueldoTotal;
	
	public Empleado(Integer cantidadHoras, Integer cantidadHijos, Boolean estaCasado) {
		this.SALARIO_FAMILIAR_POR_HIJO = 200.0;
		this.SALARIO_FAMILIAR_POR_CONYUGE = 100.0;
		this.cantidadDeHorasTrabajadas = cantidadHoras;
		this.cantidadDeHijos = cantidadHijos;
		this.estaCasado = estaCasado;
	}
	
	public abstract Double calcularSueldo();
	
}
