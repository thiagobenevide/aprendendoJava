package app;

import controller.CadastroController;
import model.BaseDados;
import view.TelaCadastro;

public class App {

	public static void main(String[] args) {
		
		BaseDados.createBase();
		
		new CadastroController(new TelaCadastro());

	}

}
