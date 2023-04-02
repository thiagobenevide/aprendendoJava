package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import util.SpringUtilities;

public class RemoverUsuarioView extends JFrame{
	JLabel matriculaLabel;
	JTextField matriculaField;
	JButton removerButton;
	JPanel principalPanel;
	
	public RemoverUsuarioView() {
		setSize(200,100);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		matriculaLabel = new JLabel("Matricula: ");
		matriculaField = new JTextField();
		removerButton = new JButton("Remover");
		principalPanel = new JPanel(new SpringLayout());
		
		principalPanel.add(matriculaLabel);
		principalPanel.add(matriculaField);
		
		SpringUtilities.makeCompactGrid(principalPanel, 1, 2, 6, 6, 6, 6);
		add(principalPanel, BorderLayout.CENTER);
		add(removerButton, BorderLayout.PAGE_END);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new RemoverUsuarioView();
	}
	
}
