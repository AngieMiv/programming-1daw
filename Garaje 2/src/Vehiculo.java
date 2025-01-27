
public abstract class Vehiculo {

	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Vehiculo() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor SuperClase");
	}
	// Métodos abstractos de la clase
	public abstract void arrancar();
}
