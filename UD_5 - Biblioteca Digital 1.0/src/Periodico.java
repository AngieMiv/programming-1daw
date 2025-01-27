
public class Periodico extends Publicacion {

	private String nombre;
	private String fecha;
	
	public Periodico() {}
	public Periodico(int numPaginas, float precio, String nombre, String fecha) {
		super(numPaginas, precio);
		nombre = this.nombre;
		fecha = this.fecha;
	}

	// getters
	public String getNombre() {return nombre;}
	public String getFecha() {return fecha;}

	// setters
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setFecha(String fecha) {this.fecha = fecha;}

} // end class Periodico extends Publicacion
