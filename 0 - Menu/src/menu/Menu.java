package menu;
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

	//setters
	public void setTitulo(String titulo) {Titulo = titulo;}
	public void setOpciones(String[] opciones) {Opciones = opciones;}
	public void setOpcElegida(int opcelegida) {this.OpcElegida = opcelegida;}

	//getters
	public String getTitulo() {return Titulo;}
	public String[] getOpciones() {return Opciones;}
	public int getOpcElegida() {return OpcElegida;}

	public void mostrar() {
		System.out.println();
		System.out.println(this.Titulo);
		System.out.println("--------------------------------------");
		for (int i=0 ; i<Opciones.length ; i++) {
			System.out.println(i+1+". "+ Opciones[i]);
		}
		System.out.println("0. Salir");
	}

	public int seleccionaOpc() {
		Scanner sc=new Scanner(System.in);
		int result=0;
		boolean salir=false;

		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("Elige una opción:");

		while(!salir){
			result=sc.nextInt();
			if (result>=0 && result<=Opciones.length)
				salir=true;
			else System.out.println("Elegiste una opción no valida, vuelva a intentarlo:");
		} 
		this.OpcElegida = result;
		sc.close();
		return result;
	}

	public String Literal() {
		String Literal;
		if (this.OpcElegida==0)
			return "salir";
		else return Opciones[this.OpcElegida-1];
	}

}
