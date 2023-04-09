/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_24: Thread
 */

// Exemplo 5: Base para classe TesteDuasThreadsComPrioridade

package exemplo5;

public class ThreadSimples extends Thread {
	private long tempoEspera;
	public ThreadSimples(String str) {
		super(str);
	}
	public void run() {
		int a;
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
			tempoEspera=(long)(Math.random() * 4000);
//			tempoEspera=(long)(500);
			System.err.println("Nome: " + getName() + " - criada" 
					+ "\t Prioridade atual: " + getPriority() 
					+ " \t Espera: " + tempoEspera  
					+ "\t Valor de i: " + i
			);
			a=getPriority();
			if (a>1)
				setPriority(a-1);
//			
			try {
				sleep(tempoEspera);
				
			}
			catch (InterruptedException e) {}
		}
		
		System.out.println("TERMINOU " + getName()+"!");
	}
}




