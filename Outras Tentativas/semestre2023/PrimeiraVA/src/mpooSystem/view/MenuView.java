package mpooSystem.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import mpoo.System.util.SpringUtilities;

public class MenuView extends JFrame{
	JButton logarButton, cadastrarButton, sairButton;
	JPanel botoesPanel, imagemPanel;
	
	public MenuView() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250,140);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		botoesPanel = new JPanel(new SpringLayout());
		
		logarButton = new JButton("Logar");
		cadastrarButton = new JButton("Cadastrar");
		sairButton = new JButton("Sair");
		
		
		botoesPanel.add(logarButton);
		botoesPanel.add(cadastrarButton);
		botoesPanel.add(sairButton);
		
		SpringUtilities.makeCompactGrid(botoesPanel, 1, 3, 6, 6, 6, 6);
		
		add(botoesPanel, BorderLayout.CENTER);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MenuView();
	}
	
}
