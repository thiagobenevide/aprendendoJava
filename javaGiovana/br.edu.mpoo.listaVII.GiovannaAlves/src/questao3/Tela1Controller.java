package questao3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela1Controller implements ActionListener {

	Tela1 tela1;
	Tela2 tela2;
	
	public Tela1Controller(Tela1 tela1, Tela2 tela2) {
		
		this.tela1 = tela1;
		this.tela2 = tela2;
		
		control();
		
	}
	
	private void control() {
		
		tela1.setVisible(true);
		tela1.getAbrirOutraTela().addActionListener(this);
		
	}
	
	private void update() {
		tela1.setVisible(false);
		tela1 = null;
		System.gc();
		tela2.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == tela1.getAbrirOutraTela()) {
			update();
		}
		
	}
	
}
