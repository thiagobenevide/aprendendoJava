package model_4;

import javax.swing.JOptionPane;

public class OperacaoException extends Exception {

	public OperacaoException(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}
