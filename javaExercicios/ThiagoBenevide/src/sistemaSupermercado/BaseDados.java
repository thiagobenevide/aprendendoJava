package sistemaSupermercado;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Produto>produtos;
	
	
	public static void inicializarBase() {
		produtos = new ArrayList<Produto>();
	}
	
	public static Produto buscarProduto(Produto produto) {
		if (produto!=null) {
			for(Produto produtoCurrent:produtos) {
				if(produtoCurrent.getCodBarras().equalsIgnoreCase(produto.getCodBarras())) {
					return produtoCurrent;
				}
			}
			return null;
			
		}
		return null;
	}
	
	public static Produto buscarProduto(String codBarras) {
		for(Produto produtoCurrent:produtos) {
			if(produtoCurrent.getCodBarras().equalsIgnoreCase(codBarras)) {
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
	
	public static boolean adicionarProduto(Produto produto) {
		if (produto!=null && isProduto(produto)==false) {
			produtos.add(produto);
			return true;
		}
		return false;
	}
	
	public static boolean atualizarProduto(Produto produtoOld, Produto produtoNew) {
		if(produtoOld != null && produtoNew != null && isProduto(produtoOld)==true) {
			produtos.set(produtos.indexOf(buscarProduto(produtoOld)), produtoNew);
			return true;
		}
		return false;
	}
	
	public static boolean atualizarEstoque(Produto produto, int quantidade) {
		if(produto == null && quantidade == 0 ) {
			return false;
		}else {
			buscarProduto(produto).getEstoque().setQuantidade(quantidade);
			return true;
		}
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	
}


