package app;

import controller.ControllerCadastrar1;
import model.BaseDados1;
import view.LoginView;


public class App6 {
	public static void main(String[] args) {
		BaseDados1.createBase();
		//new ControllerCadastrar1();
		new LoginView();
	}
}
