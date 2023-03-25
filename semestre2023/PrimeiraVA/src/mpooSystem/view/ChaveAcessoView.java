package mpooSystem.view;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ChaveAcessoView extends JFrame{
	JLabel chaveLabel;
	JButton validarButton;
	JTextField chaveField;
	public ChaveAcessoView() {
		setSize(200, 140);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(false);
		setVisible(true);
		
		chaveLabel = new JLabel("Chave Acesso");
		chaveField = new JTextField(); 
		validarButton = new JButton("Validar");
		add(chaveLabel);
		add(chaveField);
		add(validarButton);
		
	}
	
	
	
	public static void main(String[] args) {
		new ChaveAcessoView();
	}
	
}
