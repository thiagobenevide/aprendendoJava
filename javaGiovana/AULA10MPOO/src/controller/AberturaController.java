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
	LoginGUI loginGui;
	MouseListener mouseTratadora;
	KeyTratador keyTratador;
	
	public AberturaController(AberturaGUI aberturaGUI, LoginGUI loginGui) {
		
		this.aberturaGUI = aberturaGUI;
		this.loginGui = loginGui;
		
		keyTratador = new KeyTratador();
		mouseTratadora = new MouseTratadora();
		
		control();
		
	}
	
	private void control() {
		
		this.aberturaGUI.addMouseListener(mouseTratadora);
		this.aberturaGUI.addKeyListener(keyTratador);
		
	}

	private void update() {
		aberturaGUI.setVisible(false);
		aberturaGUI = null;
		System.gc();
		loginGui.setVisible(true);
		
	}
	
	
	private class MouseTratadora extends MouseAdapter {
	
		@Override
		public void mouseClicked(MouseEvent e) {
			update();
		}

	}
	
	private class KeyTratador extends KeyAdapter {
		
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
	
	
}
