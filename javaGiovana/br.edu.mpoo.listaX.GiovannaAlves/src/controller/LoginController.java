package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		controll();
	}
	
	private void controll() {
		
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
				System.out.println("Clique");
				if (BaseDados.isAdmin(loginGUI.getLoginField().getText(), loginGUI.getSenhaField().getText()) == true) {
					update();
				}
			}
			
		}
		
	}
	
	
}
