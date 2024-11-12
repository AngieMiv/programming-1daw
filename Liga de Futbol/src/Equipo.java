import java.util.Arrays;

public class Equipo {
		
	private final int totalJugadores = 20;
	private final int totalTecnicos = 2;
	
	private String nombre;
	private String estadio;
	public Jugador[] jugadores = new Jugador [totalJugadores];
	private Entrenador[] entrenadores = new Entrenador[totalTecnicos];
		
	private int ultimoJug = 0;
	private int ultimoTec = 0;
		
		public Equipo(String nombre, String estadio) {	
			this.nombre = nombre;
			this.estadio = estadio;		
		}
		
		public Equipo(String nombre, String estadio, Jugador[] plantilla, Entrenador[] cuerpoTecnico) {	
			this.nombre = nombre;
			this.estadio = estadio;
			this.jugadores = plantilla;
			this.entrenadores = cuerpoTecnico;	
		}
		
		// -- getters
		public String isNombre() {return this.nombre;};
		public String isEstadio() {return this.estadio;};
		public Jugador[] getJugadores() {return this.jugadores;};
		public Entrenador[] getEntrenadores() {return this.entrenadores;};

		// -- setters
		public void setNombre(String nombre) {this.nombre = nombre;};
		public void setEstadio(String estadio) {this.estadio = estadio;};
		public void setJugadores(Jugador[] jugadores) {this.jugadores = jugadores;};
		public void setEntrenadores(Entrenador[] entrenadores) {this.entrenadores = entrenadores;};
		
	}

	
}

