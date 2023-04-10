package sincronizacaoObjeto;

public class AppDeposito extends Thread{

	public void run(){
		synchronized (App.conta) {
			for (int i=0; i<100; i++){
				App.conta.depositar(1.0);
				try {
					sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}