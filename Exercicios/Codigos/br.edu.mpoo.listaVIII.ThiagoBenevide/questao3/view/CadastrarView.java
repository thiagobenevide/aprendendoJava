package view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastrarView extends JFrame{
	JLabel cadastrarLabel, tipoLabel, nomeLabel, cpfLabel, foneLabel, emailLabel, salarioLabel, matriculaLabel;
	JTextField nomeField, foneField, emailField, salarioField, matriculaField;
	JFormattedTextField cpfFormatField;
	JRadioButton clienteRadio, funcionarioRadio;
	JButton adicionarButton;

	JCheckBox aceitarPropagandaCheckBox;
	ButtonGroup tipoGroup;
	JPanel panelGroup, panelHeader;
	
	
	public CadastrarView() {
		setSize(330,220);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cadastrarLabel = new JLabel("Cadastrar");
		cadastrarLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		tipoLabel = new JLabel("Tipo");
		nomeLabel = new JLabel("Nome: ");
		cpfLabel = new JLabel("CPF: ");
		foneLabel = new JLabel("Fone: ");
		emailLabel = new JLabel("E-mail: ");
		matriculaLabel = new JLabel("Matrícula: ");
		matriculaLabel.setVisible(false);
		salarioLabel = new JLabel("Salário: ");
		salarioLabel.setVisible(false);
		
		clienteRadio = new JRadioButton("Cliente", true);
		funcionarioRadio = new JRadioButton("Funcionario");
		
		tipoGroup = new ButtonGroup();
		tipoGroup.add(clienteRadio);
		tipoGroup.add(funcionarioRadio);
		
		panelGroup = new JPanel();
		panelGroup.add(tipoLabel);
		panelGroup.add(clienteRadio);
		panelGroup.add(funcionarioRadio);
		
		nomeField = new JTextField(25);
		foneField = new JTextField(25);
		emailField = new JTextField(25);
		matriculaField = new JTextField(20);
		matriculaField.setVisible(false);
		salarioField = new JTextField(20);
		salarioField.setVisible(false);
		
		try {
			cpfFormatField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfFormatField.setColumns(25);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		add(cadastrarLabel);
		add(panelGroup);
		add(nomeLabel);
		add(nomeField);
		add(cpfLabel);
		add(cpfFormatField);
		add(foneLabel);
		add(foneField);
		add(emailLabel);
		add(emailField);
		add(matriculaLabel);
		add(matriculaField);
		add(salarioLabel);
		add(salarioField);
		
		
		aceitarPropagandaCheckBox = new JCheckBox("Aceita receber propaganda");
		adicionarButton = new JButton("Adicionar");
		
		add(aceitarPropagandaCheckBox);
		add(adicionarButton);
		
		
		
		
		
		
		
		
		
		setVisible(true);
	}

	
	public JTextField getSalarioField() {
		return salarioField;
	}


	public void setSalarioField(JTextField salarioField) {
		this.salarioField = salarioField;
	}


	public JLabel getSalarioLabel() {
		return salarioLabel;
	}


	public JLabel getMatriculaLabel() {
		return matriculaLabel;
	}


	public JTextField getMatriculaField() {
		return matriculaField;
	}


	public void setMatriculaField(JTextField matriculaField) {
		this.matriculaField = matriculaField;
	}


	public void setAdicionarButton(JButton adicionarButton) {
		this.adicionarButton = adicionarButton;
	}



	public JTextField getNomeField() {
		return nomeField;
	}


	public JTextField getFoneField() {
		return foneField;
	}


	public JTextField getEmailField() {
		return emailField;
	}


	public JFormattedTextField getCpfFormatField() {
		return cpfFormatField;
	}


	public JRadioButton getClienteRadio() {
		return clienteRadio;
	}


	public JRadioButton getFuncionarioRadio() {
		return funcionarioRadio;
	}


	public JButton getAdicionarButton() {
		return adicionarButton;
	}


	public JCheckBox getAceitarPropagandaCheckBox() {
		return aceitarPropagandaCheckBox;
	}
	
	
	
}
