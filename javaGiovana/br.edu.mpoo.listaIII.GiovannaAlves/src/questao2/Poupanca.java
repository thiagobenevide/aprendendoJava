package questao2;

public class Poupanca extends Conta {

	public Poupanca(int n, double saldo) {
		super(n, saldo);
	}

	public void debito (double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public void rendeJuros(int taxa) {
		this.setSaldo(this.getSaldo() + getSaldo()*taxa/100);
	}
	
}
