package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import model.SpringUtilities;


public class TelaCadastro extends JFrame{
	JLabel clienteLabel, nomeLabel, cpfLabel, desejaSairLabel;
	JTextField nomeField;
	JFormattedTextField  cpfField;
	JButton adicionarButton, simButton, naoButton;
	JMenuBar menuBarra;
	JMenu menuCadastrar, menuSair;
	JMenuItem clienteItem;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public TelaCadastro() {
		
		setSize(300,200);
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
		clienteItem.setAccelerator();
		
		
		menuBarra.add(menuCadastrar);
		menuBarra.add(menuSair);
		menuCadastrar.add(clienteItem);
		
		/*Tela Cadastro*/
		
		JPanel panelPrincipal = new JPanel(new SpringLayout());
		JPanel panelCabecalho = new JPanel(new GridBagLayout());
		/*Configura o cabeçalho*/
		clienteLabel = new JLabel("Cliente");
		clienteLabel.setFont(new Font("Arial", Font.BOLD,30));
		gbc.gridx = 2;
		gbc.gridy = 2;
		
		/*Configura o principal*/
		
		nomeLabel = new JLabel("Nome");

		
		nomeField = new JTextField("Nome completo");
		try {
			cpfLabel = new JLabel("Cpf");
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		panelCabecalho.add(clienteLabel, gbc);
		
		panelPrincipal.add(nomeLabel);
		panelPrincipal.add(nomeField);
		panelPrincipal.add(cpfLabel);
		panelPrincipal.add(cpfField);
		
		SpringUtilities.makeCompactGrid(panelPrincipal,2,2,6,6,6,6);
		
		
		/*Configura o botão final*/
		
		JPanel panelButton = new JPanel(new GridBagLayout());		
		adicionarButton = new JButton("Adicionar");
		gbc.gridx = 2;
		gbc.gridy = 2;
		panelButton.add(adicionarButton, gbc);

		add(panelCabecalho, BorderLayout.NORTH);
		add(panelPrincipal, BorderLayout.CENTER);
		add(panelButton,BorderLayout.PAGE_END);
		
		panelCabecalho.setVisible(false);
		panelPrincipal.setVisible(false);
		panelButton.setVisible(false);
		
		
		setVisible(true);
		
		
	}

	public JLabel getClienteLabel() {
		return clienteLabel;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JLabel getDesejaSairLabel() {
		return desejaSairLabel;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JFormattedTextField getCpfField() {
		return cpfField;
	}

	public JButton getAdicionarButton() {
		return adicionarButton;
	}

	public JButton getSimButton() {
		return simButton;
	}

	public JButton getNaoButton() {
		return naoButton;
	}

	public JMenuBar getMenuBarra() {
		return menuBarra;
	}

	public JMenu getMenuCadastrar() {
		return menuCadastrar;
	}

	public JMenu getMenuSair() {
		return menuSair;
	}

	public JMenuItem getClienteItem() {
		return clienteItem;
	}
	
	
	
	
}
