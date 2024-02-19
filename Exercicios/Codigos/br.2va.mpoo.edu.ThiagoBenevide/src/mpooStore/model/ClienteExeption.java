package mpooStore.model;

import javax.swing.JOptionPane;

public class ClienteExeption extends Exception{

	public ClienteExeption() {
		JOptionPane.showMessageDialog(null, "Cliente inválido", null, JOptionPane.ERROR_MESSAGE);
	}

}
