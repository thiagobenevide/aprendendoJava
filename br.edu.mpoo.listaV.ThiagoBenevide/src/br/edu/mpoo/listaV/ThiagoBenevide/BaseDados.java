package br.edu.mpoo.listaV.ThiagoBenevide;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Produto>produtos;
	
	public static void inicializarBase() {
		produtos = new ArrayList<Produto>();
	}
	
	public static Produto buscarProduto(Produto produto) {
		if(produto!=null)
			for(Produto produtoCurrent:produtos)
				if(produtoCurrent.getCodBarras().equals(produto.getCodBarras()))
					return produtoCurrent;
		return null;
	}
	
	
	public static Produto buscarProduto(String codBarras) {
		if(codBarras!=null && codBarras.length() > 0)
			for(Produto produtoCurrent:produtos)
				if(produtoCurrent.getCodBarras().equals(codBarras))
					return produtoCurrent;
		return null;
	}
	
	public static boolean isProduto(Produto produto) {
		if(produto!=null)
			if(buscarProduto(produto)!=null)
				return true;
		return false;
	}
	
	public static boolean adicionarProduto(Produto produto) {
		if(produto!=null && !isProduto(produto)) {
			produtos.add(produto);
			return true;
		}
		return false;
			
	}
	
	public static boolean atualizarEstoque(Estoque estoque) {
		if(estoque!=null) {
			estoque.setQuantidade(estoque.getQuantidade()-1);
			return true;
		}return false;
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	
	
	
	
}
