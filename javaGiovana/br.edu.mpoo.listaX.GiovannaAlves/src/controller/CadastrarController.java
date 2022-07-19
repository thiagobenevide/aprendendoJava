package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import model.BaseDados;
import model.Cliente;
import model.CpfException;
import model.Funcionario;
import model.Pessoa;
import model.Validador;
import view.CadastrarGUI;
import view.JOPtionPane;

public class CadastrarController implements FocusListener, CaretListener {

	CadastrarGUI cadastrarGUI;
	MenuHandler menuHandler;
	ButtonHandler buttonHandler;
	KeyHandler keyHandler;
	private boolean status;
	private boolean telaCliente;
	
	public CadastrarController(CadastrarGUI cadastrarGUI) {
		
		this.cadastrarGUI = cadastrarGUI;
		
		buttonHandler = new ButtonHandler();
		menuHandler = new MenuHandler();
		keyHandler = new KeyHandler();
		
		controll();
	}
	
	private void controll() {
		
		// --------------- cof ação de menu
		
		cadastrarGUI.getClienteItem().addActionListener(menuHandler);
		cadastrarGUI.getFuncionarioItem().addActionListener(menuHandler);
		
		// --------------- cof ação de botao
		
		cadastrarGUI.getClienteGUI().getAdicionarClienteButton().addActionListener(buttonHandler);
		cadastrarGUI.getFuncionarioGUI().getAdicionarFuncionarioButton().addActionListener(buttonHandler);
		
		// --------------- cof ação de digitar
		
		cadastrarGUI.getClienteGUI().getCpfField().addKeyListener(keyHandler);
		cadastrarGUI.getFuncionarioGUI().getCpfField().addKeyListener(keyHandler);
		
		// --------------- ação de liberar botao (TELA CLIENTE)
		
		cadastrarGUI.getClienteGUI().getNomeField().addCaretListener(this);
		cadastrarGUI.getClienteGUI().getCpfField().addCaretListener(this);
		cadastrarGUI.getClienteGUI().getFoneField().addCaretListener(this);
		cadastrarGUI.getClienteGUI().getEmailField().addCaretListener(this);
		
		// --------------- ação de liberar botao (TELA FUNCIONARIO)
		
		cadastrarGUI.getFuncionarioGUI().getNomeField().addCaretListener(this);
		cadastrarGUI.getFuncionarioGUI().getCpfField().addCaretListener(this);
		cadastrarGUI.getFuncionarioGUI().getFoneField().addCaretListener(this);
		cadastrarGUI.getFuncionarioGUI().getEmailField().addCaretListener(this);
		cadastrarGUI.getFuncionarioGUI().getMatriculaField().addCaretListener(this);
		
		// --------------- nome ação de focar e desfocar
		
		cadastrarGUI.getClienteGUI().getNomeField().addFocusListener(this);
		cadastrarGUI.getFuncionarioGUI().getNomeField().addFocusListener(this);
		
	}
	
	private void update(JPanel panel) {
		
		if (cadastrarGUI.getPanelPrincipal() != null) {
			
			cadastrarGUI.getPanelPrincipal().setVisible(false);
			cadastrarGUI.setPanelPrincipal(null);
			
			cadastrarGUI.setPanelPrincipal(panel);
			cadastrarGUI.add(cadastrarGUI.getPanelPrincipal());
			cadastrarGUI.getPanelPrincipal().setVisible(true);
			
		} else {
			
			cadastrarGUI.setPanelPrincipal(panel);
			cadastrarGUI.add(cadastrarGUI.getPanelPrincipal());
			cadastrarGUI.getPanelPrincipal().setVisible(true);
			
		}
		
	}
	
	private void adicionarCLiente(String sexo, boolean checkBox) {
		try {
			BaseDados.adicionarPessoa(new Cliente(cadastrarGUI.getClienteGUI().getNomeField().getText(), 
					cadastrarGUI.getClienteGUI().getCpfField().getText(), 
					cadastrarGUI.getClienteGUI().getFoneField().getText(), 
					cadastrarGUI.getClienteGUI().getEmailField().getText(), sexo, checkBox));
			new JOPtionPane("Cliente adicionado com sucesso!");
		} catch (CpfException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			new JOPtionPane(e1.getMessage());
		}
	}
	
	private void adicionarFuncionario(String sexo) {
		try {
			BaseDados.adicionarPessoa(new Funcionario(cadastrarGUI.getFuncionarioGUI().getNomeField().getText(), 
					cadastrarGUI.getFuncionarioGUI().getCpfField().getText(), 
					cadastrarGUI.getFuncionarioGUI().getFoneField().getText(), 
					cadastrarGUI.getFuncionarioGUI().getEmailField().getText(), sexo,
					cadastrarGUI.getFuncionarioGUI().getMatriculaField().getText()));
			new JOPtionPane("Funcionario adicionado com sucesso!");
		} catch (CpfException e1) {
			e1.printStackTrace();
			new JOPtionPane(e1.getMessage());
		}
	}
	
	private class MenuHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == cadastrarGUI.getClienteItem()) {
				update(cadastrarGUI.getClienteGUI());
				telaCliente = true;
			}
			
			if (e.getSource() == cadastrarGUI.getFuncionarioItem()) {
				telaCliente = false;
				update(cadastrarGUI.getFuncionarioGUI());
			}
			
		}
		
	}
	
	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == cadastrarGUI.getClienteGUI().getAdicionarClienteButton()) {
				if (cadastrarGUI.getClienteGUI().getFemininoRadioButton().isSelected()) {
					if (cadastrarGUI.getClienteGUI().getPropagandaCheckBox().isSelected()) {
						adicionarCLiente("Feminino", true);
					}
					else {
						adicionarCLiente("Feminino", false);
					}
				}
				
				if (cadastrarGUI.getClienteGUI().getMasculinoRadioButton().isSelected()) {
					if (cadastrarGUI.getClienteGUI().getPropagandaCheckBox().isSelected()) {
						adicionarCLiente("Masculino", true);
					}
					else {
						adicionarCLiente("Masculino", false);
					}
				}
			}
			
			if (e.getSource() == cadastrarGUI.getFuncionarioGUI().getAdicionarFuncionarioButton()) {

				if (cadastrarGUI.getFuncionarioGUI().getFemininoRadioButton().isSelected()) {	
					adicionarFuncionario("Feminino");
				}
				
				if (cadastrarGUI.getFuncionarioGUI().getMasculinoRadioButton().isSelected()) {
					adicionarFuncionario("Masculino");
				}
			}
			
		}
		
	}

	private class KeyHandler extends KeyAdapter {

		@Override
		public void keyReleased(KeyEvent e) {
			
			String cpfFormatedCliente = cadastrarGUI.getClienteGUI().getCpfField().getText().replace(".", "").replace("-", "");
			String cpfFormatedFuncionario = cadastrarGUI.getFuncionarioGUI().getCpfField().getText().replace(".", "").replace("-", "");
			
			try {
				if (telaCliente == true) {
					
					if (e.getSource() == cadastrarGUI.getClienteGUI().getCpfField()) {

						if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
							status = false;
							cadastrarGUI.getClienteGUI().getAdicionarClienteButton().setEnabled(false);
						}
						
						if ((cpfFormatedCliente.length() == 11) && Validador.validarCPF(cpfFormatedCliente)) {
							status = true;	
						}
						
					}
				}
				
				if (telaCliente == false) {
					
					if (e.getSource() == cadastrarGUI.getFuncionarioGUI().getCpfField()) {

						if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
							status = false;
							cadastrarGUI.getFuncionarioGUI().getAdicionarFuncionarioButton().setEnabled(false);
						}
						
						if ((cpfFormatedFuncionario.length() == 11) && Validador.validarCPF(cpfFormatedFuncionario)) {
							status = true;
						}
					}
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
	}

	@Override
	public void caretUpdate(CaretEvent e) {
		
		if (telaCliente == true) {
			
			if (cadastrarGUI.getClienteGUI().getNomeField().getText().length() != 0 &&
					!cadastrarGUI.getClienteGUI().getNomeField().getText().contains("Nome completo") &&
					cadastrarGUI.getClienteGUI().getFoneField().getText().length() != 0 &&
					cadastrarGUI.getClienteGUI().getEmailField().getText().length() != 0) {
				if (status == true) {
					cadastrarGUI.getClienteGUI().getAdicionarClienteButton().setEnabled(true);
				}
			}
			
			else {
				cadastrarGUI.getClienteGUI().getAdicionarClienteButton().setEnabled(false);
			}
		}
		
		if (telaCliente == false) {

			if (cadastrarGUI.getFuncionarioGUI().getNomeField().getText().length() != 0 &&
					!cadastrarGUI.getFuncionarioGUI().getNomeField().getText().contains("Nome completo") &&
					cadastrarGUI.getFuncionarioGUI().getFoneField().getText().length() != 0 &&
					cadastrarGUI.getFuncionarioGUI().getEmailField().getText().length() != 0 &&
					cadastrarGUI.getFuncionarioGUI().getMatriculaField().getText().length() != 0) {
				
				if (status== true) {
					cadastrarGUI.getFuncionarioGUI().getAdicionarFuncionarioButton().setEnabled(true);
				}
				
				else {
					cadastrarGUI.getFuncionarioGUI().getAdicionarFuncionarioButton().setEnabled(false);
				}
			}
			
			else {
				cadastrarGUI.getFuncionarioGUI().getAdicionarFuncionarioButton().setEnabled(false);
			}
		}
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		
		if (telaCliente == true) {
			if (e.getSource() == cadastrarGUI.getClienteGUI().getNomeField()) {
				cadastrarGUI.getClienteGUI().getNomeField().setText("");
				cadastrarGUI.getClienteGUI().getNomeField().setForeground(Color.BLACK);
			}
		}
		
		if (telaCliente == false) {
			if (e.getSource() == cadastrarGUI.getFuncionarioGUI().getNomeField()) {
				cadastrarGUI.getFuncionarioGUI().getNomeField().setText("");
				cadastrarGUI.getFuncionarioGUI().getNomeField().setForeground(Color.BLACK);
			}
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		
		if (status == true) {
			if (e.getSource() == cadastrarGUI.getClienteGUI().getNomeField()) {
				cadastrarGUI.getClienteGUI().getNomeField().setText("Nome completo");
				cadastrarGUI.getClienteGUI().getNomeField().setForeground(Color.LIGHT_GRAY);
			}
		}
		
		if (status == false) {
			if (e.getSource() == cadastrarGUI.getClienteGUI().getNomeField()) {
				cadastrarGUI.getFuncionarioGUI().getNomeField().setText("Nome completo");
				cadastrarGUI.getFuncionarioGUI().getNomeField().setForeground(Color.LIGHT_GRAY);
			}
		}
		
	}
	
	
	
	
	
	
	
	
}
