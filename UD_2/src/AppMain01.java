import java.util.*;

//import java.util.Scanner;
//import java.util.Random;

public class AppMain01 {

	public static void main(String[] args) {
		AppMain01 a = new AppMain01();
		a.run();
	}
	
	/*-----------------* Método donde colocar todos los ejercicios *-----------------*/
	
	public void run() { /*  Insertar aquí las llamadas a los ejercicios que se vayan implementando */
				
		System.out.println("Inicio de la aplicación\n");
		
		//ej201();
		//ej202();
		//ej210();
		//ej211();
		//ej212();
		//ej213();
		//ej214();
		//ej215();
		//ej216();
		//ej217();
		ej218();
		//ej220(); // fx
		
		System.out.println("\nFin de la aplicación");
		
	}

	
	/*-------------------** Lista de ejercicios resueltos **-------------------------*/
	
	
		public void ej201() { /**Averiguar tipo de triángulo pidiendo 3 lados: a, b, c.**/
		
		System.out.println("Averigua qué tipo de triángulo es ingresando los lados");
		
		Scanner sc = new Scanner(System.in);
		
		String str = "Dime el lado ";
		System.out.println(str + "a:");
		double a = sc.nextDouble();
		System.out.println(str + "b:");
		double b = sc.nextDouble();
		System.out.println(str + "c:");
		double c = sc.nextDouble();
		
		if (a == b && b == c && a == c)
			System.out.print("Es un Triángulo Equilátero"); // 3 + 3 + 3
		else if ((a * a + b * b) == c * c)
			System.out.println("Es un Triángulo Rectángulo"); // 3 + 4 + 5
		else if (a == b || b == c || a == c)
			System.out.println("Es un Triángulo Isósceles"); // 3 + 3 + 4
		else
			System.out.println("Es un Triángulo Escaleno"); // 3 + 5 + 7
		
		System.out.println("\nYa sabes qué tipo de triángulo es ^-^");
		
		sc.close();
		}
	
		public void ej202() { /**Algoritmo para pago de viaje de estudios, el director:
			cuánto debe cobrar a cada alumno & cuánto debe pagar a la compañía de viajes.
	 		*de 100 o + alumnos = 65 € por alumno
	 		*de 50 a 99 = 70 € por alumno
	 		*de 30 a 49 = 95 € por alumno
	 		*de menos de 30 = 4000 € total
	 		**/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos alumnos van al viaje?");
		
		int num_alumn = sc.nextInt();
		int a = 65; // euros/alumno si son 100 o más alumno
		int b = 70; // euros/alumno si son de 99-50 alumnos
		int c = 95; // euros/alumno si son de 49-30
		int d = 4000 / num_alumn;
		
		if (num_alumn >= 100) {
			System.out.println("Cada alumno debe pagar " + a + "€");
			System.out.println("El total son " + (num_alumn * a) + "€");
		} else if (num_alumn <= 99 && num_alumn >= 50) {
			System.out.println("Cada alumno debe pagar " + b + "€");
			System.out.println("El total son " + (num_alumn * b) + "€");
		} else if (num_alumn <= 49 && num_alumn >= 30) {
			System.out.println("Cada alumno debe pagar " + c + "€");
			System.out.println("El total son " + (num_alumn * c) + "€");
		} else
		{
			System.out.println("Cada alumno debe pagar " + d + "€");
			System.out.println("El total son " + (num_alumn * d) + "€");
		}
			
		sc.close();
		
	}

		public void ej210() { /**Programa que aplique un descuento a un precio dependiendo
		 						de su valor.
		 						Si precio >= 100 mínimo, se aplica el descuento, si no, no
		 						Descuento: 8% **/
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("¿Cual es el precio?");
			
			double precio = sc.nextDouble();
			
			if (precio >= 100){			// Pregunto por el precio, si es >=100 aplico el 80%
				double descuento = precio * 0.08;
				System.out.println("El descuento es del 8%, precio final: "
				+ (precio - descuento) + "€.");
			} else
				System.out.println("No se puede aplicar descuento.");
			
			sc.close();
		}

		public void ej211() { /**Transforma notas numéricas en texto
		 						Nota entre 0 y 10**/
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingresa la nota, entre 0 y 10");
			
			double nota = sc.nextDouble();
			
			if (nota >=0 && nota <= 10) {
				if (nota >= 9 && nota <= 10)
					System.out.println("Calificación:\nSobresaliente");
				else if (nota >= 6.5 && nota < 9)
					System.out.println("Calificación:\nNotable");
				else if (nota >= 5 && nota < 6.5)
					System.out.println("Calificación:\nSuficiente");
				else if (nota < 5)
					System.out.println("Calificación:\nInsuficiente");
			}
			else {
				System.out.println("El valor de la nota debe ser entre 0 y 10");
			}
			
			sc.close();
		}

		public void ej212() { /**Modificar el 210 para que exista un valor máximo de descuento
		 						si el descuento es de más de X valor, solo se aplica el maximo
		 						también que no acepte números negativos**/

			Scanner sc = new Scanner(System.in);
			
			System.out.println("¿Cual es el precio?");
			
			double precio = sc.nextDouble();
			double maxDescuento = 200;
			
			if (precio >= 100){
				double descuento = precio * 0.08;
				if (descuento >= maxDescuento) {
					System.out.println("Ha llegado al máximo descuento.\n"
							+ "El precio final es: " + (precio - maxDescuento));
				}
				else if (descuento < maxDescuento)
					System.out.println("El descuento es del 8%, precio final: "
				+ (precio - descuento) + "€.");
			} else
				System.out.println("No se puede aplicar descuento.");
			
			sc.close();
		}
		
		public void ej213() { /**A partir de 2 Int, pida una operación de suma, resta, multiplicar
		 						o dividir. Una vez elegida, efectúa el cálculo y lo muestra**/
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("¿Qué operacion quieres realizar? Elige entre "
					+ "sumar, restar, multiplicar, dividir");
			
			String operacion = "";
			operacion = sc.nextLine();
			
			System.out.println("Dame uno de los números enteros (sin coma)");
			int a = sc.nextInt();
			System.out.println("Dame el otro número (sin coma)");
			int b = sc.nextInt();
			
			switch (operacion) {
			case "sumar":
				System.out.println("La suma da: " + (a + b));
				break;
			case "restar":
				System.out.println("La resta da: " + (a - b));
				break;
			case "multiplicar":
				System.out.println("La multiplicación da: " + (a * b));
				break;
			case "dividir":
				System.out.println("La división da: " + (a / b));
				break;
			}
			
			sc.close();
		}
		
		public void ej214() { /**Calcular cuántos días tiene un mes (el mes se representa en num)
								Si se introduce otro número que no sea del 1 al 12,
								hay que decir que se ha introducido un número de mes incorrecto.
								mes 2 = 28 o 29 días
								mes 4, 6, 9, 11 = 30 días
								mes 1, 3, 5, 7, 8, 10, 12 = 31 días **/
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduzca el número de mes (del 1 al 12)");
			
			int mes = sc.nextInt();
			
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("Es un mes de 31 días");
				break;
			case 4, 6, 9, 11:
				System.out.println("Es un mes de 30 días");
				break;
			case 2:
				System.out.println("Puede tener 28 o 29 días");
				break;
			}
			if (mes < 1 || mes > 12)
				System.out.println("Número de mes no válido");
			
			sc.close();	
		}		
	
		public void ej215() { /**Termostato en fx de la temp, diga si es necesario encender el A/C.
							temp >= 21: “Activa el aire acondicionado.”
							temp menos de 21 “Para el aire acondicionado."**/
			
			Scanner sc = new Scanner(System.in);
			System.out.println("¿Qué temperatura hace?");
			
			float temp = sc.nextFloat();
			
			if (temp >= 21)
				System.out.println("Activa el aire acondicionado.");
			else
				System.out.println("Para el aire acondicionado");
			
			sc.close();
		}
		
		public void ej216() { /**Programa que realiza diferentes acciones a partir de un dato leído por el teclado.
							Horario de trabajo es de 9 a 14 && 16 a 19 h.
							A las 14 es la hora de comer, y por tanto es tiempo libre.**/
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduzca la hora (sin los minutos)");
			
			int hora = sc.nextInt();
			
			if (hora >= 0 && hora < 24) {
				if ((hora >= 9 && hora < 14) || hora >= 16 && hora < 19)
					System.out.println("Es hora de trabajar u_u");
				else if (hora == 14)
					System.out.println("Hora de la comida, ñam.");
				else
					System.out.println("¡Tiempo libre!");
			} else 
				System.out.println("Hora no válida.");
			
			sc.close();
		}
		
		public void ej217() { /**Adivinar un número entre 1 y 100.
							Número aleatorio entre 1 y 100, el usuario debe de adivinar el número.
							El programa deberá dar pistas indicando si es mayor, menor si ha acertado.
							Llevar la cuenta del número de intentos.
							Posibilidad de abandonar el juego si el usuario introduce el número 999.
							Incluir mensajes de bienvenida, instrucciones y reglas y de comunicación del resultado.**/
			System.out.println("Welcome! You have to guess a number between 1 and 100."
					+ "\nI´ll count the tries until you get it. I´ll tell you if the number is greater"
					+ ", less, or if you won.\nIf you want to quit, write the number '999'."
					+ "\nLet's begin!");
			
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			int randomNum = random.nextInt(0, 101); // con import java.util.Random
			int tries = 0; // inicializamos a 0, luego vamos incrementando
			int playerNum; // el número que introduce el jugador
			
			do {
				System.out.println("Insert a number between 1 and 100:");
				playerNum = sc.nextInt();
				tries++;
				
				if (playerNum == 999)
					System.out.println("Are you quitting? What a coward.");
				else if (playerNum < 1 || playerNum > 100)
					System.out.println("I've said the number is between 1 and 100...\n");
				else if (playerNum > randomNum) 
					System.out.println("My number is less than yours.\n");
				else if (playerNum < randomNum)
					System.out.println("My number is greater than yours.\n");
			} while (playerNum != randomNum && playerNum != 999); /* mientras que el numero del jugador no sea igual al random
			 									me pides el número, lo asigno, aumento el numero de intentos, y comparo*/
			
			if (playerNum == randomNum)
				System.out.println("You won in " + tries + " try/tries!^-^");
			
			sc.close();			
		}		

		public void ej218() { /**217 diff version: machine guesses the number**/

			System.out.println("Think of a number. I'll print a number for you, "
					+ "and you'll tell me if its less or greater than that number "
					+ "entering the word 'less' or 'greater', respectively.\n"
					+ "I´ll also count my number of tries, and tell you if I"
					+ "get to guess your number. If I guess your number, you have"
					+ "to enter the words 'you won' :)\nalso, you can "
					+ "quit entering the number '999'.");
			String youWon = "you won";
			String greater = "greater";
			String less = "less";
			int min = 0;
			int max = 101;
			final String quit = "999";
			Random random = new Random();
			int randomNum  = random.nextInt(min, max);
			//int less = 0;
			//int greater = 0;
			System.out.println("Is it greater or less than " + randomNum + "?");
			Scanner sc = new Scanner(System.in);
			String symbol = sc.nextLine();
			
			while (!symbol.equals(youWon)) { /*error check range RandomGenerator,
											default int nextInt(int origin, int bound)
											*/
	
				if (symbol.equals("999")) break;
				
				if (min >= max || max <= min) {
		            System.out.println("hmm, something went wrong here. Start over.");
		            break;
				}
				if (symbol.equals(less)) {
					max = randomNum;
					try {
					randomNum = random.nextInt(min, max);
					} catch (Exception e) {
						
						System.out.println("Incoherencia Detectada");
					}
					
					
					System.out.println("Is it greater or less than " + randomNum + "?");
					//symbol = sc.nextLine();
					System.out.println("------------");
					

				} else if (symbol.equals(greater)) {
					min = randomNum;
					
					try {
					randomNum = random.nextInt(min, max);
					} catch (Exception e) {
						
						System.out.println("Incoherencia Detectada");
					}
					System.out.println("Is it greater or less than " + randomNum + "?");
					//symbol = sc.nextLine();
					System.out.println("oaoaoaoa");
				}
				
				symbol = sc.nextLine();
			
			
				} // endWhile
			/*
				switch(symbol) {
				case quit:
					System.out.println("you're quitting, ok ok");
					break;
				}
			*/
			
	
			if (symbol.equals(youWon)) {
				System.out.println("I won!");
			}
			
			sc.close();	
			
		}
		
		public void ej220() { /**3 funciones que devuelvan min, max y media de un array de ints**/
			int [] numeros = {1, 4, 7, 4, 6, -2, 10};
			int minimo = minimo(numeros);
			int maximo = maximo(numeros);
			System.out.println("El mínimo es " + minimo);
			System.out.println("El maximo es " + maximo);
			//System.out.println("La media es " + media);
		}
		
	
		public static int minimo (int[] valores) {
			int min = valores[0];
			for (int i = 0; i < valores.length; i++) {
				int valor = valores[i];
				if (min > valor) {
					min = valor;
				}
			}
			return min;
		}
		
		
		public static int maximo (int[] valores) {
			int max = valores[0];
			for (int i = 0; i < valores.length; i++) {
				int valor = valores[i];
				if (max < valor) {
					max = valor;
				}
			}
			return max;
		}
		
		
		public static int media (int[] valores) {
			int med = valores[0];
			
			/*************/
			return med;
		}
	}













