import java.util.Scanner;

public class Menu{

	private String Titulo;
	private String[] Opciones;
	private int OpcElegida;

	public Menu() {

	}
	public Menu(String titulo, String[] opcs) {
		this.Titulo= titulo;
		this.Opciones= opcs;
	}

	// setters
	public void setTitulo(String titulo) {Titulo = titulo;}
	public void setOpciones(String[] opciones) {Opciones = opciones;}
	public void setOpcElegida(int opcelegida) {this.OpcElegida = opcelegida;}

	// getters
	public String getTitulo() {return this.Titulo;}
	public String[] getOpciones() {return this.Opciones;}
	public int getOpcElegida() {return this.OpcElegida;}

	public void mostrar() {
		System.out.println();
		System.out.println(this.Titulo);
		System.out.println("--------------------------------------");
		for (int i = 0 ; i < Opciones.length ; i++) {
			System.out.println(i + 1 + ". " + Opciones[i]);
		}
		System.out.println("0. Salir");
	} // end fx mostrar

	public int seleccionaOpc() {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean salir = false;

		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("Elige una opción:");

		while(!salir) {
			option = sc.nextInt();
			if (option >= 0 && option <= Opciones.length) {
				salir = true;
			} else System.out.println("Elegiste una opción no valida, vuelva a intentarlo:");
		} 
		this.OpcElegida = option;
		//sc.close();
		return option;
	} // end fx seleccionaOpc

//	public String Literal() {
//		String Literal;
//		if (this.OpcElegida == 0)
//			return "Salir";
//		else return Opciones[this.OpcElegida - 1];
//	}

}
