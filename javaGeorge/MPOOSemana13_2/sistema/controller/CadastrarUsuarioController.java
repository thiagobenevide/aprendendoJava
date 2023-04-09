package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import view.CadastrarUsuarioPanel;

public class CadastrarUsuarioController {
	
	CadastrarUsuarioPanel cadastrarUsuarioPanel;
	
	FieldHandler fieldHandler;
	ButtonHandler buttonHandler;
	
	KeyHandler keyHandler;
	
	public CadastrarUsuarioController(
			CadastrarUsuarioPanel cadastrarUsuarioPanel) {
		this.cadastrarUsuarioPanel = cadastrarUsuarioPanel;
		fieldHandler = new FieldHandler();
		buttonHandler= new ButtonHandler();
		keyHandler = new KeyHandler();
		control();
	}
	
	private void control(){
		cadastrarUsuarioPanel.getNomeUsuarioField().addCaretListener(fieldHandler);
		cadastrarUsuarioPanel.getNomeUsuarioField().addKeyListener(keyHandler);
		cadastrarUsuarioPanel.getCpfUsuarioField().addCaretListener(fieldHandler);
		cadastrarUsuarioPanel.getSenhaUsuarioField().addCaretListener(fieldHandler);
		cadastrarUsuarioPanel.getDataNascimentoUsuarioField().addCaretListener(fieldHandler);
		
		cadastrarUsuarioPanel.getNomeUsuarioField().addFocusListener(fieldHandler);
		
		cadastrarUsuarioPanel.getSalvarButton().addActionListener(buttonHandler);
	}

	//associado ao campo Nome
	private class FieldHandler implements CaretListener, FocusListener{

		@Override
		public void caretUpdate(CaretEvent e) {
			if(cadastrarUsuarioPanel.getNomeUsuarioField().getText().length()!=0 &&
				cadastrarUsuarioPanel.getCpfUsuarioField().getText().length()!=0 && //rever tratamento
				cadastrarUsuarioPanel.getSenhaUsuarioField().getText().length()!=0 &&
				cadastrarUsuarioPanel.getDataNascimentoUsuarioField().getText().length()!=0 //rever tratamento
			)
				cadastrarUsuarioPanel.getSalvarButton().setEnabled(true);
			else
				cadastrarUsuarioPanel.getSalvarButton().setEnabled(false);
			
		}

		@Override
		public void focusGained(FocusEvent e) {
			if (e.getSource()==cadastrarUsuarioPanel.getNomeUsuarioField()){
				if (cadastrarUsuarioPanel.getNomeUsuarioField().getText().equals("Nome Completo")){
					cadastrarUsuarioPanel.getNomeUsuarioField().setText("");
					cadastrarUsuarioPanel.getNomeUsuarioField().setForeground(Color.BLACK);
				}					
			}
		}

		@Override
		public void focusLost(FocusEvent e) {
			if (e.getSource()==cadastrarUsuarioPanel.getNomeUsuarioField()){
				if (cadastrarUsuarioPanel.getNomeUsuarioField().getText().equals("")){
					cadastrarUsuarioPanel.getNomeUsuarioField().setText("Nome Completo");
					cadastrarUsuarioPanel.getNomeUsuarioField().setForeground(Color.LIGHT_GRAY);
				}					
			}			
		}
	} 

	private class KeyHandler extends KeyAdapter{
//		String dadosValidos = "0987654321";

		@Override
		public void keyTyped(KeyEvent event) {
//			if (!dadosValidos.contains(event.getKeyChar() + ""))
			if (!Character.isDigit(event.getKeyChar()))
				event.consume();
		}
		
	}
	
	//para o botão salvar
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==cadastrarUsuarioPanel.getSalvarButton()){
				//salvar os dados do Usuario no model
				System.out.println("salvar");
				//utilizaria o método de adicionarUsuario da Base (vide aulas passadas)
			}
		}
	}
}