package questao8;

import java.util.ArrayList;


public class Banco {

	private static ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public static void Base() {
		
		contas = new ArrayList<Conta>();
	}
	
	public static boolean adicionarConta(Conta conta) {
		if(conta == null) {
			return false;
		}
		for (int i=0; i < contas.size(); i++)
			if(contas.get(i).equals(conta))
				return false;
		System.out.println("Conta adicionada com sucesso!");
		contas.add(conta);
		return true;
	}
	
	public static Conta buscarConta(Conta conta) {
		for (Conta contasCurrent: contas)
			if(contasCurrent.equals(conta)) {
				return contasCurrent;
			}
		return null;
	}
	
	
	public static boolean tranferir(Conta contaSaida, Conta contaEntrada, int valor) {
		if (buscarConta(contaSaida) != null && buscarConta(contaEntrada) != null){
			if (contaSaida.sacar(valor) == true) {
				contaEntrada.depositar(valor);
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}
