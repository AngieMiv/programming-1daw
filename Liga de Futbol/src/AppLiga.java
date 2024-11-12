
public class AppLiga {

	public AppLiga() {};

	public static void main(String[] args) {
		
		// Crear Entrenadores
		Entrenador en1  = new Entrenador();
		en1.setNombre("Cholo Simeone");
		en1.setEdad(50);
		en1.setNumtitulos(5);
		
		Entrenador en2 = new Entrenador("Iñigo Perez", 30, 0);
		
		// Crear Jugadores
		Jugador j1 = new Jugador("jugador 1", Puesto.PORTERO, 1, 25, 0);
		Jugador j2 = new Jugador("jugador 2", Puesto.DEFENSA, 2, 25, 0);
		Jugador j3 = new Jugador("jugador 3", Puesto.CENTRAL, 3, 25, 0);
		Jugador j4 = new Jugador("jugador 4", Puesto.DELANTERO, 4, 25, 0);
		
		
		// Crear Equipos
		Equipo eq1 = new Equipo("Atlético de Madrid", "Metropolitano");
		Equipo eq2 = new Equipo("Real Madrid","Santiago Bernabeu");
		Equipo eq3 = new Equipo("Rayo Vallecano", "Estadio de Vallecas");
		
		//definir jugadores a un equipo ¿?
		eq1.jugadores[0] = j1;
		eq2.fichaJugador(j2);
	}

} // end class
