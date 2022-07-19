package app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import controller.AberturaController;
import controller.CadastrarController;
import controller.Controller;
import controller.LoginController;
import model.FileReader;
import model.Administrador;
import model.Backup;
import model.BaseDados;
import model.Cliente;
import model.CpfException;
import model.Funcionario;
import model.MalaDiretaBackup;
import model.Pessoa;
import view.AberturaGUI;
import view.CadastrarGUI;
import view.LoginGUI;

public class App {

	public static void main(String[] args) {
		
		try {
			BaseDados.createBase();
		} catch (CpfException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			new Controller();
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		MalaDiretaBackup malaDiretaBackup = new MalaDiretaBackup();
		
		malaDiretaBackup.start();
//		
//		FileReader adminFileReader = new FileReader();
//		
//		
//		try {
//			ArrayList<Pessoa> pessoas = adminFileReader.readFile(Backup.getPath());
//			for (Pessoa p : pessoas)
//				System.out.println(p.toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}
}
