package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import model.BaseDados;
import model.Cliente;
import model.Funcionario;
import view.CadastrarClientePanel;
import view.CadastrarFuncionarioPanel;
import view.CadastrarGUI;

public class CadastrarController {
	
	CadastrarGUI cadastrarGUI;
	MenuHandler menuHandler;
	ButtonHandler buttonHandler;
	MouseListener mouseTratadora;
	
	public CadastrarController(CadastrarGUI cadastrarGUI) {
		
		this.cadastrarGUI = cadastrarGUI;
		
		menuHandler = new MenuHandler();
		buttonHandler = new ButtonHandler();
		mouseTratadora = new MouseTratadora();
		control();
		
	}
	
	private void control() {

		cadastrarGUI.getMenuCliente().addActionListener(menuHandler);
		cadastrarGUI.getMenuFuncionario().addActionListener(menuHandler);
		cadastrarGUI.getExit().addActionListener(menuHandler);
		
		cadastrarGUI.getCadastrarClientePanel().getAdicionarButton().addActionListener(buttonHandler);
		cadastrarGUI.getCadastrarFuncionarioPanel().getAdicionarFuncionarioButton().addActionListener(buttonHandler);
		
		cadastrarGUI.getSairMenu().addMouseListener(mouseTratadora);
		
	}
	
	private void update(JPanel panel) {
		
		if (cadastrarGUI.getPrincipalPanel() != null) {
			cadastrarGUI.getPrincipalPanel().setVisible(false);
			cadastrarGUI.setPrincipalPanel(null);
			
			cadastrarGUI.setPrincipalPanel(panel);
			cadastrarGUI.add(cadastrarGUI.getPrincipalPanel(), BorderLayout.CENTER);
			cadastrarGUI.getPrincipalPanel().setVisible(true);
		}
		
		else {
		
			cadastrarGUI.setPrincipalPanel(panel);
			cadastrarGUI.add(cadastrarGUI.getPrincipalPanel(), BorderLayout.CENTER);
			
		}
	}

	private class MenuHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == cadastrarGUI.getMenuCliente()) {
				update(cadastrarGUI.getCadastrarClientePanel());
			}
			
			if (e.getSource() == cadastrarGUI.getMenuFuncionario()) {
				update(cadastrarGUI.getCadastrarFuncionarioPanel());
			}
			
			if (e.getSource() == cadastrarGUI.getExit()) {
				cadastrarGUI.getPrincipalPanel().setVisible(false);
				cadastrarGUI.setPrincipalPanel(null);
				System.exit(0);
			}
			
		}
		
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == cadastrarGUI.getCadastrarClientePanel().getAdicionarButton()) {
				if (cadastrarGUI.getCadastrarClientePanel().getPropaganda().isSelected()) {
					if (cadastrarGUI.getCadastrarClientePanel().getFemininoRadioButton().isSelected()) {
						
						BaseDados.adicionarUsuario(new Cliente(null, null, cadastrarGUI.getCadastrarClientePanel().getNomeField().getText(), cadastrarGUI.getCadastrarClientePanel().getCpfField().getText()
								, cadastrarGUI.getCadastrarClientePanel().getFoneField().getText(), cadastrarGUI.getCadastrarClientePanel().getEmailField().getText(), 
								"feminino", true));
					}
					
					else {
						
						BaseDados.adicionarUsuario(new Cliente(null, null, cadastrarGUI.getCadastrarClientePanel().getNomeField().getText(), cadastrarGUI.getCadastrarClientePanel().getCpfField().getText()
								, cadastrarGUI.getCadastrarClientePanel().getFoneField().getText(), cadastrarGUI.getCadastrarClientePanel().getEmailField().getText(), 
								"masculino", true));
					}
				}
				
				else {
					
					if (cadastrarGUI.getCadastrarClientePanel().getFemininoRadioButton().isSelected()) {
						
						BaseDados.adicionarUsuario(new Cliente(null, null, cadastrarGUI.getCadastrarClientePanel().getNomeField().getText(), cadastrarGUI.getCadastrarClientePanel().getCpfField().getText()
								, cadastrarGUI.getCadastrarClientePanel().getFoneField().getText(), cadastrarGUI.getCadastrarClientePanel().getEmailField().getText(), 
								"feminino", false));
					}
					
					else {
						
						BaseDados.adicionarUsuario(new Cliente(null, null, cadastrarGUI.getCadastrarClientePanel().getNomeField().getText(), cadastrarGUI.getCadastrarClientePanel().getCpfField().getText()
								, cadastrarGUI.getCadastrarClientePanel().getFoneField().getText(), cadastrarGUI.getCadastrarClientePanel().getEmailField().getText(), 
								"masculino", false));
					}
				}
			}
			
			else if (e.getSource() == cadastrarGUI.getCadastrarFuncionarioPanel().getAdicionarFuncionarioButton()) {
				if (cadastrarGUI.getCadastrarFuncionarioPanel().getFemininoFuncionarioRadioButton().isSelected()) {
					
					BaseDados.adicionarUsuario(new Funcionario(null, null, cadastrarGUI.getCadastrarFuncionarioPanel().getNomeFuncionarioField().getText(), cadastrarGUI.getCadastrarFuncionarioPanel().getCpfFuncionarioField().getText()
							, cadastrarGUI.getCadastrarFuncionarioPanel().getFoneFuncionarioField().getText(), cadastrarGUI.getCadastrarFuncionarioPanel().getEmailFuncionarioField().getText(), 
							cadastrarGUI.getCadastrarFuncionarioPanel().getMatriculaFuncionarioField().getText(),"feminino"));
				}
				
				else {
					BaseDados.adicionarUsuario(new Funcionario(null, null, cadastrarGUI.getCadastrarFuncionarioPanel().getNomeFuncionarioField().getText(), cadastrarGUI.getCadastrarFuncionarioPanel().getCpfFuncionarioField().getText()
							, cadastrarGUI.getCadastrarFuncionarioPanel().getFoneFuncionarioField().getText(), cadastrarGUI.getCadastrarFuncionarioPanel().getEmailFuncionarioField().getText(), 
							cadastrarGUI.getCadastrarFuncionarioPanel().getMatriculaFuncionarioField().getText(),"masculino"));
				}
			}
			
		}
		
	}
	
	private class MouseTratadora extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == cadastrarGUI.getSairMenu()) {
				cadastrarGUI.getPrincipalPanel().setVisible(false);
				cadastrarGUI.setPrincipalPanel(null);
				System.exit(0);
			}
		}
		
	}

}
