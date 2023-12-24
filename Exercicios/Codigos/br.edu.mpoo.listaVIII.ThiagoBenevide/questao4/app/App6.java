package app;

import controller.TelaInicialController;
import model.BaseDados2;


public class App6 {
	public static void main(String[] args) {
		BaseDados2.createBase();
		new TelaInicialController();
	}
}
