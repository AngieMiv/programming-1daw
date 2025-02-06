
public abstract class Estacion {

	
	private String nombre; 		// nombre de la estación
	private boolean movil;		// la estación es móvil (true) o fija (false)
	private double potencia;		// Potencia nominal de la estación.
	public DiarioMedidas[] diarios = new DiarioMedidas[4]; // Las estaciones solo guardan los 4 últimos días de medidas.
	private int pos = 0;		// atributo interno, sin getters/setters

	
	public Estacion(String nombre, boolean movil, double potencia) {
		super();
		this.nombre = nombre;
		this.movil = movil;
		this.potencia = potencia;
	}

	/**
	 * Añade un diario de medidas a la estación
	 * No hace comprobaciones , se debe controlar antes de invocarlo
	 * @param dm Diario de medidas a añadir
	 * @return true OK, false ERROR
	 */
	public boolean addMedicion(DiarioMedidas dm) {
		boolean result = false;
		//if (!dm.getEstacion().equals(nombre)) { // cargar sólo diarios que no estén ya asignados
		// de medida sin nombre de estación
			this.diarios[pos]= dm;
			this.diarios[pos].setEstacion(this.nombre);
			pos = (pos+1) % 4; // Buffer circular
			result = true;
		//}
		//else result = false;
		return result;
	}
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	public boolean isMovil() {		return movil;	}
	public void setMovil(boolean movil) {		this.movil = movil;	}
	public double getPotencia() {		return potencia;	}
	public void setPotencia(double potencia) {		this.potencia = potencia;	}
	
	/**
	 * Devuelve el total de diario de medida cargados en la estación
	 * @return número de medidas
	 */
	public int getTotalDiarios() {
		
		int result = 0;
				for (int i=0; i< this.diarios.length;i++) {
					if (this.diarios[i]!= null) result ++;
				}
		return result;
		
	};

	/**
	 * Método abstracto
	 * @return Potencia consumida según el tipo de estación
	 */
	abstract double calculaConsumo(Estacion e);
	
	/*1B.- Implementa el método eligeEstacion() de la clase AppMain.
	Pedirá al usuario un número de estación válido en función de total
	de estaciones disponibles en la aplicación.
	Si no elige un número válido se retornará null y
	si es válido, el objeto Estación elegido.*/
	
	
}
