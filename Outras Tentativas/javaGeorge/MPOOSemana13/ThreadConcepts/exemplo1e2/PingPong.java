/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_24: Thread
 */

// Exemplo 1: Criando threads em Java - estendendo da classe Thread

package exemplo1e2;


public class PingPong extends Thread{
	private String palavra;
	private int tempoEspera;
	
	public PingPong (String texto, int tempo){
		palavra=texto;
		tempoEspera=tempo;
	}
	
	public void run(){
		try{
			for (;;){
				System.out.println(palavra);
				Thread.sleep(tempoEspera);
			}
		}catch (InterruptedException e){
			System.err.println("Ocorreu um erro");
			return;
		}
	}
	
	public static void main(String [] args){
		PingPong ping = new PingPong("ping", 500);
		ping.start();
		
		PingPong pong = new PingPong("pong", 1000);
		pong.start();
	}
	
}
