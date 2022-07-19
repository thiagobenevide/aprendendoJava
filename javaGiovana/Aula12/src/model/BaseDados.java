package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseDados {

	private static FichaAtendimento fichaAtendimento;
	
	// carregar a ROM
	// CRUD (CREATE, REATRIVE, UPDATE, DELETE)
	// ctrl + shift + o - para importar todas as bibliotecas
	
	private static String pathFichaAtendimento = "file/fichaAtendimento.xml";
	private static BufferedWriter fileBufferedWriter;
	private static BufferedReader fileBufferedReader;
	
	public static void createBase() {
		fichaAtendimento = new FichaAtendimento();
		inicializar();
	}
	
	private static void inicializar() {
		openFileReader(pathFichaAtendimento);
		fichaAtendimento = readFichaFile();
		closeFile();
	}
	
	private static void openFile(String path) throws FileNotFoundException {
		try {
			File file = new File(path);
			if (!file.exists()) file.createNewFile();
			fileBufferedWriter = new BufferedWriter(new FileWriter(file, true));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new FileNotFoundException(); // RELANCANDO A EXCECAO
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void closeFile() {
		try {
			if (fileBufferedWriter != null) {
			fileBufferedWriter.close();	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writerFichaAtendimento() {
		
	}
	
	public static void openFileReader(String path) {
		fileInput = new FileInputStream(path);
		fileBufferedReader = new BufferedReader(new InputStreamReader(fileInput));
	}
	
	//Dom4Driver() - É UMA BIBLIOTECA PARA PEGAR UM TEXTO E CONVERTER EM CONTEXTOS de java
}
