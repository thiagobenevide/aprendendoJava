package br.edu.mpoo.listaV.ThiagoBenevide;

public class App {

	
	public static void main(String[] args) {
		BaseDados.inicializarBase();
		Produto p1 = new Produto("SABAO", "DOVE", "1585458", 50);
		Produto p2 = new Produto("SABAO", "DOVE", "1585458", 50);
		Produto p3 = new Produto("SABAO", "DOVE", "1785458", 50);
		
		new Estoque(50, p1);
		new Estoque(5, p2);
		new Estoque(50, p3);
		
		BaseDados.adicionarProduto(p1);
		BaseDados.adicionarProduto(p2);
		BaseDados.adicionarProduto(p3);
		
		Vender.vender(p3);
		
		
		System.out.println(p1.getEstoque().getQuantidade());
		System.out.println(p2.getEstoque().getQuantidade());
		System.out.println(p3.getEstoque().getQuantidade());
		System.out.println(BaseDados.getProdutos());
		
		
		
		
		
	}
}
