package mpooStore.model;

import javax.swing.JOptionPane;

public class CPFException extends Exception{

	public CPFException() {
		JOptionPane.showMessageDialog( null, "CPF informado é inválido",null, JOptionPane.ERROR_MESSAGE );
	}
	
	
}
