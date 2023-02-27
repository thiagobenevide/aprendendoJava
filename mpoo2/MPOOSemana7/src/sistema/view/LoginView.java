package sistema.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import sistema.model.UsuarioOld;
import sistema.model.Validador;

public class LoginView extends JFrame{

	JLabel loginLabel, senhaLabel;
	JTextField loginField;
	JPasswordField senhaField;
	JButton entrarButton, sairButton;

	public LoginView() {
		super ("Login");
		setLayout(new FlowLayout());
		setSize(200, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		loginLabel = new JLabel("Login:");
		senhaLabel = new JLabel("Senha:");
		
		loginField = new JTextField(10);
//		try {
//			loginField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
//			loginField.setColumns(10);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		senhaField = new JPasswordField(10);
				
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(entrarButton);
		add(sairButton);
		
		setVisible(true);
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public void setLoginField(JTextField loginField) {
		this.loginField = loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public void setSenhaField(JPasswordField senhaField) {
		this.senhaField = senhaField;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
	
}