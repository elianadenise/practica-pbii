package supermercado;

public class Cliente {

	private Integer cantidadDeProductos;
	private Integer posicion;
	
	public Cliente(Integer posicion, Integer productos) {
		this.cantidadDeProductos = productos;
		this.posicion = posicion;
	}

	public Integer getPosicion() {
		return posicion;
	}

	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}
	
}
