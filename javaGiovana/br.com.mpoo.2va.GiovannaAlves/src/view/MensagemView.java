package view;

import javax.swing.JOptionPane;

public class MensagemView extends JOptionPane {

	public MensagemView(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}
