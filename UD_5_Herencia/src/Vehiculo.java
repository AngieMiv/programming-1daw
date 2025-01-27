
public class Vehiculo { // -- Superclase
	
	public String matricula;
	public String color;
	//public String modo;

	public Vehiculo() {
//		System.out.println("Instancio Vehículo");
	}
	
	public Vehiculo(String matricula) {
		this.matricula = matricula;
	}
	
	public Vehiculo(String matricula, String color) {
		this.matricula = matricula;
		this.color = color;
	}

	
	public void arrancar() {
		System.out.println("Arranco Vehículo " + matricula);
	}
	
	public void arrancar(String modo) { // -- modo aplicado a vehículo
		System.out.println("Arranco vehículo modo " + modo);

	}

}
