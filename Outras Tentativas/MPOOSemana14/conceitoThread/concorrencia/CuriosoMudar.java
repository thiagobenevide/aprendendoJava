package concorrencia;

public class CuriosoMudar extends Thread{
	
	public void run(){
		for (int i=0;i<100;i++){//100 ações de mudar
			try {
				sleep(200);
				mudarValor(App.valor.numero*2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void mudarValor(int numero){
//Sem thread:
//				while (true){
//				if (!Bloqueio.bloqueio){
//					Bloqueio.bloqueio=true;
////					ação de mudar
//					//...
//					break;
//				}
//		}

		synchronized (App.valor) {
			App.valor.numero = numero;
			System.out.println("feito( " + this.getName() + "):" + App.valor.numero);	
		}
	}
}