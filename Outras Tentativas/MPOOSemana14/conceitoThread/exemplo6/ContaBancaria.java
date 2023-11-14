/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_24: Thread
 */

// Exemplo 6: Sincronização de Threads

package exemplo6;

public class ContaBancaria {
	private int numeroConta;
	private double saldoAtual;
	
	public ContaBancaria (int numero, double depositoInicial){
		numeroConta+=numero;
		saldoAtual=depositoInicial;
	}
	
	public synchronized double getSaldo() {
		return saldoAtual;
	}
	
	public synchronized void deposito (double valor) {
		saldoAtual+=valor;
	}
}
