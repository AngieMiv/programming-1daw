package menu;

public class AppMenu {

	public AppMenu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String[] opcs = {
				"  ",
				"  ",
				"  ",
				"  "
		};

		boolean appSalir = false;

		Menu m1 = new Menu("Garage: Opciones disponibles", opcs);

		while(!appSalir) {
			m1.mostrar();
			int opcElegida = m1.seleccionaOpc();

			switch (opcElegida) {
			case 1:
				System.out.println("Opción:"+ opcElegida + ". No implementada");
				break;
			case 2:
				System.out.println("Opción:"+ opcElegida + ". No implementada");
				break;
			case 3:
				System.out.println("Opción:"+ opcElegida + ". No implementada");
				break;
			case 4:
				System.out.println("Opción:"+ opcElegida + ". No implementada");
				break;
			case 0:
				appSalir = true;
				break;
			}//switch

		}//while

		System.out.println("Aplicación terminada");
	}//main

}//class
