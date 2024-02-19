package app;

import controller.ControllerCadastrar;
import controller.ControllerCadastrar2;
import model.BaseDados;
import model.BaseDados2;


public class App5 {
	public static void main(String[] args) {
		BaseDados.createBase();
		new ControllerCadastrar();
	}
}
