package arrays4;

public class Banco {

	public static boolean depositar(double valor, Conta conta) {
		conta.setSaldo(valor);
		return true;
	}
	
	public static boolean sacar(double valor, Conta conta) {
		if (conta.getSaldo() >= valor) {
			conta.setSaldo(-valor);
			return true;
			}
		return false;
	}
	
}
