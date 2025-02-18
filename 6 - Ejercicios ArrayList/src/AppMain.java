import java.util.ArrayList;
import java.util.Collections;

public class AppMain {

	public AppMain() {}

	public static void main(String[] args) {
		
	Funciones funciones = new Funciones();
	ArrayList<Integer> valores = new ArrayList<Integer>();
	Collections.addAll(valores, -3, -1, 2, 4, 5, 6, 7, 8, 9, 10);
	
	System.out.println(funciones.estaEnArrayListInt(3, valores));
	
	System.out.println(funciones.generaArrayListInt(7, 3, 6));

	
	}

}
