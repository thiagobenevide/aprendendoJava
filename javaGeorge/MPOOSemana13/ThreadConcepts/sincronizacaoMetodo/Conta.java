package sincronizacaoMetodo;

public class Conta {

	public double saldo;

	public Conta() {}
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public synchronized void depositar(double valor){
		this.saldo+=valor;
	}
	
	public synchronized double getSaldo() {
		return saldo;
	}
}
