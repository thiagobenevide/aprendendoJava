package mpooSystem.model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Pessoa>pessoas;
	
	public static void createBase() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	private static void inicializarBase() {
		
	}
	
	private static Pessoa buscarPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			for(Pessoa pessoaCurrent : pessoas) {
				if(pessoaCurrent.getCpf().equalsIgnoreCase(pessoa.getCpf())){
					return pessoaCurrent;
				}
			}
		}
		return null;
	}
	
	public static boolean isPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			return pessoas.contains(buscarPessoa(pessoa));
		}
		return false;
	}
	
	public static boolean isUsuario(String login, String senha) {
		for(Pessoa pessoaCurrent : pessoas) {
			/*Precisa ser feito o downcast para analisar como usuário e não como pessoa*/
		}
		
		
	}
}
