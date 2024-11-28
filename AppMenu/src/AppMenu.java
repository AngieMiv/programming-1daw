
public class AppMenu {

	public AppMenu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String[] op_garaje = {
			"Añadir Coche",
			"Añadir Garaje",
			"Eliminar Coche",
			"Modificar Coche"
		};
		
		boolean salirApp = false;
		
		Menu m1 = new Menu("GARAJE-> Opciones: ", op_garaje);
		
		//System.out.println(m1.getTitulo());
		
		//System.out.println();
		//m1.seleccionaOpc();
		while(!salirApp) {
			m1.getTitulo(); // mostrar el título del menú
			m1.mostrar(); // mostrar las opciones del menú del m1 (Garaje)
			
			int opcElegida = m1.seleccionaOpc();
			switch(opcElegida) {
			case 1:
				System.out.println("1. sin implementar");
				break;
			case 2:
				System.out.println("2. sin implementar");
				break;
			case 3:
				System.out.println("3. sin implementar");
				break;
			case 4:
				System.out.println("4. sin implementar");
				break;
			case 0:
				System.out.println("Saliendo del menú.");
				salirApp = true;
				break;	
			} // end switch
			
		}// end while !salirApp
		
	} // end main

} // end class AppMenu
