package montacargas;
import java.util.*;
public class Montacargas {

	private final Double CARGA_MAXIMA;
	private List<Carga> cargas;

	public Montacargas(Double cargaMaxima) {
		this.CARGA_MAXIMA = cargaMaxima;
		this.cargas = new LinkedList<Carga>();
	}

	public Boolean agregarCarga(Carga carga) {
		if((this.obtenerCarga() + carga.getPeso()) <= this.CARGA_MAXIMA) {
			return this.cargas.add(carga);
		}
		return Boolean.FALSE;
	}

	public Double obtenerCarga() {
		Double cargaAcumulada = 0.0;
		for(Carga carga : this.cargas) {
			cargaAcumulada += carga.getPeso();
		}
		return cargaAcumulada;
	}

	public Integer cantidadDeCargas() {
		return this.cargas.size();
	}

	public Boolean descargar() {
		return this.cargas.removeAll(cargas);
	}

	public Double obtenerCargaPromedio() {
		return (this.obtenerCarga() / this.cantidadDeCargas());
	}
	
}
