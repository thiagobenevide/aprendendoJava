package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ResourceBundle.Control;

import javax.swing.JOptionPane;

import sistema.model.Mensagem;
import sistema.model.UsuarioOld;
import sistema.model.Validador;
import sistema.view.LoginView;
import sistema.view.MensagemView;

public class LoginController{ //implements ActionListener, KeyListener, FocusListener {
	LoginView loginView;
	ButtonHandler buttonHandler;
	KeyHandler keyHandler;
	public LoginController(LoginView loginView) {
		this.loginView = loginView;
		buttonHandler = new ButtonHandler();
		keyHandler = new KeyHandler();
		control();
	}
	
	private void control(){
		loginView.getSairButton().addActionListener(buttonHandler);
		loginView.getEntrarButton().addActionListener(buttonHandler);
//		loginView.addKeyListener(keyHandler);
		
		loginView.getLoginField().addKeyListener(keyHandler);
		loginView.getSenhaField().addKeyListener(keyHandler);
		loginView.getEntrarButton().addKeyListener(keyHandler);
		loginView.getSairButton().addKeyListener(keyHandler);
	}

	private void validarUsuario(){
		Usuario usuario = new Usuario();
		if (loginView.getLoginField().getText().equalsIgnoreCase("") || 
				loginView.getSenhaField().getText().equalsIgnoreCase(""))
//				JOptionPane.showMessageDialog(null, "Preencha os campos de login e senha!");
				new MensagemView(Mensagem.CAMPO_VAZIO, 1);
		
			else{
				usuario.setLogin(loginView.getLoginField().getText());
				usuario.setSenha(loginView.getSenhaField().getText());


				if (Validador.validarUsuario(usuario))
					new MensagemView(Mensagem.LOGIN_SUCESSO, 0);
					
				else
					new MensagemView(Mensagem.LOGIN_ERRO, 1);
			}

	}
	
	private class ButtonHandler implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==loginView.getSairButton())
				System.exit(0);
			
			if (e.getSource()==loginView.getEntrarButton()){
				validarUsuario();
			}
		}
	}

	
	private class KeyHandler extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==KeyEvent.VK_ESCAPE)
				System.exit(0);
			
			//problema: todos os componentes da tela estão validando o usuário ao pressionar ENTER
			//como resolver?
			if (e.getKeyCode()==KeyEvent.VK_ENTER)
				validarUsuario();
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
			//diferenciar se é caracter ou digito
//			String dados[] = {"1", "2", "3"};
			
			if (Character.isDigit(e.getKeyChar()))
				e.consume();
			}
		}
	
	private class FieldHandler implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}}
}
