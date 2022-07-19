package questao3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrame1 extends JFrame {
	
	JButton botao;
	
	public JFrame1() {
		super("Como Fechar um JFrame");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		botao = new JButton("Abrir Outro JFrame");
		
		add(botao);
		
		botao.addActionListener(
				 (ActionListener) new ActionListener() { //tratamento por classe interna anônima
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == botao) {
						
						Tela tela = new Tela();
		
					}
					
				}
				 }); 
		
		
		setVisible(true);
		
	}
	
}
