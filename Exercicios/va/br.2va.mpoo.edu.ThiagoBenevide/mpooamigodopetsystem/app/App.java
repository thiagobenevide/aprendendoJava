package app;


import controller.IndexController;
import model.BaseDados;
import model.CPFException;
import model.GeradorBrinde;
import model.GerenciadorBrinde;
import view.MensagemView;

public class App {
	public static GerenciadorBrinde gerenciadorBrinde;
	
	public static void main(String[] args) {
		gerenciadorBrinde = new GerenciadorBrinde();
		GeradorBrinde gB = new GeradorBrinde();
		gB.start();
		try {
			BaseDados.createBase();
		} catch (CPFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new IndexController();
	}
}
