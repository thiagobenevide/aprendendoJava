package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados1;
import model.Cliente2;
import model.Funcionario2;
import view.CadastrarView2;

public class ControllerCadastrar1 implements ActionListener{
	CadastrarView2 telaCadastro;
	
	public ControllerCadastrar1() {
		this.telaCadastro = new CadastrarView2();
		controller();
	}
	
	public void controller() {
		telaCadastro.getAdicionarButton().addActionListener(this);
		telaCadastro.getFuncionarioRadio().addActionListener(this);
		telaCadastro.getClienteRadio().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaCadastro.getAdicionarButton()) {
			adicionarUsuario();
		}
		if(e.getSource()==telaCadastro.getFuncionarioRadio()) {
			ocultarAceitaPropaganda();
		}
		if(e.getSource()==telaCadastro.getClienteRadio()) {
			mostrarAceitaPropaganda();
		}
		
		
	}
	
	
	public void adicionarUsuario() {
		String nome = telaCadastro.getNomeField().getText();
		String cpf = telaCadastro.getCpfFormatField().getText();
		String fone = telaCadastro.getFoneField().getText();
		String email = telaCadastro.getEmailField().getText();
		boolean propaganda = telaCadastro.getAceitarPropagandaCheckBox().isSelected();
		boolean isFuncionario = telaCadastro.getFuncionarioRadio().isSelected();
		boolean isCliente = telaCadastro.getClienteRadio().isSelected();
		
		if(isFuncionario) {
			BaseDados1.adicionarUsuario(new Funcionario2(nome, cpf, fone, email, "123456")); 
			JOptionPane.showMessageDialog(null, "Funcionario cadastrado com suscesso");
			System.out.println(BaseDados1.usuariosBase());
			
		}
		
		if(isCliente) {
			BaseDados1.adicionarUsuario(new Cliente2(nome, cpf, fone, email, "123456", propaganda));
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
			System.out.println(BaseDados1.usuariosBase());
		}
		
		
	}
	
	private void ocultarAceitaPropaganda() {
		telaCadastro.getAceitarPropagandaCheckBox().setVisible(false);
	}
	
	private void mostrarAceitaPropaganda() {
		telaCadastro.getAceitarPropagandaCheckBox().setVisible(true);
	}

}
