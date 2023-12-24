package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaInicialView;

public class TelaInicialController implements ActionListener{
	public TelaInicialView telaInicial;
	
	public TelaInicialController() {
		telaInicial = new TelaInicialView();
		controller();
	}
	
	private void controller() {
		telaInicial.getLoginButton().addActionListener(this);
		telaInicial.getCadastrarButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaInicial.getLoginButton()) {
			telaInicial.setVisible(false);
			new TelaLoginController();
		}
		if(e.getSource()==telaInicial.getCadastrarButton()) {
			telaInicial.setVisible(false);
			new ControllerCadastrar2();
		}
		
	}
	
}
