package mpooStore.model;

import java.util.Random;

import mpooStore.app.App;

public class GeradorCupom extends Thread{
	private static final long GERAR_CUPOM = 5000;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				App.gerenciadorCupom.setValorCupomAtual(gerarCupom());
				sleep(GERAR_CUPOM);
				if(!App.gerenciadorCupom.isOfertaCupom()) {
					interrupt();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private double gerarCupom() {
		return new Random().nextDouble(100);
		
	}

	
	
}
