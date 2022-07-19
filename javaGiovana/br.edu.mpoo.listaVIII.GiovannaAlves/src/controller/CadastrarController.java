package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import view.CadastrarClientePanel;
import view.CadastrarFuncionarioPanel;
import view.CadastrarGUI;

public class CadastrarController implements ActionListener {

	CadastrarGUI cadastrarGUI;
//	CadastrarClientePanel cadastrarClientePanel;
//	CadastrarFuncionarioPanel cadastrarFuncionarioPanel;
	
	public CadastrarController(CadastrarGUI cadastrarGUI) {
		
		this.cadastrarGUI = cadastrarGUI;
		control();
		
//		cadastrarClientePanel = new CadastrarClientePanel();
//		cadastrarFuncionarioPanel = new CadastrarFuncionarioPanel();
	}
	
	private void control() {
		
		cadastrarGUI.getMenuCliente().addActionListener(this);
		cadastrarGUI.getMenuFuncionario().addActionListener(this);
		cadastrarGUI.getExit().addActionListener(this);
		cadastrarGUI.getSairMenu().addActionListener(this);
		
	}
	
	public void atualizarPainel(JPanel panel) {
		if (cadastrarGUI.getPrincipalPanel() != null) {
			
			cadastrarGUI.getPrincipalPanel().setVisible(false);
			cadastrarGUI.setPrincipalPanel(null);
			
			cadastrarGUI.setPrincipalPanel(panel);
			cadastrarGUI.add(cadastrarGUI.getPrincipalPanel(), BorderLayout.CENTER);
			cadastrarGUI.getPrincipalPanel().setVisible(true);
		} else {
			cadastrarGUI.setPrincipalPanel(panel);
			cadastrarGUI.add(cadastrarGUI.getPrincipalPanel(), BorderLayout.CENTER);
			cadastrarGUI.getPrincipalPanel().setVisible(true);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == cadastrarGUI.getMenuCliente()) {
			atualizarPainel(cadastrarGUI.getCadastrarClientePanel());
		}
		
		if (e.getSource() == cadastrarGUI.getMenuFuncionario()) {
			atualizarPainel(cadastrarGUI.getCadastrarFuncionarioPanel());
		}
		
		if (e.getSource() == cadastrarGUI.getExit()) {
			if (cadastrarGUI.getPrincipalPanel() != null) {
				cadastrarGUI.getPrincipalPanel().setVisible(false);
				cadastrarGUI.setPrincipalPanel(null);
				System.exit(0);
			}
		}
		
		if (e.getSource() == cadastrarGUI.getSairMenu()) {
			cadastrarGUI.getPrincipalPanel().setVisible(false);
			cadastrarGUI.setPrincipalPanel(null);
			System.exit(0);
			}
			
		}
		
	}
