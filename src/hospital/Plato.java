package hospital;

public class Plato {

	private Boolean tieneAzucar;
	private Boolean estaCrudo;
	private Boolean tieneTacc;
	private Boolean tieneSal;
	
	public Plato(Boolean tieneAzucar, Boolean estaCrudo, Boolean tieneTacc, Boolean tieneSal) {
		this.tieneAzucar = tieneAzucar;
		this.estaCrudo = estaCrudo;
		this.tieneTacc = tieneTacc;
		this.tieneSal = tieneSal;
	}

	public Boolean getTieneAzucar() {
		return tieneAzucar;
	}

	public Boolean getEstaCrudo() {
		return estaCrudo;
	}

	public Boolean getTieneTacc() {
		return tieneTacc;
	}

	public Boolean getTieneSal() {
		return tieneSal;
	}
	
}
