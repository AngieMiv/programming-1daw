/**
 * Clase Coche			02/11/2023
 * @author root
 *
 */
public class Coche {
							// Visibildad
	public String marca;	// +
	String modelo;			// #
	private int fechaMat;	// -
	int litDeposito=60;		// #
	String matricula="";	// #
	
	
	// -- Constructor por defecto
	public Coche() {
			super();
			// TODO Auto-generated constructor stub

	}

	/**
	 * Constructor de coche con todos los parámetros
	 * @param marca	Marca del vehículo
	 * @param modelo Modelo del vehículo
	 * @param fechaMat Fecha de matriculación
	 * @param litDeposito Litros de capacidad del diposito
	 */
	public Coche(String marca, String modelo, int fechaMat, int litDeposito) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.fechaMat = fechaMat;
		this.litDeposito = litDeposito;
	}
	
	public Coche(String ma, String mo) {
		
		this.marca = ma;
		this.modelo = mo;
	}

	public Coche(String marca, String modelo, int fechaMat, int litDeposito, String _matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.fechaMat = fechaMat;
		this.litDeposito = litDeposito;
		this.matricula = _matricula;
	}

	// -- Getters y Setters para los atributos privados y no privados
	//----------------------------------------------------------------
	public int getFechaMat() { return fechaMat;}
	public void setFechaMat(int _fechaMat) {this.fechaMat = _fechaMat;}
	
	public String getMarca() {return marca;	}
	public void setMarca(String marca) {this.marca = marca;	}

	public String getModelo() {return modelo;}
	public void setModelo(String modelo) {this.modelo = modelo;	}

	public int getLitDeposito() {return litDeposito;}
	public void setLitDeposito(int litDeposito) {this.litDeposito = litDeposito;}

	// -- Método adHoc que muestra por panatalla la marca y el modelo
	public void soy() {
		System.out.println("Yo soy un "+ marca + " "+modelo);
	}

	// -- Método toString que devuelve un string en formato csv con todos los atributos 
	// -- del objeto
	
	public String toString() {
		
		String str =marca + ", " + modelo + ", "+ litDeposito + ", " + fechaMat;
		return str;
	}
	
	

}
