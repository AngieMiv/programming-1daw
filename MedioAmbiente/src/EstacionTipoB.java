
public class EstacionTipoB extends Estacion {

	int numVar;			// Número de variables extra que monitoriza.
	int memoria;		// Tamaño en Kb de memoria flash de respaldo.(8,16,32)

	public EstacionTipoB(String nombre, boolean movil, double potencia,int numvar, int memoria) {
		super(nombre, movil, potencia);
		this.memoria= memoria;
		this.numVar = numvar;// TODO Auto-generated constructor stub
	}

	/*
	 * EstacionTipoB : 	consumo = potencia + 92,5 + 25 * numVar + 10 * memoria
	 */
	@Override
	double calculaConsumo() {
		double result =0.0;
		result = this.getPotencia() + 92.5 + (25.0 * this.numVar) + (10.0 * this.memoria);
		return result;
	}

}
