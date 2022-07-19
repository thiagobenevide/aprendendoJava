package model;

import java.util.ArrayList;
import java.util.Formatter;

public class MalaDiretaBackup extends Thread {

	private Formatter output;
	
	@Override
	public void run() {
		
		try {
			
			//sleep(300000); // tempo para executar
			sleep(300000);
			
			Backup.openFile(Backup.getPath());
			
			for (Pessoa p : BaseDados.getPessoas()) {
				if (p instanceof Administrador) {
					Backup.addAdmin((Administrador)p);
				}
				
				if (p instanceof Cliente) {
					Backup.addCliente((Cliente)p);
				}
				
				if (p instanceof Funcionario) {
					Backup.addFunc((Funcionario)p);
				}
			}
			
			Backup.closeFile();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
	
}
