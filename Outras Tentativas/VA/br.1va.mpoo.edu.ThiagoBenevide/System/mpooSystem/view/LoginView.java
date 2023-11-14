package mpooSystem.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import mpooSystem.util.SpringUtilities;

public class LoginView extends JFrame{
	JLabel loginLabel, senhaLabel;
	JTextField loginField;
	JPasswordField senhaField;
	JButton entrarButton, sairButton;
	JPanel panelPrincipal;
	
	public LoginView() {
		setSize(210,150);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelPrincipal = new JPanel(new SpringLayout());
		
		loginLabel = new JLabel("Login: ");
		loginField = new JTextField();
		senhaLabel = new JLabel("Senha: ");
		senhaField = new JPasswordField();
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		
		panelPrincipal.add(loginLabel);
		panelPrincipal.add(loginField);
		panelPrincipal.add(senhaLabel);
		panelPrincipal.add(senhaField);
		panelPrincipal.add(entrarButton);
		panelPrincipal.add(sairButton);
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 3, 2, 6, 6, 6, 6);
		
		add(panelPrincipal, BorderLayout.CENTER);
		
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
	
	
}
