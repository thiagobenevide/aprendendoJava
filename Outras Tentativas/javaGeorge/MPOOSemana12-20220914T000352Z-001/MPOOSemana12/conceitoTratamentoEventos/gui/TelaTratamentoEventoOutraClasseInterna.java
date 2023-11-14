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

//Solu��o3
public class TelaTratamentoEventoOutraClasseInterna extends JFrame{
	
	JButton addButton, sairButton;
	ButtonHandler buttonHandler;
	
	public TelaTratamentoEventoOutraClasseInterna(){
		super("T�tulo");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setLayout(new FlowLayout());//mudar na maioria das aplica��es 
		addButton = new JButton("Adicionar");
		sairButton = new JButton("Sair");
		
		buttonHandler = new ButtonHandler();
		
		addButton.addActionListener(buttonHandler);//arg0=onde est� o tratamento?
		sairButton.addActionListener(buttonHandler);//arg0=onde est� o tratamento?
//		addButton.addKeyListener(l);
		add(addButton);
		add(sairButton);
		setVisible(true);
	}

	

	private class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			if (event.getSource()==addButton)
				JOptionPane.showMessageDialog(null, "bot�o Add pressionado");
			
			if (event.getSource()==sairButton)
				System.exit(0);
			
		}
	}

}