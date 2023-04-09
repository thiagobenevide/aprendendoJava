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

//Solução1
public class TelaTratamentoEventoPropiaClasse extends JFrame implements ActionListener{
	
	JButton addButton, sairButton;
	
	public TelaTratamentoEventoPropiaClasse(){
		super("Título");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setLayout(new FlowLayout());//mudar na maioria das aplicações 
		addButton = new JButton("Adicionar");
		sairButton = new JButton("Sair");
		
		addButton.addActionListener(this);//arg0=onde está o tratamento?
		sairButton.addActionListener(this);//arg0=onde está o tratamento?
//		addButton.addKeyListener(l);
		add(addButton);
		add(sairButton);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()==addButton)
			JOptionPane.showMessageDialog(null, "botão Add pressionado");
		
		if (event.getSource()==sairButton)
			System.exit(0);
		
	}


}