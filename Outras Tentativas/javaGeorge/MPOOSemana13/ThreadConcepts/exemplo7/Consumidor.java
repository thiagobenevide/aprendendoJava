package exemplo7;

import java.util.Random;

public class Consumidor implements Runnable {

	private static Random gerador=new Random();
	private Buffer localCompartilhado;
	
	public Consumidor(Buffer compartilhado){
		localCompartilhado=compartilhado;
	}
	public void run() {
		int sum=0;
		
		for (int i = 1; i <=10; i++){
				
			try{
				Thread.sleep(gerador.nextInt(3000));
				sum+=localCompartilhado.get();
				System.out.printf("\t\t\t%2d\n",sum);
			}catch(InterruptedException exception){
				exception.printStackTrace();
			}
			System.out.printf("\n%s %d.\n%s\n", "Consumidor ler valores totalizados.",sum, "Terminando Consumidor.");
		}
	}
}
