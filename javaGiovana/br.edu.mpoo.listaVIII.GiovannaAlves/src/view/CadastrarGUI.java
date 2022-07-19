package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class CadastrarGUI extends JFrame {

	JMenuBar menuBar;
	JMenu cadastrarMenu, sairMenu;
	JMenuItem menuFuncionario, menuCliente, exit;
	CadastrarClientePanel cadastrarClientePanel;
	CadastrarFuncionarioPanel cadastrarFuncionarioPanel;
	private JPanel principalPanel;
	
	public CadastrarGUI() {
		super("Cadastro");
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
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
		
		principalPanel = new JPanel();
		
		principalPanel.setVisible(false);
		
		cadastrarClientePanel = new CadastrarClientePanel();
				
		cadastrarFuncionarioPanel = new CadastrarFuncionarioPanel();
		
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

	public CadastrarFuncionarioPanel getCadastrarFuncionarioPanel() {
		return cadastrarFuncionarioPanel;
	}

	public JPanel getPrincipalPanel() {
		return principalPanel;
	}

	public void setPrincipalPanel(JPanel principalPanel) {
		this.principalPanel = principalPanel;
	}
}
