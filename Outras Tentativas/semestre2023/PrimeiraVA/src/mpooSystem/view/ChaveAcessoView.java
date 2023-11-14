package mpooSystem.view;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import mpoo.System.util.SpringUtilities;

public class ChaveAcessoView extends JFrame{
	JLabel chaveLabel;
	JButton validarButton;
	JTextField chaveField;
	JPanel panelPrincipal;
	public ChaveAcessoView() {
		setSize(200, 140);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setResizable(false);
		
		chaveLabel = new JLabel("Chave Acesso");
		chaveField = new JTextField(); 
		validarButton = new JButton("Validar");
		
		
		panelPrincipal = new JPanel(new SpringLayout());
		
		panelPrincipal.add(chaveLabel);
		panelPrincipal.add(chaveField);
		panelPrincipal.add(validarButton);
		
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 3, 1, 6, 6, 6, 6);
		
		add(panelPrincipal, BorderLayout.CENTER);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new ChaveAcessoView();
	}
	
}
