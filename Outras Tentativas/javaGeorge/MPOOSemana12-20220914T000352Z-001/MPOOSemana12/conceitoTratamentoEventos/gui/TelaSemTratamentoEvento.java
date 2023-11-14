package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaSemTratamentoEvento extends JFrame{
	
	JButton addButton, sairButton;
	
	public TelaSemTratamentoEvento(){
		super("T�tulo");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setLayout(new FlowLayout());//mudar na maioria das aplica��es 
		addButton = new JButton("Adicionar");
		sairButton = new JButton("Sair");
		
		add(addButton);
		add(sairButton);
		
		setVisible(true);
	}
}