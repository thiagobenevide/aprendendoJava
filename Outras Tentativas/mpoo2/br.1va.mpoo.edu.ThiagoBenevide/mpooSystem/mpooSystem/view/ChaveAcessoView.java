package mpooSystem.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import mpooSystem.util.SpringUtilities;

public class ChaveAcessoView extends JFrame {
	JLabel chaveAcessoLabel;
	JTextField chaveField;
	JButton validarButton;
	JPanel panelPrincipal;
	
	
	public ChaveAcessoView() {
		setSize(400, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLayout(new BorderLayout());
		
		chaveAcessoLabel = new JLabel("ChaveAcesso");
		chaveField = new JTextField();
		chaveField.setColumns(10);
		validarButton = new JButton("Validar");
		
		panelPrincipal = new JPanel(new SpringLayout());
		
		panelPrincipal.add(chaveAcessoLabel);
		panelPrincipal.add(chaveField);
		panelPrincipal.add(validarButton);
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 3, 1, 6, 6, 6, 6);
		
		add(panelPrincipal, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	
	
}
