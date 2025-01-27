
public class Segunda extends Primera {
	
	private String nombre_segunda;

	public Segunda() {
		System.out.println("Constructor de la subclase segunda");
		nombre_segunda = "Subclase";
	}

	public String getNombre_segunda() {return nombre_segunda;}

	public void setNombre_segunda(String nombre_segunda) {this.nombre_segunda = nombre_segunda;}	

}
