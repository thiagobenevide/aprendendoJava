package sistema;

import java.util.ArrayList;

public class BaseDados {
	
	private static ArrayList<Compra>compras;
	private static ArrayList<Pessoa>pessoas;
	
	public static void createBase() {
		compras = new ArrayList<Compra>();
		pessoas = new ArrayList<Pessoa>();
		inicializarBase();
	}
	
	private static void inicializarBase() {
		//Adiciona um novo pessoa na função de administrador
		
		//1 Caso de polimorfismo de objetos
		//Adicionando instancias de objetos
		/*
		 * pessoas.add(new Cliente("Jose Silva", new Telefone(87,99992222), new
		 * Endereco("Rua Uast", "Universitario", "Serra Talhada", "PE", "56640-000"),
		 * new Email("zezin@gmail.com"), "masculino", true, "000-0000-0000"));
		 * pessoas.add(new Funcionario());
		 */
		
	}
	
	//Métodos da Compra na base de dados
	
	public static boolean adicionarCompra(Compra compra) {
		if(compra!=null) {
			return compras.add(compra); //Comando de inserir compra em arquivo ou base de dados
		}
		return false;
	}
	
	public static Compra buscarCompra(int id) {
		for (Compra compraCurrent:compras) {  //Varredura de dados usando o forEach
			if (compraCurrent.getId()==id) {
				return compraCurrent;
			}
		}
		return null;
	}

	
	public static Compra buscarCompra(Compra compra) {
		if(compra!=null) {
			for (Compra compraCurrent:compras) {
				if (compraCurrent.getId()== compra.getId()) {
					return compraCurrent;
				}
			}
		}
			
		return null;
	}

	
	
	//Métodos do Pessoa na base de dados
	
	private static Pessoa buscarPessoa(Pessoa pessoa) {
		for(Pessoa pessoaCurrent:pessoas) {
			if(pessoaCurrent.getCpf().equalsIgnoreCase(pessoa.getCpf())) {
				return pessoaCurrent;
			}
		}
		return null;
	}
	
	private static Pessoa buscarPessoa(String cpf) {
		for(Pessoa pessoaCurrent:pessoas) {
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
	
	public static boolean adicionarPessoa(Pessoa pessoa) {
		if (pessoa!=null) {
			if(!isPessoa(pessoa)) {
				return pessoas.add(pessoa);
				
			}
		}
		return false;
	}
	
	public static boolean removerPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			return pessoas.remove(buscarPessoa(pessoa));
		}
		return false;
	}
	
	public static boolean atualizarPessoa(Pessoa pessoaOld, Pessoa pessoaNew) {
		if(pessoaNew!=null && pessoaOld!=null) {
			pessoas.set(pessoas.indexOf(buscarPessoa(pessoaOld)), pessoaNew);
			return true;
		}
		return false;
		
	}
	

	public static ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	
	
	
}
