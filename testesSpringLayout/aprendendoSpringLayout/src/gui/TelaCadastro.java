package gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import entidade.SpringUtilities;

public class TelaCadastro extends JFrame{
	JLabel cadastrarLabel,tipoLabel, nomeLabel, cpfLabel, foneLabel, emailLabel, matriculaLabel;
	JTextField nomeField, cpfField, foneField, emailField, matriculaField;
	JRadioButton clienteRadio, funcionarioRadio;
	JCheckBox propagandaBox;
	JButton adicionarButton;
	
	
	
	public TelaCadastro() {
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(true);
		
		/*Cadastro*/
		JPanel tituloPanel = new JPanel(new BorderLayout());
		cadastrarLabel = new JLabel("Cadastrar");
		cadastrarLabel.setFont(new Font("", Font.BOLD, 20));
		tituloPanel.add(cadastrarLabel, BorderLayout.NORTH);
		
		/*Tipo*/
		
		JPanel principalPanel = new JPanel(new SpringLayout());
		JPanel radioButtonPanel =  new JPanel(new SpringLayout());
		
		
		tipoLabel = new JLabel("Tipo: ");
		
		
		clienteRadio = new JRadioButton("Cliente", true);
		funcionarioRadio = new JRadioButton("Funcionário");
		radioButtonPanel.add(clienteRadio);
		radioButtonPanel.add(funcionarioRadio);

		ButtonGroup grupoBotao = new ButtonGroup();
		grupoBotao.add(clienteRadio);
		grupoBotao.add(funcionarioRadio);
		
		SpringUtilities.makeCompactGrid(radioButtonPanel, 1, 2, 6, 6, 6, 6);
		add(radioButtonPanel, BorderLayout.CENTER);
		
		/*Nome*/
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField(10);
		
		
		try {
			/*CPF*/
			cpfLabel = new JLabel("CPF: ");
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(10);
			
			
			/*Fone*/
			foneLabel = new JLabel("Fone: ");
			foneField = new JFormattedTextField(new MaskFormatter("(##) 9-####-####"));
			foneField.setColumns(10);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		/*Email*/
		emailLabel = new JLabel("Email: ");
		emailField = new JTextField();
		emailField.setColumns(10);
		
		
		/*Matricula*/
		matriculaLabel = new JLabel("Matricula: ");
		matriculaField = new JTextField();
		
		matriculaLabel.setVisible(false);
		matriculaField.setVisible(false);
		
		/*Adicionar*/
		adicionarButton = new JButton("Adicionar");
		
		
		/*Propaganda*/
		propagandaBox = new JCheckBox("Aceito receber propaganda");
		
		principalPanel.add(tipoLabel);
		principalPanel.add(radioButtonPanel);
		principalPanel.add(nomeLabel);
		principalPanel.add(nomeField);
		principalPanel.add(cpfLabel);
		principalPanel.add(cpfField);
		principalPanel.add(foneLabel);
		principalPanel.add(foneField);
		principalPanel.add(emailLabel);
		principalPanel.add(emailField);
		principalPanel.add(matriculaLabel);
		principalPanel.add(matriculaField);
		
		SpringUtilities.makeCompactGrid(principalPanel, 6, 2, 6, 6, 6, 6);
	
		add(tituloPanel, BorderLayout.NORTH);
		add(principalPanel, BorderLayout.CENTER);
		add(adicionarButton, BorderLayout.EAST);
		add(propagandaBox, BorderLayout.PAGE_END);
		
		
		
		setVisible(false);
		
	}

	public JLabel getCadastrarLabel() {
		return cadastrarLabel;
	}

	public JLabel getTipoLabel() {
		return tipoLabel;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JLabel getFoneLabel() {
		return foneLabel;
	}

	public JLabel getEmailLabel() {
		return emailLabel;
	}

	public JLabel getMatriculaLabel() {
		return matriculaLabel;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getFoneField() {
		return foneField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JTextField getMatriculaField() {
		return matriculaField;
	}

	public JRadioButton getClienteRadio() {
		return clienteRadio;
	}

	public JRadioButton getFuncionarioRadio() {
		return funcionarioRadio;
	}

	public JCheckBox getPropagandaBox() {
		return propagandaBox;
	}

	public JButton getAdicionarButton() {
		return adicionarButton;
	}
	
	

	
	
}
