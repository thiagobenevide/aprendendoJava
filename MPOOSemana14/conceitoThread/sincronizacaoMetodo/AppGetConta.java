package sincronizacaoMetodo;

public class AppGetConta extends Thread{
	
	public void run(){
		for (int i=0;i<100;i++){
			System.out.println(this.getName()+ " GetConta \t" + App.conta.getSaldo());
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}