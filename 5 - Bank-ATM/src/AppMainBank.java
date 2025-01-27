import java.time.LocalDateTime;
import menu.Menu;

public class AppMainBank {
	
	// Cuentas ejemplo
	public CuentaBancaria cEjemplo[] = {
			new CuentaBancaria ("ES982034624802554266201", 2501),
			new CuentaBancaria ("ES982034624802554266201", 2501),
			new CuentaBancaria ("ES982034624802554266201", 2501),
			new CuentaBancaria ("ES982034624802554266201", 2501)
	};
	
	private float importe;					// Obj. para el importe
	private LocalDateTime fecha;			// Obj. para la fecha
	private CuentaBancaria cuentaOrigen;	// Cuenta de origen
	private CuentaBancaria cuentaDestino;	// Cuenta de destino 
	

	public AppMainBank() {}
	
	public static void main(String[] args) {
		AppMainBank a = new AppMainBank();
		a.run();
	}
	
	public void run() {
		
		//Menu
		//----------------------------------------------------------
		String[] op_menu1 = {"1. Saldo de cuenta", "2. Información de cuenta",
				"3. Retirar dinero", "4. Ingresar dinero"};
		
		boolean appSalir = false;				
		Menu m1 = new Menu("¿Qué desea hacer? Elija una opción: ", op_menu1);	
		while (!appSalir) {
					
			m1.mostrar();
			int opcElegida = m1.seleccionaOpc();
			
			// Ejecutar la opcción elegida		
			switch(opcElegida) {
			case 1:
				this.cuentaOrigen = this.eligeCuenta("Origen");
				this.cuentaOrigen = this.eligeCuenta("Origen");
				result = cuentaOrigen.ingresaEnCuenta(importe);
				if (result) {
					LocalDateTime t = LocalDateTime.now();
					Movimiento m = new Movimiento(cuentaOrigen, null, importe, t, "INGRESO");
					result = miCajero.registraMov(m);
					System.out.println("Operación realizada con éxito");
				} else {
					System.out.println("Error al efectuar la operación.");
				}
				break;
			case 2:
				//pideDatos(Cajero.tipoOperacion.INGRESO);
				//resultado = miCajero.realizaOperacion(Cajero.tipoOperacion.Ingreso, cuentaOrigen, null)
				break;
			case 3:
				this.cuentaOrigen = this.eligeCuenta("Origen");
				this.cuentaDestino = this.eligeCuenta("Destino");
				result = cuentaOrigen.enviaTransferencia(cuentaDestino, importe);
				if (result) {
					LocalDateTime t = LocalDateTime.now();
					Movimiento m = new Movimiento(cuentaOrigen, null, importe, t, "TRANSFERENCIA");
					result = miCajero.registraMov(m);
					System.out.println("Operación realizada con éxito");
				} else {
					System.out.println("Error al efectuar la operación.");
				}
				break;
			
			}	//switch
			
		}	//while
		
	}	//run
	
}	//class