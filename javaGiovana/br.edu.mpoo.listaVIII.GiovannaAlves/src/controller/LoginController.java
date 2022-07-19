package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.BaseDados;
import view.CadastrarGUI;
import view.LoginGUI;

public class LoginController {

	LoginGUI loginGui;
	CadastrarGUI cadastrarGUI;
	ButtonHandler buttonHandler;
	
	public LoginController(LoginGUI loginGui, CadastrarGUI cadastrarGUI) {
		
		this.loginGui = loginGui;
		this.cadastrarGUI = cadastrarGUI;
		
		buttonHandler = new ButtonHandler();
		loginGui.getEntrarButton().addActionListener(buttonHandler);
		
	}
	
	private void update() {
		loginGui.setVisible(false);
		loginGui = null;
		System.gc();
		cadastrarGUI.setVisible(true);
	}

	private class ButtonHandler implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==loginGui.getEntrarButton()) {
				update();
			}
			
		}
	}
}
