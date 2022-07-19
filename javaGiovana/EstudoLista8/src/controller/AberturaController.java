package controller;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.AberturaGUI;
import view.LoginGUI;

public class AberturaController {

	AberturaGUI aberturaGUI;
	LoginGUI loginGUI;
	KeyTratadora keyTratadora;
	MouseTratadora mouseTratadora;
	
	
	public AberturaController(AberturaGUI aberturaGUI, LoginGUI loginGUI) {
		
		this.aberturaGUI = aberturaGUI;
		this.loginGUI = loginGUI;
		
		keyTratadora = new KeyTratadora();
		mouseTratadora = new MouseTratadora();
		
		aberturaGUI.setVisible(true);
		
		control();
	}
		
	private void control() {
		
		this.aberturaGUI.addMouseListener(mouseTratadora);
		this.aberturaGUI.addKeyListener(keyTratadora);
		
	}
	
	private void update() {
		aberturaGUI.setVisible(false);
		aberturaGUI = null;
		System.gc();
		loginGUI.setVisible(true);
		
	}
	
	private class KeyTratadora extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==KeyEvent.VK_ENTER) {
				update();
			}
			
			if (e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				System.exit(0);
			}
		}
		
	}
	
	private class MouseTratadora extends MouseAdapter{
	
		@Override
		public void mouseClicked(MouseEvent e) {
			update();
		}

	}
}
