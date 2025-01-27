
public abstract class Figura {

	private String color;
	private int categoría;
	
	public Figura(String color) {
		this.color = color;
	}
	
	public void escala(int valor) {
		categoría = categoría * valor;
	}
	
	public abstract double area();
	
} // end public abstract class Figura

