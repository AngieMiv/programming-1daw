import tools.Menu;
import tools.Tablero;

public class AppMain {

	public AppMain() {};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] op_menu = {
				"Añadir Coche",
				"Añadir Garaje",
				"Eliminar Coche",
				"Modificar Coche"
		};
		boolean appSalir = false;
				
		Menu m1 = new Menu("GARAJE : Opciones disponibles",op_menu);

		while (!appSalir) {
			
			m1.mostrar();
			int opcElegida = m1.seleccionaOpc();
			// Ejecutar la opcción elegida		
			switch(opcElegida) {
			
				case 1:
					System.out.println("Opción : " + opcElegida + " no implementada");
					break;
				case 2:
					System.out.println("Opción : " + opcElegida + " no implementada");
					break;
				case 3:
					System.out.println("Opción : " + opcElegida + " no implementada");
					break;
				case 4:
					System.out.println("Opción : " + opcElegida + " no implementada");
					break;				
				case 0:
					appSalir = true;
					break;
			}
		} // while
		
		System.out.println("Aplicación terminada");
	} // main

} // class
