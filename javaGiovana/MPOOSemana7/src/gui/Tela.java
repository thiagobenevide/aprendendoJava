package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela {

	JFrame frame = new JFrame("TÍTULO");
	
	JButton botao = new JButton("Entrar");
	
	public Tela() {
		frame.setSize(200, 200);
		frame.setResizable(false); //
		frame.setLocationRelativeTo(null); // LOCAL PARA EXIBIR
		//frame.setUndecorated(true); // se não tiver botão não fecha
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // SERVE PARA LIBERAR MEMÓRIA (É OBRIGATÓRIO)
		frame.setLayout(new FlowLayout()); // SE FOR NULL, TEM QUE DIZER A POSIÇÃO DELE, GERALMENTE UTILIZAMOS GERENCIADOR DE LAYOUTS 
		
		
//		botao.setBounds(65, 140, 60, 30); // TEM QUE CALCULAR MUITO, NÃO UTILIZAR
		//botao.setLocation(x, y);
		
		frame.add(botao);
		
		frame.setVisible(true);
	}
}
