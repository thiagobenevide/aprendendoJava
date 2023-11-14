package sistema;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Pessoa>pessoas;
	private static ArrayList<Compra>compras;
	
	
	//Métodos da Compra
	
	public static void createBase() {
		pessoas = new ArrayList<Pessoa>();
		compras = new ArrayList<Compra>();
		inicializarBase();
	}
	
	public static void inicializarBase() {
		
	}
	
	public static boolean adicionarCompra(Compra compra) {
		if(compra!=null) {
			return compras.add(compra);
		}
		return false;
	}
	
	public static Compra buscarCompra(int id) {
		for(Compra compraCurrent:compras) {
			if(compraCurrent.getId()==id) {
				return compraCurrent;
			}
		}
		return null;
	}
	
	//Métodos das pessoas
	
	private static Pessoa buscarPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			for(Pessoa pessoaCurrent: pessoas) {
				if(pessoaCurrent.getCpf().equalsIgnoreCase(pessoa.getCpf())) {
					return pessoaCurrent;
				}
			}
		}
		return null;
	}
	
	private static Pessoa buscarPessoa(String cpf) {
		for(Pessoa pessoaCurrent: pessoas) {
			if(pessoaCurrent.getCpf().equalsIgnoreCase(cpf)) {
				return pessoaCurrent;
			}
		}
		return null;
	}
	
	
	public static boolean isPessoa(Pessoa pessoa) {
		return pessoas.contains(buscarPessoa(pessoa));
	}
	

	public static boolean isPessoa(String cpf) {
		return pessoas.contains(buscarPessoa(cpf));
	}
	
	public static boolean removerPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			pessoas.remove(buscarPessoa(pessoa));
			return true;
		}
		return false;
	}
	
	
	public static boolean atualizarPessoa(Pessoa pessoaOld, Pessoa pessoaNew) {
		if(pessoaOld!=null && pessoaNew!=null) {
			pessoas.set(pessoas.indexOf(buscarPessoa(pessoaOld)), pessoaNew);
			return true;
		}
		return false;
	}
	
	
	public static ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	public static ArrayList<Compra> getCompras() {
		return compras;
	}	
	
}
