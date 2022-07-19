package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.StringTokenizer;

public class Backup {
	
	private static Formatter output;
	private static final String PATH = "file/baseDados";	
	
	public static void openFile(String nameFile) {
		
		try {
			output = new Formatter(nameFile); // abre o arquivo
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void addAdmin(Administrador admin) throws FormatterClosedException{
		output.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n", admin.getNome(),
				admin.getCpf(),
				admin.getTelefone(),
				admin.getEmail(),
				admin.getSexo(),
				admin.getLogin(),
				admin.getSenha(),
				admin.getMatricula(),
				",");
	}
	
	public static void addFunc(Funcionario func) throws FormatterClosedException{
		output.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n", func.getNome(),
				func.getCpf(),
				func.getTelefone(),
				func.getEmail(),
				func.getSexo(),
				func.getMatricula(),
				",");
	}
	
	public static void addCliente(Cliente cliente) throws FormatterClosedException{
		output.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n", cliente.getNome(),
				cliente.getCpf(),
				cliente.getTelefone(),
				cliente.getEmail(),
				cliente.getSexo(),
				cliente.isReceivePropaganda(),
				",");
	}
	
	public static void closeFile() {
		if (output!=null) 
			output.close();
	}

	public static String getPath() {
		return PATH;
	}
	
	public void perc() {
		ArrayList<Pessoa> pessoas = BaseDados.getPessoas();
		
		for (Pessoa p : pessoas) {
			if (p instanceof Administrador) {
				addAdmin((Administrador) (p));
			}
			
			else if (p instanceof Cliente) {
				addCliente((Cliente) (p));
			}
			
			else if (p instanceof Funcionario) {
				addFunc((Funcionario) (p));
			}
		}
		
	}
	
	
}
