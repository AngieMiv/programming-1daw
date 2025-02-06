
public class EstacionTipoB extends Estacion {

	int numVar;			// Número de variables extra que monitoriza.
	int memoria;		// Tamaño en Kb de memoria flash de respaldo.(8,16,32)
	
	final double consumoMovil = 250;

	public EstacionTipoB(String nombre, boolean movil, double potencia,int numvar, int memoria) {
		super(nombre, movil, potencia);
		this.memoria= memoria;
		this.numVar = numvar;// TODO Auto-generated constructor stub
	}

	@Override
	double calculaConsumo(Estacion b) {
		double consumo = consumoMovil + (25 * this.numVar) + (10 * this.memoria);
		return consumo;
	}
	
	@Override
	void printConsumo(Estacion b) {
		System.out.println(calculaConsumo(b));
	}

	
	//getters
	public int getNumVar() {return numVar;}
	public int getMemoria() {return memoria;}

	// setters
	public void setNumVar(int numVar) {this.numVar = numVar;}
	public void setMemoria(int memoria) {this.memoria = memoria;}


	

}
