package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.CalculadoraView;

public class Controller7 implements MouseListener{
	CalculadoraView calculadora;
	
	
	public Controller7() {
		calculadora = new CalculadoraView();
		
		controller();
		
		
		
	}
	
	public void controller() {
		calculadora.getNumberButton().get("0").addMouseListener(this);;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==calculadora.getNumberButton().get("0")) {
			System.out.println("0");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
