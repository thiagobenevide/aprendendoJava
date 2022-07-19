package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGUI extends JFrame {
		
	JLabel loginLabel, senhaLabel;
	JTextField loginField, senhaField;
	JButton loginButton, sairButton;
	
	// COMPONENTES GRÁFICOS
	// TRATAMENTO DE EVENTOS
	
	public LoginGUI() {
		super("Título");
		setSize(200, 200);
	//	frame.setResizable(false); //
		setLocationRelativeTo(null); // LOCAL PARA EXIBIR
		//frame.setUndecorated(true); // se não tiver botão não fecha
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // SERVE PARA LIBERAR MEMÓRIA (É OBRIGATÓRIO)
		setLayout(new FlowLayout()); // SE FOR NULL, TEM QUE DIZER A POSIÇÃO DELE, GERALMENTE UTILIZAMOS GERENCIADOR DE LAYOUTS 
		
		loginLabel = new JLabel("Login: ");
		senhaLabel = new JLabel("Senha: ");
		loginField = new JTextField(10);
		senhaField = new JPasswordField(5);
		loginButton =  new JButton("Entrar");
		sairButton =  new JButton("Sair");
//		botao.setBounds(65, 140, 60, 30); // TEM QUE CALCULAR MUITO, NÃO UTILIZAR
		//botao.setLocation(x, y);
		// senha seria JPasswordField
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(loginButton);
		add(sairButton);
		setVisible(true);
	}
	
	
	
}
