
public class Coche extends Vehiculo{

	public Coche() {
		System.out.println("Constructor subclase");
	}

	public void arrancar() {
		System.out.println("Arranca Coche");
	}

	public void arrancar(String s) {
		System.out.println("Arranca Coche: "+ s);
	}
	
	public double impuesto() {
		return 0;
	}
}
