package otraEmpresaDeTransporte;

import java.util.ArrayList;

public class Bicicleta {

	private String ciudad;
	private ArrayList<Paquete> paquetes;
	
	public Bicicleta() {
		this.ciudad = null;
		this.paquetes = new ArrayList<Paquete>();
	}

	public Boolean agregarPaquete(Paquete paquete) {
		if(this.ciudad == null && this.paquetes.size() <= 2) {
			this.ciudad = paquete.getCiudad();
			return paquetes.add(paquete);
		} else if(this.ciudad.equals(paquete.getCiudad()) && this.paquetes.size() <= 2) {
			return paquetes.add(paquete);
		}
		return Boolean.FALSE;
		
	}
	
}
