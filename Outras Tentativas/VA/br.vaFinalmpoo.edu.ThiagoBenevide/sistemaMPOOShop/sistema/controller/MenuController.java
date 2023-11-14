package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sistema.view.MenuView;

public class MenuController implements ActionListener{
	MenuView menu;
	
	public MenuController() {
		menu =  new MenuView();
		menu.setVisible(true);
		control();
	}

	private void control() {
		menu.getPegarCupomButton().addActionListener(this);
		menu.getPegarBrinteButton().addActionListener(this);
		
	}

	private void updatePegarCupom() {
		menu.setVisible(false);
		menu = null;
		System.gc();
		new CupomController();
	}
	
	private void updatePegarBrinde() {
		menu.setVisible(false);
		menu = null;
		System.gc();
		new BrindeController();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menu.getPegarCupomButton())
			updatePegarCupom();
		if(e.getSource() == menu.getPegarBrinteButton());
			updatePegarBrinde();
			
		
	}




}
