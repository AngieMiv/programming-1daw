import java.util.ArrayList;
import java.util.Collections;

public class Funciones {

	/** a) Genera un ArrayList de tamaño n con números aleatorios cuyo intervalo min y max se indica como parámetro
	 * @param n : tamaño del ArrayList
	 * @param min : valor mínimo del ArrayList de Integers
	 * @param max : valor máximo del ArrayList de Integers 
	 * @return ArrayList con los parámetros indicados
	 */
	public ArrayList<Integer> generaArrayListInt(int n, int min, int max){
		ArrayList<Integer> result = new ArrayList<Integer>(n);
		int size = 0;

		for (int i = 0; i <= max; i++) {
			while (size < n) {
				if (i >= min) {
					result.add(i++);
				} else {
					i++;
				}
				size++;
			}

		}
		//ArrayList<Integer> result = new ArrayList<Integer>(n);

		// TODO implementar este método
		return result;
	}

	/** b) Devuelve el mínimo del ArrayList que pasa como parámetro
	 * @param valores : ArrayList de integers
	 * @return min: el mínimo de entre todos los integers del ArrayList de valores
	 */
	public Integer minimoArrayListInt(ArrayList<Integer> valores) {
		Integer min = 0;
		// TODO result
		return min;
	}

	/**c) Devuelve el máximo del ArrayList que pasa como parámetro
	 * @param valores : ArrayList de integers
	 * @return max : el maximo de entre todos los integers del ArrayList de valores
	 */
	public Integer maximoArrayListInt(ArrayList<Integer> valores) {
		Integer max = 0;
		// TODO result
		return max;
	}

	/** d) Devuelve la media del ArrayList que se pasa como parámetro
	 * @param valores : ArrayList de integers
	 * @return media: la media como double de los integers del ArrayList valores
	 */
	public double mediaArrayListInt(ArrayList<Integer> valores) {
		double media = 0.0;
		// TODO result
		return media;
	}

	/** 
	 * e) Dice si un número está o no dentro de un ArrayList
	 * @param num : El número a buscar dentro del ArrayList
	 * @param valores: ArrayList con integers
	 * @return result true or false
	 */
	public boolean estaEnArrayListInt(Integer num, ArrayList<Integer> valores) {
		boolean result = false;
		for(int i = 0; i < valores.size(); i++) {
			if (valores.get(i) == num) {
				result = true;
			}
		}
		return result;
	}

	/** f) Busca un número en un ArrayList y devuelve la posición (el índice) en la que se encuentra
	 * Esta función devuelve la posición donde se encuentra el elemento
	 * @param num : Elemento a buscar
	 * @param valores : Array donde buscar
	 * @return pos : posición dentro del array si se encuentra el elemento, o -1 si no existe
	 */
	public Integer posicionEnArrayList(Integer num, ArrayList<Integer> valores) {
		Integer pos = -1;
		// TODO
		return pos;
	}


	/** g) Le da la vuelta a un ArrayList
	 * Esta función da la vuelta al orden de un ArrayList de Integers
	 * @param valores : ArrayList que pasamos para que le de la vuelta
	 * @return result : Array de valores al revés
	 */
	public ArrayList<Integer> volteaArrayListInt(ArrayList<Integer> valores){
		ArrayList<Integer> result = new ArrayList<Integer>();
		// TODO
		return result;
	}

}
