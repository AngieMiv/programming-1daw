

/**
 * Clase AppMain			02/11/2023
 * Clase principal del programa, que contiene
 * el punto de inicio del mismo.
 * @author root
 *
 */



public class AppMain {

	public static void main(String[] args) {
		
		// Crear coches
		Coche c1 = new Coche();
		Coche c2 = new Coche("MERCEDES","e220");
		Coche c3 = new Coche("LAMBORGINI","MARZAL",2020,80);
		Coche c4 = new Coche("SEAT","LEON");
		Coche c5 = new Coche("MAZDA","6",2014,60);
		
		// --- Otra forma de inicializar, utilizando los disintos
		// --- constructores de la clase
		
		//Coche[] _coches = {new Coche(),new Coche("MERCEDES","e220"),
		//		new Coche("LAMBORGINI","MARZAL",2020,80),new Coche("SEAT","LEON")
		//		new Coche("MAZDA","6",2014,60)};
		
		
		
		// Inicializar cada objeto con sus atributos
		c2.litDeposito = 60;		// Como es visible utlizamos el método de referencia por nombre
		c2.setFechaMat(2022);		// Como es privado utilizado el setter disponible
		// -------- c1
		c1.marca ="BMW";
		c1.modelo ="311";
		c1.litDeposito = 60;
		c1.setFechaMat(2019);
		// -------- c2
		
		// Crear garaje
		
		//Garaje miGaraje = new Garaje("MI CASA");	// Instanciar garaje inicializando su nombre
		Garaje miGaraje = new Garaje();				// Instancia garaje con constructor por defecto
		miGaraje.setNombre("MI CASA");				// inicializar atributo con setter
		
		// Insertar uno a uno los coches
		miGaraje.misCoches[0]=c1;					// Actualizo por código cada posición
		miGaraje.misCoches[1]=c2;
		miGaraje.misCoches[2]=c3;
		miGaraje.misCoches[3]=c4;
		miGaraje.misCoches[4]=c5;
		
		// Insertarlos desde un array				Creo un array y utizo un bucle para la asingación
//		Coche[] _coches = {c1,c2,c3,c4,c5};
//		
//		for (int i=0;i<miGaraje.misCoches.length;i++) {
//			miGaraje.misCoches[i]=_coches[i];
//		}
//		
		
		// --- Listar los coches en el garaje
		System.out.println("COCHES DE " + miGaraje.getNombre());
		for(int i=0;i<miGaraje.misCoches.length;i++) {
			
			System.out.print( "PLAZA "+(i+1)+": ");
			//miGaraje.misCoches[i].soy();						  // Utilizar método adHoc
			System.out.println(miGaraje.misCoches[i].toString()); // Utilizar método toString
		}
		
	}

}
