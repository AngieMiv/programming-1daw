import java.util.Scanner;

import javax.management.openmbean.OpenMBeanConstructorInfoSupport;

public class Menu {

	private String Titulo;
	private String[] Opciones;
	private int opcElegida;

	// Vacío
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String titulo, String[] opcs) {
		this.Titulo = titulo;
		this.Opciones = opcs;
	}

	public String getTitulo() {return this.Titulo;}
	public void setTitulo(String titulo) {this.Titulo = titulo;}

	public String[] getOpciones() {return this.Opciones;}
	public void setOpciones(String[] opciones) {this.Opciones = opciones;}

	public int getOpcElegida() {return this.opcElegida;}
	public void setOpcElegida(int opcElegida) {this.opcElegida = opcElegida;}

	public void mostrar() {
		System.out.println();
		System.out.println(this.Titulo);
		System.out.println("-------------------");
		for (int i = 0; i < Opciones.length; i++) {
			System.out.println(i+1 + ". " + Opciones[i]);
		}
		System.out.println("0. Salir");

	}

	public int seleccionaOpc() {
		int result = 0;
		String[] opcs = getOpciones();
		int numOpcs = opcs.length;
		Scanner sc = new Scanner(System.in);

		System.out.println("Elige la opción:");
		result = sc.nextInt();

		while (result > numOpcs && result > numOpcs) {
			System.out.println("Ingresa un número válido");
			result = sc.nextInt();
		}
		if (result < numOpcs && result > numOpcs) {
			setOpcElegida(result);
		}
		sc.close();
		return getOpcElegida();
	}

}
