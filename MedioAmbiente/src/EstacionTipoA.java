
public class EstacionTipoA extends Estacion {

	boolean redundante;	//La estación posee fuente de alimentación redundante.
	boolean cErrores;	//La estación posee mecanismo de corrección de errores.

	
	public EstacionTipoA(String nombre, boolean movil, double potencia,boolean redundante, boolean cerrores) {
		super(nombre, movil, potencia);
		this.redundante = redundante;
		this.cErrores = cerrores;
		// TODO Auto-generated constructor stub
	}

	/*
	 * EstacionTipoA : 	consumo = potencia + 840.0 + 10 (si tiene redundancia) + 10 (si tiene correccción 				de errores).
	 */
	@Override
	double calculaConsumo(Estacion a) {
		double potencia = getPotencia();
		double cRedundante, cCorErrores;
		
		cRedundante = (this.redundante)?10:0;
		cCorErrores = (this.cErrores)?10:0;
		
		return potencia + cRedundante + cCorErrores;
	};
	
	// getters
	public boolean isRedundante() {return redundante;}
	public boolean iscErrores() {return cErrores;}

	// setters
	public void setRedundante(boolean redundante) {this.redundante = redundante;}
	public void setcErrores(boolean cErrores) {this.cErrores = cErrores;}

	
}
