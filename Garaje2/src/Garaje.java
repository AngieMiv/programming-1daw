
public class Garaje {

	public Garaje() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Coche c = new Coche();
//		c.arrancar();
//		c.arrancar("Despacito");
		
		Motocicleta moto1 = new Motocicleta("Verde", (short)125, (short)50);
		//moto1.arrancar();2
		double impuestoMoto1 = moto1.impuesto();
		System.out.println("Impuesto Moto 1: " + impuestoMoto1);
		
		Camion camion1 = new Camion("Negro", (short)2000, (short)400, (byte)2);
		camion1.setNumRuedas((byte) 8);
		//camion1.arrancar();
		double impuestoCamion1 = camion1.impuesto();
		System.out.println("Impuesto Camión 1: " + impuestoCamion1);
	};

}
