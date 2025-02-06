import java.time.LocalDate;
import java.util.Scanner;

import tools.Menu;


public class AppMain {

	public Estacion[] estaciones = new Estacion[6];			// Gestionamos 6 estaciones
	public DiarioMedidas[] diarios = new DiarioMedidas[6]; 	// 6 Diarios de medidas disponibles
	public Medida[] medidas ;								// TODO
	private static String[] n_est = {"BARAJAS","CUZCO","ARGUELLES","MONCLOA","SOL","ATOCHA"};
	private static String NA = "Sin Asignar";

	public AppMain() {	}									// Instanciar programa

	public static void main(String[] args) {				// Lanzador del programa

		System.out.println("Iniciando Aplicación...");
		AppMain ma = new AppMain();
		ma.run();
		System.out.println("Aplicación terminada");
	} // main

	/** Ejecuta un objeto AppMain, para evitar uso de static
	 * 
	 */
	public void run() {										// Pto de arranque no estático

		String[] opciones = {
				"Listar estaciones",
				"Seleccionar estacion",
				"Cargar diario en estacion",
				"Listar Medidas",
				"Resumen Estaciones"
		};
		String titulo = "MEDIO AMBIENTE 1.O";
		Menu m = new Menu(titulo,opciones);
		boolean salir = false;
		Estacion est_elegida=null;
		init_data();										// Cargar datos de aplicación		

		while(!salir) {
			m.setTitulo(titulo + " ESTACION : " + ((est_elegida == null)? "": est_elegida.getNombre()));
			m.mostrar(); 						// Muestra el menú
			int opcion = m.seleccionaOpc();		// solicita opción
			System.out.println("\n");
			switch(opcion) {
			case 1:
				listarEstaciones();				
				break;
			case 2:
				est_elegida = eligeEstacion();
				break;
			case 3:
				cargarDiario(est_elegida);
				break;
			case 4:
				listarMediciones(est_elegida);
				break;
			case 5:
				resumenEstaciones();
				break;	
			case 0: salir = true;
			}		
		} // Bucle principal
	} // run

	/**
	 * PREGUNTA 1B. Implementa el método eligeEstacion(). Deberás solicitar un número de estación
	 * válido en función de total de estaciones disponibles en la aplicación.
	 * Si no elige un número válido se retornará null.
	 * Elige una estación de entre las registradas
	 * @return Estación elegida o null si se cancela la selección
	 */
	public Estacion eligeEstacion() {

		Estacion result= null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Elige un número de estación, del 1 al 6");
		try {
			int estacion = sc.nextInt();

			if (estacion <= 6 && estacion >= 0) {
				result = estaciones[estacion - 1];
			} else {
				return null;
				//System.out.println("No válido, introduce un número del 1 al 6");
			} 
		} catch (Exception e) {
			System.out.println("Debes introducir un número del 1 al 6");
		}
		return result;
	}

	/**
	 * PREGUNTA 2. Genera un listado formateado de las estaciones disponibles en la aplicación. Se mostrará un número de orden
	 * secuencia, el nombre de la estación, el total de diarios que tiene asignados esa estación y el total de medidas con las
	 * que cuenta la estación (habrá que sumar las medidas disponibles en todos sus diarios).
	 * No cuentan los diarios y las medidas que tienen valor nulo. Utiliza las funciones para obtener totales parciales que 
	 * implementan las clases DiarioMedidas y Medida.
	 * Debes presentar la información tabulada. Utiliza la función justifica para conseguir el efecto deseado.
	 * 
	 * Lista las estaciones registrada en la base de datos. Presenta los siguientes datos:
	 * nombre de la estación, número de diarios de medida de esa estación y todas de medidas de todos los diarios que pertencen a esa estación
	 */
	public void listarEstaciones() {

		System.out.println("Nombre de las estaciones:");
		for (int i = 0; i < estaciones.length; i++) {
			System.out.println(estaciones[i].getNombre());
		}


	};
	/**
	 * PREGUNTA 3. Lista las medidas que tiene asignadas una estación. La información se debe presentar en forma tabular.
	 * Sólo se mostrarán los diarios y las medidas que no sean nulos.
	 * El orden de presentación de los campos es Nombre de estación, fecha del diario, fecha de la medida, temperatura, presion y humedad.
	 * Utiliza la función justifica para tabular y alinear correctamente la información.
	 * 
	 * Lista las medidas dispobnibles
	 * @param estacion Estación sobre la que se listarán las medidas
	 */
	public void listarMediciones(Estacion estacion) {

		// PREGUNTA 3.
		/* 
		 * Código respuesta
		 */

	}


	/**
	 * PREGUNTA 4. Genera una tabla resumen, que presente el total de estaciones de cada tipo y la potencia que consumen
	 * Debes generar una última línea de acumulados.
	 * 
	 * Presenta un resumen de la información existente mostrará
	 * número de estaciones totales
	 * número de estaciones de cada tipo
	 * Potencia total consumida
	 * Potencia total por cada tipo
	 */
	public void resumenEstaciones() {

		//		private String justifica(String cad,int numero) {		
		//			return String.format("%1$-" + numero + "s", cad); // justifica a la izq , añadir %1$- para dcha
		//		}
		System.out.println("RESUMEN ESTACIONES");
		System.out.println("-------------------------------");
		int a = 0, b = 0;
		for(int i = 0; i < this.estaciones.length; i++) {
			if (estaciones[i].isMovil() == true) {
				a += 1;
			} else {
				b += 1;
			}	
		}
//		Double[] just = {(double) a, this.estaciones[i].calculaConsumo(estaciones[i])};
		String kk[];
		int num = 18;
//		for (int i = 0; i < this.estaciones.length; i++)  
//		{
//			if (this.estaciones != null) {
//				kk = justifica(a, + this.estaciones[i].calculaConsumo(estaciones[i]) + num);
//			}
//		}
			
		//String[] cad = {(String)a, };

		System.out.println("ESTACIONES TIPO A : " + a);
		System.out.println("ESTACIONES TIPO B : " + b);

	}


	/**
	 * Elige un diario de medidas de entre los registrados para cargar en una estación 
	 * @return diario de medidas para cargar /visualizar
	 */
	public DiarioMedidas eligeDiarioMedidas() {
		DiarioMedidas result= null;
		// Utilizo el objeto menu para mostrar una lista eligble de valores, con opción de cancelación
		// Sólo se ejecuta una vez, como si fuese una pregunta simple.
		String[] opcs = new String[this.diarios.length]; 		// Diarios registrados en la aplicación
		for (int i = 0; i< opcs.length;i++) {
			String  valor = "< Vacío >";
			if (this.diarios[i]!= null) 
			{
				valor = justifica(this.diarios[i].getEstacion() + this.diarios[i].getFecha() , 18);
			} // Diario con datos
			opcs[i] = valor;
		} // Diarios registrados
		Menu m = new Menu("ESTACION          FECHA",opcs);
		m.mostrar();											// Lista valores
		int elegida = m.seleccionaOpc();						// Elige uno de los posibles valores
		if (elegida==0) result= null;							// Opción cero anula selección anterior
		else
			result = this.diarios[elegida-1];
		return result;
	}




	/**
	 * Asigna el diario de medidas a la estación ( lo añade y cambia el valor del campo estación con
	 * el nombre de la estación). Los diarios sólo se pueden añadir a una estación.
	 * @param e Estación donde se cargarán las medidas
	 * @param dm Diario de medida con las medidas
	 * @return true operación OK, false errores en el proceos
	 */
	public boolean cargarDiario(Estacion e) {

		if (e!=null) {
			DiarioMedidas dm_elegido = this.eligeDiarioMedidas();				// Elegir diario de medidas
			if (dm_elegido == null) {
				System.out.println("\n*** Operación cancelada.");
				return false;
			}
			if (!dm_elegido.getEstacion().equals("Sin Asignar")) {	// Comprueba que no esté ya asignado
				System.out.println("\n*** Este diario ya está cargado,elige otro.");
				System.out.println("Operación cancelada.");
				return false;
			}
			else {
				e.addMedicion(dm_elegido);				// Añado el diario de medidas a la estaicón
				dm_elegido.setEstacion(e.getNombre());	// Marco el nombre de la estación
				System.out.println("Diario añadido.");
				return true;
			}
		} else {
			System.out.println("\n*** Elige una estación primero!");
			return false;
		}
	}


	/**
	 * Inicializa un conjunto de datos para utilizar la aplicación
	 * Se generar 4 diarios de medida para los días 27,28,29,30, con 4 medidas cada uno
	 * Tras la ejecución de este método los artibutos de la clase AppMain quedan incializados
	 */
	public void init_data() {

		Medida m100 = new Medida("2025-01-27T00:00:01#13#123#35");		Medida m101 = new Medida("2025-01-27T01:01:01#14#123#35");
		Medida m102 = new Medida("2025-01-27T02:02:01#15#123#35");		Medida m103 = new Medida("2025-01-27T03:03:01#16#123#35");
		Medida m200 = new Medida("2025-01-28T00:04:02#23#223#45");		Medida m201 = new Medida("2025-01-28T01:05:02#24#223#45");
		Medida m202 = new Medida("2025-01-28T02:06:02#25#223#45");		Medida m203 = new Medida("2025-01-28T03:07:02#26#223#45");
		Medida m300 = new Medida("2025-01-29T00:08:03#33#323#55");		Medida m301 = new Medida("2025-01-29T01:09:03#34#323#55");
		Medida m302 = new Medida("2025-01-29T02:10:03#35#323#55");		Medida m303 = new Medida("2025-01-29T03:11:03#36#323#55");
		Medida m400 = new Medida("2025-01-30T00:12:04#03#423#65");		Medida m401 = new Medida("2025-01-30T01:13:04#04#423#65");
		Medida m402 = new Medida("2025-01-30T02:14:04#05#423#65");		Medida m403 = new Medida("2025-01-30T03:15:04#06#423#65");

		Medida[] datosmedidas = {m100,m101,m102,m103,m200,m201,m202,m203,m300,m301,m302,m303,m400,m401,m402,m403};

		boolean _SI = true; boolean _NO = false;
		for (int e=0;e<6;e++) {
			if (e==0 ||  e==3) {
				this.estaciones[e]= new EstacionTipoA(n_est[e], (e%2==0)?_SI:_NO, 50,(e%2==0)?_SI:_NO, (e%2==1)?_SI:_NO);
			} else {
				this.estaciones[e]= new EstacionTipoB(n_est[e], (e%2==0)?_SI:_NO, 50,(e%2==0)?1:2, (e%2==1)?8:16);
			}
		}
		// vacía todos los  diarios
		for (int i=0;i<this.diarios.length;i++) {
			this.diarios[i]= null;
		}
		// Asigna valores para los 4 primeros diarios
		int ptr_medida = 0;
		LocalDate fecha = LocalDate.of(2025, 1, 27); // Fecha concreta 27
		for (int i=0;i<4;i++) {
			this.diarios[i] = new DiarioMedidas(NA,fecha); // Diario sin asignación
			for (int j=0;j<4;j++) { // 4 medidas a cada diario
				this.diarios[i].addMedida(datosmedidas[ptr_medida]);
				ptr_medida++;
			} // bucle medidas
			fecha = fecha.plusDays(1L);
		} // bucle diarios
		this.estaciones[2].addMedicion(this.diarios[1]); // Asigna un diario
	}  // init_data


	// getters
	public Estacion[] getEstaciones() {return estaciones;}
	public DiarioMedidas[] getDiarios() {return diarios;}
	public Medida[] getMedidas() {return medidas;}
	public static String[] getN_est() {return n_est;}
	public static String getNA() {return NA;}

	// setters
	public void setEstaciones(Estacion[] estaciones) {this.estaciones = estaciones;}
	public void setDiarios(DiarioMedidas[] diarios) {this.diarios = diarios;}
	public void setMedidas(Medida[] medidas) {this.medidas = medidas;}
	public static void setN_est(String[] n_est) {AppMain.n_est = n_est;}
	public static void setNA(String nA) {NA = nA;}

	/**
	 * Función auxiliar para justificar con espacios el contenido del string
	 * @param cad Cadena original 
	 * @param numero anchura total
	 * @return cadena rellenada con espacios justificada a la izquierda.
	 */
	private String justifica(String cad,int numero) {		
		return String.format("%1$-" + numero + "s", cad); // justifica a la izq , añadir %1$- para dcha
	}
	
} // Class
