package questao3;

import java.util.ArrayList;

public class Banco {
	private static ArrayList<Conta>contas;
	
	
	
	public static boolean transferir(Conta contaOrigem, Conta contaDestino, double valor) {
		if(contaOrigem!=null && contaDestino!=null) {
			contaOrigem.sacar(valor);
			contaDestino.depositar(valor);
			return true;
		}
		return false;
	}

	public static ArrayList<Conta> getContas() {
		return contas;
	}

	public static void setContas(ArrayList<Conta> contas) {
		Banco.contas = contas;
	}
	
	
	
	
}
