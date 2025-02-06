import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class DiarioMedidas {

	private final int TOT_MED = 24;	// Num máximo de medidas de una estación
	private String estacion;		// Nombre de la estación meteorológica
	private LocalDate fecha;		// Fecha de la recogida de datos: yyy-mm-dd
	private Medida[] mediciones = new Medida[TOT_MED];	// Medidas recogidas
	
	private int pos = 0; // (from Estación: // atributo interno, sin getters/setters)
	
	public DiarioMedidas() {
		//this.mediciones == new Medida[TOT_MED];
		initMedidas();
	}

	private void initMedidas() {
		for (int i = 0; i < TOT_MED; i++) {
			this.mediciones[i] = null;
		}
	}
	
	public DiarioMedidas(String nombre, LocalDate fecha) {
		this.estacion = nombre;
		this.fecha = fecha;
		initMedidas();
	}
	
	/*
	 * B1. - Implementa el método boolean AddMedida (Medida _medida), que añade un registro Medida al diario.
	 * Deberá descargar la Medida que se pasa si su marca temporal no coincide con la fecha para la que se crea el diario.
	 * Tampoco se permitirán fechas que se encuentren en el mismo instante de tiempo.
	 * Retornará true si consigue añadir la medida y false en caso contrario.
	 * *
	 * *
	 * Añade una medida, comprobando que pertenece a la fecha del diario
	 * y no se repite.
	 * @param m Medida a insertar
	 * @return true : operación correcta, false : error
	 */
	public boolean addMedida(Medida m) {
		boolean result = false;
		if (this.fecha.equals(m.getFechahora().toLocalDate())) {
			this.mediciones[pos] = m;
			pos = (pos + 1) % TOT_MED;
			result = true;
		} else {
			result = false;
		}
		return result;	
	}
	
	// getters
	public String getEstacion() {return this.estacion;}
	public LocalDate getFecha() {return this.fecha;}
	public int getTOT_MED() {return this.TOT_MED;}
	
	// setters
	public void setEstacion(String estacion) {this.estacion = estacion;}
	public void setFecha(LocalDate fecha) {this.fecha = fecha;}
	
	

//	final static DateTimeFormatter ISO_FORMATTER = DateTimeFormatter.ISO_DATE_TIME;
//	LocalDate ldt = this.fecha;
//	public String formattedDateTime(DiarioMedidas diarios) {
//		String str = ldt.format(ISO_FORMATTER);
//		return str;
//	}


}

// un diario de medidas puede recoger hasta 24 medidas
