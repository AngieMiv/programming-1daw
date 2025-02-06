import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class Medida {

	
	private int temperatura;	// Valor en grados de la temperatura
	private int presion;		// Valor presión en milibares 100-1200
	private int humedad;		// Porcentaje humedad 0-100
	private LocalDateTime fechahora;	// Código-Nombre de la estación
	
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
	
	/* 
	 * A1. - Implementa un constructor adicional. El string datosMedida que se pasa
	 * como parámetro vendrá siempre formateado con la siguiente estructura:
	 * 		2024-12-18T00:00:00#14#722#63#12
	 * 	public Medida(String datosMedida) {
		return null;
	}
	 */

	// getters
	public LocalDateTime getFechahora() {return fechahora;}
	public int getTemperatura() {return temperatura;}
	public int getPresion() {return presion;}
	public int getHumedad() {return humedad;}

	// setters
	public void setFechahora(LocalDateTime fechahora) {this.fechahora = fechahora;}
	public void setTemperatura(int temperatura) {this.temperatura = temperatura;}
	public void setPresion(int presion) {this.presion = presion;}
	public void setHumedad(int humedad) {this.humedad = humedad;}
	
	// listar medidas:
	public void listaMedidas(String datos) {
		String[] campos = datos.split("#");
		this.fechahora = LocalDateTime.parse(campos[0]);
		this.temperatura = Integer.parseInt(campos[1]);
		this.presion = Integer.parseInt(campos[2]);
		this.humedad = Integer.parseInt(campos[3]);
		System.out.println(campos);
	}

}

