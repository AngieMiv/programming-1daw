
public class Camion extends Vehiculo {
	
	int numEjes;
	//public Camion() {};
	
	public Camion(String color, short Cilindrada, short Potencia, byte NumEjes) {
		super(color, Cilindrada, Potencia, NumEjes);
		this.numEjes = NumEjes;
	};

	public void arrancar() {
		System.out.println("Arranca Camión");
	}

	public void arrancar(String s) {
		System.out.println("Arranca Camión: "+ s);
	}
	
	public double impuesto() {
		return getCilindrada()/30 +  getPotencia()*20 + getNumRuedas()*20 + numEjes*50;
	}

	//Getters y Setters
	public int getNumEjes() {return numEjes;}
	public void setNumEjes(int numEjes) {this.numEjes = numEjes;}
	
}
