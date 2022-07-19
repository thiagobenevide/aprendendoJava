package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class MalaDiretaBackup extends Thread {
	
	@Override
	public void run() {
		
		try {
			
			//sleep(300000); // tempo para executar
			sleep(5000);
			
			FileReader fileReader = new FileReader();
			
			Backup.openFile(Backup.getPath());
			
			try {
				for (Pessoa p : fileReader.readFile(Backup_Buffer.getPath())) {
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
			} catch (FormatterClosedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Backup.closeFile();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
	
}
