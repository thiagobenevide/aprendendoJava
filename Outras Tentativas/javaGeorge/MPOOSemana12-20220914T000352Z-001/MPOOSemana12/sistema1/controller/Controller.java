package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.CadastroGUI;
import view.Tela;
import view.Tela2;

public class Controller implements ActionListener{
	
	Tela tela;
	Tela2 tela2;
	
	public Controller(Tela tela, Tela2 tela2) {
		this.tela = tela;
		this.tela2 = tela2;
	
		control();
		tela.getAddButton().addActionListener(this);
		tela.getSairButton().addActionListener(this);
		tela2.getAddButton().addActionListener(this);
		
	}
	
	private void control(){
		tela.getAddButton().addActionListener(this);
		tela.getSairButton().addActionListener(this);
		tela2.getAddButton().addActionListener(this);		
	}
	

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()==tela.getAddButton())
			JOptionPane.showMessageDialog(null, "botão Add tela 1 pressionado");
		
		if (event.getSource()==tela2.getAddButton())
			JOptionPane.showMessageDialog(null, "botão Add tela 2 pressionado");
		
		if (event.getSource()==tela.getSairButton())
			System.exit(0);
		
	}

	/*Questionamento: No MVC quem executaria a app? 
	 * Resposta: "A classe controladora"
	 * 
	 * Em MPOO estamos definindo o main em app
	 */
//	public static void main(String[] args) {
//	}
}
