package questao9;

public class Sabonete extends Produto{
	private String fragancia;
	private double peso;
	private String composicao;
	
	public Sabonete(String nome, String fabricante, String codBarras, double preco, String fragancia, double peso,
			String composicao) {
		super(nome, fabricante, codBarras, preco);
		this.fragancia = fragancia;
		this.peso = peso;
		this.composicao = composicao;
	}
	public Sabonete(String nome, String fabricante, String codBarras, double preco) {
		super(nome, fabricante, codBarras, preco);
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
