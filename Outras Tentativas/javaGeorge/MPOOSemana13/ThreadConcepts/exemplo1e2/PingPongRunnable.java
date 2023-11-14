/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_24: Thread
 */


// Exemplo 2: Criando threads em Java - implementando a interface Runnable

package exemplo1e2;

public class PingPongRunnable implements Runnable{
	private String palavra;
	private int tempoEspera;
	
	public PingPongRunnable (String texto, int tempo){
		palavra=texto;
		tempoEspera=tempo;
	}
	
	public void run(){
		try{
			for (;;){
				System.out.println(palavra);
				Thread.sleep(tempoEspera);
			}
		}catch (Exception e){
			System.err.println("Ocorreu um erro");
			return;
		}
	}
	
	public static void main(String [] args){
		Runnable ping = new PingPongRunnable("ping", 500);
		Runnable pong = new PingPongRunnable("pong", 1000);
		
		new Thread(ping).start();
		Thread pingThread = new Thread(ping);
		pingThread.start();
		
		new Thread(pong).start();
	}
}
