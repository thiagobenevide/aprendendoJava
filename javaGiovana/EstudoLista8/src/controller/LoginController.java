package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import model.BaseDados;
import view.CadastrarGUI;
import view.LoginGUI;

public class LoginController {

	LoginGUI loginGUI;
	CadastrarGUI cadastrarGUI;
	ButtonHandler buttonHandler;
	
	public LoginController(LoginGUI loginGUI, CadastrarGUI cadastrarGUI) {
	
		this.loginGUI = loginGUI;
		this.cadastrarGUI = cadastrarGUI;
		
		buttonHandler = new ButtonHandler();
		
		loginGUI.getEntrarButton().addActionListener(buttonHandler);
		
	}
	
	private void update() {
		loginGUI.setVisible(false);
		loginGUI = null;
		System.gc();
		cadastrarGUI.setVisible(true);
	}

	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == loginGUI.getEntrarButton()) {
				
				if (BaseDados.buscarUsuario(loginGUI.getLoginField().getText(), loginGUI.getSenhaPasswordField().getText()) == true) {
					update();
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
				}
				
			}
			
		}
		
	}
	
}
