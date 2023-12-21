package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.Frame1;
import gui.Frame2;

public class Controller implements ActionListener{
	Frame1 tela1;
	Frame2 tela2;
	
	
	public Controller() {
		this.tela1 = new Frame1();
		controller();
		
	}
	
	public void controller() {
		tela1.getAbrirButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tela1.getAbrirButton()) {
			abrirTela2();
		}else if(e.getSource()==tela2.getHidenButton()) {
			ocultarTela2();
		}else if(e.getSource()==tela2.getDisposeButton()) {
			disponse();
		}else if(e.getSource()==tela2.getSetVisibleButton()) {
			setVisible2();
		}else if(e.getSource()==tela2.getSistemButton()) {
			exit();
		}

			
		
	}
	
	public void abrirTela2() {
		tela1.setVisible(false);
		if(tela2 == null) {
			this.tela2 = new Frame2();
			this.tela2.getHidenButton().addActionListener(this);
			this.tela2.getDisposeButton().addActionListener(this);
			this.tela2.getSetVisibleButton().addActionListener(this);
			this.tela2.getSistemButton().addActionListener(this);
		}else {
			this.tela2.setVisible(true);
		}

	}
	
	public void ocultarTela2() {
		this.tela2.setVisible(false);
		this.tela1.setVisible(true);
	}
	public void disponse() {
		this.tela2.setVisible(false);
		this.tela1.setVisible(true);
	}
	public void setVisible2() {
		this.tela2.setVisible(false);
		this.tela1.setVisible(true);
	}
	public void exit() {
		System.exit(0);
	}
	
	
	
	
	
	
	
	
}
