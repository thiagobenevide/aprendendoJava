package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import model.Backup_2;
import model.BaseDados;
import model.Filme;
import view.CineMPOOView;

public class App extends Thread {

	public static void main(String[] args) {
		
		BaseDados.createBase();
		
		App app = new App();
		
//		Backup_2 file = new Backup_2();
//		
//		try {
//			file.openFile(Backup_2.getPath());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		app.start();
		//new control.Controller();
		
	}

	@Override
	public void run() {
		
		try {
			//sleep(600000);
			sleep(5000);
			
			Backup_2 file = new Backup_2();
			
				try {
					file.openFile(Backup_2.getPath());
					for (Filme f : BaseDados.proximasSessoes()) {
						System.out.println(f);
						file.saveFilme(f);
					}
					file.closeFile();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
}
