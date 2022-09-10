package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
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
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import questao1.SpringUtilities;

public class Tela extends JFrame{
	JButton button1;
	JLabel labelTitulo, labelTipo, labelNome, labelCPF, labelFone, labelEmail;
	JTextField nomeField, cpfField, foneField, emailField;
	JCheckBox checkBox;
	JRadioButton opcaoCliente, opcaoFuncionario;
	ButtonGroup buttonGroup;
	JPanel panelHeader, panelMain, panelMainButton, panelFooter;
	
	
	public Tela() throws HeadlessException {
		super("Gerenciar Dados");
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		//HEADER
		labelTitulo = new JLabel("Cadastrar");
		labelTitulo.setFont(new Font("", Font.BOLD, 20));
		
		
		panelHeader = new JPanel(new BorderLayout());
		panelHeader.add(labelTitulo, BorderLayout.NORTH);		
		add(panelHeader, BorderLayout.NORTH);
		
		//MAIN
		
		panelMain = new JPanel();
		
		
		//Buttons
		labelTipo = new JLabel("Tipo: ");
		opcaoCliente = new JRadioButton("Cliente", true);
		opcaoFuncionario = new JRadioButton("Funcionario");
		//Input
		labelNome = new JLabel("Nome: ");
		labelCPF = new JLabel("CPF: ");
		labelFone = new JLabel("Fone: ");		
		labelEmail = new JLabel("Email: ");
		
		nomeField = new JTextField(10);
		emailField = new JTextField(10);
	
		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###.##"));
			cpfField.setColumns(9);
			foneField = new JFormattedTextField(new MaskFormatter("(##) 9-####-####"));
			foneField.setColumns(10);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		panelMainButton = new JPanel();
		panelMainButton.add(opcaoCliente);
		panelMainButton.add(opcaoFuncionario);
		
		panelMain.add(labelTipo);
		panelMain.add(panelMainButton);
		panelMain.add(labelNome);
		panelMain.add(nomeField);
		panelMain.add(labelCPF);
		panelMain.add(cpfField);
		panelMain.add(labelFone);
		panelMain.add(foneField);
		
		add(panelMain, BorderLayout.CENTER);
		
		//SpringUtilities.makeCompactGrid(panelMain, 6, 2, 6, 6, 6, 6);
		
		setVisible(true);
	}

}
