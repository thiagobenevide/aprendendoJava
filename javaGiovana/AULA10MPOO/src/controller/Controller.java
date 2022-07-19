package controller;

import view.AberturaGUI;
import view.CadastrarGUI;
import view.LoginGUI;

public class Controller {

	LoginController loginController;
	CadastrarController cadastrarController;
	AberturaController aberturaController;
	
	AberturaGUI aberturaGUI;
	CadastrarGUI cadastrarGUI;
	LoginGUI loginGUI;
	
	public Controller() {
	
		aberturaGUI = new AberturaGUI();
		loginGUI = new LoginGUI();
		cadastrarGUI = new CadastrarGUI();
		
		aberturaController = new AberturaController(aberturaGUI, loginGUI);
		loginController = new LoginController(loginGUI, cadastrarGUI);
		cadastrarController = new CadastrarController(cadastrarGUI);
		
		
	}
	
}
