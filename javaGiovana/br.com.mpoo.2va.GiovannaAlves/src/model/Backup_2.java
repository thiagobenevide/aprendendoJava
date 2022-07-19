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

public class Backup_2 {

	private static BufferedWriter bufferedWriter;
	private static final String path = "basedadosVA";
	private static BufferedReader fileBufferedReader;

	
	public static void backup(ArrayList<Filme> filmes) {
	
	}
	
	
	public static void openFile(String path) throws FileNotFoundException, IOException {
		try {
			
			File file = new File(path);
			File arquivo = new File(file.getParentFile(), path);
			if(!file.exists())
				file.createNewFile();
			bufferedWriter = new BufferedWriter(new FileWriter(arquivo, true));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Filme> loadFilme() throws IOException, FileNotFoundException{
		
		ArrayList<Filme> filme = new ArrayList<Filme>();
		ArrayList<String> dadosFilme = new ArrayList<String>();
		String linha = "";
		
		InputStream is = new FileInputStream(Backup_2.path);
		
		fileBufferedReader = new BufferedReader(new InputStreamReader(is));
		
		int cont = 0;
		
		while((linha = fileBufferedReader.readLine()) != null) {
			if (linha.equals(",")) {
				//filme.add(new Filme(dadosFilme.get(0), dadosFilme.get(1), dadosFilme.get(2), dadosFilme.add(3), dadosFilme.add(4), dadosFilme.add(5)));
				
				dadosFilme.clear();
				
				cont = 0;
				
			}
			
			else {
				dadosFilme.add(linha);
				cont ++;
			}
		}
		
		return filme;
	}
	
	public static boolean saveFilme(Filme filme) {
		try {
			int s = (int) filme.getSessao().getValorIngresso();
			
			if (filme.isDublado() == true && filme.isLegendado() == true) {
				bufferedWriter.write(filme.getTitulo());
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getGenero());
				bufferedWriter.newLine();
				bufferedWriter.write("true");
				bufferedWriter.newLine();
				bufferedWriter.write("true");
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getAnoLancamento());
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getDescricao());
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getSessao().getSala());
				bufferedWriter.newLine();
				bufferedWriter.write(s);
				bufferedWriter.newLine();
				bufferedWriter.write(",");
				bufferedWriter.newLine();
				bufferedWriter.flush();
				return true;
			}
			
			if (filme.isDublado() == true) {
				bufferedWriter.write(filme.getTitulo());
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getGenero());
				bufferedWriter.newLine();
				bufferedWriter.write("false");
				bufferedWriter.newLine();
				bufferedWriter.write("true");
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getAnoLancamento());
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getDescricao());
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getSessao().getSala());
				bufferedWriter.newLine();
				bufferedWriter.write(s);
				bufferedWriter.newLine();
				bufferedWriter.write(",");
				bufferedWriter.newLine();
				bufferedWriter.flush();
				return true;
			}
			
			if (filme.isLegendado() == true) {
				bufferedWriter.write(filme.getTitulo());
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getGenero());
				bufferedWriter.newLine();
				bufferedWriter.write("true");
				bufferedWriter.newLine();
				bufferedWriter.write("false");
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getAnoLancamento());
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getDescricao());
				bufferedWriter.newLine();
				bufferedWriter.write(filme.getSessao().getSala());
				bufferedWriter.newLine();
				bufferedWriter.write(s);
				bufferedWriter.newLine();
				bufferedWriter.write(",");
				bufferedWriter.newLine();
				bufferedWriter.flush();
				return true;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static void closeFile() {
		if (bufferedWriter != null)
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}


	public static String getPath() {
		return path;
	}
	
	
	
}
