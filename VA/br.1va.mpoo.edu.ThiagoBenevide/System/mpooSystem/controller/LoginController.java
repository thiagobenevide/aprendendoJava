package mpooSystem.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import mpooSystem.model.BaseDados;
import mpooSystem.model.Mensagem;
import mpooSystem.view.LoginView;
import mpooSystem.view.MensagemView;

public class LoginController implements ActionListener, WindowListener{
	LoginView loginView;
	
	public LoginController() {
		loginView = new LoginView();
		loginView.setVisible(true);
		control();
	}
	
	private void control() {
		loginView.getEntrarButton().addActionListener(this);
		loginView.getSairButton().addActionListener(this);
		loginView.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				janelaAnterior();
				
			}
		});
	}
	
	public void updateSair() {
		loginView.setVisible(false);
		loginView = null;
		System.gc();
	}
	
	public void janelaAnterior() {
		updateSair();
		new MenuController();
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loginView.getEntrarButton()) {
			if(BaseDados.isUsuario(loginView.getLoginField().getText(), loginView.getSenhaField().getText())) {
				MensagemView.mostrarMensagem(Mensagem.USUARIO_LOGIN_SUCESS);
			}else {
				MensagemView.mostrarMensagem(Mensagem.USUARIO_LOGIN_ERROR);				
			}
		}
		if(e.getSource()==loginView.getSairButton()) {
			updateSair();
		}
		
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
