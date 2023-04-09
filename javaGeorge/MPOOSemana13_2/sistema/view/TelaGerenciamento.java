package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;

public class TelaGerenciamento extends JFrame{
	JMenuBar menuBar;
	JMenu gerenciarMenu, controleMenu, sairMenu, usuarioMenu;
	JMenuItem cadastrarUsuarioMenuItem, removerUsuarioMenuItem, buscarUsuarioMenuItem, atualizarUsuarioMenuItem;
//				demonstrativoMenuItem, verificadorMenuItem;
	
	String titulo;
	JLabel tituloLabel;
	CadastrarUsuarioPanel cadastrarProdutoPanel; //panel do forms
	
	JPanel containerCadastrarPanel;
	JScrollPane scrollContainerPanel;
	

	public TelaGerenciamento(){
		super("MPOO System");
		setSize(350, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		
		gerenciarMenu = new JMenu("Gerenciar");
		gerenciarMenu.setMnemonic(KeyEvent.VK_G);
		controleMenu = new JMenu("Controle");
		controleMenu.setMnemonic(KeyEvent.VK_C);
		sairMenu = new JMenu("Sair");
		sairMenu.setMnemonic(KeyEvent.VK_S);
		
		usuarioMenu = new JMenu("Usuario");
		usuarioMenu.setMnemonic(KeyEvent.VK_P);
		
		cadastrarUsuarioMenuItem = new JMenuItem("Cadastrar");
		cadastrarUsuarioMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.ALT_MASK));
		buscarUsuarioMenuItem = new JMenuItem("Buscar");
		buscarUsuarioMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.ALT_MASK));
		atualizarUsuarioMenuItem = new JMenuItem("Atualizar");
		atualizarUsuarioMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
		removerUsuarioMenuItem = new JMenuItem("Remover");
		removerUsuarioMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.ALT_MASK));
		
		menuBar.add(gerenciarMenu);
		menuBar.add(controleMenu);
		menuBar.add(sairMenu);
		usuarioMenu.add(cadastrarUsuarioMenuItem);
		usuarioMenu.add(buscarUsuarioMenuItem);
		usuarioMenu.add(atualizarUsuarioMenuItem);
		usuarioMenu.add(removerUsuarioMenuItem);
		gerenciarMenu.add(usuarioMenu);
		setJMenuBar(menuBar);
		
		tituloLabel = new JLabel(CadastrarUsuarioPanel.tituloPanel);
		tituloLabel.setFont(new Font("", Font.BOLD, 20));
		tituloLabel.setForeground(Color.DARK_GRAY);
		tituloLabel.setAlignmentX(LEFT_ALIGNMENT);
		
		cadastrarProdutoPanel = new CadastrarUsuarioPanel();
		
		tituloLabel.setFocusable(true);//a principio o título vai ficar em foco
		
		containerCadastrarPanel = new JPanel();
		containerCadastrarPanel.setPreferredSize(new Dimension(250, 300));
		scrollContainerPanel = new JScrollPane(containerCadastrarPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		containerCadastrarPanel.add(tituloLabel, BorderLayout.NORTH);
		containerCadastrarPanel.add(cadastrarProdutoPanel, BorderLayout.CENTER);
		
		add(scrollContainerPanel);
		containerCadastrarPanel.setVisible(false);
	}


	public JMenu getGerenciarMenu() {
		return gerenciarMenu;
	}


	public JMenu getControleMenu() {
		return controleMenu;
	}


	public JMenu getSairMenu() {
		return sairMenu;
	}


	public JMenu getUsuarioMenu() {
		return usuarioMenu;
	}


	public JMenuItem getCadastrarUsuarioMenuItem() {
		return cadastrarUsuarioMenuItem;
	}


	public JMenuItem getRemoverUsuarioMenuItem() {
		return removerUsuarioMenuItem;
	}


	public JMenuItem getBuscarUsuarioMenuItem() {
		return buscarUsuarioMenuItem;
	}


	public JMenuItem getAtualizarUsuarioMenuItem() {
		return atualizarUsuarioMenuItem;
	}


	public String getTitulo() {
		return titulo;
	}


	public JLabel getTituloLabel() {
		return tituloLabel;
	}


	public CadastrarUsuarioPanel getCadastrarProdutoPanel() {
		return cadastrarProdutoPanel;
	}


	public JPanel getContainerPanel() {
		return containerCadastrarPanel;
	}


	public JScrollPane getScrollContainerPanel() {
		return scrollContainerPanel;
	}
}


