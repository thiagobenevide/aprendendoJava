package sincronizacaoObjeto;

public class AppGetConta extends Thread{

	public void run(){
		synchronized (App.conta){
			for (int i=0;i<100;i++){
				System.out.println(this.getName()+ "\t" + App.conta.getSaldo());
				try {
					sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}