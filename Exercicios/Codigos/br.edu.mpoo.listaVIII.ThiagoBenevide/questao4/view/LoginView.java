package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame{
	JLabel loginLabel, senhaLabel, erroLabel, obrigatorioLabel, obrigatorioLabel2;
	JTextField loginField;
	JPasswordField senhaField;
	JButton entrarButton, sairButton;
	
	public LoginView() {
		setSize(200,150);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);
		
		loginLabel = new JLabel("Login: ");
		senhaLabel = new JLabel("Senha: ");
		obrigatorioLabel = new JLabel("*");
		obrigatorioLabel.setFont(new Font("Arial", Font.ITALIC, 10));
		obrigatorioLabel.setForeground(Color.red);

		obrigatorioLabel2 = new JLabel("*");
		obrigatorioLabel2.setFont(new Font("Arial", Font.ITALIC, 10));
		obrigatorioLabel2.setForeground(Color.red);

		
		loginField = new JTextField(10);
		senhaField = new JPasswordField(10);
		
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		
		erroLabel = new JLabel("(*) Informe o campo obrigatório");
		erroLabel.setFont(new Font("Arial", Font.ITALIC, 10));
		erroLabel.setForeground(Color.red);
		erroLabel.setVisible(false);
		
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		
		add(loginLabel);
		add(loginField);
		add(obrigatorioLabel);
		add(senhaLabel);
		add(senhaField);
		add(obrigatorioLabel2);
		add(erroLabel);
		add(entrarButton);
		add(sairButton);
		
		
		
		
		setVisible(true);
	}
	
	
}
