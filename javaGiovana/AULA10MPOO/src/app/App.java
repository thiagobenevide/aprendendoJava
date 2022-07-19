package app;

import controller.AberturaController;
import controller.CadastrarController;
import controller.Controller;
import controller.LoginController;
import model.BaseDados;
import view.AberturaGUI;
import view.CadastrarGUI;
import view.LoginGUI;

public class App {

	public static void main(String[] args) {
		
		BaseDados.createBase();
		
		new Controller();
		
	}

}
