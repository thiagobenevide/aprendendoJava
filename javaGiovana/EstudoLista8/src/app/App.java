package app;

import controller.AberturaController;
import controller.CadastrarController;
import controller.Controller;
import controller.LoginController;
import model.BaseDados;
import model.Cliente;
import view.AberturaGUI;
import view.CadastrarGUI;
import view.LoginGUI;

public class App {

	public static void main(String[] args) {
		
		BaseDados.createBase();
		
		BaseDados.adicionarUsuario(new Cliente("gio", "123", "Giovanna", "08102349476", "87981378564", "gmail", "feminino", false));
		
		new Controller();
		
	}

}
