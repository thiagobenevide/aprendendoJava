package questao1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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

public class Tela extends JFrame{
	JLabel nomeLabel, cpfLabel, foneLabel, emailLabel, tituloLabel, tipoLabel;
	JTextField nomeField, cpfField, foneField, emailField;
	JButton adicionarButton;
	JRadioButton opcao1Radio, opcao2Radio;
	JCheckBox checkBox;
	
	public Tela() {
		super("Gerenciar Dados");
		setSize(400, 300);
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
				
		JPanel panelTitulo = new JPanel(new BorderLayout());
		tituloLabel = new JLabel("Cadastrar");
		panelTitulo.add(tituloLabel);
		
		tipoLabel = new JLabel("Tipo:");
		
		nomeLabel = new JLabel("Nome:");
		nomeField = new JTextField(10);
		
		cpfLabel = new JLabel("CPF:");
		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(8);
		} catch (ParseException e) {
			e.printStackTrace();
			// poderia colocar alguma mensagem de erro de exibição e matar o sistema
		}

		foneLabel = new JLabel("Fone:");
		try {
			foneField = new JFormattedTextField(new MaskFormatter("(##)# ####-####"));
			foneField.setColumns(10);
		} catch (ParseException e) {
			e.printStackTrace();
			// poderia colocar alguma mensagem de erro de exibição e matar o sistema
		}

		emailLabel = new JLabel("E-mail:");
		emailField = new JTextField(10);
		
		opcao1Radio = new JRadioButton("Cliente", true);
		opcao2Radio = new JRadioButton("Funcionário");
		ButtonGroup group = new ButtonGroup();
		group.add(opcao1Radio);
		group.add(opcao2Radio);
		
		checkBox = new JCheckBox("Aceita receber propaganda");
		
		adicionarButton = new JButton("Adicionar");	

		JPanel painelTitulo = new JPanel(new BorderLayout());
		painelTitulo.add(tituloLabel);
		add(painelTitulo, BorderLayout.NORTH);
		
		JPanel painel2 = new JPanel(new SpringLayout());
		painel2.add(opcao1Radio);
		painel2.add(opcao2Radio);
		SpringUtilities.makeCompactGrid(painel2,1, 2, 6, 6, 6, 6);
		add(painel2, BorderLayout.CENTER);
		
		JPanel painel= new JPanel(new SpringLayout());
		painel.add(tipoLabel);
		painel.add(painel2);
		painel.add(nomeLabel);
		painel.add(nomeField);
		painel.add(cpfLabel);
		painel.add(cpfField);
		painel.add(foneLabel);
		painel.add(foneField);
		painel.add(emailLabel);
		painel.add(emailField);
		SpringUtilities.makeCompactGrid(painel,5, 2, 6, 6, 6, 6);
		add(painel, BorderLayout.CENTER);
		getContentPane().add(checkBox, BorderLayout.PAGE_END);
		getContentPane().add(adicionarButton, BorderLayout.EAST);
		setVisible(true);
		
	}
}

