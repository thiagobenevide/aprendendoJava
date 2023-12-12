package questao3;

public abstract class Conta {
	private double saldo;
	
	public boolean depositar(double valor) {
		saldo = saldo + valor;
		return true;
			
	}
	
	public boolean sacar(double valor) {
		if(valor<saldo) {
			saldo = saldo-valor;
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
