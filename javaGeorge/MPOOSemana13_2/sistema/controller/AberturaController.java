package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.TelaAbertura;
import view.TelaGerenciamento;

public class AberturaController{
	
	TelaAbertura telaAbertura;
	TelaGerenciamento telaGerenciamento;
	MouseHandler mouseHandler;
	KeyHandler keyHandler;
	
	public AberturaController(TelaAbertura telaAbertura, TelaGerenciamento telaGerenciamento) {
		this.telaAbertura = telaAbertura;
		this.telaGerenciamento=telaGerenciamento;
		mouseHandler = new MouseHandler();
		keyHandler = new KeyHandler();
//		GerenciamentoController gerenciamentoController = new GerenciamentoController(telaGerenciamento);
		control();
	}
	
	public void control(){
		telaAbertura.addMouseListener(mouseHandler);
		telaAbertura.addKeyListener(keyHandler);
	}

	private class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			telaAbertura.setVisible(false);
			telaGerenciamento.setVisible(true);
		}
	}
		
	private class KeyHandler extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent event) {
		if(event.getKeyCode()==KeyEvent.VK_ESCAPE){
			System.exit(0);
		}
		if(event.getKeyCode()==KeyEvent.VK_ENTER){
			telaAbertura.setVisible(false);
			telaGerenciamento.setVisible(true);
		}
	}
	}
}
