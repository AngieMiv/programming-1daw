import java.util.ArrayList;

public class Funciones {

	// a) Genera un ArrayList de tamaño n con números aleatorios cuyo intervalo min y max se indica como parámetro
	public ArrayList<Integer> generaArrayListInt(int n, int min, int max){
		ArrayList<Integer> result = new ArrayList<Integer>();
		// TODO implementar este método
		return result;
	}
	
	// b) Devuelve el mínimo del ArrayList que pasa como parámetro
	public Integer minimoArrayListInt(ArrayList<Integer> valores) {
		Integer result = 0;
		// TODO result
		return result;
	}
	
	// c) Devuelve el máximo del ArrayList que pasa como parámetro
	public Integer maximoArrayListInt(ArrayList<Integer> valores) {
		Integer result = 0;
		// TODO result
		return result;
	}
	
	// d) Devuelve la media del ArrayList que se pasa como parámetro
	public double mediaArrayListInt(ArrayList<Integer> valores) {
		double result = 0.0;
		// TODO result
		return result;
	}

	// e) Dice si un número está o no dentro de un ArrayList
	public boolean estaEnArrayListInt(Integer num, ArrayList<Integer> valores) {
		boolean result = false;
		while(!result) {
			for(int i = 0; i < valores.size(); i++) {
				if (valores.get(i) == num) {
					result = true;
				}
			}
		}
		return result;
	}
	
	/**
	 * Esta función devuelve la posición donde se encuentra el elemento
	 * @param num : Elemento a buscar
	 * @param valores : Array donde buscar
	 * @return Posición dentro del array si se encuentra el elemento, o -1 si no existe
	 */
	// f) Busca un número en un ArrayList y devuelve la posición (el índice) en la que se encuentra
	public Integer posicionEnArrayList(Integer num, ArrayList<Integer> valores) {
		Integer result = -1;
		// TODO
		return result;
	}
	
	// g) Le da la vuelta a un ArrayList
	public ArrayList<Integer> volteaArrayListInt(ArrayList<Integer> valores){
		ArrayList<Integer> result = new ArrayList<Integer>();
		// TODO
		return result;
	}
	
}
