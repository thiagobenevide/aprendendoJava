package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaGerenciamento;

public class GerenciamentoController{
	TelaGerenciamento telaGerenciamento;
	ButtonHandler buttonHandler;
	
	public GerenciamentoController(TelaGerenciamento telaGerenciamento) {
		this.telaGerenciamento = telaGerenciamento;
		buttonHandler = new ButtonHandler();
		control();
	}
	
	private void control(){
		telaGerenciamento.getCadastrarUsuarioMenuItem().addActionListener(buttonHandler);
		telaGerenciamento.getBuscarUsuarioMenuItem().addActionListener(buttonHandler);
	}
	
	private class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==telaGerenciamento.getCadastrarUsuarioMenuItem())
				telaGerenciamento.getContainerPanel().setVisible(true);
			
			if(e.getSource()==telaGerenciamento.getBuscarUsuarioMenuItem()){
				telaGerenciamento.getContainerPanel().setVisible(false);
//				telaGerenciamento.getContainerPanel().setVisible(true);//getContainerPanel() iria ser a telaBuscar
			    System.out.println("foi");
			}
		}
		
	}
	

}
