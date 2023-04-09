package app;

import controller.Controller;
import view.Tela;
import view.Tela2;

public class AppSistema1 {
	public static void main(String[] args) {
		Tela tela = new Tela();
		Tela2 tela2 = new Tela2();
		
		Controller control = new Controller(tela, tela2);
//		control.control(); //chamado no construtor Controller
	}
}
