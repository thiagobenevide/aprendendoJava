package model;

import java.io.File;
import java.util.ArrayList;

import view.JOPtionPane;

public class BaseDados {

	private static ArrayList<Pessoa> pessoas;
	private static final String CLIENTE_EXISTE = "Erro ao adicionar o cliente: já existe na base!";
	private static final String FUNCIONARIO_EXISTE = "Erro ao adicionar o Funcionário: já existe na base!";
		
	public static void createBase() throws CpfException {
		pessoas = new ArrayList<Pessoa>();
		try {
			inicializarBase();
		} catch (CpfException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void inicializarBase() throws CpfException {
		
		Administrador admin = new Administrador("Gio", "08102349476", "11111111111", "gmail", "Feminino", "gio", "123", "456");
		
		try {
			
			adicionarPessoa(admin);

			
		} catch (CpfException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}
	
	public static boolean isAdmin(String login, String senha) {
		
		if (login == null || senha == null) {
			return false;
		}
		
		for (Pessoa userCurrent : pessoas) {
			if (userCurrent instanceof Administrador) {
				if (((Administrador)userCurrent).getLogin().equalsIgnoreCase(login) && ((Administrador)userCurrent).getSenha().equals(senha)){
					return true;
				}
			}
			return false;
		}
		return false;
	}
	
	public static Pessoa buscarPessoa(Pessoa usuario) {
		for (Pessoa p : pessoas) {
			if (p.getCpf().equals(usuario.getCpf())) {
				return p;
			}
		}
		
		return null;
	}
	
	public static Pessoa buscarPessoa (String cpf) {
		for (Pessoa p : pessoas) {
			if (p.getCpf().equals(cpf)) {
				return p;
			}
		}
		
		return null;
	}
	
	public static boolean isPessoa(Pessoa pessoa) {
		if (buscarPessoa(pessoa) != null) {
			return true;
		}
		return false;
	}
	
	public static boolean adicionarPessoa(Pessoa pessoa) throws CpfException{
		
		try {
			
			if (buscarPessoa(pessoa) == null) {
				pessoas.add(pessoa);
				return true;
			}

			else {
				if (pessoa instanceof Cliente) {
					throw new CpfException(CLIENTE_EXISTE);
				}
				
				else if (pessoa instanceof Funcionario) {
					throw new CpfException(FUNCIONARIO_EXISTE);
				}
				
				else {
					return false;
				}
			}
			
		} catch (CpfException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public static boolean removerPessoa(Pessoa pessoa) {
		if (buscarPessoa(pessoa) != null) {
			pessoas.remove(pessoa);
			return true;
		}
		return false;
	}
	
	public static boolean atualizarPessoa(Pessoa pessoaOld, Pessoa pessoaNew) {
		if (buscarPessoa(pessoaNew) != null && buscarPessoa(pessoaNew) == null) {
			pessoas.set(pessoas.indexOf(pessoaOld), pessoaNew);
			return true;
		}
		
		return false;
	}

	public static ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	
}
