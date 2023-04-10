/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_24: Thread
 */


// Exemplo 3: Mostra múltiplas threads - utilizando sleep com tempos aleatórios

package exemplo3e4;

public class ImprimindoThread extends Thread{
	private int tempoEspera; 
	
	public ImprimindoThread(String nome){
		super(nome);
		tempoEspera = (int)(Math.random()*5000);
		System.err.println("Nome: " + getName() + "\t Domindo: " + tempoEspera + " ms");
	}
	
	public void run(){
		try{
			System.err.println(getName() + " - indo dormir");
			Thread.sleep(tempoEspera);
		}catch(InterruptedException interruptedException){
			System.err.println(interruptedException.toString());
		}
		
		System.err.println(getName() + " - já dormiu");
	}
	
	public static void main(String [] args){
		ImprimindoThread t1, t2, t3, t4;
		
		t1 = new ImprimindoThread("thread1");
		t2 = new ImprimindoThread("thread2");
		t3 = new ImprimindoThread("thread3");
		t4 = new ImprimindoThread("thread4");
		
		System.err.println("\nIniciando as Threads:");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.err.println("\n Threads iniciadas");
	}
}
