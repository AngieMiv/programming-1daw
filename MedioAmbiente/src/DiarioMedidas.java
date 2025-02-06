import java.time.LocalDate;

public class DiarioMedidas {

	private final int TOT_MED=24;
	private String estacion;
	private LocalDate fecha;
	public Medida[] medidas = new Medida[TOT_MED];
	private int pos=0;
	public DiarioMedidas() {
		//this.mediciones = = new Medida[TOT_MED];
		initMedidas();

	}

	private void initMedidas() {
		for (int i=0; i<TOT_MED;i++) {
			this.medidas[i]=null;
		}
	}
	public DiarioMedidas(String nombre, LocalDate fecha) {
		this.estacion= nombre;
		this.fecha = fecha;
		initMedidas();
	}
	/**
	 * Añade una medida, comprobando que pertenece a la fecha del diario
	 * y no se repite.
	 * @param m Medida a insertar
	 * @return true : operación correcta, false : error
	 */
	public boolean addMedida(Medida m) {
		boolean result = false;
		if (this.fecha.equals(m.getFechahora().toLocalDate())) {
			this.medidas[pos] = m;
			pos = (pos+1) % TOT_MED;
			result = true;
		}
		else
		{
			result=false;
		}
		return result;	
	}
	/**
	 * Devuelve el total de medidas registradas en un diario de medidas
	 * @return número de medidas
	 */
	public int getTotalMedidas() {
		int result = 0;
		for (int i=0; i< this.medidas.length;i++) {
			if (this.medidas[i]!= null) result ++;
		}
		return result;
	}
	public String getEstacion() {		return estacion;	}
	public void setEstacion(String estacion) {		this.estacion = estacion;	}
	public LocalDate getFecha() {		return fecha;	}
	public void setFecha(LocalDate fecha) {		this.fecha = fecha;	}
	public int getTOT_MED() {		return TOT_MED;	}

}
