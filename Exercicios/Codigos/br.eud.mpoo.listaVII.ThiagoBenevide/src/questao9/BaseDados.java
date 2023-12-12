package questao9;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Produto>produtos;
	
	public static void createBase() {
		produtos = new ArrayList<Produto>();
		inicializarBase();
	}
	
	public static void inicializarBase() {
		
	}
	
	
	public static Produto buscarProduto(Produto produto) {
		if(produto!= null)
			for(Produto produtoCurrent: produtos)
				if(produtoCurrent.getCodBarras().equals(produto.getCodBarras()))
					return produtoCurrent;
		return null;
	}
	
	public static Produto buscarProduto(String codBarras) {
		if(codBarras!= null)
			for(Produto produtoCurrent: produtos)
				if(produtoCurrent.getCodBarras().equals(codBarras))
					return produtoCurrent;
		return null;
	}
	
	
	public static boolean isProduto(Produto produto) {
		if(buscarProduto(produto)!=null)
			return true;
		return false;
		
	}
	
	public static boolean addProduto(Produto produto) {
		if(!isProduto(produto)) {
			produtos.add(produto);
		}
		return false;
	
	}
	
	public static boolean atualizarEstoque(Produto produto,int  quantidade) {
		buscarProduto(produto).getEstoque().setQuantidade(buscarProduto(produto).getEstoque().getQuantidade()-quantidade);;
		return true;
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	
}
