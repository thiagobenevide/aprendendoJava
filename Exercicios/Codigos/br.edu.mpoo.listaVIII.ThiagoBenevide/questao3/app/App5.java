package app;

import controller.ControllerCadastrar2;
import model.BaseDados2;


public class App5 {
	public static void main(String[] args) {
		BaseDados2.createBase();
		new ControllerCadastrar2();
	}
}
