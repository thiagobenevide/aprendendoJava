package model_4;

import javax.swing.JOptionPane;

public class ContaException extends Exception {

	public ContaException(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}
