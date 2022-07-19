package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.AberturaGUI;
import view.LoginGUI;

public class AberturaController implements MouseListener, KeyListener{

	AberturaGUI aberturaGUI;
	//MouseHanlder mouseHandler;

	public AberturaController(AberturaGUI aberturaGUI) {
		//mouseAdapater = new MouseHandler
		//this.aberturaGUI.addMouseListener(mouseHandler);
		//this.aberturaGUI.addMouseMoutionListener(mouseHandler);
		this.aberturaGUI = aberturaGUI;
		control();
	}

	private void control() {
		this.aberturaGUI.addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("(" + e.getX() + ";" + e.getY() + ")");
		aberturaGUI.setVisible(false);
		new LoginGUI();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	//OPCAO COM ADAPTER
	
	//private class MouseHandler extends MouseAdapter{
		// colocaria só os metodos que quero
	//}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) // esc
			System.exit(0);
		
		if(e.getKeyCode()==KeyEvent.VK_ENTER)
			new LoginGUI();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
