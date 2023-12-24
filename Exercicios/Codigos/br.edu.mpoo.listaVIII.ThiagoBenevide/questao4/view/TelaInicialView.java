package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaInicialView extends JFrame{
	JButton loginButton, cadastrarButton;
	
	
	public TelaInicialView() {
		setSize(200, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		loginButton = new JButton("Login");
		cadastrarButton = new JButton("Cadastrar");
		
		
		add(loginButton);
		add(cadastrarButton);
		
		
		
		
		
		
		setVisible(true);
	}


	public JButton getLoginButton() {
		return loginButton;
	}


	public JButton getCadastrarButton() {
		return cadastrarButton;
	}
	
	
	
}
