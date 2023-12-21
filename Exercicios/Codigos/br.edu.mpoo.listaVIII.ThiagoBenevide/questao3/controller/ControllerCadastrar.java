package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.Cliente;
import model.Funcionario;
import view.CadastrarView;

public class ControllerCadastrar implements ActionListener{
	CadastrarView telaCadastro;
	
	public ControllerCadastrar() {
		telaCadastro = new CadastrarView();
		controller();
	}
	
	public void controller() {
		telaCadastro.getAdicionarButton().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaCadastro.getAdicionarButton()) {
			adicionarUsuario();
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
			boolean status = BaseDados.adicionarUsuario(new Funcionario(nome, cpf, fone, email, "123456"));
			if(status)
				JOptionPane.showConfirmDialog(null, "Funcionario cadastrado com suscesso");

		}
		
		if(isCliente) {
			boolean status  = BaseDados.adicionarUsuario(new Cliente(nome, cpf, fone, email, "123456", propaganda));
			if(status)
				JOptionPane.showConfirmDialog(null, "Cliente cadastrado com sucesso");
		}
		
		
	}
	
	

}
