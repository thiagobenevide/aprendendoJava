package questao3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela1 extends JFrame {

	private JButton abrirOutraTela;

	public Tela1() {
		super("Como Fechar um JFrame");
		
		setSize(400,100);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		abrirOutraTela = new JButton("Abrir outro JFrame");
		
		add(abrirOutraTela);
		
		setVisible(false);
		
	}
	
	public JButton getAbrirOutraTela() {
		return abrirOutraTela;
	}
	
	
}
