
public abstract class Vehiculo {

	private String color;
	private byte NumRuedas;
	private short Cilindrada;
	private short Potencia;
	
	public Vehiculo() {}
	
	public Vehiculo (String color, short Cilindrada, short Potencia) {
		this.color = color;
		this.Cilindrada = Cilindrada;
		this.Potencia = Potencia;
	}
	  
	public Vehiculo(String color, short Cilindrada, short Potencia, byte NumEjes) {
		this.color = color;
		this.Cilindrada = Cilindrada;
		this.Potencia = Potencia;
	}
		 
	// Métodos abstractos de la clase
	public abstract void arrancar();
	public abstract double impuesto();
	
	// Getters y Setters
	public String getColor() {return this.color;}
	public byte getNumRuedas() {return this.NumRuedas;}
	public short getCilindrada() {return this.Cilindrada;}
	public short getPotencia() {return this.Potencia;}
	public void setColor(String color) {this.color = color;}
	public void setNumRuedas(byte numRuedas) {NumRuedas = numRuedas;}
	public void setCilindrada(short cilindrada) {Cilindrada = cilindrada;}
	public void setPotencia(short potencia) {Potencia = potencia;}
}
