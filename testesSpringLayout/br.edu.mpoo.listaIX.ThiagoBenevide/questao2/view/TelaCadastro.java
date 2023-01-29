package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame{
	JLabel clienteLabel, nomeLabel, cpfLabel, desejaSairLabel;
	JTextField nomeField, cpfField;
	JButton adicionarButton, simButton, naoButton;
	JMenuBar menuBarra;
	JMenu menuCadastrar, menuSair;
	JMenuItem clienteItem;
	
	public TelaCadastro() {
		
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setResizable(false);
		
		/*Primeira Tela*/
		
		menuBarra = new JMenuBar();
		setJMenuBar(menuBarra);
		
		menuCadastrar = new JMenu("Cadastrar");
		menuSair = new JMenu("Sair");
		clienteItem = new JMenuItem("Cliente");
		
		
		menuBarra.add(menuCadastrar);
		menuBarra.add(menuSair);
		menuCadastrar.add(clienteItem);
		
		/*Tela Cadastro*/
		
		JPanel principal = new JPanel(new BorderLayout());
		
		clienteLabel = new JLabel("Cliente");
		clienteLabel.setFont(new Font("Arial", Font.BOLD,20));
		nomeLabel = new JLabel("Nome");
		cpfLabel = new JLabel("Cpf");
		
		principal.add(clienteLabel, setLayout());
		
		
		adicionarButton = new JButton("Adicionar");
		
		add(principal);
		
		
		
		

		
		setVisible(true);
		
		
	}
	
	
}
