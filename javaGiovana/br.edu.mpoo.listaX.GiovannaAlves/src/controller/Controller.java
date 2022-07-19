package controller;

import java.io.IOException;

import javax.swing.JLabel;

import model.Backup;
import model.Icone;
import model.Logo;
import view.AberturaGUI;
import view.CadastrarGUI;
import view.JOPtionPane;
import view.LoginGUI;

public class Controller {

	AberturaGUI aberturaGUI;
	LoginGUI loginGUI;
	CadastrarGUI cadastrarGUI;
	Icone icone;
	Logo logo;
	
	AberturaController aberturaController;
	LoginController loginController;
	CadastrarController cadastrarController;
	
	public Controller() throws Exception {
				
		try {
			logo = new Logo();
			icone = new Icone();
			aberturaGUI = new AberturaGUI(icone.getIconeIcon(), logo.getLogoIcon());
		} catch (Exception e) {
			e.printStackTrace();
			new JOPtionPane("Não foi possível carregar a imagem");
			System.exit(0);
		}
		
		loginGUI = new LoginGUI();
		
		try {
			cadastrarGUI = new CadastrarGUI();
		} catch (Exception e) {
			e.printStackTrace();
			new JOPtionPane("Erro de formatação");
			System.exit(0);
		}
		
		aberturaController = new AberturaController(aberturaGUI, loginGUI);
		loginController = new LoginController(loginGUI, cadastrarGUI);
		cadastrarController = new CadastrarController(cadastrarGUI);
	}
}
