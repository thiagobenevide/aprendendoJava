package mpooSystem.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import mpooSystem.model.BaseDados;
import mpooSystem.model.Mensagem;
import mpooSystem.view.ChaveAcessoView;
import mpooSystem.view.MensagemView;

public class ChaveAcessoController {
	ChaveAcessoView chaveView;
	
	public ChaveAcessoController() {
		chaveView = new ChaveAcessoView();
		chaveView.setVisible(true);
		control();
		
		
	}
	
	private void control() {
		chaveView.getChaveAcessoField().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==chaveView.getValidarButton()) 
					if(BaseDados.isAdmin(chaveView.getValidarButton().getText()))
						MensagemView.mostrarMensagem(Mensagem.ADMINSTRADOR_SUCESS);
					else 
						MensagemView.mostrarMensagem(Mensagem.ADMINSTRADOR_ERROR);
			}
		});
		
	}
	

}
