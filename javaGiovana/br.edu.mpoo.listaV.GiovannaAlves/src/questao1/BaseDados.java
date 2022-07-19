package questao1;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public static void inicializarBase() {
		produtos = new ArrayList<Produto>();
	}
	
	public static Produto buscarProduto(Produto produto) {
		
		if (buscarProduto(produto.getCodBarras()) != null) {
			return buscarProduto(produto.getCodBarras());
		}
		
		return null;
	}
	
	public static Produto buscarProduto(String codBarras) {
		for (Produto produtosCurrent : produtos) {
			if (produtosCurrent.getCodBarras().equals(codBarras)) {
				return produtosCurrent;
			}
		}
		return null;
	}
	
	public static boolean isProduto(Produto produto) {
		
		if (buscarProduto(produto.getCodBarras()) != null) {
			return true;
		}
		
		return false;
	}
	
	public static boolean adicionarProduto(Produto produto) {
		if (isProduto(produto) == true) {
			return false;
		}
		
		produtos.add(produto);
		return true;
	}
	
	public static boolean atualizarEstoque(Produto produto, int estoque) {
		//TEM QUE RECEBER UM PRODUTO E O ESTOQUE
		if (produto == null && estoque == 0) {
			return false;
		}
		buscarProduto(produto).getEstoque().setQuantidade(estoque);
		return true;
	}
	
	public static ArrayList<Produto> getProdutos(){
		return produtos;
	}
	
}
