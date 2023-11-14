package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela2 extends JFrame{
	
	JButton addButton;
	
	public Tela2(){
		super("Título");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setLayout(new FlowLayout());//mudar na maioria das aplicações 
		addButton = new JButton("Adicionar");
		
		add(addButton);
		
		setVisible(true);
	}

	public JButton getAddButton() {
		return addButton;
	}
	
	
}