package questao4;

public class Banco {

	public static boolean depositar(double valor, Conta conta) {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Agência : " + conta.getAgencia());
		System.out.println("Número da Conta: " + conta.getNumero());
		System.out.println("Saldo Anterior: " + conta.getSaldo());
		conta.setSaldo(conta.getSaldo() + valor);
		System.out.println("----------------- Deposito efetuado com Sucesso-------------------");
		System.out.println("Agência : " + conta.getAgencia());
		System.out.println("Número da Conta: " + conta.getNumero());
		System.out.println("Saldo Atual: " + conta.getSaldo());
		System.out.println("-----------------------------------------------------------------");
		return true;
		}
	
	public static boolean sacar(double valor, Conta conta) {
		if (valor <= conta.getSaldo()) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("Agência : " + conta.getAgencia());
			System.out.println("Número da Conta: " + conta.getNumero());
			System.out.println("Saldo Anterior: " + conta.getSaldo());
			System.out.println("----------------- Saque efetuado com Sucesso-------------------");
			System.out.println("Agência : " + conta.getAgencia());
			System.out.println("Número da Conta: " + conta.getNumero());
			System.out.println("Saldo Atual: " + conta.getSaldo());
			conta.setSaldo(conta.getSaldo() - valor);
			System.out.println("---------------------------------------------------------------");
			return true;
		}else {
			System.out.println("----------Falha ao efetuar saque----------");

		}
		return false;
		
	}
	public static boolean transferir(double valor, Conta contaOrigem, Conta contaDestino) {
		if(Banco.sacar(valor, contaOrigem) == true) {
			Banco.depositar(valor, contaDestino);
			return true;
		}
		return false;
	}
}
