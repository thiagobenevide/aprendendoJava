package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Solução4
public class TelaTratamentoEventoOutraClasseExterna extends JFrame{
	
	private JButton addButton, sairButton;
	ButtonHandler buttonHandler;
	
	public TelaTratamentoEventoOutraClasseExterna(){
		super("Título");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setLayout(new FlowLayout());//mudar na maioria das aplicações 
		addButton = new JButton("Adicionar");
		sairButton = new JButton("Sair");
		
		buttonHandler = new ButtonHandler(this);
		
		addButton.addActionListener(buttonHandler);//arg0=onde está o tratamento?
		sairButton.addActionListener(buttonHandler);//arg0=onde está o tratamento?
//		addButton.addKeyListener(l);
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