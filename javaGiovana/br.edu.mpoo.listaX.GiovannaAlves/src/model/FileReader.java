package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FileReader {

	BufferedReader fileBufferedReader;
	
	public ArrayList<Pessoa> readFile(String path) throws IOException{
		
		ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
		ArrayList<String> dadosAdmin = new ArrayList<String>();
		String linha = "";
		
		InputStream is = new FileInputStream(path);
		
		fileBufferedReader = new BufferedReader(new InputStreamReader(is));
		
		int cont = 0;
		
		while((linha = fileBufferedReader.readLine()) != null) {
			
			if (linha.equals(",")) {
				if (cont == 8) {
					pessoa.add(new Administrador(dadosAdmin.get(0),
							dadosAdmin.get(1),
							dadosAdmin.get(2),
							dadosAdmin.get(3), 
							dadosAdmin.get(4), 
							dadosAdmin.get(5), 
							dadosAdmin.get(6), 
							dadosAdmin.get(7)));
					
					dadosAdmin.clear();
					
					cont = 0;
				}
				
				if (cont == 6) {
					
					for (String dados : dadosAdmin) {
						
						if (dados.equals("false")) {
							pessoa.add(new Cliente(dadosAdmin.get(0),
									dadosAdmin.get(1),
									dadosAdmin.get(2),
									dadosAdmin.get(3), 
									dadosAdmin.get(4), 
									false));
							cont = 0;
						}
						
						else if (dados.equals("true")) {
							pessoa.add(new Cliente(dadosAdmin.get(0),
									dadosAdmin.get(1),
									dadosAdmin.get(2),
									dadosAdmin.get(3), 
									dadosAdmin.get(4), 
									true));
							cont = 0;
						}
						
					}
					
					if (cont == 6) {
						pessoa.add(new Funcionario(dadosAdmin.get(0),
								dadosAdmin.get(1),
								dadosAdmin.get(2),
								dadosAdmin.get(3), 
								dadosAdmin.get(4), 
								dadosAdmin.get(5)));
						dadosAdmin.clear();
						cont = 0;
					}
					
					dadosAdmin.clear();
				}
			}
			else {
				dadosAdmin.add(linha);
				cont ++;
			}
		}
						
		return pessoa;
	}
}
