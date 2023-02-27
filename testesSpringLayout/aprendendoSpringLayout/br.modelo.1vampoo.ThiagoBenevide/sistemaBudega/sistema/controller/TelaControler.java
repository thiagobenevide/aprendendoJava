package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sistema.view.TelaCadastro;

public class TelaControler implements ActionListener{
	TelaCadastro telaCadastro;

	public TelaControler(TelaCadastro tela) {
		this.telaCadastro = tela;
		this.telaCadastro.setVisible(true);
		controler();		
	}
	
	private void controler() {
		this.telaCadastro.getClienteRadio().addActionListener(this);
		this.telaCadastro.getFuncionarioRadio().addActionListener(this);
		this.telaCadastro.getAdicionarButton().addActionListener(this);
	}
	

	private void atualizaTelaCliente() {
		this.telaCadastro.getMatriculaField().setVisible(false);
		this.telaCadastro.getMatriculaLabel().setVisible(false);
		this.telaCadastro.getAceitaPropagandaBox().setVisible(true);
	}
	
	private void atualizarTelaFuncionario() {
		this.telaCadastro.getMatriculaField().setVisible(true);
		this.telaCadastro.getMatriculaLabel().setVisible(true);
		this.telaCadastro.getAceitaPropagandaBox().setVisible(false);
	}
	
	//Events
	//public void actionPerformed(ActionEvent e) {
		//if(e.getSource() == tela.getClienteRadio()) {
	//		atualizarTelaCliente();
		//}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == telaCadastro.getClienteRadio()) {
			atualizaTelaCliente();
		}
		
		if(e.getSource() ==  telaCadastro.getFuncionarioRadio()) {
			atualizarTelaFuncionario();
		}
		
		if(e.getSource() == telaCadastro.getAdicionarButton()) {
			
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	
	
	
}
