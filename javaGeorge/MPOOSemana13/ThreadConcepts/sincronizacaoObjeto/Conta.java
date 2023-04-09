package sincronizacaoObjeto;

public class Conta {

	public double saldo;

	public Conta() {}
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor){
		this.saldo+=valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
