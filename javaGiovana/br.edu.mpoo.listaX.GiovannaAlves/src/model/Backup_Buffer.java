package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.StringTokenizer;

public class Backup_Buffer {
	
	private static BufferedWriter fileBuffer;
	private static final String PATH = "file/baseDadosBuffer";	
	

	public void createFile(String path) throws FileNotFoundException, IOException {
		try {
			File file = new File(path);
			if (!file.exists())
				file.createNewFile();
			fileBuffer = new BufferedWriter(new FileWriter(file, true));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void addAdmin(Administrador admin) throws FormatterClosedException{
		try {
			fileBuffer.write(admin.getNome());
			fileBuffer.newLine();
			fileBuffer.write(admin.getCpf());
			fileBuffer.newLine();
			fileBuffer.write(admin.getTelefone());
			fileBuffer.newLine();
			fileBuffer.write(admin.getEmail());
			fileBuffer.newLine();
			fileBuffer.write(admin.getSexo());
			fileBuffer.newLine();
			fileBuffer.write(admin.getMatricula());
			fileBuffer.newLine();
			fileBuffer.write(admin.getLogin());
			fileBuffer.newLine();
			fileBuffer.write(admin.getSenha());
			fileBuffer.newLine();
			fileBuffer.write(",");
			fileBuffer.newLine();
			fileBuffer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addFunc(Funcionario func) throws FormatterClosedException{
		try {
			fileBuffer.write(func.getNome());
			fileBuffer.newLine();
			fileBuffer.write(func.getCpf());
			fileBuffer.newLine();
			fileBuffer.write(func.getTelefone());
			fileBuffer.newLine();
			fileBuffer.write(func.getEmail());
			fileBuffer.newLine();
			fileBuffer.write(func.getSexo());
			fileBuffer.newLine();
			fileBuffer.write(func.getMatricula());
			fileBuffer.newLine();
			fileBuffer.write(",");
			fileBuffer.newLine();
			fileBuffer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addCliente(Cliente cliente) throws FormatterClosedException{
		try {
			fileBuffer.write(cliente.getNome());
			fileBuffer.newLine();
			fileBuffer.write(cliente.getCpf());
			fileBuffer.newLine();
			fileBuffer.write(cliente.getTelefone());
			fileBuffer.newLine();
			fileBuffer.write(cliente.getEmail());
			fileBuffer.newLine();
			fileBuffer.write(cliente.getSexo());
			fileBuffer.newLine();
			if (cliente.isReceivePropaganda() == true)
				fileBuffer.write("true");
			else 
				fileBuffer.write("false");
			fileBuffer.newLine();
			fileBuffer.write(",");
			fileBuffer.newLine();
			fileBuffer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closeFile() {
		if (fileBuffer != null) 
			try {
				fileBuffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static String getPath() {
		return PATH;
	}
	
}
