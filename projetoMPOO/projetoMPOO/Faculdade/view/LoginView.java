package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import util.SpringUtilities;

public class LoginView extends JFrame{
	JLabel loginLabel, senhaLabel;
	JTextField loginField;
	JPasswordField senhaField;
	JButton entrarButton;
	JPanel principalPanel;
	
	public LoginView() {
		setSize(300, 150);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		loginLabel = new JLabel("Login: ");
		loginField = new JTextField();
		senhaLabel = new JLabel ("Senha: ");
		senhaField = new JPasswordField(20);
		entrarButton = new JButton("Entrar");
		
		principalPanel = new JPanel(new SpringLayout());
		principalPanel.add(loginLabel);
		principalPanel.add(loginField);
		principalPanel.add(senhaLabel);
		principalPanel.add(senhaField);
		
		SpringUtilities.makeCompactGrid(principalPanel, 2, 2, 6, 6, 6, 6);
		
		add(principalPanel, BorderLayout.CENTER);
		add(entrarButton, BorderLayout.PAGE_END);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LoginView();
	}
	
}
