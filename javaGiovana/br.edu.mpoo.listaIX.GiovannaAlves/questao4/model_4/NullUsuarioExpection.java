package model_4;

import javax.swing.JOptionPane;

public class NullUsuarioExpection extends Exception {

	public NullUsuarioExpection(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}
