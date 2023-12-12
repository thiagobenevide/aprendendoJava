package entidade;

public class Estoque {

	private int quantidade;
	
	public Estoque(Produto produto) {
		
	}

	public Estoque(int quantidade, Produto produto) {
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
