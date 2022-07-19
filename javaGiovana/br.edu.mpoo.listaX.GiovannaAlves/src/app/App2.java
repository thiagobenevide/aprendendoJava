package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import controller.AberturaController;
import controller.CadastrarController;
import controller.Controller;
import controller.LoginController;
import model.FileReader;
import model.Administrador;
import model.Backup;
import model.Backup_Buffer;
import model.BaseDados;
import model.Cliente;
import model.CpfException;
import model.Funcionario;
import model.MalaDiretaBackup;
import model.Pessoa;
import view.AberturaGUI;
import view.CadastrarGUI;
import view.LoginGUI;

public class App2 {

	public static void main(String[] args) {
		
		Administrador admin = new Administrador("Gio", "08102349476", "11111111111", "gmail", "Feminino", "gio", "123", "456");
		Cliente c = new Cliente("Davi", "00000000000", "66666666", "gmail", "Feminino", true);
		Funcionario f = new Funcionario("Jorge", "22222222222", "77777777", "gmail", "Feminino", "789");
		
		Backup_Buffer file = new Backup_Buffer();
		
		try {
			file.createFile(Backup_Buffer.getPath());
			file.addAdmin(admin);
			file.addCliente(c);
			file.addFunc(f);
			file.closeFile();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		MalaDiretaBackup malaDiretaBackup = new MalaDiretaBackup();
		
		malaDiretaBackup.start();
		
		
		FileReader fileReader = new FileReader();
		
		
		try {
			ArrayList<Pessoa> pessoas = fileReader.readFile(Backup_Buffer.getPath());
			
			for (Pessoa p : pessoas)
				System.out.println(p.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
