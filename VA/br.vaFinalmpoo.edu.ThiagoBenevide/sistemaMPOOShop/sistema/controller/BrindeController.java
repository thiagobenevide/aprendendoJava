package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sistema.view.BrindeView;

public class BrindeController implements ActionListener{
	BrindeView brindeView;
	
	public BrindeController() {
		brindeView = new BrindeView();
		brindeView.setVisible(true);
		control();
	}
	
	
	private void control() {
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
