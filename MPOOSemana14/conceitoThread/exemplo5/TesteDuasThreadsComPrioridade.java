/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_24: Thread
 */

/*
 * Exemplo 5: Mostra múltiplas threads - utilizando prioridade
 * Faz uso da classe ThreadSimples
*/

package exemplo5;

public class TesteDuasThreadsComPrioridade {
	public static void main (String[] args) {
		ThreadSimples thread1 = new ThreadSimples("Ping");
		ThreadSimples thread2 =new ThreadSimples("Pong");
		
		thread1.setPriority(4);
		thread2.setPriority(6);
		
//		Thread.currentThread().setPriority(1);
		
		thread1.start();
		thread2.start();
		
		System.out.println("Main terminado!");
	}
}