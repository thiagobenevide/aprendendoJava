package app;

import model.BaseDados;
import controller.Controller;
import controller.ControllerCadastroGUI;
import view.CadastroGUI;
import view.Tela;
import view.Tela2;

public class AppSistema2 {
	public static void main(String[] args) {
		BaseDados.createBase();
		CadastroGUI cadastroGUI = new CadastroGUI();
		cadastroGUI.getProdutoPanel().setVisible(true);
		ControllerCadastroGUI controllerCadastroGUI = new ControllerCadastroGUI(cadastroGUI);
	}
}
