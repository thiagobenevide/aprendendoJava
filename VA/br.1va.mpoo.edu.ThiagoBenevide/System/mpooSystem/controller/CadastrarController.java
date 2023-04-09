package mpooSystem.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import mpooSystem.model.BaseDados;
import mpooSystem.model.Mensagem;
import mpooSystem.model.Pessoa;
import mpooSystem.model.Usuario;
import mpooSystem.view.CadastrarView;
import mpooSystem.view.MensagemView;

public class CadastrarController{
	CadastrarView cadastrarView;
	ButtonHandler buttonHandler;
	
	public CadastrarController() {
		cadastrarView = new CadastrarView();
		cadastrarView.setVisible(true);
		buttonHandler = new ButtonHandler();
		control();
	}
	private void control() {
		cadastrarView.getAddButton().addActionListener(buttonHandler);
		cadastrarView.getSairButton().addActionListener(buttonHandler);
		cadastrarView.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				janelaAnterior();
				
			}
		});
		
	}
	
	private String selectRadio() {
		if(cadastrarView.getFemininoRadio().isSelected()) {
			return cadastrarView.getFemininoRadio().getText();
		}else {
			return cadastrarView.getMasculinoRadio().getText();
		}
	}
	
	public void updateSair() {
		cadastrarView.setVisible(false);
		cadastrarView = null;
		System.gc();
	}
	
	public void janelaAnterior() {
		updateSair();
		new MenuController();
	}
	
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cadastrarView.getAddButton()) {
				if(BaseDados.adicionarPessoa((Pessoa) new Usuario(
						cadastrarView.getNomeField().getText(),
						cadastrarView.getCpfField().getText().replaceAll("[^0-9]", ""),
						selectRadio(),
						cadastrarView.getLoginField().getText(),
						cadastrarView.getSenhaField().getText()))) {
					MensagemView.mostrarMensagem(Mensagem.USUARIO_SUCESS);
					System.out.println(cadastrarView.getCpfField().getText());
				}else {
					MensagemView.mostrarMensagem(Mensagem.USUARIO_ERROR);
				}
				
			}
			if(e.getSource() == cadastrarView.getSairButton()) {
				updateSair();
			}
		
		}
		
		
	}
	
	
}
