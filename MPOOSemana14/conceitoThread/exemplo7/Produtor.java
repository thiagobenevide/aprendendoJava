package exemplo7;

import java.util.Random;

public class Produtor implements Runnable {
	
	private static Random gerador = new Random();
	private Buffer localCompartilhado;
	
	public Produtor(Buffer compartilhado){
			localCompartilhado=compartilhado;
	}
	

	public void run() {
		int sum=0;
		
		for (int i = 1; i <=10; i++){
				
			try{
				Thread.sleep(gerador.nextInt(3000));
				localCompartilhado.set(i);
				sum+=i;
				System.out.printf("\t%2d\n",sum);
			}catch(InterruptedException exception){
				exception.printStackTrace();
			}
			
			System.out.printf("\n%s\n%s\n", "Produtor realizou carregamento.", "Terminando Produtor.");
		}
	}
}
