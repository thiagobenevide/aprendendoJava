package sistema;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Pessoa>pessoas;
	private static ArrayList<Compra>compras;
	private static ArrayList<Produto>produtos;

	
	public static void crateBase() {
		compras = new ArrayList<Compra>();
		pessoas = new ArrayList<Pessoa>();
		produtos = new ArrayList<Produto>();
		inicializarBase();
	}
	
	
	public static void inicializarBase() {
		
	}
	
	
	//Métodos Compra
	
	
	public static boolean adicionarCompra(Compra compra) {
		if(compra!=null) {
			return compras.add(compra);
		}
		return false;
	}
	
	
	public static Compra buscarCompra(int id) {
		for(Compra compraCurrent: compras) {
			if(compraCurrent.getId()==id);
			return compraCurrent;
		}
		return null;
	}
	
	public static Compra buscarCompra(Compra compra) {
		if(compra!=null) {
			for(Compra compraCurrent: compras) {
				if(compraCurrent.getId()==compra.getId()) {
					return compraCurrent;
				}
			}
			
		}
		return null;
	}
	
	//Méodos Pessoas
	
	private static Pessoa buscarPessoa(Pessoa pessoa) {
		if(pessoa!=null) {
			for(Pessoa pessoaCurrent: pessoas) {
				if (pessoaCurrent.getCpf().equalsIgnoreCase(pessoa.getCpf())){
					return pessoaCurrent;
				}
			}
		}
		return null;
	}
	

	private static Pessoa buscarPessoa(String cpf) {
		
		for(Pessoa pessoaCurrent: pessoas) {
			if (pessoaCurrent.getCpf().equalsIgnoreCase(cpf)){
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
		if(pessoa!= null) {
			return pessoas.remove(buscarPessoa(pessoa));
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
	
	
	//Métodos Produtos
	
	
	private static Produto buscarProduto(Produto produto) {
		if(produto!=null) {
			for(Produto produtoCurrent: produtos) {
				if(produtoCurrent.getNome().equalsIgnoreCase(produto.getNome())) {
					return produtoCurrent;
				}
			}
		}
		return null;
	}
	

	private static Produto buscarProduto(String nome) {
		
		for(Produto produtoCurrent: produtos) {
			if(produtoCurrent.getNome().equalsIgnoreCase(nome)) {
				return produtoCurrent;
			}
		}
		return null;
	}
	
	
	public static boolean isProduto(Produto produto) {
		if(produto!=null) {
			return produtos.contains(buscarProduto(produto));
		}
		return false;
	}
	
	public static boolean isProduto(String nome) {
		return produtos.contains(buscarProduto(nome));
	}
	
	
	public static boolean atualizarProduto(Produto produtoOld, Produto produtoNew) {
		if(produtoOld!=null && produtoNew!=null) {
			produtos.set(produtos.indexOf(buscarProduto(produtoOld)), produtoNew);
			return true;
		}
		return false;
	}
	
	
	public static boolean removerProduto(Produto produto) {
		if(produto!=null) {
			produtos.remove(produtos.indexOf(buscarProduto(produto)));
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
	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	
	
}
