package mpooStore.model;

import javax.swing.JOptionPane;

public class CupomException extends Exception{

	public CupomException() {
		JOptionPane.showMessageDialog(null, "Cupom inválido", null, JOptionPane.ERROR_MESSAGE);
	}

	
	
}
