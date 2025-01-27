
public class Publicacion {

	private int numPaginas;
	private float precio;
	
	public Publicacion() {}
	
	public Publicacion(int numPaginas, float precio) {
		numPaginas = this.numPaginas;
		precio = this.precio;
	}
		
	// getters
	public int getNumPags() {return this.numPaginas;}
	public float getPrecio() {return this.precio;}
	
	// setters
	public void setNumPaginas(int numPags) {numPags = this.numPaginas;}
	public void setPrecio(float precio) {precio = this.precio;}
			
} // end (super)class Publicacion
