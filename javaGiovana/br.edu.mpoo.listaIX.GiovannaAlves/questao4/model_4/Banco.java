package model_4;

public class Banco {

	public static boolean transferir(double valor, Conta contaOrigem, Conta contaDestino) throws ContaException, OperacaoException {
		
		try {
			if (validarContaDestino(contaDestino) && validarContaOrigem(contaOrigem)) {
				if (valor <= contaOrigem.getSaldo()) {
					try {
						sacar(valor, contaOrigem);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				else {
					throw new OperacaoException("Valor é maior do que o saldo disponível");
				}
				try {
					depositar(valor, contaDestino);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return true;
			}
			
			return false;
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		return false;
	}
	
	public static boolean validarContaOrigem(Conta conta) throws ContaException {
		try {
			if (conta != null) {		
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			throw new ContaException("Conta Origem inválida");
		}
	}
	
	public static boolean validarContaDestino(Conta conta) throws ContaException {
		
		try {
			if (conta != null) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ContaException("Conta Destino inválida");
		}
		
		return false;
	}
	
	public static boolean depositar(double valor, Conta conta) throws OperacaoException{
		
		try {
			System.out.println("-------------------------------");
			System.out.println("Saldo anterior: " + conta.getSaldo());
			conta.setSaldo(conta.getSaldo() + valor);
			System.out.println("Saldo atual: " + conta.getSaldo());
			System.out.println("-------------------------------");
			return true;
			
		} catch (Exception e) {
			
			throw new OperacaoException("Erro ao efetuar depósito");
			
		}
	}
	
	public static boolean sacar(double valor, Conta conta) throws OperacaoException {
		
		try {
		
			if (valor <= conta.getSaldo()) {
				try {
					System.out.println("Saldo anterior: " + conta.getSaldo());
					conta.setSaldo(conta.getSaldo() - valor);
					System.out.println("Saldo atual: " + conta.getSaldo());
					return true;
					
				} catch (Exception e) {
					e.printStackTrace();
					throw new OperacaoException("Erro ao efetuar o saque");
				}
			}
			
			return false;
			
		} catch (Exception e) {
			e.getStackTrace();
			throw new OperacaoException("Erro ao efetuar o saque");
			}
		}


}

