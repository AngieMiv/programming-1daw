package tools;
import java.util.Scanner;

public class Menu {

	private String Titulo;
	private String[] Opciones;
	private int opcElegida;
	
	// Vacío
	public Menu() {}
	
	public Menu(String titulo,String[] opcs) {	
		this.Titulo = titulo;
		this.Opciones = opcs;	
	}

	// getters
	public String getTitulo() {return Titulo;}
	public String[] getOpciones() {return Opciones;}
	public int getOpcElegida() {return opcElegida;}

	// setters
	public void setTitulo(String titulo) {Titulo = titulo;}
	public void setOpciones(String[] opciones) {Opciones = opciones;}
	public void setOpcElegida(int opcElegida) {this.opcElegida = opcElegida;}

	public void mostrar() {
		System.out.println();
		System.out.println(this.Titulo);
		System.out.println("-------------------------------");
		for(int i = 0; i < Opciones.length; i++) {
			System.out.println(i + 1 + ". " + Opciones[i]);
		}
		System.out.println("0. Salir");
		System.out.println("-------------------------------");
	}
		
	public int seleccionaOpc() {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		while(!salir) {
			System.out.println("Elige una opción valida : ");
			result = sc.nextInt();
			if (result >= 0 && result <= this.Opciones.length) {
				salir = true;
			} else {
				System.out.println("Opción incorrecta: ");
			}
			
		}
//		do {
//			System.out.println("Elige una opción valida : ");
//			result = sc.nextInt();
//			if (result >= 0 && result <= this.Opciones.length) {
//				salir = true;
//			} else {
//				System.out.println("Opción incorrecta: ");
//			}
//			
//		} while(!salir);
		
		this.opcElegida = result;
		return result;
		
	} // end seleccionaOpc
	
	public String mostrarLiteral() {
		if (this.opcElegida == 0) {
			return "Salir";
		}
		else		{
			return this.Opciones[this.opcElegida - 1];
		}
		
	} // end mostrarLiteral menú 0. Salir
	
}

// listar estaciones, calcular potencias, calcular medidas, imprimir medidas...

