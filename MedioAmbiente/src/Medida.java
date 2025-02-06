import java.time.LocalDateTime;

public class Medida {

	
	private int temperatura;
	private int presion;
	private int humedad;
	private LocalDateTime fechahora;
	
	public Medida() {
		// TODO Auto-generated constructor stub
	}

	public Medida(String datos) {
		
		String[] campos = datos.split("#");
		this.fechahora = LocalDateTime.parse(campos[0]);
		this.temperatura = Integer.parseInt(campos[1]);
		this.presion = Integer.parseInt(campos[2]);
		this.humedad = Integer.parseInt(campos[3]);
	}
	
	public String toString() {
		return null;
	}
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getPresion() {
		return presion;
	}

	public void setPresion(int presion) {
		this.presion = presion;
	}

	public int getHumedad() {
		return humedad;
	}

	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}

	public LocalDateTime getFechahora() {
		return fechahora;
	}

	public void setFechahora(LocalDateTime fechahora) {
		this.fechahora = fechahora;
	}

	
}
