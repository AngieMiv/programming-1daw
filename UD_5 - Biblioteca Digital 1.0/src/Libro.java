public class Libro extends Publicacion{

	private String titulo;
	private String tipoPortada;
	private String ISBN;
	private String nombreAutor;
	private String editorial;
	
	public Libro() {}
	
	public Libro(int numPaginas, float precio, String titulo, String tipoPortada, String ISBN, String nombreAutor, String editorial) {
		super(numPaginas, precio);
		titulo = this.titulo;
		tipoPortada = this.tipoPortada;
		ISBN = this.ISBN;
		nombreAutor = this.nombreAutor;
		editorial = this.editorial;
	}

	//getters
	public String getTitulo() {return titulo;}
	public String getTipoPortada() {return tipoPortada;}
	public String getISMB() {return ISBN;}
	public String getNombreAutor() {return nombreAutor;}
	public String getEditorial() {return editorial;}

	//setters
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public void setTipoPortada(String tipoPortada) {this.tipoPortada = tipoPortada;}
	public void setISMB(String ISBN) {this.ISBN = ISBN;}
	public void setNombreAutor(String nombreAutor) {this.nombreAutor = nombreAutor;}
	public void setEditorial(String editorial) {this.editorial = editorial;}

} // end class Libro extends OPublicacion