package questao3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler2 implements ActionListener {

	Tela2 tela2;
	
	public ButtonHandler2(Tela2 tela2) {

		this.tela2 = tela2;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == tela2.getSetVisibleButton()) {
			tela2.setVisible(false);
		}
		
	}
	
}
