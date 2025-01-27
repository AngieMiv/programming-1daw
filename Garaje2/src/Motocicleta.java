
public class Motocicleta extends Vehiculo{

	//public Motocicleta() {};
	
	public Motocicleta(String color, short Cilindrada, short Potencia) {
		super(color, Cilindrada, Potencia);
	};

	public void arrancar() {
		System.out.println("Arranca Moto");
	}

//	public void arrancar(String s) {
//		System.out.println("Arranca Moto: "+ s);
//	}
	
	public double impuesto() {
		double p1 = getCilindrada()/30;
		double p2 = getPotencia()*30;
		return p1 + p2;
	}

}
