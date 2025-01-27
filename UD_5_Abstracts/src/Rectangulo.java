
public class Rectangulo extends Figura {

	int base;
	int altura;
	
	public Rectangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {
		return this.base * this.altura;
	}

}
