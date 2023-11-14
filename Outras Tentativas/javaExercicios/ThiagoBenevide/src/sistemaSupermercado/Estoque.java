package sistemaSupermercado;

public class Estoque {
	private int quantidade;
	
	
	public Estoque(Produto produto) {
		super();
	}
	
	public Estoque(Produto produto, int quantidade) {
		produto.getEstoque().quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}

	
}
