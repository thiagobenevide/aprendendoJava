package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import base.BaseDados;
import entidade.Cliente;
import entidade.Funcionario;
import entidade.UsuarioAbstract;
import gui.TelaCadastro;

public class TelaControler implements ActionListener{
	TelaCadastro tela;
	
	public TelaControler(TelaCadastro tela) {
		this.tela = tela;
		this.tela.setVisible(true);
		controler();
		
	}
	
	private void controler() {
		this.tela.getClienteRadio().addActionListener(this);
		this.tela.getFuncionarioRadio().addActionListener(this);
		this.tela.getAdicionarButton().addActionListener(this);
	}

	
	

	
	
	private void atualizarTelaCliente() {
		this.tela.getPropagandaBox().setVisible(true);
		this.tela.getMatriculaField().setVisible(false);
		this.tela.getMatriculaLabel().setVisible(false);
	}
	
	private void atualizarTelaFuncionario() {
		this.tela.getPropagandaBox().setVisible(false);
		this.tela.getMatriculaField().setVisible(true);
		this.tela.getMatriculaLabel().setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tela.getClienteRadio()) {
			atualizarTelaCliente();
		}
		
		if(e.getSource() == tela.getFuncionarioRadio()) {
			atualizarTelaFuncionario();
		}
		
		if(e.getSource() == tela.getAdicionarButton()) {
			try {
				if(tela.getClienteRadio().isSelected()) {
					if(tela.getPropagandaBox().isSelected()) {
						UsuarioAbstract cliente = new Cliente(tela.getNomeField().getText(), tela.getCpfField().getText(),tela.getFoneField().getText(), tela.getEmailField().getText(), true);
						BaseDados.adicionarUsuario(cliente);
					}
					else {
						UsuarioAbstract cliente = new Cliente(tela.getNomeField().getText(), tela.getCpfField().getText(),tela.getFoneField().getText(), tela.getEmailField().getText(), false);
						BaseDados.adicionarUsuario(cliente);
					}
				}
				
				if(tela.getFuncionarioRadio().isSelected()) {
					UsuarioAbstract funcionario = new Funcionario(tela.getNomeField().getText(), tela.getCpfField().getText(),tela.getFoneField().getText(), tela.getEmailField().getText(), tela.getMatriculaField().getText());
					BaseDados.adicionarUsuario(funcionario);
				}
				
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	
}
