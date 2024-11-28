/**
 * Clase Garaje			02/11/2023
 * Implementa un garaje con espacio para NUM_PLAZAS coches
 * @author root
 *
 */
public class Garaje {

	/**
	 * Capacidad del garaje
	 */
	final int NUM_PLAZAS = 5;
	private String nombre;
	Coche[] misCoches = new Coche[NUM_PLAZAS];
	
	/**
	 * Constructor
	 */
	public Garaje() {
		super();
	}
	
	/**
	 * Constructor con parámetro nombre
	 * @param nombre valor para asignar
	 */
	public Garaje(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getter atributo Nombre
	 * @return nombre valor devuelto
	 */
	public String getNombre() {
		return nombre;
	}

/**
 * setter atributo Nombre
 * @param nombre valor para asignar
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Coche[] getMisCoches() {
		return misCoches;
	}

	/**
	 * setter atributo lista de coches en garaje
	 * @param misCoches array con la lista de objetos coches
	 * para incorporar al garaje
	 */
	public void setMisCoches(Coche[] misCoches) {
		this.misCoches = misCoches;
	}	
	
}
