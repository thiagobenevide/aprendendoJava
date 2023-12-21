package app;

import controller.ControllerCadastrar;
import model.BaseDados;


public class App5 {
	public static void main(String[] args) {
		BaseDados.createBase();
		new ControllerCadastrar();
	}
}
