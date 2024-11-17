
public class JavaTips {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3 = 3; 
		final int n4= 4;

		// Pre incremento y Post incremento			 
		n1 = 2;
		n2 = 0;

		n1 = ++n2  + n1 ;
		System.out.println("Numero 1:" +  n1 );
		System.out.println("Numero 2:" +  n2);
		System.out.println("Triple :" +  triple(n1));
		barra (10);
		n1 = 2;
		n2 = 0;
		n1 = n2++  + n1 ;
		System.out.println("Numero 1:" +  n1 );
		System.out.println("Numero 2:" +  n2 );
		System.out.println("Triple :" +  triple(n1));

		barra(10);


		/*
 	visibilidad de Variables y constantes
		 */
		
		System.out.println("numero 3:" + n3);
		//n4 = n4 +1; // no es posible modificar ni reasignar una variable final
		System.out.println("numero 4:" + n4);

	}


	// Método que devuelve valores --> Tipo del objeto que se devuelve
	public static int triple(int a) {	
		// a = a + n3;		// n3 no es visible dentro del método
		return a*3;
	}

	// Método que no devuelve valores --> void
	public static void barra(int a) {
		// No devuelve ningún valor, aunque si puede tener salida por pantalla
		for(int i = 0; i < a; i++) {
			System.out.print("*");
		}
		System.out.println();
	}


}
