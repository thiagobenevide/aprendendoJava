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

public class CadastroGUI extends JFrame {

	JMenu jMenuCadastrar, jMenuSair; // CRIA O PRIMEIRO MENU
	JMenuBar jMenuBar; //cria a barra de menu
	JMenuItem cliMenuItem; // CRIA O ITEM DO MENU
	ClientePanel clientePanel;
	JPanel panelPrincipal;
	
	public CadastroGUI() {
		super("Cadastro");
		
		setSize(250, 250);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		jMenuBar = new JMenuBar();
		
		jMenuSair = new JMenu("Sair");
		jMenuCadastrar = new JMenu("Cadastrar");
		
		cliMenuItem = new JMenuItem("Cliente");
		
		cliMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		
		jMenuCadastrar.add(cliMenuItem);
		
		jMenuBar.add(jMenuCadastrar);
		jMenuBar.add(jMenuSair);
		
		setJMenuBar(jMenuBar);
		
		panelPrincipal = new JPanel();
		
		panelPrincipal.setVisible(false);
		
		ClientePanel clientePanel = new ClientePanel();
		
		
		setVisible(false);
	}

	public JMenu getjMenuCadastrar() {
		return jMenuCadastrar;
	}

	public JMenu getjMenuSair() {
		return jMenuSair;
	}

	public JMenuBar getjMenuBar() {
		return jMenuBar;
	}

	public JMenuItem getCliMenuItem() {
		return cliMenuItem;
	}

	public ClientePanel getClientePanel() {
		return clientePanel;
	}

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	
}
