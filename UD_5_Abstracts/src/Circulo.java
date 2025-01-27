
public class Circulo extends Figura {
	
	int radio;

	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI * this.radio * this.radio;
	}

}
