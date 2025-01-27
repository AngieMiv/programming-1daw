
public class Coche extends Vehiculo{ // -- Subclase, Hereda de la superclase Vehículo

	boolean wifi;
	
	public Coche() {
//		System.out.println("Instancio Coche");
	}

	public Coche(String matricula, boolean wifi) {
		
		//this.matricula = matricula;
		super(matricula);
		
		this.wifi = wifi;
	}
	
	public void arrancar() { // -- Sobreescribo el método arrancar() de la superclase
		System.out.println("Arranco Coche.");
	}

	public void arrancar(String modo) { // -- Sobrecarga del método
		System.out.println("Arranco Coche " + modo);
	}
	
}
