package controller;

import model.Backup;
import view.AberturaGUI;
import view.CadastrarGUI;
import view.LoginGUI;

public class Controller {

	AberturaGUI aberturaGUI;
	LoginGUI loginGUI;
	CadastrarGUI cadastrarGUI;
	
	AberturaController aberturaController;
	LoginController loginController;
	CadastrarController cadastrarController;
	
	public Controller() {
		
		aberturaGUI = new AberturaGUI();
		loginGUI = new LoginGUI();
		cadastrarGUI = new CadastrarGUI();
		
		aberturaController = new AberturaController(aberturaGUI, loginGUI);
		loginController = new LoginController(loginGUI, cadastrarGUI);
		cadastrarController = new CadastrarController(cadastrarGUI);
	}
}
