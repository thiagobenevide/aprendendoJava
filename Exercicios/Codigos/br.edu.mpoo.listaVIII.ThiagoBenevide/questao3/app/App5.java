package app;

import controller.ControllerCadastrar1;
import model.BaseDados1;


public class App5 {
	public static void main(String[] args) {
		BaseDados1.createBase();
		new ControllerCadastrar1();
	}
}
