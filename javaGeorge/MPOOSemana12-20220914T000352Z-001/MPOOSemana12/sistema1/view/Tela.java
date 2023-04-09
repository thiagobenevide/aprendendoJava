package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame{
	
	JButton addButton, sairButton;
	
	public Tela(){
		super("Título");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setLayout(new FlowLayout());//mudar na maioria das aplicações 
		addButton = new JButton("Adicionar");
		sairButton = new JButton("Sair");
		
		add(addButton);
		add(sairButton);
		
		setVisible(true);
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
	
}