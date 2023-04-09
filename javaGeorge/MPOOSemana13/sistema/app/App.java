package app;

import model.BaseDados;
import model.MalaDiretaParabens;

public class App{
	public static void main(String[] args) {
		BaseDados.createBase();
		MalaDiretaParabens malaDiretaParabens = new MalaDiretaParabens();
		malaDiretaParabens.start();
	}
}
