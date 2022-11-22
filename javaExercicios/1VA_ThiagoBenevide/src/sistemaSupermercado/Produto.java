package sistemaSupermercado;

import java.util.Date;

public class Produto {
	public String codBarras;
	private String nome;
	protected double preco;
	Date validade;
	private boolean perecivel;
	private Estoque estoque;
	
	
	
	public Produto(String codBarras, String nome, double preco, Date validade, boolean perecivel) {
		super();
		this.codBarras = codBarras;
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
		this.perecivel = perecivel;
		this.estoque = new Estoque(this);
	}



	public String getCodBarras() {
		return codBarras;
	}



	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public Date getValidade() {
		return validade;
	}



	public void setValidade(Date validade) {
		this.validade = validade;
	}



	public boolean isPerecivel() {
		return perecivel;
	}



	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}



	public Estoque getEstoque() {
		return estoque;
	}



	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	
	
}
