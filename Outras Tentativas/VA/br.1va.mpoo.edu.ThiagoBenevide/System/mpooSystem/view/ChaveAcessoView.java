package mpooSystem.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.SpringLayout;

import mpooSystem.util.SpringUtilities;

public class ChaveAcessoView extends JFrame{
	JLabel  chaveAcessoLabel;
	JPasswordField chaveAcessoField;
	JButton validarButton;
	JPanel panelPrincipal;
	
	public ChaveAcessoView() {
		setSize(200,140);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		
		chaveAcessoLabel = new JLabel("Chave Acesso");
		chaveAcessoField =  new JPasswordField();
		validarButton =  new JButton("Validar");
		
		panelPrincipal = new JPanel(new SpringLayout());
		
		panelPrincipal.add(chaveAcessoLabel);
		panelPrincipal.add(chaveAcessoField);
		panelPrincipal.add(validarButton);
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 3, 1, 6, 6, 6, 6);
		
		add(panelPrincipal, BorderLayout.CENTER);
		
	}

	public JPasswordField getChaveAcessoField() {
		return chaveAcessoField;
	}

	public JButton getValidarButton() {
		return validarButton;
	}
	
	
	
}
