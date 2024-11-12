
public class Jugador {
	
	private String nombre;
	private Puesto puesto;
	private int dorsal;
	private int edad;
	private int nGoles;

	public Jugador() {}; // constructor w.o args
		
	public Jugador(String nombre, Puesto puesto, int dorsal, int edad, int nGoles) { // constructor w args
			this.nombre = nombre;
			this.edad = edad;
			this.dorsal = dorsal;
			this.edad = edad;
			this.nGoles = nGoles;
	} // end constructos w args
	
		// -- getters
	public String isNombre() {return this.nombre;}
	public Puesto getPuesto() {return this.puesto;};
	public int getDorsal() {return this.dorsal;}
	public int getEdad() {return this.edad;}
	public int getnGoles() {return this.nGoles;}
	
		// -- setters
	public void setNombre(String nombre) {this.nombre = nombre;};
	public void setPuesto(Puesto puesto) {this.puesto = puesto;};
	public void setEdad(int edad) {this.edad = edad;};
	public void setnGoles(int nGoles) {this.nGoles = nGoles;};

} // end class Jugador
