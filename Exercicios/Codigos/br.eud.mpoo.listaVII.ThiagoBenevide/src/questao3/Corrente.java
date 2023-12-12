package questao3;

public class Corrente extends Conta{
	
	public void correrJuros(double taxa) {
		setSaldo(getSaldo()- (getSaldo()*taxa));
	}
	
	
	
}
