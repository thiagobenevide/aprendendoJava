package mpooSystem.model;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Pessoa>pessoas;
	
	
	public static void createBase() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	private static Pessoa buscarPessoa(Pessoa pessoa) {
		if(pessoa!= null) {
			for(Pessoa pessoaCurrent: pessoas) {
				if(pessoaCurrent.getCpf().equalsIgnoreCase(pessoa.getCpf())) {
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
		return false;
	}
	
	public static boolean isUsuario(Usuario usuario){
		return false;
	}
	
	public static boolean adicionarPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			if(!isPessoa(pessoa)) {
				pessoas.add(pessoa);
				return true;
			}
		}
		return false;
		//informar erro ao adicionar usuario
	}
	
	public static boolean removerPessoa(Pessoa pessoa) {
		if(pessoa!=null && isPessoa(pessoa)) {
			pessoas.remove(pessoas.indexOf(buscarPessoa(pessoa)));
			return true;
		}
		return false;
	}
	
}
