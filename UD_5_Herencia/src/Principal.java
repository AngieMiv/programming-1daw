
public class Principal {

	public Principal() {
		
	}

	public static void main(String[] args) {
//		Primera p1 = new Primera();
//		Segunda s2 = new Segunda();
//		
//		System.out.println("s2.valor_primera = " + s2.getValor_primera());
//		System.out.println("p1.valor_primera = " + p1.getValor_primera());
//		s2.setValor_primera(2);
//		System.out.println("s2.valor_primera = " + s2.getValor_primera());
//		System.out.println("p1.valor_primera = " + p1.getValor_primera()); // no cambia porque "valor" no es static
//		
//		System.out.println("s2.clave = " + s2.getClave());
//		System.out.println("p1.clave = " + p1.getClave());
//
//		s2.setClave(8);
//		System.out.println("s2.clave = " + s2.getClave());
//		System.out.println("p1.clave = " + p1.getClave()); // cambia porque "clave" es static

		Vehiculo v1 = new Vehiculo();
		System.out.print("Vehículo  -> ");
		v1.arrancar();
		
		Coche c1 = new Coche();
		System.out.print("Coche  -> ");
		c1.arrancar();
		
		System.out.print("Coche  -> ");
		c1.arrancar("modo eléctrico");
		
		Vehiculo v2 = new Vehiculo("1234 ABC");
		System.out.print("Vehículo -> ");
		v2.arrancar();
		
		Coche c2 = new Coche("5678 DEF", true);
		c2.arrancar();
	}

}
