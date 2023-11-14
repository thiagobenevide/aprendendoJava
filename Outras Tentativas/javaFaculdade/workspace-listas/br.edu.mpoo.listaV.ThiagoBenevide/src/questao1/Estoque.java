package questao1;

public class Estoque {
	private int quantidade;

	
	public Estoque(Produto produto) {	}

	
	public Estoque(int quantidade, Produto produto) {
		super();
		produto.getEstoque().quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "Estoque [quantidade=" + quantidade + "]";
	}
	
	
}
