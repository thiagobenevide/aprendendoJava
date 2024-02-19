package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.BaseDados2;
import model.Cliente;
import model.Cliente2;
import model.Funcionario;
import model.Funcionario2;
import view.CadastrarView;
import view.CadastrarView2;

public class ControllerCadastrar implements ActionListener{
	CadastrarView telaCadastro;
	
	public ControllerCadastrar() {
		telaCadastro = new CadastrarView();
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
			layoutFuncionario();
		}
		if(e.getSource()==telaCadastro.getClienteRadio()) {
			layoutCliente();
		}
		
	}
	
	
	private void adicionarUsuario() {
		String nome = telaCadastro.getNomeField().getText();
		String cpf = telaCadastro.getCpfFormatField().getText();
		String fone = telaCadastro.getFoneField().getText();
		String email = telaCadastro.getEmailField().getText();
		boolean isFuncionario = telaCadastro.getFuncionarioRadio().isSelected();
		boolean isCliente = telaCadastro.getClienteRadio().isSelected();
		
		if(isFuncionario) {
			String matricula = telaCadastro.getSalarioField().getText();
			double salario =  Double.parseDouble(telaCadastro.getSalarioField().getText());

			boolean status = BaseDados.adicionarUsuario(new Funcionario(nome, cpf, fone, email,salario , matricula));
			if(status) {
				JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
			}else {
				JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário");
			}

		}
		
		if(isCliente) {
			boolean propaganda = telaCadastro.getAceitarPropagandaCheckBox().isSelected();
			boolean status  = BaseDados.adicionarUsuario(new Cliente(nome, cpf, fone, email, propaganda));
			if(status) {
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
			}else {
				JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente");
			}
		}
		
		
	}
	
	private void layoutFuncionario() {
		telaCadastro.setSize(330,300);
		telaCadastro.getAceitarPropagandaCheckBox().setVisible(false);
		telaCadastro.getMatriculaLabel().setVisible(true);
		telaCadastro.getMatriculaField().setVisible(true);
		telaCadastro.getSalarioLabel().setVisible(true);
		telaCadastro.getSalarioField().setVisible(true);
	}
	
	private void layoutCliente() {
		telaCadastro.setSize(330,220);
		telaCadastro.getAceitarPropagandaCheckBox().setVisible(true);
		telaCadastro.getMatriculaLabel().setVisible(false);
		telaCadastro.getMatriculaField().setVisible(false);
		telaCadastro.getSalarioLabel().setVisible(false);
		telaCadastro.getSalarioField().setVisible(false);
	}
	
	

}
