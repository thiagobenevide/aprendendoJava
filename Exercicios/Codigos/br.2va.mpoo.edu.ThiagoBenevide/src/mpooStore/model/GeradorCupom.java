package mpooStore.model;

import java.util.Random;

import mpooStore.app.App;

public class GeradorCupom extends Thread{
	private static final long GERAR_CUPOM = 1000;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				App.gerenciadorCupom.setValorCupomAtual(gerarCupom());
				System.out.println(App.gerenciadorCupom.getValorCupomAtual());
				if(!App.gerenciadorCupom.isOfertaCupom()) {
					interrupt();
				}
				sleep(GERAR_CUPOM);
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
