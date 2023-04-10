package concorrencia;

public class CuriosoVer extends Thread{
	
	public void run(){
		for (int i=0;i<100;i++){//100 ações de ver 
			try {
				sleep(500);
				System.out.println(verValor());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
	public int verValor(){
//Sem Thread		
//		while (true){
//			if (!Bloqueio.bloqueio){
//				Bloqueio.bloqueio=true;
////				ação de Ver
//				break;
//			}
//		}

		synchronized (App.valor) {
			return App.valor.numero;	
		}
	}
}