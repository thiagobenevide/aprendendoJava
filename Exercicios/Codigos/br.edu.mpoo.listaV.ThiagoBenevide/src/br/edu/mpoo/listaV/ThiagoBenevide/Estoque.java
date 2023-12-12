package br.edu.mpoo.listaV.ThiagoBenevide;

public class Estoque {
	private int quantidade;

	public Estoque (Produto produto) {};
	
	public Estoque(int quantidade, Produto produto) {
		produto.getEstoque().setQuantidade(quantidade);;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
