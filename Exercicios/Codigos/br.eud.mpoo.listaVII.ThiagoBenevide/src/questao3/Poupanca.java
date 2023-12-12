package questao3;

public class Poupanca extends Conta{
	private static final int dv = 1;
	
	public void renderJuros(double taxa) {
		setSaldo(getSaldo()+(getSaldo()*taxa));
	}

	public static int getDv() {
		return dv;
	}
	
	
	
	
}
