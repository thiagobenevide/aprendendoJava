package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela {

	JFrame frame = new JFrame("T�TULO");
	
	JButton botao = new JButton("Entrar");
	
	public Tela() {
		frame.setSize(200, 200);
		frame.setResizable(false); //
		frame.setLocationRelativeTo(null); // LOCAL PARA EXIBIR
		//frame.setUndecorated(true); // se n�o tiver bot�o n�o fecha
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // SERVE PARA LIBERAR MEM�RIA (� OBRIGAT�RIO)
		frame.setLayout(new FlowLayout()); // SE FOR NULL, TEM QUE DIZER A POSI��O DELE, GERALMENTE UTILIZAMOS GERENCIADOR DE LAYOUTS 
		
		
//		botao.setBounds(65, 140, 60, 30); // TEM QUE CALCULAR MUITO, N�O UTILIZAR
		//botao.setLocation(x, y);
		
		frame.add(botao);
		
		frame.setVisible(true);
	}
}
