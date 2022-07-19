package questao8;

public class Corrente extends Conta {

	public Corrente(double saldo) {
		super(saldo);
	}

	public void correrJuros(double taxa) {
		this.sacar(taxa);
	}
}
