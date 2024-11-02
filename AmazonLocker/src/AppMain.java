import java.util.Scanner;


/**
 * Implementación de un modelo simplificado de utilización de un contenedor de mensajería, similar al
 * servicio Amazon Locker.
 * Se han simplificado las funciones y el modelado de las entidades.
 * CUESTIONES PREVIAS PARA LA IMPLEMENTACIÓN
 * 
 * 0.- ES OBLIGATORIO SEGUIR LA IMPLEMENTACIÓN UTILIZADA.
 *     Otros esquemas de modelado de datos válidos no serán tenidos en cuenta en la revisión
 *     del trabajo.
 *     Podría argumentarse, que sólo es necesario disponer de un array de String para implementar
 *     todas las funciones y es cierto, pero se debe pensar que esta parte de programa se engloba
 *     dentro de otro desarrollo mayor y aunque parezca innecesario, el array de boolean, es necesario
 *     para otros módulos que está desarrollando otro equipo distinto del nuestro.
 * 1.- Lee atentamente los comentarios
 * 2.- Analiza y comprende la estructura de la aplicación, utiliza el depurador para
 * 	   verificar que el flujo de ejecución que piensas  es el real
 * 3.- Notas técnicas
 * 
 * 		POSICIÓN: Reflexiona sobre como se puede devolver la posición. Con la información
 * 		reciba hasta ahora, sólo podíamos devolver tipos primitivos, ¿cómo se te ocurre
 * 		devolver 'de una vez' la fila y la columna?
 * 
 * 		Genera todos los métodos de apoyo que estimes necesarios, es recomendable programar modularmente
 * 		(no va a afectar al rendimiento), ya que aumentará la legibilidad y claridad del código.
 * 
 * 		IdPedido: Como es de tipo String, vamos a suponer que el formato del mismo será:
 * 				  AAA : 3 caracteres para la provincia
 * 				  999 : 3 numeros para generar un identificador único
 * 			      Ejemplo : MAD007
 *      Elegiremos el valor "", para indicar que el cajón no tiene ningún paquete en su interior.
 * 
 * @author root
 *
 */
public class AppMain {

	public final int FILAS = 6;										// Número de cajones en una columna
	public final int COLUMNAS = 4;									// Número de columnas del locker
	public final int TOTAL = FILAS * COLUMNAS;						// Total de cajones en el locker
	// --- Aún manejando un valor conocido, a veces conviene utilizar constantes para dejar más claro
	// --- el significado
	public final boolean LIBRE = false;
	public final boolean OCUPADO = true;
	
	public static void main(String[] args) {
		
		System.out.println("Aplicación Iniciada.");
		AppMain app = new AppMain();
		app.run();
		System.out.println("\n\nAplicación Terminada.");
	}

	public void run() {
		
		String[][] lockerPack = new String[FILAS][COLUMNAS];		// Guardar el identificador único del paquete del cliente
		boolean[][] lockerStat = new boolean[FILAS][COLUMNAS];		// Guardar estado del loocker true : libre, false : ocupado
		
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		while (!salir) {
			
			// Pinta el menú de opciones
			System.out.println("\n\n------------------------------");
			System.out.println("-- REPARTIDOR --");
			System.out.println("1.- Ocupación del locker");
			System.out.println("2.- Dejar paquete en locker");
			// TODO incluir opción nueva
			System.out.println("-- CLIENTE --");
			System.out.println("3.- Estado envío");
			System.out.println("4.- Retirar paquete en locker");

			System.out.println("0.- Salir");
			System.out.println("------------------------------");
			
			// Solicita opción al usuario
			System.out.print("\nElija opcion : ");
			int opcion = sc.nextInt();
			
			switch (opcion) {
			
				case 1:
					mostrarOcupacion(lockerStat);
					break;
				case 2:
					dejarPaquete(lockerPack,lockerStat);
					break;
				case 3:
					estadoEnvio(lockerPack);
					break;
				case 4:
					retirarPaquete(lockerPack,lockerStat);
					break;
				case 0:
					salir = true;
					break;
				default:
					System.out.print("\nOpción no válida!");
					break;
			} // endSwitch
		} // endWhile
	} // endRun

	/**
	 * Método para comprobar la ocupación del locker
	 * @param lock
	 */
	public void mostrarOcupacion(boolean[][] lock) {
		
		/*
		 * Recorrer el array de estado del locker y contar cuantos están a LIBRE
		 * Mostar el numero de 'cajones libres'
		 * Mostrar el mumero de cajones ocupados ( TOTAL - 'cajones libres')
		 */
		System.out.print("\nMostrar ocupación NO IMPLEMENTADA ");
	}
	
	/**
	 * Método para  dejar un pedido en el locker
	 * @param lock
	 */
	public void dejarPaquete(String[][] lockPack,boolean[][] lockStat ) {
		System.out.print("\nDejar Paquete NO IMPLEMENTADA ");
		/*
		 * pedir codigo;
		 * POSICION = buscar cajon libre;
		 * asignar el codigo en el locker de paquetes en la POSICION
		 * actualizar a true el locker de estado en la POSICION
		 */
	}
	
	/**
	 * Método para comprobar si el paquete está ya en el locker
	 * @param lock
	 */
	
	public void estadoEnvio(String[][] lock) {
		System.out.print("\nEstado Envío NO IMPLEMENTADA ");
		/*
		 * pedir el codigo;
		 * recorre el locker buscando el codigo
		 * y retornar TRUE si lo he encontrado o FALSE si no está todavía
		 * Alternativamente puedo mostrar aquí el mensaje
		 */
		
	}
	/**
	 * Método para recoger el paquete que está en el locker
	 * @param lock
	 */
	public void retirarPaquete(String[][] lockPack,boolean[][] lockStat) {
		System.out.print("\nRetirar Paquete NO IMPLEMENTADA ");
		
		/*
		 * pedir codigo;
		 * POSICION = buscar cajon donde esta el codigo;
		 * actualizar a false el locker de estado en la POSICION
		 * actualizo el estado 'sin paquete' el locker de paquetes
		 */
	}
	/**
	 * Función auxiliar para pedir al usuario el identificador del pedido.
	 * Vale tanto para el repartidor como para el cliente
	 * @return
	 */
	public String leerIdPedido() {
		
		return null;
	}
} // endClass

