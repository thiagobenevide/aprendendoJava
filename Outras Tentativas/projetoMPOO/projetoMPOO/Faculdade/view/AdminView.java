package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import util.SpringUtilities;

public class AdminView extends JFrame{
	JButton cadastrarUsuario, removerUsuario;
	JPanel principalPanel;
	
	public AdminView() {
		setSize(180, 120);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		cadastrarUsuario = new JButton("Cadastrar Usuário");
		removerUsuario = new JButton("Remover Usuário");
		
		principalPanel = new JPanel(new SpringLayout());
		
		principalPanel.add(cadastrarUsuario);
		principalPanel.add(removerUsuario);
		
		SpringUtilities.makeCompactGrid(principalPanel, 2, 1, 6, 6,6,6);
	
		add(principalPanel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AdminView();
	}
	
}
