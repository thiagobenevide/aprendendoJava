package questao8;

public class Poupanca extends Conta {
	
	private static final int dv = 1; 

	public Poupanca(double saldo) {
		super(saldo);
	}

	public void renderJuros(double taxa) {
		this.depositar(dv/taxa);
	}
}
