package concorrencia;

public class CuriosoVer extends Thread{
	
	
	public void run(){
		for (int i=0;i<100;i++){
			try {
				sleep(1000);
				System.out.println(verValor());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
	}
	
	public int verValor(){
		synchronized (App.valor) {
			return App.valor.numero;	
		}
	}

}
