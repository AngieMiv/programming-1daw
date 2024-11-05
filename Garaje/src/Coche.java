
public class Coche {

	// -- atributos
	
	private String marca = "???";		// valor por defecto será este
	public String matricula;			
	private int motor; 					
	public String color;				
	private boolean radio = false;		// radio si/no

	//  -- métodos

	public Coche(){		// Constructor sin args
		//inicialicación por defecto
	}

	public Coche(String _marca, String _matricula, int _motor, String _color, boolean _radio){	// Constructor con args
		this.marca = _marca;
		this.matricula = _matricula;
		this.motor = _motor;
		this.color = _color;
		this.radio = _radio;
	}
	
	public Coche(String _matricula, int _motor, String _color, boolean _radio){	// Otro constructor con args
		this.matricula = _matricula;
		this.motor = _motor;
		this.color = _color;
		this.radio = _radio;
	}

	/*
	 *  cuando dentro del código de la clase, quiero que me retorne el valor de algo,
	 *  utiliza el atributo de este objeto con "this.tal"
	 */ 
	
	// -- crear los GETTERS
	
	public String getMarca() {
		return this.marca;
	}
	
	public int getMotor(){
		return this.motor;
	}
	
	public boolean getRadio() {
		return this.radio;
	}
	
	// -- CREAR LOS SETTERS
	
	public void setMarca(String marca) {
		this.marca = marca;
	};
	public void setMotor(int motor) {
		this.motor = motor;
	}
	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	// -- método 2 para imprimir ficha del coche 

	public void fichaTecnica() {
		System.out.println("\nFICHA AUTOMÓVIL");
		System.out.println("-------------------");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Motor: " + this.getMotor()); // se podría utilizar this.motor bc estoy dentro de la clase
		System.out.println("Color: " + this.color);
		System.out.println("Tiene radio: " + this.getRadio());
		System.out.println("-------------------\n");
	}

}
