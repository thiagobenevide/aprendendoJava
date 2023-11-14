package app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.TelaAbertura;
import view.TelaGerenciamento;
import model.BaseDados;
import model.MalaDiretaParabens;
import controller.Controller;

public class App{
	public static void main(String[] args) {//
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		BaseDados.incializarBaseDados();
		
		TelaAbertura telaAbertura = new TelaAbertura();
		TelaGerenciamento telaGerenciamento= new TelaGerenciamento();
		Controller controller = new Controller(telaAbertura, telaGerenciamento);
		
		MalaDiretaParabens malaDiretaParabens = new MalaDiretaParabens();
		malaDiretaParabens.start();
		
//		new TelaGerenciamento().setVisible(true);
	}

}
