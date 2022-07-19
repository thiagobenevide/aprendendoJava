package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import util.SpringUtilities;

public class LoginGUI extends JFrame {

	JLabel loginLabel, senhaLabel;
	JTextField loginField;
	JPasswordField senhaPasswordField;
	JButton entrarButton;
	
	public LoginGUI() {
		super("Login");
		
		setSize(200,200);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new SpringLayout());
		
		loginLabel = new JLabel("Login: ");
		loginField = new JTextField(10);

		senhaLabel = new JLabel("senha: ");
		senhaPasswordField = new JPasswordField(10);
		
		entrarButton = new JButton("Entrar");
		
		panel.add(loginLabel);
		panel.add(loginField);

		panel.add(senhaLabel);
		panel.add(senhaPasswordField);

		panel.add(entrarButton);

		util.SpringUtilities.makeCompactGrid(panel, 5, 1, 6, 6, 6, 6);
		
		add(panel);
		
		setVisible(false);
	}

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaPasswordField() {
		return senhaPasswordField;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}
	
	
}
