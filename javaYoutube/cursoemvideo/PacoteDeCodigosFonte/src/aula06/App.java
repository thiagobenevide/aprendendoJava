package aula06;

public class App {
	
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		controle.ligar();
		controle.play();
		controle.maisVolume();
		controle.abrirMenu();
	}
}
