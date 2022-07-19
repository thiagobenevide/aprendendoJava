package questao1;

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

public class TelaCadastrar extends JFrame {

	private JLabel tituloLabel, tipoLabel, nomeLabel, cpfLabel, foneLabel, emailLabel, matriculaLabel;
	private JTextField nomeField, cpfField, foneField, emailField, matriculaField;
	private JCheckBox propragandaCheckBox;
	private JRadioButton clienteRadioButton, funcioRadioButton;
	private JButton adicionarButton;
	
	public TelaCadastrar() {
		super("Gerenciar Dados");
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel panelTitulo =  new JPanel(new BorderLayout());
		tituloLabel = new JLabel("Cadastrar");
		tituloLabel.setFont(new Font("", Font.BOLD, 20));
		panelTitulo.add(tituloLabel, BorderLayout.NORTH);
		
		tipoLabel = new JLabel("Tipo: ");
		
		JPanel panelRadioButton = new JPanel(new SpringLayout());
		
		clienteRadioButton = new JRadioButton("Cliente", true);
		funcioRadioButton = new JRadioButton("Funcionário");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(clienteRadioButton);
		buttonGroup.add(funcioRadioButton);
		
		panelRadioButton.add(clienteRadioButton);
		panelRadioButton.add(funcioRadioButton);
		
		SpringUtilities.makeCompactGrid(panelRadioButton, 1, 2, 6, 6, 6, 6);
		
		add(panelRadioButton, BorderLayout.CENTER);
		
		JPanel panelPrincipal = new JPanel(new SpringLayout());
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField(10);
		
		
		try {
			cpfLabel = new JLabel("CPF: ");
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(10);
			
			foneLabel = new JLabel("Fone: ");
			foneField = new JFormattedTextField(new MaskFormatter("(##) # ####-####"));
			foneField.setColumns(10);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		emailLabel = new JLabel("E-mail: ");
		emailField = new JTextField(10);
		
		matriculaLabel = new JLabel("Matrícula: ");
		matriculaField = new JTextField(10);
		
		matriculaLabel.setVisible(false);
		matriculaField.setVisible(false);
		
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
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 6, 2, 6, 6, 6, 6);
		
		propragandaCheckBox = new JCheckBox("Aceita receber propaganda");
		
		adicionarButton = new JButton("Adicionar");
		
		add(panelTitulo, BorderLayout.NORTH);
		add(panelPrincipal, BorderLayout.CENTER);
		add(propragandaCheckBox, BorderLayout.PAGE_END);
		add(adicionarButton, BorderLayout.EAST);
		
		setVisible(false);
		
	}
	
	
	public JLabel getTituloLabel() {
		return tituloLabel;
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
	public JCheckBox getPropragandaCheckBox() {
		return propragandaCheckBox;
	}
	public JRadioButton getClienteRadioButton() {
		return clienteRadioButton;
	}
	public JRadioButton getFuncioRadioButton() {
		return funcioRadioButton;
	}
	public JButton getAdicionarButton() {
		return adicionarButton;
	}
	
}
