import tablero.Tablero;

public class AppTablero {

	public static void main(String[] args) {
		
		int _fila;
		int _columna;
		
		Tablero miTablero = new Tablero(5,5,true);
		
		miTablero.mostrarTablero();
		miTablero.leeMovimiento();
		_fila = miTablero.getFila();
		_columna = miTablero.getColumna();
		miTablero.marcarCelda(_fila, _columna, 'X');
		miTablero.mostrarTablero();
		
		
		prt("Aplicación terminada");
		
		
	} // main

	public static void prt(String s) {
		System.out.println(s);
	}
	
} // Class Juego