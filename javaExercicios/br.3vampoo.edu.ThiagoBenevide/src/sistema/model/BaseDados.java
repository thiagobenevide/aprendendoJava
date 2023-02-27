package sistema.model;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Produto> produtos;
	
	public void createBase() {
		ArrayList produtos = new ArrayList<Produto>();
	}
	
	private void inicializarBase() {
		
	}
	
	public static Produto buscarProduto(String codBarras) {
		for(Produto produtoCurrent: produtos) {
			if(produtoCurrent.getCodBarras().equalsIgnoreCase(codBarras)) {
				return produtoCurrent;
			}
		}
		return null;
	}
	
	public static ArrayList<Produto> buscarProdutoSAVencer(int diasAVencer){
		return null;
	}
	
	public static ArrayList<Produto> buscarProdutosVencidos() {
		return null;
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	
}
