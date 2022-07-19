package questao8;

public abstract class Conta {
	
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public boolean depositar(double valor) {
		this.saldo += valor;
		return true;	
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;	
		}
		return false;	
	}

	public double getSaldo() {
		return saldo;
	}

}
