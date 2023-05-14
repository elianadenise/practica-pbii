package empresaLaPerseverancia;

public class Gerente extends Permanente{

	public Gerente(Integer cantidadHoras, Integer cantidadHijos, Boolean estaCasado, Integer antiguedad) {
		super(cantidadHoras, cantidadHijos, estaCasado, antiguedad);
		this.sueldoPorHora = 400.0;
		this.sueldoPorAntiguedad = 150.0;
	}
	
}
