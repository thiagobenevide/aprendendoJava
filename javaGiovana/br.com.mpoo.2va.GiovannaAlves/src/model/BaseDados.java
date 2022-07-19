package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import view.MensagemView;

public class BaseDados {

	private static final String pathBaseDados = "base/basedados.xml";
	public static ArrayList<Filme> filmes;
	
	public static void createBase() {
		filmes = new ArrayList<Filme>();
		inicializarBase();
	}
	
	private static void inicializarBase() {
		try {

			Filme filme = new Filme("titulo",
					"genero",
					true,
					true,
					2000,
					"descricao");
			BaseDados.addFilme(filme);

			
			try {
				String strData = "30/05/2022";
				String strHora = "08:02";
				String concatenada = strData +" " + strHora;
				SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm");
				Calendar c = Calendar.getInstance();
				c.setTime(s.parse(concatenada));
				new Sessao(10,
						20,
						c,
						BaseDados.isFilme(filme));
				
				new MensagemView("Sessão criada com sucesso!");
				
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (FilmeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new MensagemView(e.getMessage());
		}
	}
	
	private static void uploadFilme(String path) {
		// fazer upload
	}
	
	public static Filme isFilme(Filme filme) {
		for (Filme f : filmes) {
			if (f.getTitulo().equals(filme.getTitulo()) || f.getSessao().equals(filme.getSessao())) {
				return f;
			}
		}
		
		return null;
	}
	
	public static boolean buscarFilme(Filme filme) {
		for (Filme f : filmes) {
			if (f.getTitulo().equals(filme.getTitulo()) || f.getSessao().equals(filme.getSessao())) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean addFilme(Filme filme) throws FilmeException {
		try {
			if (buscarFilme(filme) == false) {
				filmes.add(filme);
				return true;
			}
			
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static ArrayList<Filme> proximasSessoes() {
		return filmes;
	}
	
}
