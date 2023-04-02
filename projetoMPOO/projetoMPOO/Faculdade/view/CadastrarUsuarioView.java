package view;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.SpringLayout;

import util.SpringUtilities;

public class CadastrarUsuarioView extends JFrame{
	JLabel nomeLabel, emailLabel,loginLabel, senhaLabel, diciplina1Label, diciplina2Label, diciplina3Label, chaveAdminLabel;
	JTextField nomeField, emailField,loginField, diciplina1Field, diciplina2Field, diciplina3Field, chaveAdminField;
	JPasswordField senhaField;
	JRadioButton professorRadio, alunoRadio, adminRadio;
	ButtonGroup usuariosGroup;
	JButton adicionarButton;
	JPanel selecaoPanel, principalPanel,usuarioPanel, adminPanel;
	
	
	public CadastrarUsuarioView() {
		setSize(630,220);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		professorRadio = new JRadioButton("Professor", true);
		alunoRadio = new JRadioButton("Aluno");
		adminRadio = new JRadioButton("Administrador");
		
		usuariosGroup = new ButtonGroup();
		usuariosGroup.add(professorRadio);
		usuariosGroup.add(alunoRadio);
		usuariosGroup.add(adminRadio);
		
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField();
		nomeField.setColumns(20);
		emailLabel = new JLabel("Email: ");
		emailField = new JTextField();
		loginLabel = new JLabel("Login: ");
		loginField = new JTextField();
		senhaLabel = new JLabel("Senha: ");
		senhaField = new JPasswordField();
		
		diciplina1Label = new JLabel("Diciplina 1: ");
		diciplina1Field = new JTextField();
		diciplina1Field.setColumns(20);
		diciplina2Label = new JLabel("Diciplina 2: ");
		diciplina2Field = new JTextField();
		diciplina3Label = new JLabel("Diciplina 3: ");
		diciplina3Field = new JTextField();
		
		
		chaveAdminLabel = new JLabel("Chave Administrador");
		chaveAdminField = new JTextField();
		chaveAdminField.setColumns(20);
		
		adicionarButton = new JButton("Adicionar");
		
		selecaoPanel = new JPanel(new SpringLayout());
		principalPanel = new JPanel(new SpringLayout());
		usuarioPanel = new JPanel(new SpringLayout());
		adminPanel = new JPanel(new SpringLayout());
		
		selecaoPanel.add(professorRadio);
		selecaoPanel.add(alunoRadio);
		selecaoPanel.add(adminRadio);
		SpringUtilities.makeCompactGrid(selecaoPanel, 1, 3, 6, 6, 6, 6);
		add(selecaoPanel, BorderLayout.PAGE_START);
		
		principalPanel.add(nomeLabel);
		principalPanel.add(nomeField);
		principalPanel.add(emailLabel);
		principalPanel.add(emailField);
		principalPanel.add(loginLabel);
		principalPanel.add(loginField);
		principalPanel.add(senhaLabel);
		principalPanel.add(senhaField);
		SpringUtilities.makeCompactGrid(principalPanel, 4, 2, 6, 6, 6, 6);
		add(principalPanel, BorderLayout.WEST);
		
		
		usuarioPanel.add(diciplina1Label);
		usuarioPanel.add(diciplina1Field);
		usuarioPanel.add(diciplina2Label);
		usuarioPanel.add(diciplina2Field);
		usuarioPanel.add(diciplina3Label);
		usuarioPanel.add(diciplina3Field);
		SpringUtilities.makeCompactGrid(usuarioPanel, 3, 2, 6, 6, 6, 6);
		add(usuarioPanel, BorderLayout.EAST);
		
		adminPanel.add(chaveAdminLabel);
		adminPanel.add(chaveAdminField);
		SpringUtilities.makeCompactGrid(adminPanel, 1, 2, 6, 6, 6, 6);
		add(adminPanel, BorderLayout.CENTER);
		
		
		add(adicionarButton, BorderLayout.PAGE_END);
		usuarioPanel.setVisible(false);
		adminPanel.setVisible(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CadastrarUsuarioView();
	}
	
	
	
}
