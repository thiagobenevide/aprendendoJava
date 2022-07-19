package app;

import java.io.File;
import java.util.ArrayList;

import controller.AberturaController;
import controller.CadastrarController;
import controller.Controller;
import controller.LoginController;
import model.AdminFileReader;
import model.Administrador;
import model.Backup;
import model.BaseDados;
import model.Cliente;
import model.Funcionario;
import model.MalaDiretaBackup;
import model.Pessoa;
import view.AberturaGUI;
import view.CadastrarGUI;
import view.LoginGUI;

public class App {

	public static void main(String[] args) {
		
		BaseDados.createBase();
	
		new Controller();
		
		MalaDiretaBackup malaDiretaBackup = new MalaDiretaBackup();
		
		malaDiretaBackup.run();
		
		AdminFileReader adminFileReader = new AdminFileReader();
		
		
		try {
			ArrayList<Pessoa> pessoas = adminFileReader.readFile(Backup.getPath());
			for (Pessoa p : pessoas)
				System.out.println(p.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
