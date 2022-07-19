package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame {

	JMenuBar menuBar;
	JMenu menuCadastrar, menuSair;
	JMenuItem menuClienteItem;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	JLabel tituloLabel, nomeLabel, cpfLabel;
	JTextField nomeField, cpfField;
	JButton adicionarButton;
	JPanel painelCentral, painelButton, painelTitulo; 
	
	public TelaCadastro() {
		super("Cadastro");
		
		setSize(300, 200);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout()); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		
		menuCadastrar = new JMenu("Cadastrar");
		menuBar.add(menuCadastrar);
		
		menuSair = new JMenu("Sair");
		menuBar.add(menuSair);
		
		menuClienteItem = new JMenuItem("Cliente");
		
		menuClienteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		
		menuCadastrar.add(menuClienteItem);

		setJMenuBar(menuBar);
		
		//-----------------------------//
		
		tituloLabel = new JLabel("Cliente");
		tituloLabel.setFont(new Font("", Font.BOLD, 20));
		
		gbc.gridx = 2;
		gbc.gridy = 2;
		
		painelTitulo = new JPanel(new GridBagLayout());
		
		painelTitulo.add(tituloLabel, gbc);
		
		add(painelTitulo, BorderLayout.NORTH);
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField("Nome Completo",10);
		nomeField.setForeground(Color.LIGHT_GRAY);
		
		try {
			
			cpfLabel = new JLabel("CPF: ");
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(10);
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		painelCentral = new JPanel(new SpringLayout());
	
		painelCentral.add(nomeLabel);
		painelCentral.add(nomeField);
		painelCentral.add(cpfLabel);
		painelCentral.add(cpfField);
		
		util.SpringUtilities.makeCompactGrid(painelCentral, 2, 2, 6, 6, 6, 6);
		
		add(painelCentral, BorderLayout.CENTER);
		
		adicionarButton = new JButton("Adicionar");
		gbc.gridx = 2;
		gbc.gridy = 2;
		
		painelButton = new JPanel(new GridBagLayout());
		
		painelButton.add(adicionarButton, gbc);
		
		adicionarButton.setEnabled(false); // botao inativo
		
		add(painelButton, BorderLayout.PAGE_END);
		
		
		painelButton.setVisible(false);
		
		painelTitulo.setVisible(false);
		
		painelCentral.setVisible(false);
		
		setVisible(true);
	}

	public JMenu getMenuCadastrar() {
		return menuCadastrar;
	}

	public JMenu getMenuSair() {
		return menuSair;
	}

	public JMenuItem getMenuClienteItem() {
		return menuClienteItem;
	}

	public JLabel getTituloLabel() {
		return tituloLabel;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JButton getAdicionarButton() {
		return adicionarButton;
	}
	public JPanel getPainelCentral() {
		return painelCentral;
	}

	public JPanel getPainelButton() {
		return painelButton;
	}

	public JPanel getPainelTitulo() {
		return painelTitulo;
	}
	
}
