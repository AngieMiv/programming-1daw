import java.util.Scanner;

public class ud2_0_AppMain {

	public static void main(String[] args) {
		ud2_0_AppMain a = new ud2_0_AppMain();
		a.run();
	}
	/**
	 * Método donde colocar todos los ejercicios
	 */
	public void run() {
	
		System.out.println("Inicio de la aplicación\n");
		/*  Insertar aquí las llamadas a los ejercicios que se vayan implementando */
		ej201();
		System.out.println("\nFin de la aplicación");
		
	}
	
	//------------------- Lista de ejercicios resueltos
	
	public void ej201() { // Averiguar tipo de triángulo pidiendo 3 lados: a, b, c.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Averigua qué tipo de triángulo es ingresando los lados");
		
		String str = "Dime el lado ";
		System.out.println(str + "a:");
		double a = sc.nextDouble();
		System.out.println(str + "b:");
		double b = sc.nextDouble();
		System.out.println(str + "c:");
		double c = sc.nextDouble();
		
		if (a == b && b == c && a == c)
			System.out.print("Es un Triángulo Equilátero"); // 3 + 3 + 3
		else if ((a * a + b * b) == c * c)
			System.out.println("Es un Triángulo Rectángulo"); // 3 + 4 + 5
		else if (a == b || b == c || a == c)
			System.out.println("Es un Triángulo Isósceles"); // 3 + 3 + 4
		else
			System.out.println("Es un Triángulo Escaleno"); // 3 + 5 + 7
		
		System.out.println("\nYa sabes qué tipo de triángulo es ^-^");
		
		sc.close();
	}
	
}
