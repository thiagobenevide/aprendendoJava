package sistemaSupermercado;

public class Xampu extends Produto{

	private String tipoDeCabelo;
	private double peso;
	private String composicao;
	
	public Xampu(String nome, String fabricante, String codBarras, double preco, String tipoDeCabelo, double peso, String composicao) {
		super(nome, fabricante, codBarras, preco);
		
		this.tipoDeCabelo = tipoDeCabelo;
		this.peso = peso;
		this.composicao = composicao;
		// TODO Auto-generated constructor stub
	}

	public String getTipoDeCabelo() {
		return tipoDeCabelo;
	}

	public void setTipoDeCabelo(String tipoDeCabelo) {
		this.tipoDeCabelo = tipoDeCabelo;
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
