
public class CuentaBancaria {

	String cuenta;
	float saldo;

	public CuentaBancaria(String cuenta, float saldo) {
		this.cuenta = cuenta;
		this.saldo = saldo;
	}

	// getters
	public String getCuenta() {return cuenta;}
	public float getSaldo() {return saldo;}

	// setters
	public void setCuenta(String cuenta) {this.cuenta = cuenta;}
	public void setSaldo(float saldo) {this.saldo = saldo;}

	public boolean ingresaCuenta(float cantidad) {
		boolean operacion = false;
		if(cantidad > 0) {
			this.saldo = this.saldo + cantidad;
			operacion = true;
		}
		return operacion;
	}

	public boolean retirarSaldo(float cantidad) {
		boolean operacion=false;
		if (cantidad < 0) {
			this.saldo = this.saldo - cantidad;
			operacion = true;
		}
		return operacion;
	}

	public boolean enviaTransferencia(CuentaBancaria cuentaDestino, float cantidad) {
		boolean resultado = false;
		if ((this.saldo >= cantidad) && (cantidad >0)) {
			resultado = this.retiraDeCuenta(cantidad);
			if (resultado) {
				resultado = cuentaDestino.ingresaEnCuenta(cantidad);
				if (!resultado) {
					resultado =this.ingresaCuenta(cantidad);
				}//!resultado
			}//resultado
		}//(this.Saldo >= cantidad )
		return resultado;

	}//class

}

