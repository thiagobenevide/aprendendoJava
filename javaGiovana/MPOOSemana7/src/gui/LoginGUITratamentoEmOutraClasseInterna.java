package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGUITratamentoEmOutraClasseInterna extends JFrame implements ActionListener{
		
	JLabel loginLabel, senhaLabel;
	JTextField loginField, senhaField;
	JButton loginButton, sairButton;
	
	// COMPONENTES GR�FICOS
	// TRATAMENTO DE EVENTOS
	
	public LoginGUITratamentoEmOutraClasseInterna() {
		super("T�tulo");
		setSize(200, 200);
	//	frame.setResizable(false); //
		setLocationRelativeTo(null); // LOCAL PARA EXIBIR
		//frame.setUndecorated(true); // se n�o tiver bot�o n�o fecha
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // SERVE PARA LIBERAR MEM�RIA (� OBRIGAT�RIO)
		setLayout(new FlowLayout()); // SE FOR NULL, TEM QUE DIZER A POSI��O DELE, GERALMENTE UTILIZAMOS GERENCIADOR DE LAYOUTS 
		
		loginLabel = new JLabel("Login: ");
		senhaLabel = new JLabel("Senha: ");
		loginField = new JTextField(10);
		senhaField = new JPasswordField(5);
		loginButton =  new JButton("Entrar");
		sairButton =  new JButton("Sair");
		
		buttonHandler = new ButtonHandler();
		loginButton.addActionListener(buttonHandler);
		sairButton.addActionListener(this);
		
		
		//botao.setBounds(65, 140, 60, 30); // TEM QUE CALCULAR MUITO, N�O UTILIZAR
		//botao.setLocation(x, y);
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(loginButton);
		add(sairButton);
		setVisible(true);
	}
	
	private class ButtoHandler implements ActionListener{
		if (e.getSource()==loginButton)
			//DEVERIA CHAMAR O VALIDADOR 
			System.out.println(loginField.getText()); // PASSAR COMO PARAMETRO PARA O CONSTRUTOR
			System.out.println(senhaField.getText()); // PASSAR COMO PARAMETRO PARA O CONSTRUTOR
			JOptionPane.showMessageDialog(null, "bot�o pressionado");
}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	// realiza o tratamento em classe interna anonima
	// o this aponta para o m�todo sobrescrito da classe
	// faz o tratamento para os bot�es
	
}
