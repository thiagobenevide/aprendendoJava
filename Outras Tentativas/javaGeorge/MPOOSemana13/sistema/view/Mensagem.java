package view;

import javax.swing.JOptionPane;

public class Mensagem {
	public static final String MENSAGEM_BUG="Deu bug. O sistema ser� finalizado!";
	
	public static void exibirMensagem(String mensagem){
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
}
