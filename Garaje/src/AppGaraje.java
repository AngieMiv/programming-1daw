
public class AppGaraje {

	public AppGaraje() {
		
	}

	
	public static void main(String[] args) {
		
		// --- 2 maneras de inicializar un objeto --- //
		// --- Cómo escribir atributos de las dos formas, con los 2 constructores en Coche.java
		
		// - con constructor sin argumentos
		
		Coche c1 = new Coche();
		c1.color = "Rojo";
		c1.matricula = "KSR-3009";
		c1.setMotor(1800);
		
		// - con constructor con argumentos
		
		Coche c2 = new Coche("FYY-4040", 2400, "Plateado", true);
		Coche c3 = new Coche("Volkswagen", "4564-DRF", 2600, "Negro", true);
		
		// --- Leer atributos
		
		String sMatricula = c2.matricula;
		int iMotor = c2.getMotor();
		
		// -- implementando método 1 para imprimir la ficha del coche
		
		// -printFicha(c1);
		printFicha(c2);
		
		// -- implimentando método 2 para imprimir la ficha del coche 
		
		c1.fichaTecnica();
		c2.fichaTecnica();
		c3.fichaTecnica();
		
			
		System.out.println("app terminada");
			
	} // --- main ending
	
	public static void printFicha(Coche car) {
		
		// -- método 1 para imprimir ficha del coche
		// -- método 2 para imprimirla, está en coche.java
		
		System.out.println("\nFICHA AUTOMÓVIL");
		System.out.println("-------------------");
		System.out.println("Matricula: " + car.matricula);
		System.out.println("Motor: " + car.getMotor());
		System.out.println("Color: " + car.color);
		System.out.println("Tiene radio: " + car.getRadio());
		System.out.println("-------------------\n");
		
	} // -- end printFicha

} // -- end AppGaraje
