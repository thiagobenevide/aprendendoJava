package sistema_bancario;

public class Banco {
	public static boolean depositar(double valor, Conta conta) {
		if(conta!=null) {
			conta.setSaldo(conta.getSaldo()+valor);
			return true;
		}
		return false;
	}
	
	public static boolean sacar(double valor, Conta conta) {
		if(conta!=null && conta.getSaldo()>=valor) {
			conta.setSaldo(conta.getSaldo()-valor);
			return true;
		}
		return false;
	}
	
	
}
