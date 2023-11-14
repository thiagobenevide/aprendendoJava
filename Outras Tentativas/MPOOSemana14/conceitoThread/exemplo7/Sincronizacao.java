/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_24: Thread
 */

// Exemplo X: Sincronização de Threads

package exemplo7;

public class Sincronizacao implements Buffer{
	
	private int buffer=-1;
	private boolean ocupado = false;
	
	public synchronized void set(int valor){
		while (ocupado){
			try{
				System.out.println("Produtor tenta escrever");
				displayEstado("Buffer cheio. Produtor espera");
				wait();
			}catch(InterruptedException exception){
				exception.printStackTrace();
			}
		}
		ocupado=true;
		buffer=valor;

		displayEstado("Produtor escreve " + buffer);
		notify();
	}
	
	public synchronized int get(){
		while (!ocupado){
			try{
				System.out.println("Consumidor tenta ler");
				displayEstado("Buffer vazio. Consumidor espera.");
				wait();
			}catch(InterruptedException exception){
				exception.printStackTrace();
			}
		}
		
		ocupado = false;
		int valorLido = buffer;
		
		displayEstado("Consumidor leu" + valorLido);
		notify();
		
		return valorLido;
	}
	
	public void displayEstado(String operacao){
		System.out.println(operacao + buffer + "\t\t" + ocupado + "\n\n");
	}
}