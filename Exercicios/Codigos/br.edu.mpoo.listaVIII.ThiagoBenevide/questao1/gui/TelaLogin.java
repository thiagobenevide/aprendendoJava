package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame{
	JLabel loginLabel, senhaLabel;
	JTextField loginField;
	JPasswordField senhaField;
	JButton entrarButton;
	
	public TelaLogin(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 125);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		
		loginLabel = new JLabel("Login: ");
		senhaLabel = new JLabel("Senha: ");
		loginField = new JTextField(10);
		senhaField = new JPasswordField(10);
		entrarButton = new JButton("Entrar");
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(entrarButton);
		
		setVisible(true);
		
		
	}
	
	
}
