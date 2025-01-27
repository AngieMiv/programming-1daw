package menu;

import java.util.Scanner;

public class AppMenu {

	public AppMenu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String[] opcGaraje = {
				"Añadir Coche",
				"Añadir Garage",
				"Eliminar Coche",
				"Eliminar Garage"
		};

		boolean appSalir =false;

		Menu m1 = new Menu("Garage: Opciones disponibles", opcGaraje);

		while(!appSalir) {
			m1.mostrar();
			int OpcElegida = m1.seleccionaOpc();

			switch (OpcElegida) {
			case 1:
				System.out.println("Opción:"+ OpcElegida + ". No implementada");
				break;
			case 2:
				System.out.println("Opción:"+ OpcElegida + ". No implementada");
				break;
			case 3:
				System.out.println("Opción:"+ OpcElegida + ". No implementada");
				break;
			case 4:
				System.out.println("Opción:"+ OpcElegida + ". No implementada");
				break;
			case 0:
				appSalir = true;
				break;
			}//switch

		}//while

		System.out.println("Aplicación terminada");
	}//main

}//class
