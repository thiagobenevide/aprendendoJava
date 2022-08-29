package campanhaVenda;

import java.util.Date;

public class Produto {
	private String nome;
	private double preco;
	private double precoPromocional;
	private Date validade;
	private String codBarras;
	private int quantidade;
	
	
	
	public Produto(String nome, double preco, double precoPromocional, Date validade, String codBarras,
			int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.precoPromocional = precoPromocional;
		this.validade = validade;
		this.codBarras = codBarras;
		this.quantidade = quantidade;
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



	public double getPrecoPromocional() {
		return precoPromocional;
	}



	public void setPrecoPromocional(double precoPromocional) {
		this.precoPromocional = precoPromocional;
	}



	public Date getValidade() {
		return validade;
	}



	public void setValidade(Date validade) {
		this.validade = validade;
	}



	public String getCodBarras() {
		return codBarras;
	}



	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
}
