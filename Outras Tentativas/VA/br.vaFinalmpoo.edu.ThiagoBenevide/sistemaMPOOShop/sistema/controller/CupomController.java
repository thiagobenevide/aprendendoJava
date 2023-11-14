package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sistema.view.CupomView;

public class CupomController implements ActionListener{
	CupomView cupomView;
	
	
	public CupomController() {
		cupomView = new CupomView();
		cupomView.setVisible(true);
		
		control();
	}
	
	private void control() {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
