package questao1;

public class Sabonete extends Produto {

	private String fragrancia;
	private double peso;
	private String composicao;
	
	public Sabonete(String nome, String fabricante, String codBarras, double preco, String fragrancia, double peso,
			String composicao) {
		super(nome, fabricante, codBarras, preco);
		this.fragrancia = fragrancia;
		this.peso = peso;
		this.composicao = composicao;
	}

	public String getFragrancia() {
		return fragrancia;
	}

	public double getPeso() {
		return peso;
	}

	public String getComposicao() {
		return composicao;
	}

}
