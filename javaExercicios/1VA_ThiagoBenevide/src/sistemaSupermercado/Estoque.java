package sistemaSupermercado;

public class Estoque {
	private int quantidade;

	public Estoque(Produto produto) {
		
	}
	
	public Estoque(Produto produto, int quantidade) {
		super();
		produto.getEstoque().setQuantidade(quantidade);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
