import java.time.LocalDate;
import java.util.Scanner;

import tools.Menu;


public class AppMain {

	public Estacion[] estaciones = new Estacion[6];			// Gestionamos 6 estaciones
	public DiarioMedidas[] diarios = new DiarioMedidas[6]; 	// 6 Diarios de medidas disponibles
	public Medida[] medidas;								// TODO
	//public AppMain() {	}									// Instanciar programa

	public static void main(String[] args) {				// Lanzador del programa

		System.out.println("Iniciando Aplicación...");
		AppMain ma = new AppMain();
		ma.run();
		System.out.println("Aplicación terminada");


	} // main

	/* Ejecuta un objeto AppMain, para evitar uso de static */

	@SuppressWarnings("unlikely-arg-type")
	public void run() {									// Pto de arranque no estático
		Scanner sc = new Scanner(System.in);
		init_data();									// Cargar datos de aplicación

		String[] opciones = {
				"Lista nombre estaciones",
				"Lista mediciones",
				//"Opcion 3",
				//"Opcion 4",
				//"Opcion 5",
				//"Opcion 6"
		};

		Menu m = new Menu("MEDIO AMBIENTE", opciones);
		boolean salir = false;

		//m.mostrar();
		while(!salir) {
			m.mostrar(); 						// Muestra el menú
			int opcion = m.seleccionaOpc();		// solicita opción
			switch(opcion) {
			case 1:
				System.out.println("Nombre de las estaciones:");
				for (int i = 0; i < estaciones.length; i++) {
					System.out.println(estaciones[i].getNombre());
				}
				break;
			case 2:
				System.out.println("Listado de mediciones:");
				//				for (int i = 0; i < diarios.length; i++) {
				//					if (diarios[i] == null) {
				//						System.out.println("vacío");
				//					} else {
				//						System.out.println(diarios[i].getEstacion() + diarios[i].getFecha());
				//					}
				System.out.println("¿Qué medida?");
				String medidaIn = sc.nextLine();
				try {
					for (int i = 0; i < getMedidas().length; i++) {
						if (medidaIn.equals(getMedidas()[i])) {
							System.out.println(getMedidas()[i]);
						} else {
							System.out.println("No existe la medida");
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				//			case 3:
				//				System.out.println("Opción no implementada");
				//				break;
				//			case 4:
				//				System.out.println("Opción no implementada");
				//				break;
				//			case 5:
				//				System.out.println("Opción no implementada");
				//				break;
				//			case 6:
				//				System.out.println("Opción no implementada");
				//				break;	
			case 0: salir = true;
			break;
			} // end switch



		} // end While principal

	} // end public void run


	/* 
	 * inicializa un conjunto de datos para utilizar la aplicación.
	 * Se generar 4 diarios de medida para los días 27,28,29,30, con 4 medidas cada uno
	 */

	/*QUITAR STATIC !!!!-----*/
	public void init_data() {

		Medida m100 = new Medida("2025-01-27T00:00:01#13#123#35");		Medida m101 = new Medida("2025-01-27T01:01:01#14#123#35");
		Medida m102 = new Medida("2025-01-27T02:02:01#15#123#35");		Medida m103 = new Medida("2025-01-27T03:03:01#16#123#35");

		Medida m200 = new Medida("2025-01-28T00:04:02#23#223#45");		Medida m201 = new Medida("2025-01-28T01:05:02#24#223#45");
		Medida m202 = new Medida("2025-01-28T02:06:02#25#223#45");		Medida m203 = new Medida("2025-01-28T03:07:02#26#223#45");

		Medida m300 = new Medida("2025-01-29T00:08:03#33#323#55");		Medida m301 = new Medida("2025-01-29T01:09:03#34#323#55");
		Medida m302 = new Medida("2025-01-29T02:10:03#35#323#55");		Medida m303 = new Medida("2025-01-29T03:11:03#36#323#55");

		Medida m400 = new Medida("2025-01-30T00:12:04#03#423#65");		Medida m401 = new Medida("2025-01-30T01:13:04#04#423#65");
		Medida m402 = new Medida("2025-01-30T02:14:04#05#423#65");		Medida m403 = new Medida("2025-01-30T03:15:04#06#423#65");

		Medida[] datosmedidas = {m100, m101, m102, m103, m200, m201, m202, m203, m300, m301, m302, m303, m400, m401, m402, m403};

		String[] n_est = {"BARAJAS", "CUZCO", "ARGUELLES", "MONCLOA", "SOL", "ATOCHA"};

		boolean _SI = true;
		boolean _NO = false;

		for (int e = 0; e < 6; e++) {
			if (e == 0 ||  e == 3) {
				this.estaciones[e] = new EstacionTipoA(n_est[e], (e%2==0)?_SI:_NO, 50,(e%2==0)?_SI:_NO, (e%2==1)?_SI:_NO);
			} else {
				this.estaciones[e]= new EstacionTipoB(n_est[e], (e%2==0)?_SI:_NO, 50,(e%2==0)?1:2, (e%2==1)?8:16);
			}
		}

		// vacía todos los  diarios
		for (int i = 0; i < this.diarios.length; i++) {
			this.diarios[i] = null;
		}

		// Asigna valores para los 4 primeros diarios
		int ptr_medida = 0;
		LocalDate fecha = LocalDate.of(2025, 1, 27); // Fecha concreta 27

		for (int i = 0; i < 4; i++) {

			this.diarios[i] = new DiarioMedidas("",fecha);

			for (int j = 0; j < 4; j++) { // 4 medidas a cada diario
				this.diarios[i].addMedida(datosmedidas[ptr_medida]);
				ptr_medida++;

			} // end for bucle medidas

			fecha = fecha.plusDays(1L);
		} // end for bucle diarios

	}  // end public void init_data

	public Estacion[] getEstaciones() {return this.estaciones;}
	public DiarioMedidas[] getDiarios() {return this.diarios;}
	public Medida[] getMedidas() {return this.medidas;}

	public void setEstaciones(Estacion[] estaciones) {this.estaciones = estaciones;}
	public void setDiarios(DiarioMedidas[] diarios) {this.diarios = diarios;}
	public void setMedidas(Medida[] medidas) {this.medidas = medidas;}

	
} // end Class AppMain
