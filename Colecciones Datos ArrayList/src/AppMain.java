import java.util.ArrayList;

public class AppMain {

	public AppMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Producto p1 = new Producto("Pan", 6);
		Producto p2 = new Producto("Leche", 2);
		Producto p3 = new Producto("Fresas", 20);
		Producto p4 = new Producto("Col", 1);
		Producto p5 = new Producto("Carne", 3);
		
		// 2. -- Inicializar el ArrayList
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		
		// 3. -- Añadir en el orden del pdf, del 1 al 4
		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		listaProductos.add(p4);
		
		// 4. -- Añadir p5 en la posición 1 del ArrayList
		listaProductos.add(1, p5);
		
		// 5. -- Añadir p5 al final
		listaProductos.add(p5);
		
		// 6. -- Mostrar los elementos del array
		// --- for normal ---
		System.out.println("La lista contiene " + listaProductos.size() + " productos:");
		for(int i = 0; i<listaProductos.size(); i++) {
			System.out.println(i + ": " + listaProductos.get(i));
		}
		
		// --- for simplificado ---
		System.out.println("\nfor simplificado = for(Producto p : listaProductos){syso(p);}");
		for(Producto p : listaProductos) {
			System.out.println(p);
		}
		
		
	}
	

	

}
