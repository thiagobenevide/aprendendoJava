package sistema.model;

public class Estoque {
	private int quantidade;
	
	private Estoque(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Estoque(Produto produto, int quantidade) {
		produto.setEstoque(new Estoque(quantidade));
	}
	
}
