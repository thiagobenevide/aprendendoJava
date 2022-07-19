package questao1;

public abstract class Produto {

	private String nome;
	private String fabricante;
	private String codBarras;
	private double preco;
	private Estoque estoque;
	
	public Produto(String nome, String fabricante, String codBarras, double preco) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.codBarras = codBarras;
		this.preco = preco;
		this.estoque = new Estoque(this);
	}
	
	
	public String getNome() {
		return nome;
	}



	public String getFabricante() {
		return fabricante;
	}



	public String getCodBarras() {
		return codBarras;
	}



	public double getPreco() {
		return preco;
	}

	
	
	public Estoque getEstoque() {
		return estoque;
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", fabricante=" + fabricante + ", codBarras=" + codBarras + ", preco=" + preco
				+ estoque +"]";
	}


	
}
