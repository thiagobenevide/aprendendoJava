package mpooSystem.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import mpooSystem.util.SpringUtilities;

public class MenuView  extends JFrame{
	JButton logarButton, cadastrarButton, sairButton;
	JPanel panelPrincipal;
	public MenuView() {
		setSize(400, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		logarButton = new JButton("Logar");
		cadastrarButton = new JButton("Cadastrar");
		sairButton = new JButton("Sair");
		
		panelPrincipal = new JPanel(new SpringLayout());
		
		panelPrincipal.add(logarButton);
		panelPrincipal.add(cadastrarButton);
		panelPrincipal.add(sairButton);
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 1, 3, 6, 6, 6, 6);
		
		add(panelPrincipal, BorderLayout.PAGE_END);
		
		setVisible(true);
		
		
		
	}
	
	public JButton getLogarButton() {
		return logarButton;
	}
	public JButton getCadastrarButton() {
		return cadastrarButton;
	}
	public JButton getSairButton() {
		return sairButton;
	}
	
	public static void main(String[] args) {
		new MenuView();
	}
	
	
}
