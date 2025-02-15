
public class Producto {

	private String nombre;
	private int cantidad;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public Producto (String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	
	@Override
	public String toString() {
		return "Producto: " + nombre + ", cantidad:" + cantidad;
	}

	// getters
	public String getNombre() {return this.nombre;}
	public int getCantidad() {return this.cantidad;}

	// setters
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setCantidad(int cantidad) {this.cantidad = cantidad;}

}
