package controller;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import view.TelaLoginView2;

public class TelaLoginController implements WindowListener{
	TelaLoginView2 telaLogin;
	
	public TelaLoginController() {
		telaLogin = new TelaLoginView2();
		controller();
		
		
	}
	
	private void controller() {
		
	}
	
	private void desativarTela() {
		telaLogin.setVisible(false);
		TelaInicialController.telaInicial.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		desativarTela();
		
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
