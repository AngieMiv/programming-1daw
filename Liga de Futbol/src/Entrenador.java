
public class Entrenador {
	
	private String nombre;
	private int edad;
	private int nTitulos;

	public Entrenador() {}; // constructor w.o args
		
	public Entrenador(String nombre, int edad, int nTitulos) { // constructor w args
			this.nombre = nombre;
			this.edad = edad;
			this.nTitulos = nTitulos;
	}
		// getters
	public String isNombre() {return this.nombre;};
	public int getEdad() {return this.edad;};
	public int getnTitulos() {return this.nTitulos;};
	
		// setters
	public void setNombre(String nombre) {this.nombre = nombre;};
	public void setEdad(int edad) {this.edad = edad;};
	public void setnTitulos(int nTitulos) {this.nTitulos = nTitulos;};

} // end class Entrenador
