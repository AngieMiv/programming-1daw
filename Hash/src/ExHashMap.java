import java.util.HashMap;
import java.util.Map.Entry;

public class ExHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(911, "Alba Martínez");
		m.put(555, "Ramón Merchán");
		m.put(212, "Alejandro Espinosa");
		System.out.println();
		System.out.println("Recupera elemento con clave 911");
		System.out.println(m.get(911));
		
		// Recorrer un HashMap por clave
		System.out.println("Recorrer HashMap por clave");
		for (Integer clave : m.keySet()){
			System.out.println("Clave: " + clave + " | Valor: " + m.get(clave));
		}
		
		System.out.println();
		
		// Recorrer un HashMap con Entry
		System.out.println("Recorrer HashMap con Entry");
		for (Entry<Integer, String> par : m.entrySet()) {
			System.out.println("Clave: " + par.getKey() + " = Valor: " + par.getValue());
		}
		
	}
}
