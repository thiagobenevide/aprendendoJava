package controller;

import view.AberturaGUI;
import view.CadastrarGUI;
import view.LoginGUI;

public class Controller {

	LoginGUI loginGUI;
	CadastrarGUI cadastrarGUI;
	AberturaGUI aberturaGUI;
	
	AberturaController aberturaController;
	LoginController loginController;
	CadastrarController cadastrarController;
	
	public Controller() {
		
		loginGUI = new LoginGUI();
		cadastrarGUI = new CadastrarGUI();
		aberturaGUI = new AberturaGUI();
		
		aberturaController = new AberturaController(aberturaGUI,  loginGUI);
		loginController = new LoginController(loginGUI, cadastrarGUI);
		cadastrarController = new CadastrarController(cadastrarGUI);
		
	}
	
}
