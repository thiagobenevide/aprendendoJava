package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.BaseDados;
import model.CPFException;
import view.IndexView;

public class IndexController {
	IndexView telaIndex;
	private ButtonHandler buttonHandler;
	private KeyHandler keyHandler;
	private AdocaoController adocaoController;
	
	
	public IndexController() {
		telaIndex = new IndexView();
		buttonHandler = new ButtonHandler();
		keyHandler = new KeyHandler();
		adocaoController =  new AdocaoController(telaIndex);
	
		controller();
		
	}
	
	private void controller() {
		telaIndex.addKeyListener(keyHandler);
		telaIndex.getAdotarButton().addKeyListener(keyHandler);
		telaIndex.getAdotarButton().addActionListener(buttonHandler);
	}
	
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == telaIndex.getAdotarButton()) {
				telaIndex.setVisible(false);
				adocaoController.adocaoView.setVisible(true);
			}
			
		}
		
	}
	
	private class KeyHandler extends KeyAdapter{
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				int retur = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "MPOOAmigodoPet", 0, 0, new ImageIcon("mpooamigodopet.img/icone.png"));
				if(retur == 0) {
					System.exit(0);					
				}
			}
		}
		
	}
	
	
	
	
}
