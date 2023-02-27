package sistema.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.text.Format;

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

import sistema.util.SpringUtilities;

public class TelaCadastro extends JFrame{
	JTextField nomeField, cpfField, foneField, emailField, matriculaField;
	JLabel cadastrarLabel, tipoLabel, nomeLabel, cpfLabel, foneLabel, emailLabel, matriculaLabel;
	JButton adicionarButton;
	JRadioButton clienteRadio, funcionarioRadio;
	JCheckBox aceitaPropagandaBox;
	ButtonGroup grupoBotao;
	JPanel panelPrincipal, panelTitulo, panelRadioButton;
	
	public TelaCadastro() {
		setSize(600, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
		//Criar os panels
		panelTitulo = new JPanel(new BorderLayout());
		panelPrincipal = new JPanel(new SpringLayout());
		panelRadioButton = new JPanel(new SpringLayout());
		grupoBotao = new ButtonGroup();
		
		//Panel Titulo
		cadastrarLabel = new JLabel("Cadastrar");
		cadastrarLabel.setFont(new Font("", Font.BOLD, 20));
		
		
		//Panel Principal
		
		//Linha 1
		tipoLabel = new JLabel("Tipo: ");
		clienteRadio = new JRadioButton("Cliente", true);
		funcionarioRadio = new JRadioButton("Funcionario");
		//Linha2
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField();
		nomeField.setColumns(30);
		//Linha 3		
		try {
			cpfLabel = new JLabel("CPF: ");
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(10);
		}catch(Exception e) {
			
		}
		//Linha 4
		try {
			foneLabel = new JLabel("Fone: ");
			foneField = new JFormattedTextField( new MaskFormatter("(##) 9-####-####"));
			foneField.setColumns(10);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		emailLabel = new JLabel("Email: ");
		emailField = new JTextField();
		emailField.setColumns(30);
		
		matriculaLabel = new  JLabel("Matricula: ");
		matriculaField = new JTextField();
		matriculaField.setColumns(10);
		
		//Fora
		aceitaPropagandaBox = new JCheckBox("Aceito Receber Propagandas");
		adicionarButton = new JButton("Adicionar");
		
		//Adicionar
		panelRadioButton.add(clienteRadio);
		panelRadioButton.add(funcionarioRadio);
		grupoBotao.add(clienteRadio);
		grupoBotao.add(funcionarioRadio);
		panelTitulo.add(cadastrarLabel);
		panelPrincipal.add(tipoLabel);
		panelPrincipal.add(panelRadioButton);
		panelPrincipal.add(nomeLabel);
		panelPrincipal.add(nomeField);
		panelPrincipal.add(cpfLabel);
		panelPrincipal.add(cpfField);
		panelPrincipal.add(foneLabel);
		panelPrincipal.add(foneField);
		panelPrincipal.add(emailLabel);
		panelPrincipal.add(emailField);
		panelPrincipal.add(matriculaLabel);
		panelPrincipal.add(matriculaField);
		
		SpringUtilities.makeCompactGrid(panelRadioButton, 1, 2, 4, 4, 4, 4);
		SpringUtilities.makeCompactGrid(panelPrincipal, 6, 2, 4, 4, 4, 4);
		
		
		add(panelTitulo, BorderLayout.NORTH);
		add(panelPrincipal, BorderLayout.CENTER);
		add(adicionarButton, BorderLayout.EAST);
		add(aceitaPropagandaBox, BorderLayout.PAGE_END);
		
		//Visibilidade Padrao
		matriculaLabel.setVisible(false);
		matriculaField.setVisible(false);
		setVisible(true);
		
		
		
		
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

	
	public JLabel getMatriculaLabel() {
		return matriculaLabel;
	}
	
	public JButton getAdicionarButton() {
		return adicionarButton;
	}

	public JRadioButton getClienteRadio() {
		return clienteRadio;
	}

	public JRadioButton getFuncionarioRadio() {
		return funcionarioRadio;
	}

	public JCheckBox getAceitaPropagandaBox() {
		return aceitaPropagandaBox;
	}
	
	
	
}
