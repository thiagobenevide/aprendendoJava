package controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import view.AberturaGUI;
import view.LoginGUI;

public class AberturaController {

	MouseHandler mouseHadler;
	KeyHandler keyHandler;
	AberturaGUI aberturaGUI;
	LoginGUI loginGUI;
	
	public AberturaController(AberturaGUI aberturaGUI, LoginGUI loginGUI) {
		
		this.aberturaGUI = aberturaGUI;
		this.loginGUI = loginGUI;
		
		mouseHadler = new MouseHandler();
		keyHandler = new KeyHandler();
		
		controll();
		
	}
	
	private void controll() {
		
		aberturaGUI.addMouseListener(mouseHadler);
		aberturaGUI.addKeyListener(keyHandler);
		
	}
	
	private void update() {
		
		aberturaGUI.setVisible(false);
		aberturaGUI = null;
		System.gc();
		loginGUI.setVisible(true);
		
	}
	
	private class MouseHandler extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			update();
		}

	}
	
	private class KeyHandler extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				update();
			}
			
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				System.exit(0);
			}
			
		}

	}
	
	
}
