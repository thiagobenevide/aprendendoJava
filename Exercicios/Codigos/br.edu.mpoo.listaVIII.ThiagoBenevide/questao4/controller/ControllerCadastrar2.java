package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import model.BaseDados2;
import model.Cliente2;
import model.Funcionario2;
import view.CadastrarView2;
import view.TelaInicialView;

public class ControllerCadastrar2 implements ActionListener, WindowListener{
	CadastrarView2 telaCadastro;
	TelaInicialView telaInicial;
	
	
	public ControllerCadastrar2(TelaInicialView telaInicial) {
		telaCadastro = new CadastrarView2();
		controller();
	}
	
	public void controller() {
		telaCadastro.getAdicionarButton().addActionListener(this);
		telaCadastro.addWindowListener(this);
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
			boolean status = BaseDados2.adicionarUsuario(new Funcionario2(nome, cpf, fone, email, "123456"));
			if(status)
				JOptionPane.showConfirmDialog(null, "Funcionario cadastrado com suscesso");

		}
		
		if(isCliente) {
			boolean status  = BaseDados2.adicionarUsuario(new Cliente2(nome, cpf, fone, email, "123456", propaganda));
			if(status)
				JOptionPane.showConfirmDialog(null, "Cliente cadastrado com sucesso");
		}
		
		
	}
	
	private void retornarTelaInicial() {
		System.out.println("TESTE @");
		telaCadastro.setVisible(false);
		telaInicial.setVisible(true);
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		retornarTelaInicial();
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		retornarTelaInicial();
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
