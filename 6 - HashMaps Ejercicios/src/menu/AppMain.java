package menu;

import java.util.HashMap;

// Main de HashMaps
public class AppMain {

	public static void main(String[] args) {
		

	}
	
	/**
	 * Ejercicio 1. Implementa el control de acceso al área restringida de un programa. Se debe pedir un
	 * nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa
	 * dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se 
	 * agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
	 * nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una
	 * estructura de la clase HashMap. 
	 */
	public class AccessControl {
		private HashMap<String, String> users;
		
		public AccessControl() {
			users = new HashMap<>();
			users.put("AdminJaunjo", "JAunjo3843");
			users.put("UserAlba", "1WET20240D");
			users.put("Guest", "a1234567");
		}
		
	}
	
	

}
