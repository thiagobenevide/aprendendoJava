package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MensagemView extends JPanel{
	
	public void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "MPOOAmigodoPet", 0, new ImageIcon("mpooamigodopet.img/icone.png"));
	}
	
	public void exibirMensagemFalhaSistema(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "MPOOAmigodoPet", 0, new ImageIcon("mpooamigodopet.img/icone.png"));
	}
	
	public int exibirMensagemEncerrar() {
		
		return 0;
	}
	
	
}
