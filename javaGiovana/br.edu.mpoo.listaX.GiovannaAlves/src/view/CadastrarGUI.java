package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class CadastrarGUI extends JFrame {

	JMenu cadastrarMenu, sairMenu;
	JMenuBar menuBar;
	JMenuItem clienteItem, funcionarioItem;
	private JPanel panelPrincipal;
	ClienteGUI clienteGUI;
	FuncionarioGUI funcionarioGUI;
	
	public CadastrarGUI() throws Exception {
		super("Cadastro");
		
		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		
		cadastrarMenu = new JMenu("Cadastrar");
		
		sairMenu = new JMenu("Sair");
		
		clienteItem = new JMenuItem("Cliente");
		clienteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		
		
		funcionarioItem = new JMenuItem("Funcionario");
		funcionarioItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.ALT_MASK));
		
		
		cadastrarMenu.add(clienteItem);
		cadastrarMenu.add(funcionarioItem);
		
		menuBar.add(cadastrarMenu);
		menuBar.add(sairMenu);
		
		setJMenuBar(menuBar);
		
		panelPrincipal = new JPanel();
		
		panelPrincipal.setVisible(false);
		
		clienteGUI = new ClienteGUI();
		
		funcionarioGUI = new FuncionarioGUI();
		
		setVisible(false);
		
	}

	public JMenu getCadastrarMenu() {
		return cadastrarMenu;
	}

	public JMenu getSairMenu() {
		return sairMenu;
	}

	public JMenuItem getClienteItem() {
		return clienteItem;
	}

	public JMenuItem getFuncionarioItem() {
		return funcionarioItem;
	}

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public ClienteGUI getClienteGUI() {
		return clienteGUI;
	}

	public FuncionarioGUI getFuncionarioGUI() {
		return funcionarioGUI;
	}

	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	
}
