package questao6;

import java.util.ArrayList;

public class Descricao {
	private ArrayList<Produto> produtos;
	private Vendedor vendedor;
	private Cliente cliente;
	
	public Descricao(Vendedor vendedor, Cliente cliente) {
		super();
		this.vendedor = vendedor;
		this.cliente = cliente;
	}
	
	
	public void adicionarProdutos(Produto produto) {
		this.produtos.add(produto);
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	
		
}
