package exemplo7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompartilhamentoBuffer {

	public static void main(String [] args){
		ExecutorService aplicacao = Executors.newFixedThreadPool(2);
		
		Buffer localCompartilhado = new Sincronizacao();
		
//		System.out.printf(" %-40s %s \t \t %s \n %-40 s %s \n\n", "Operacao", "Buffer", "Ocupado", "---------", "-------\t\t---------");
//		System.out.printf(" %40s %s \t \t %s \n %40 s %s \n\n", "Operacao", "Buffer", "Ocupado", "---------", "-------\t\t---------");
		System.out.println("Operacao \t Buffer \t Ocupado");
		aplicacao.execute(new Produtor(localCompartilhado));
		aplicacao.execute(new Consumidor(localCompartilhado));
		
		aplicacao.shutdown();
	}
}
