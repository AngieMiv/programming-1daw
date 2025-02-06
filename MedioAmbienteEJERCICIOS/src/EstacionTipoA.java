
public class EstacionTipoA extends Estacion {

	boolean redundante;	//La estación posee fuente de alimentación redundante.
	boolean cErrores;	//La estación posee mecanismo de corrección de errores.

	final double consumoFijo = 500;
	
	public EstacionTipoA(String nombre, boolean movil, double potencia, boolean redundante, boolean cErrores) {
		super(nombre, movil, potencia);
		this.redundante = redundante;
		this.cErrores = cErrores;
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculaConsumo(Estacion a) {
		double cFijo = this.consumoFijo;
		double cRedundante, cCorErrores;
		
		cRedundante = (this.redundante)?25:0;
		cCorErrores = (this.cErrores)?10:0;
		
		return cFijo + cRedundante + cCorErrores;
	};
	
	@Override
	void printConsumo(Estacion a) {
		System.out.println(calculaConsumo(a));		
	}

	
	/* *
	 * EstacionTipoA : consumo = consumoFijo + 25 (si tiene redundancia) + 10 (si tiene correccción de errores).
	 * */

	// getters
	public boolean isRedundante() {return redundante;}
	public boolean iscErrores() {return cErrores;}

	// setters
	public void setRedundante(boolean redundante) {this.redundante = redundante;}
	public void setcErrores(boolean cErrores) {this.cErrores = cErrores;}
	

}
