package sincronizacaoMetodo;

public class AppDeposito extends Thread{
	
	public void run(){
		for (;;){
			App.conta.depositar(1.0);
			System.out.println("Thread Depósito. Novo Saldo: R$" + App.conta.getSaldo());
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}