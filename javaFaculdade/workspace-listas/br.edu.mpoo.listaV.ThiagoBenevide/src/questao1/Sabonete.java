package questao1;

public class Sabonete extends Produto {
	private String fragancia;
	private double peso;
	private String composicao;
	

	
	public Sabonete(String nome, String fabricante, String codBarras, double preco, Estoque estoque) {
		super(nome, fabricante, codBarras, preco, estoque);
		// TODO Auto-generated constructor stub
	}
	
	public String getFragancia() {
		return fragancia;
	}
	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getComposicao() {
		return composicao;
	}
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}
	
	
}
