package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class LoginGUI extends JFrame {
	
	JLabel loginLabel, senhaLabel;
	JTextField loginField;
	JPasswordField senhaField;
	JButton entrarButton;
	JPanel panelCentral;
	
	public LoginGUI() {
		super("Login");
		
		setSize(200, 200);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		panelCentral = new JPanel(new SpringLayout());
		
		loginLabel = new JLabel("Nome: ");
		loginField = new JTextField(10);
		
		senhaLabel = new JLabel("Senha: ");
		senhaField = new JPasswordField(10);
		
		entrarButton = new JButton("Entrar");
		
		panelCentral.add(loginLabel);
		panelCentral.add(loginField);

		panelCentral.add(senhaLabel);
		panelCentral.add(senhaField);

		panelCentral.add(entrarButton);
		
		util.SpringUtilities.makeCompactGrid(panelCentral, 5, 1, 6, 6, 6, 6);
		
		add(panelCentral, BorderLayout.CENTER);
		
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

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

	public JPanel getPanelCentral() {
		return panelCentral;
	}
	
}
