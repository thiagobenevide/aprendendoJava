package concorrencia;

public class CuriosoMudar extends Thread{
	
	public void run(){
		for (int i=0;i<100;i++){
			
				try {
					sleep(1000);
					mudarValor(App.valor.numero*2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	synchronized public void mudarValor(int numero){
//Sem thread
		//		while (true){
//				if (!Bloqueio.bloqueio){
//					Bloqueio.bloqueio=true;
//					//...
//					break;
//				}
//			
//		}
		///...
		synchronized (App.valor) {
			App.valor.numero = numero;
			System.out.println("feito( " + this.getName() + "):" + App.valor.numero);	
		}
	}
}
