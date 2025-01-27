/*
 * Array manipulation and algorithm
 * Angie MIV
 */

import java.util.Scanner;

public class AppMainUD4 {

	public static void main(String[] args) {
		AppMainUD4 a = new AppMainUD4();
		a.run();
	}

	/*-----------------* * *-----------------*/
	public void run() { /*  Insert here the exercise callings to implement */

		System.out.println("Starting App...\n");

		//ej401();
		//ej402();
		//ej403();
		//ej404();
		ej405();

		System.out.print("\n\n...End of App");

	}

	/*-------------------** Solved Exercises **-------------------------*/

	public void ej401() {  /*
	 * create a program that creates an array of 5x5 that stores numbers from 1 to
	 * 25 and then shows the array in screen
	 */
		int colNum = 5;
		int rowNum = 5;
		int[][] matrix5 = new int[colNum][rowNum];
		int count = 1;

		for (int i = 0; i < colNum; i++) {
			System.out.println();

			for (int j = 0; j < rowNum; j++) {

				matrix5[i][j] = count;
				if (count < 10) {
					System.out.print("[ " + count + "  ]");

				} else {
					System.out.print("[ " + count + " ]");
				}

				count++;
			}
		}

	}

	public void ej402() { 	/*
	 * Create a program that initializes an array of 10×10 and insert the values of the
	 * multiplication table from 1 times table to 10 times table. Each table in 1 row. 
	 * Then, it shows the matrix in screen.
	 */
		int colNum = 10;
		int rowNum = 11;
		int[][] arrayTimesTable = new int[colNum][rowNum];
		int count = 1;
		int multiplier = 1;

		while (multiplier < 11) {
			int i = 0;
			//int j = 0;
			for (i = 0; i < rowNum - 1; i++) {
				for (int j = 1; j <= colNum; j++) {
					arrayTimesTable[i][j] = count;
					count = j * multiplier;
					System.out.print("[ " + count + " ]");
					count++;
				}
			System.out.println();
			multiplier++;
			}
		}
	}
	
	public void ej403() {	/* Create a program that generates an NxM array (size entered by the user)
		* and fills it with NxM values (also entered by the user).
		* Then, the program should traverse the array and, at the end,
		* display on the screen how many values are greater than zero,
		* how many are less than zero,
		* and how many are equal to zero.        
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of columns:");
		int nCol = sc.nextInt();
		System.out.print("Enter the number of rows:");
		int nRow = sc.nextInt();
		System.out.println("Columns: " + nCol + ", Rows: " + nRow + ".");
		
		// --- we create the array the user wanted
		int[][] userArray = new int[nCol][nRow];
		//int allNumbers = nCol * nRow;
		//System.out.println("Total of numbers: "+ allNumbers);
		
		// --- now, we ask for the numbers they want in the array and we count how many values are >, < or = to 0
		System.out.println("Enter the numbers you want to be displayed in your array of " + nCol + "x" + nRow + ".");
		
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
                System.out.print("Enter  value for [" + i + "][" + j + "]: ");
                userArray[i][j] = sc.nextInt();
            }
        }
        
        // --- printing the array
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
            	int v = userArray[i][j];
            	System.out.print(v + ", ");            	
            }
            System.out.println();
        }
        
        // counting the <, > and =
		int negatives = 0, positives = 0, zeros = 0;
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
            	int v = userArray[i][j];
                if (v < 0) {
                	negatives++;
                } else if(v > 0) {
                	positives++;
                } else if(v == 0) {
                	zeros++;
                }
            }
        }
        
        System.out.println("Number of numbers less than 0 = " + negatives);
        System.out.println("Number of numbers more than 0 = " + positives);
        System.out.println("Number of numbers equal to 0 = " + zeros);
                
        sc.close();
		
	} // end 403
	
	public void ej404() {	/* We need to create a program to store the grades of 4 students
		* (named “Student 1,” “Student 2,” etc.)and 5 subjects. The user will input the grades,
		* and the program will display the minimum, maximum, and average grade for each student.
		*/
		String[] nombresAlumnos = {"Alumno 1", "Alumno 2", "Alumno 3", "Alumno 4"};
		String[] nombresAsignaturas = {"Asignatura A", "Asignatura B", "Asignatura C", "Asignatura D", "Asignatura E"};
		double[][] notas = new double[nombresAlumnos.length][nombresAsignaturas.length];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < nombresAlumnos.length; i++) {
			String alumno = nombresAlumnos[i];
			for (int j = 0; j < nombresAsignaturas.length; j++) {
				String asignatura = nombresAsignaturas[j];
				System.out.println("Introduce la nota de " + alumno + " de la asignatura " + asignatura + ": ");
				notas[i][j] = sc.nextDouble();
			}
		}
		System.out.println("");
	
		for(int i = 0; i < nombresAlumnos.length; i++) {
			String alumno = nombresAlumnos[i];
			double[] notasAlumno = notas[i];
			double notaMedia = media(notasAlumno);
			double notaMinima = minimo(notasAlumno);
			double notaMaxima = maximo(notasAlumno);
			System.out.println(alumno + ": Media: " + notaMedia + ", Minima: " + notaMinima + ", Maxima: " + notaMaxima);
		}
		sc.close();
	}
	
	public static void printArray(double [][] valores) {
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
            	double v = valores[i][j];
            	System.out.print(v + ", ");            	
            }
            System.out.println();
        }   
	}
	public static double minimo (double[] valores) {
		double min = valores[0];
		for (int i = 0; i < valores.length; i++) {
			double valor = valores[i];
			if (min > valor) {
				min = valor;
			}
		}
		return min;
	}
	public static double maximo (double[] valores) {
		double max = valores[0];
		for (int i = 0; i < valores.length; i++) {
			double valor = valores[i];
			if (max < valor) {
				max = valor;
			}
		}
		return max;
	}
	public static double media (double[] valores) {
		double total = 0;
		int i = 0;
		while (i < valores.length) {
			total = total + valores[i];
			i++;
		}
		double med = total / valores.length;
		return med;
	}
	
	public void ej405() {	/*We need to create a program to record the salaries of men and women in a company
		* and determine if there is a gender pay gap. The program will ask the user to input data for N different people
		* (the value of N is also entered by the user). For each person, the program will ask for their gender
		* (0 for male and 1 for female) and their salary. This information must be stored in a single matrix.
		* Finally, the program will display the average salary for each gender.
	*/
		
	}


}

