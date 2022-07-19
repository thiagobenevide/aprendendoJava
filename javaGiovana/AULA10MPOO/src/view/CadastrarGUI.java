package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CadastrarGUI extends JFrame {

	JMenuBar menuBar;
	JMenu cadastrarMenu, sairMenu;
	JMenuItem menuFuncionario, menuCliente, exit;
	CadastrarClientePanel cadastrarClientePanel;
	
	public CadastrarGUI() {
		super("Cadastro");
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		menuBar = new JMenuBar();
		
		cadastrarMenu = new JMenu("Cadastrar");
		menuBar.add(cadastrarMenu);
		
		menuCliente = new JMenuItem("Cliente");
		cadastrarMenu.add(menuCliente);
		
		menuFuncionario = new JMenuItem("Funcionario");
		cadastrarMenu.add(menuFuncionario);
		
		exit = new JMenuItem("Exit");
		cadastrarMenu.add(exit);
		
		sairMenu = new JMenu("Sair");
		menuBar.add(sairMenu);
		
		setJMenuBar(menuBar);
		
		cadastrarClientePanel = new CadastrarClientePanel();
		add(cadastrarClientePanel.tituloLabel, BorderLayout.NORTH);
		add(cadastrarClientePanel.painelCentral, BorderLayout.CENTER);
		add(cadastrarClientePanel.propaganda, BorderLayout.PAGE_END);
		add(cadastrarClientePanel.adicionarButton, BorderLayout.EAST);
		
		cadastrarClientePanel.painelCentral.setVisible(false);
		cadastrarClientePanel.tituloLabel.setVisible(false);
		cadastrarClientePanel.propaganda.setVisible(false);
		cadastrarClientePanel.adicionarButton.setVisible(false);
		
		setVisible(false);
	}

	public JMenu getCadastrarMenu() {
		return cadastrarMenu;
	}

	public JMenu getSairMenu() {
		return sairMenu;
	}

	public JMenuItem getMenuFuncionario() {
		return menuFuncionario;
	}

	public JMenuItem getMenuCliente() {
		return menuCliente;
	}

	public JMenuItem getExit() {
		return exit;
	}

	public CadastrarClientePanel getCadastrarClientePanel() {
		return cadastrarClientePanel;
	}
	
}
