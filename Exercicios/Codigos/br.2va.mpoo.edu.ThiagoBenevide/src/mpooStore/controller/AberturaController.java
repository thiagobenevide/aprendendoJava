package mpooStore.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler;

import mpooStore.model.GerenciadorCupom;
import mpooStore.view.AberturaView;

public class AberturaController {
	protected AberturaView telaAbertura;
	protected KeyHandler keyHandler;
	protected ButtonHandler buttonHandler;
	protected RadioHandler radioHandler;
	protected GanharCupomController ganharCupomController;
	
	
	public AberturaController() {
		telaAbertura = new AberturaView();
		keyHandler = new KeyHandler();
		buttonHandler = new ButtonHandler();
		radioHandler = new RadioHandler();
		ganharCupomController = new GanharCupomController(telaAbertura); 
		controller();
	}
	
	
	private void controller() {
		telaAbertura.getPegarButton().addActionListener(buttonHandler);;
		telaAbertura.getNaoRadio().addItemListener(radioHandler);
		telaAbertura.getSimRadio().addItemListener(radioHandler);
		
		//Evento de fechamento
		telaAbertura.getNaoRadio().addKeyListener(keyHandler);
		telaAbertura.addKeyListener(keyHandler);
		telaAbertura.getPegarButton().addKeyListener(keyHandler);;
		telaAbertura.getSimRadio().addKeyListener(keyHandler);

	}
	
	
	private class KeyHandler extends KeyAdapter{
		
	 @Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyPressed(e);
		if(e.getKeyCode()== KeyEvent.VK_ESCAPE) {
			int retur =  JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", null, 0, 0, null);
			if(retur == 0)
				System.exit(0);
		}
	 	}
	}
	
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == telaAbertura.getPegarButton()) {
					if(telaAbertura.getSimRadio().isSelected()) {
						ganharCupomController.ganharCupomView.setVisible(true);
						telaAbertura.setVisible(false);					
					}else {
						JOptionPane.showMessageDialog(null, "Cupom de Desconto válido apenas para cliente de MPOOStore", "MPOO Store", 0, new ImageIcon("mpooStore.img/icone.png"));
					}
					
				}
				
		}
		
	}
	
	
	private class RadioHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(telaAbertura.getNaoRadio().isSelected()) {
				JOptionPane.showMessageDialog(null, "Cupom de Desconto válido apenas para cliente de MPOOStore", "MPOO Store", 0, new ImageIcon("mpooStore.img/icone.png"));
			}
		}
	}
	
}
