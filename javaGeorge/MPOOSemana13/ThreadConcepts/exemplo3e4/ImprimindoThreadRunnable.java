package exemplo3e4;
/*Universidade Federal Rural de Pernambuco - UFRPE
 * Unidade Acadêmica de Serra Talhada - UAST
 * Prof. Richarlyson D'Emery
 * Disciplina: Modelagem e Programação Orientada a Objetos
 * 
 * Aula_24: Thread
 */


// Exemplo 4: Mostra múltiplas threads - utilizando sleep com tempos aleatórios - utilizando interface Runnable

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ImprimindoThreadRunnable implements Runnable {
	boolean rode=true;
	int i =0;
	private int tempoEspera; //tempo que a thread durma
	private String nomeThread;
	private static Random geradorAleatorio = new Random();
	
	//atribui nome a thread
	
	public ImprimindoThreadRunnable(String nome){
		nomeThread = nome;
		//tempo de espera entre 0 a 5 segundos
//		tempoEspera = geradorAleatorio.nextInt(5000);
		tempoEspera = 250;
		System.out.println("Nome: " + nomeThread + "\t Domindo: " + tempoEspera + " ms");
	}

	//método a ser executado por uma nova thread
	public void run() {
		while (rode){
			i++;
			if(i>10)
				rode=false;	
		try{
			System.err.println(nomeThread + " - indo dormir");
			Thread.sleep(tempoEspera); //sleep() coloca a thread para dormir
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println(nomeThread + " - já dormiu!");
		// TODO Auto-generated method stub
		}
	}
	
	public static void main(String [] args){
		ImprimindoThreadRunnable t1 = new ImprimindoThreadRunnable("tarefa1");
		ImprimindoThreadRunnable t2 = new ImprimindoThreadRunnable("tarefa2");
		ImprimindoThreadRunnable t3 = new ImprimindoThreadRunnable("tarefa3");
		
		System.out.println(" Iniciando as threads");
		
		ExecutorService threadExecutor = Executors.newFixedThreadPool(3);
		
		threadExecutor.execute(t1); //inicia t1
		threadExecutor.execute(t2); //inicia t2
		threadExecutor.execute(t3); //inicia t3
		
		threadExecutor.shutdown(); //encerra tudo
		
		System.out.println("Threads inicializadas e encerradas");
	}
}


