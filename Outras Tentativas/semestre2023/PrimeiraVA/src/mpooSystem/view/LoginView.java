package mpooSystem.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import mpoo.System.util.SpringUtilities;

import javax.swing.JFrame;

public class LoginView extends JFrame{
	JLabel loginLabel, senhaLabel;
	JTextField loginField, senhaField;
	JButton entrarButton, sairButton;
	
	public LoginView(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setSize(210, 150);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JPanel panelMain = new JPanel(new SpringLayout());
		
		loginLabel = new JLabel("Login: ");
		senhaLabel = new JLabel("Senha: ");
		loginField = new JTextField();
		senhaField = new JTextField();
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		
		panelMain.add(loginLabel);
		panelMain.add(loginField);
		panelMain.add(senhaLabel);
		panelMain.add(senhaField);
		panelMain.add(entrarButton);
		panelMain.add(sairButton);
		
		SpringUtilities.makeCompactGrid(panelMain, 3, 2, 6, 6, 6, 6);
		
		add(panelMain);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LoginView();
	}
}
