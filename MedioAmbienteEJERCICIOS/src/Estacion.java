
public abstract class Estacion {

	
	private String nombre; 		// nombre de la estación
	private boolean movil;		// la estación es móvil (true) o fija (false)
	private double potencia;	// Potencia nominal de la estación.
	private DiarioMedidas[] mediciones = new DiarioMedidas[4]; // Las estaciones solo guardan los 4 últimos días de medidas.
	private int pos = 0;	// atributo interno, sin getters/setters

	
	public Estacion(String nombre, boolean movil, double potencia) {
		super();
		this.nombre = nombre;
		this.movil = movil;
		this.potencia = potencia;
	}

	/**
	 * Añade un diario de medidas a la estación
	 * el diario debe llegar con el nombre de estación vacío.
	 * @param dm Diario de medidas a añadir
	 * @return true OK, false ERROR
	 */
	public boolean addMedicion(DiarioMedidas dm) {
		boolean result = false;
		if (dm.getEstacion().equals("")) { // cargar sólo diarios
		// de medida sin nombre de estación
			this.mediciones[pos]= dm;
			pos = (pos+1) % 4; // Buffer circular
			result = true;
		}
		else result = false;
		return result;
	}
	
	// getters
	public String getNombre() {return nombre;}
	public double getPotencia() {return potencia;}
	public boolean isMovil() {return movil;}
	
	// setters
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setMovil(boolean movil) {this.movil = movil;}
	public void setPotencia(double potencia) {this.potencia = potencia;}
	
	/**
	 * Método abstracto
	 * @return Potencia consumida según el tipo de estación
	 */
	
	abstract double calculaConsumo(Estacion e);
	abstract void printConsumo(Estacion e);
	/*
	 * El consumo se calcula de forma distinta para cada estación,
	 * sólo comparten una componente común que será :
	 * 		500 si la estación es fija (tipo A)
	 * 		250 si es móvil (tipo B)
	 */
	
	// public Estacion[] estaciones = new Estacion[6];
//	public static void estacionLista(Estacion[] estaciones) {
//		for (int i = 0; i > estaciones.length; i++) {
//			System.out.println(estaciones[i]);
//		}	
//	}
	
}

// 1 estación puede tener hasta 4 diarios, y un diario puede tener hasta 24 mediciones
// en Medidas y DiarioMeididas, saber cuáles diarios tienen datos? bucle y contar los que sean distintos de null
// cuantos diarios de medidas tiene esta estación? (hasta 4)
// cuántas medidas tiene este diario de medidas? (hasta 24)

	

