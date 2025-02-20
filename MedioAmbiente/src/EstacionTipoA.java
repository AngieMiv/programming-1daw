
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
	 * EstacionTipoA : 	consumo = potencia + 840.0 + 25 (si tiene redundancia) + 10 (si tiene correccción 				de errores).
	 */
	@Override
	double calculaConsumo() {
		double result = 0.0;
		result = this.getPotencia() + 840.0 + (10.0 * ((redundante)?1.0:0.0)) + (10.0 *((cErrores)?1.0:0.0));
		return result;
	}

	
}
