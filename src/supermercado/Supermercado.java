package supermercado;
import java.util.*;

public class Supermercado {
	
	private List<Cliente> colaA = new LinkedList<Cliente>();
	private List<Cliente> colaRapida = new ArrayList<Cliente>();

	public Integer getCantidadDeClientesEnCola() {
		return this.colaA.size();
	}

	public void agregarClienteACola(Cliente cliente) {
		this.colaA.add(cliente);		
	}

	public void agregarClienteAColaRapida(Cliente cliente) {
		this.colaRapida.add(cliente);		
	}
	
	public Integer getCantidadDeClientesEnColaRapida() {
		return this.colaRapida.size();
	}

	public void abrirColaRapida() { 
		Integer index = 0;
		for(Cliente cliente : this.colaA) {
			if(cliente.getCantidadDeProductos() < 5) {
				cliente.setPosicion(index);
				index++;
				this.agregarClienteAColaRapida(cliente);
			} else {
				cliente.setPosicion(cliente.getPosicion() - index);
			}
		}
		this.colaA.removeAll(colaRapida); // solo reacomoda
	}
}
