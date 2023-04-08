package mpooSystem.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mpooSystem.view.MenuView;

public class MenuController implements ActionListener {
	MenuView telaMenu;
	
	public MenuController(MenuView telaMenu) {
		this.telaMenu = telaMenu;
		controller();
	}

	private void controller() {
		this.telaMenu.getLogarButton().addActionListener(this);
		this.telaMenu.getCadastrarButton().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	
}
