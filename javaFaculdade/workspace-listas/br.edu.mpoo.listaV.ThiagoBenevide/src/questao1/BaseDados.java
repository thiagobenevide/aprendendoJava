package questao1;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Produto>produtos;

	public static void createBase() {
		produtos = new ArrayList<Produto>();
		inicializarBase();
	}
	
	
	public static void inicializarBase() {
		
	}
	
	private static Produto buscarProduto(Produto produto) {
		if(produto!=null) {
			for(Produto produtoCurrent: produtos) {
				if(produtoCurrent.getCodBarras().equalsIgnoreCase(produto.getCodBarras())) {
					return produtoCurrent;
				}
			}
		}
		return null;
	}
	
	
	private static Produto buscarProduto(String codBarras) {
		
		for(Produto produtoCurrent: produtos) {
			if(produtoCurrent.getCodBarras().equalsIgnoreCase(codBarras)) {
				return produtoCurrent;
			}
		}
		return null;
	}
	
	public static boolean adicionarProduto(Produto produto) {
		if(produto!=null) {
			if(isProduto(produto)) {
				return false;
				
			}
			produtos.add(produto);
		}
		return false;
	}
	
	
	public static boolean isProduto(Produto produto) {
		if(produto!=null) {
			return produtos.contains(buscarProduto(produto));
		}
		return false;
	}
	
	
	public static boolean isProduto(String codBarras) {	
		return produtos.contains(buscarProduto(codBarras));

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
	
	public static boolean atualizarEstoque(Produto produto, int quantidade) {
		if(produto==null && quantidade==0) {
			return false;
		}
		buscarProduto(produto).getEstoque().setQuantidade(produto.getEstoque().getQuantidade()-quantidade);
		return true;
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	
}
