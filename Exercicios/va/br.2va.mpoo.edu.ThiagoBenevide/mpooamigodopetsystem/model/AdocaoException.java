package model;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AdocaoException extends Exception{

	public AdocaoException() {
		super();
		JOptionPane.showMessageDialog(null, "Erro ao realizar adoção! Entre em contato com (87)", "MPOOAmigodoPet", 0, new ImageIcon("mpooamigodopet.img/icone.png"));
	}

	
	
	
}
