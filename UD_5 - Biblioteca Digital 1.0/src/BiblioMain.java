
public class BiblioMain {

	String nombreBiblio;
	static Libro[] estanteLibros = new Libro[10];
	Periodico[] estantePeriodicos = new Periodico[10];

	public static void main(String[] args) {

		String[] op_menu1 = {"Libros", "Periodicos"};
		String[] op_menuLibro = {"Añadir libro", "Ver lista de libros"};
		String[] op_menuPeriodico = {"Añadir periodico", "Ver lista de libros"};

		boolean appSalir = false;
		boolean appSalirLibro = false;
		boolean appSalirPeriodico = false;

		Menu m1 = new Menu("¿Cual quieres usar?",op_menu1);
		Menu m2 = new Menu("Selecciona una opción:", op_menuLibro);
		Menu m3 = new Menu("Selecciona una opción:", op_menuPeriodico);

		while (!appSalir) {

			m1.mostrar();
			int opcElegida = m1.seleccionaOpc();
			// Ejecutar la opcción elegida		
			switch(opcElegida) {

			case 1: // libros
				System.out.println("-----LIBROS----");
				while(!appSalirLibro) {

					m2.mostrar();
					int opcElegida2 = m2.seleccionaOpc();

					switch(opcElegida2) {

					case 1: // añadir libro
						System.out.println("Opción no implementada");
						break;

					case 2: // listar libros
						System.out.println("Opción no implementada");
						break;

					case 0: // salir
						appSalirLibro = true;
						break;
					} // end switch libro
				} // end while !appSalirlibro
				break;

			case 2: // periodicos
				System.out.println("---PERIODICOS---");
				while(!appSalirPeriodico) {

					m3.mostrar();
					int opcElegida3 = m3.seleccionaOpc();

					switch(opcElegida3) {

					case 1: // añadir periodicos
						System.out.println("Opción no implementada");
						break;

					case 2: // lista de periodicos
						System.out.println("Opción no implementada");
						break;

					case 0: // salir
						appSalirPeriodico = true;
						break;	
					} // end menu periodicos
				} // end while periodicos
				break;

			case 0: // salir
				System.out.println("Agur");
				appSalir = true;
				break;

			} // end switch principal
		} // end while principal

		System.out.println("\n--- Aplicación terminada");
	} // end BiblioMain

	// métodos de la Biblioteca

	public static int totalLibros() {
		return 0;
	}

	public static int totalPeriodicos() {
		return 0;
	}

	public static String[] listaLibrosEstante(Libro[] listaLibros) {
		int posicion;
		String titulo;
		String ISBN;
		String[] lista = {posicion + ": " + titulo + " - " + ISBN};
		return lista; 
	}

	public static String[] listaPeriodicosEstante(Periodico[] listaPeriodicos) {
		int posicion;
		String nombre;
		String fecha;
		String[] lista = {posicion + ": " + nombre + " - " + fecha};
		return lista;

	}


	public static boolean addLibro(Libro nuevoLibro) {
		/*
		 * añade libro al estante
		 * true: si lo ha añadido correctamente
		 * false: si no hay espacio
		 * */
		return false;
	}

	public static boolean addPeriodico(Periodico nuevoPeriodico) {
		/*
		 * añade periódico al estante
		 * true: si lo ha añadido correctamente
		 * false: si no hay espacio
		 * */
		return false;
	}

	public static String listaLibros() {
		return "lista de libros";
	}
	// 1. Métodos añadir libro: Este método intenta añadir un nuevo libro en el primer espacio vacío disponible en un estante.
	// for -- Usamos un bucle para revisar cada espacio de la estantería, uno por uno.
	// int i = 0 -- Empezamos con el primer espacio de la estantería (índice 0).
	// i < estanteLibros.length -- Continuamos mientras no hayamos revisado todos los espacios.
	// i++ -- Vamos al siguiente espacio en cada vuelta del bucle.   
	// if -- Verificamos una condición.
	// estanteLibros[i] == null -- Verificamos si el espacio en la posición i está vacío.
	// estanteLibros[i] = libroNuevo -- Si encontramos un espacio vacío, colocamos el libro nuevo en ese espacio.   
	// return true -- Indicamos que añadimos el libro correctamente devolviendo true.   
	// return false -- Después de revisar todos los espacios y no encontrar ninguno vacío, devolvemos false, indicando que no había espacio para añadir el libro.   


	public static boolean añadirLibro(Libro libroNuevo) { 
		for(int i = 0; i < estanteLibros.length; i++) { 
			if(estanteLibros[i] == null) { 					//Encuentra la primera posición vacía
				estanteLibros[i] = libroNuevo;
				return true; 							    //True cuando el libro se añade correctamente
			} 
		} 							
		return false;										//False sino encuentra espacio vacío
	}


	public static String listaPeriodicos() {
		return "lista de periódicos";
	}


}
