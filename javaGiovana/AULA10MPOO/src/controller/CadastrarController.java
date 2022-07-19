package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SpringLayout;

import view.CadastrarClientePanel;
import view.CadastrarFuncionarioPanel;
import view.CadastrarGUI;

public class CadastrarController implements ActionListener {

	CadastrarGUI cadastrarGUI;
	CadastrarClientePanel cadastrarClientePanel;
	CadastrarFuncionarioPanel cadastrarFuncionarioPanel;
	
	public CadastrarController(CadastrarGUI cadastrarGUI) {
		
		this.cadastrarGUI = cadastrarGUI;
		
		control();
		
		cadastrarClientePanel = new CadastrarClientePanel();
		cadastrarFuncionarioPanel = new CadastrarFuncionarioPanel();
	}
	
	private void control() {

		cadastrarGUI.getMenuCliente().addActionListener(this);
		cadastrarGUI.getMenuFuncionario().addActionListener(this);
		cadastrarGUI.getExit().addActionListener(this);
		cadastrarGUI.getSairMenu().addActionListener(this);
		
	}
	
	public void updateCliente(boolean status) {
		
		if (status == true) {
			cadastrarGUI.getCadastrarClientePanel().getPainelTitulo().setVisible(status);
			cadastrarGUI.getCadastrarClientePanel().getPainelCentral().setVisible(status);
			cadastrarGUI.getCadastrarClientePanel().getPropaganda().setVisible(status);
			cadastrarGUI.getCadastrarClientePanel().getAdicionarButton().setVisible(status);
		}
	}

	public void updateFuncionario(boolean status) {
		
		if (status == true) {
		
			cadastrarGUI.add(cadastrarFuncionarioPanel.getPainelTituloFuncionario(), BorderLayout.NORTH);
			cadastrarGUI.add(cadastrarFuncionarioPanel.getPainelCentralFuncionario(), BorderLayout.CENTER);
			cadastrarGUI.add(cadastrarFuncionarioPanel.getAdicionarFuncionarioButton(), BorderLayout.EAST);
			
			cadastrarFuncionarioPanel.getPainelTituloFuncionario().setVisible(status);
			cadastrarFuncionarioPanel.getPainelCentralFuncionario().setVisible(status);
			cadastrarFuncionarioPanel.getAdicionarFuncionarioButton().setVisible(status);
		}
	
		cadastrarFuncionarioPanel.getPainelTituloFuncionario().setVisible(status);
		cadastrarFuncionarioPanel.getPainelCentralFuncionario().setVisible(status);
		cadastrarFuncionarioPanel.getAdicionarFuncionarioButton().setVisible(status);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == cadastrarGUI.getMenuCliente()) {
			
			//updateFuncionario(false);
			updateCliente(true);
		}
		
		if (e.getSource() == cadastrarGUI.getMenuFuncionario()) {
			updateCliente(false);
			updateFuncionario(true);
		}
		
		if (e.getSource() == cadastrarGUI.getExit()) {
			System.exit(0);
		}
		
		if (e.getSource() == cadastrarGUI.getSairMenu()) {
			System.exit(0);
		}
		
	}
	
}
