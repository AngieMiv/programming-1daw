import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import Model.Vehiculo;
import Model.Aparcamiento;

import tools.Menu;

/**
 * Aparcamiento DAO versión 0
 * 
 * - Almacenamiento en memoria a través de disco (archivo binario)
 * - Gestión propietaria de datos mediante colecciones
 * - Gestión a través de clase DAO de datos mediante HashMap
 * - Ambos sistemas de almacenamiento sincronizados 
 */
public class AppMain {

	/**
	 * Nombre del archivo de almacenamiento en disco.
	 */
	public static final String STORAGE = "Aparcamiento.dat";
	public Aparcamiento apm;	
	
	/**
	 * Datos de prueba
	 */
	public static Vehiculo[] listaEjemplo =  {
		new Vehiculo("4444-ABC","ROJO",1900),
		new Vehiculo("5555-ABC","AZUL",1901),
		new Vehiculo("6666-ABC","ROJO",1902),
		new Vehiculo("7777-ABC","AMARILLO",1903),
		new Vehiculo("8888-ABC","ROJO",1904),
		new Vehiculo("9999-ABC","AMARILLO",1905),
		new Vehiculo("0000-ABC","ROJO",1906),
	};
	
	public AppMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Lanzador estático
	 * @param args -- Se ignoran parámetros
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppMain ap = new AppMain();
		ap.run();
		
	} // end Main

	/**
	 * Lanzador no estático de la aplicación (Método principal)
	 */
	public void run() {
		
		Menu m = new Menu();
		Boolean salir= false;
		Integer opcion =0;
		String[] opc = {
				"Añadir Vehículo",
				"Eliminar Vehículo",
				"Listar listVehiculos",
				"Listar mapVehiculos",
				"Estadísticas"
		};
		
		init();

		m.setTitulo("APARCAMIENTO : " + apm.getNombre());
		m.setOpciones(opc);
		while (!salir) {
			
			m.mostrar();// Mostrar el menú
			opcion = m.seleccionaOpc();
			
			switch(opcion) {
			
			case 1:
				addVehiculo();
				break;
			case 2:
				deleteVehiculo();
				break;
			case 3:
				listVehiculos();
				break;
			case 4:
				mapVehiculos();
				break;
			case 5:
				estadisticas();
				break;
			case 0: 
				System.out.println("\nVolcando información a disco...\n");
				save(STORAGE); // Guarda la información
				salir = true;
			} // opciones			
			
		} // bucle principal de la aplicación
		
	} // end run

/**
 * Añade un vehículo nuevo al sistema
 */
	public void addVehiculo() {
		
		String matricula = pedirMatricula();
		Integer valor = comprobarMatricula(matricula);
		if (valor != -1) {
			System.out.println("Ya existe un vehículo en el aparcamiento");
		}
		else {
			// Pedir el resto de datos
			Scanner sc = new Scanner(System.in);
			System.out.print("Dime el color :");
			String color = sc.nextLine().toUpperCase();
			System.out.print("Dime el año :");
			Integer fecha = sc.nextInt();
			// Añadirlo a la lista de vehiculos
			Vehiculo v = new Vehiculo(matricula,color,fecha);
			apm.lstVehiculos.insertOne(v);
			//apm.getListaVehiculos().add(v);
			// Añadir usando DaoVehiculoMap , uso persistenica de forma transparente
			apm.mapVehiculos.insertOne(v);
			
		}
		
		
	};
	/**
	 * Elimina un vehículo a partir de su matrícula
	 */
	public void deleteVehiculo() {
		
		String matricula = pedirMatricula();

		int valor = comprobarMatricula(matricula); // Comprobación dependiente del ArrayList
		if (valor == -1) {
			System.out.println("No existe un vehículo en el aparcamiento");
		}
		else {
			// Eliminarlo de la lista de vehiculos
			//apm.getListaVehiculos().remove(valor);
			apm.lstVehiculos.deleteOne(matricula);
			// Usando el objeto Dao Map
			apm.mapVehiculos.deleteOne(apm.mapVehiculos.findKeyByMatricula(matricula));
		}

		valor = valor;
	};
	
	/**
	 * Genera un listado de los vehículos registrados en el aparcamiento, utilizando
	 * la colección listVehiculos
	 */
	
	public void listVehiculos() {
		
		System.out.println("\n" + justifica("MATRICULA",10)+justifica("COLOR",10)+justifica("AÑO",5));
		System.out.println("-".repeat(25));
		for (Vehiculo v : apm.lstVehiculos.findAll()) {
			System.out.println(	justifica(v.getMatricula(),10)+
								justifica(v.getColor(),10)+
								justifica(""+ v.getFecha(),5));
			
		}
		System.out.println();
	};
	
	/**
	 * Genera la estadísticas del aparcamiento
	 */
	public void estadisticas() {
		cuentaColores(apm.getListaVehiculos());
		
	};
	
	/**
	 * Genera un listado de los vehículos registrados en el aparcamiento, utilizando
	 * el HashMap mapVehiculos
	 */
	
	public void mapVehiculos() {
		
		System.out.println("\n" + justifica("MATRICULA",10)+justifica("COLOR",10)+justifica("AÑO",5));
		System.out.println("-".repeat(25));
		for (Vehiculo v : apm.mapVehiculos.findAll().values()) {
			System.out.println(	justifica(v.getMatricula(),10)+
								justifica(v.getColor(),10)+
								justifica(""+ v.getFecha(),5));
			
		}
		System.out.println();
	};

	
	/**
	 * Devuelve un array con los colores distintos que existen en el aparcamiento
	 * @param alv Array de vehículos
	 * @return lista de colores distintos
	 */
	public ArrayList<String> distinctColor(ArrayList<Vehiculo> alv){
		ArrayList<String> als = new ArrayList<String>();
				for (int i=0; i < alv.size();i++) {
					String color = alv.get(i).getColor();
					if (!als.contains(color))
					{ als.add(color);}					
				}
		return als;
		
	}
	
	/**
	 * Algoritmo para generar las estadísticas de colores de los vehículos registrados
	 * @param alv Colección ArrayList de vehículos
	 */
	public void cuentaColores(ArrayList<Vehiculo> alv) {
		ArrayList<String> als = distinctColor(alv);
		Integer[] numero = new Integer[als.size()];
		// Hay que inicializarlos a cero
		for (int j=0; j< numero.length;j++) {
			 numero [j]=0;
		}
		for (int i = 0;i<alv.size();i++) {
			String color = alv.get(i).getColor();
			int pos = als.indexOf(color);
			numero[pos]++;
		}
		for (int j=0; j< numero.length;j++) {
			System.out.println(als.get(j) + " : " + numero [j]);
		}
	}
	
	/**
	 * Solicita la entrada de la matrícula por consola
	 * TODO:  no se hace ninguna comprobación de formato
	 * @return matrícula con los 3 caracteres de letra en mayúscula
	 * 
	 */
	public String pedirMatricula() {
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce Matricula");
			String matricula = sc.nextLine();
		return matricula.toUpperCase();
	}
	
	/**
	 * Recupera el índice del vehículo que tiene la matricula especificada
	 * de la colección listVehiculos del aparcamiento
	 * @param matricula Matrícula de búsqueda
	 * @return -1 : No encontrada >=0 : Índice dentro de la lista
	 */
	public int comprobarMatricula(String matricula) {
		int result =  -1;
		ArrayList<Vehiculo> al;
		al = apm.getListaVehiculos();
		for (int i = 0; i < al.size();i++) {
			Vehiculo v1 = al.get(i);
			if (v1.getMatricula().equals(matricula)) {
				result = i;
				break;
			}
		} // recorrer listaVehiculos
		
		return result;
		
	}
	
	/**
	 * Método de inicialización de la aplicación
	 * - Recupera datos almacenados en disco o genera un set de pruebas
	 * 
	 */
	public void init() {
	      File file = new File(STORAGE); // Verifica si el archivo existe
	      if (file.exists()) {
	        	
	        	System.out.println("\nRecuperando información almacenada...\n");
	            load(STORAGE);			// Método simple no recupera información DAO
	            // Regenera DAO
				for (int i=0;i<apm.getListaVehiculos().size();i++ ) {
					this.apm.mapVehiculos.insertOne(apm.getListaVehiculos().get(i));
			 }
	        }
	        else {
	        		System.out.println("\nGenerando datos de prueba ...\n");
					this.apm = new Aparcamiento();
					this.apm.setNombre("GOYA");
					for (int i=0;i<listaEjemplo.length;i++ ) {
						this.apm.getListaVehiculos().add(listaEjemplo[i]);
						// Usar objeto Dao
						this.apm.mapVehiculos.insertOne(listaEjemplo[i]);
				 }
	        }
	} // init()
	/**
	 * Hace una copia completa del contenido del objeto Aparcamiento
	 * que utiliza la aplicación. Se salvan también todos los Vehículos registrados
	 * 
	 * @return operación realizada con éxito true, false en caso contrario
	 */
	public boolean save(String fichero) {
		boolean result = false;
		
		// TODO salvar aparcamiento completo	
		//	 apm.lstVehiculos.saveAll(fichero); // salva lstVehiculos;
		
		return result;
	} // save
	
	/**
	 * Recupera la copia del último contenido del objeto Aparcamiento
	 * almacenado. Se salvan también todos los Vehículos registrados
	 * 
	 * @return operación realizada con éxito true, false en caso contrario
	 */
	public boolean load(String fichero) {
		boolean result = false;
        
		// TODO salvar aparcamiento completo
		// apm.lstVehiculos.loadAll(fichero); // recupera lstVehiculos;

		
		return result;
		
	}
	
	/**
	 * Función auxiliar para justificar con espacios el contenido del string
	 * @param cad Cadena original 
	 * @param numero anchura total
	 * @return cadena rellenada con espacios justificada a la izquierda.
	 */
	private String justifica(String cad,int numero) {	
		
		return String.format("%1$-" + numero + "s", cad); // justifica a la izq , añadir %1$- para dcha
	}
	
}
