package mpooSystem.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mpooSystem.view.MenuView;

public class MenuController  implements ActionListener{
	MenuView menu;
	
	public MenuController() {
		
		menu = new MenuView();
		menu.setVisible(true);
		control();
	}
	
	private void control() {
		menu.getLogarButton().addActionListener(this);
		menu.getCadastrarButton().addActionListener(this);
		menu.getSairButton().addActionListener(this);
	}
	
	public void updateLogin() {
		menu.setVisible(false);
		menu = null;
		System.gc();
		new LoginController();
	}
	
	public void updateCadastrar() {
		menu.setVisible(false);
		menu = null;
		System.gc();
		new CadastrarController();
	}
	
	public void updateSair() {
		menu.setVisible(false);
		menu = null;
		System.gc();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==menu.getLogarButton()) {
			updateLogin();
		}
		if(e.getSource()==menu.getCadastrarButton()) {
			updateCadastrar();
		}
		if(e.getSource()==menu.getSairButton()) {
			updateSair();
		}
		
	}
	
	

}
