package mpooSystem.model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Pessoa> pessoas;
	
	public static void createBase() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	private static void inicializarBase() {
		
	}
	
	private static Pessoa buscarPessoa(String cpf) {
		if(ValidadorCPF.validarCPF(cpf)) {
			for(Pessoa pessoaCurrent:pessoas) {
				if(pessoaCurrent.getCpf().equalsIgnoreCase(cpf))
					return pessoaCurrent;
			}
		}
		return null;
	}
	
	public static boolean isPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			return pessoas.contains(buscarPessoa(pessoa.getCpf()));
		}
		return false;
	}
	
	public static boolean isUsuario(Usuario usuario) {
		if(usuario!=null) {
			for(Pessoa pessoaCurrent:pessoas) {
				if(((Usuario)pessoaCurrent).getCpf().equalsIgnoreCase(usuario.getCpf()))
					return true;
			}
		}
		return false;
	}
	
	public static boolean isAdmin(String chaveAcesso) {
		for(Pessoa pessoaCurrent : pessoas) {
			if(((Administrador)pessoaCurrent).getChaveAcesso().equalsIgnoreCase(chaveAcesso))
				return true;
		}
		return false;
	}
	
	public static boolean adicionarPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			if(ValidadorCPF.validarCPF(pessoa.getCpf()) && !isPessoa(pessoa)) {
				return pessoas.add(pessoa);
			}
		}
		return false;
	}
	
	public static boolean removerPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			pessoas.remove(pessoas.indexOf(buscarPessoa(pessoa.getCpf())));
			return true;
		}
		return false;
	}
	
	
	public static ArrayList<String> listPessoas(){
		ArrayList<String> lista = new ArrayList<String>();
		for(Pessoa pessoaCurrent: pessoas) {
			lista.add(pessoaCurrent.nome);
		}
		return lista;
	}
	
	public static ArrayList<String> listUsuario(){
		ArrayList<String> lista = new ArrayList<String>();
		for(Pessoa pessoaCurrent: pessoas) {
			if(isUsuario((Usuario)pessoaCurrent)) {
				lista.add(pessoaCurrent.nome);
			}
		}
		return lista;
	}
	
	
}
