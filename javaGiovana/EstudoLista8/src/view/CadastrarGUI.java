package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

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
		
		sairMenu = new JMenu("Sair");
		menuBar.add(sairMenu);
		
		
		menuCliente = new JMenuItem("Cliente");
		menuCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		
		
		menuFuncionario = new JMenuItem("Funcionário");
		menuFuncionario.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.ALT_MASK));
		
		exit = new JMenuItem("Exit");
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
		
		cadastrarMenu.add(menuCliente);
		cadastrarMenu.add(menuFuncionario);
		cadastrarMenu.add(exit);
		
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
