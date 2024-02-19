package mpooStore.model;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import mpooStore.app.App;

public class TempoOferta extends Thread {
	private static final long TEMPO_OFERTA = 20000;
	
	public static long getTempoOferta() {
		return TEMPO_OFERTA;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				sleep(TEMPO_OFERTA);
				JOptionPane.showMessageDialog(null, "MPOOStore informa: campanha cupom finalizada!", "MPOO Store", 0, new ImageIcon("mpooStore.img/icone.png"));
				if(App.gerenciadorCupom.isOfertaCupom()) {
					App.gerenciadorCupom.setOfertaCupom(false);
					interrupt();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
}
