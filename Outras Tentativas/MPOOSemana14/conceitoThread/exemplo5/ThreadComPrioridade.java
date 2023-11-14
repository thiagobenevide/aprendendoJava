package exemplo5;
/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_24: Thread
 */

// Exemplo 6: Mostra múltiplas threads - utilizando prioridade

public class ThreadComPrioridade extends Thread{
	private int tempoEspera; 
	
	public ThreadComPrioridade (String nome){
		super(nome);
		System.err.println("Nome: " + getName() + " - criada");
	}
	
	public void run(){
		try{
			for (int i=0; i<10;i++){
				tempoEspera=(int)(Math.random()*5000);
				System.err.println("Nome: " + getName() + " - criada" 
						+ "\t Prioridade atual: " + getPriority() 
						+ " \t Espera: " + tempoEspera  
						+ "\t Valor de i: " + i
				);
				//System.out.println(getName() + "\t" + i + "\n");
				if(getPriority()>1){
					setPriority(getPriority()-1);
					Thread.sleep(tempoEspera);
				}
			}
		}catch(Exception e){
			System.err.println(e.getMessage());
			
		}
		
		System.err.println(getName() + " - Finalizou");
		return;
	}
	
	public static void main(String [] args){
		ThreadComPrioridade t1, t2;
		
		t1 = new ThreadComPrioridade("thread1");
		t2 = new ThreadComPrioridade("thread2");
		
		System.err.println("\nIniciando as Threads:");
		
		t1.setPriority(5);
		t2.setPriority(5);

		t1.start();
		t2.start();
		
		System.err.println("\n Threads Finalizadas");
	}
}
