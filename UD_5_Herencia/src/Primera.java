
public class Primera {
	
	private int valor_primera;
	private static int clave;
	
	public Primera() {
		System.out.println("Constructor de la superclase primera");
		valor_primera = 1;
		clave = 7;
	}

	public int getValor_primera() {return valor_primera;}
	public void setValor_primera(int valor_primera) {this.valor_primera = valor_primera;}

	public static int getClave() {return clave;}

	public static void setClave(int clave) {Primera.clave = clave;}
	
	

}
