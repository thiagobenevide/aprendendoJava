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

//Solução2
public class TelaTratamentoEventoClasseInternaAnonima extends JFrame{
	
	JButton addButton, sairButton;
	
	public TelaTratamentoEventoClasseInternaAnonima(){
		super("Título");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setLayout(new FlowLayout());//mudar na maioria das aplicações 
		addButton = new JButton("Adicionar");
		sairButton = new JButton("Sair");
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "botão Add pressionado");
			}
		});
		
		sairButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
//		addButton.addKeyListener(l);
		add(addButton);
		add(sairButton);
		setVisible(true);
	}
}