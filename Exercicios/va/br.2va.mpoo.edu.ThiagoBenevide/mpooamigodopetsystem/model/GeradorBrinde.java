package model;

import java.util.Random;

import app.App;

public class GeradorBrinde extends Thread{ 
	private static long GERAR_BRINDE = 500;
	
	private int gerarBrinde() {
		return new Random().nextInt(100);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				App.gerenciadorBrinde.valorBrinde = gerarBrinde();
				sleep(GERAR_BRINDE);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
	}
	
	
}
