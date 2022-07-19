package arrays;

import java.util.Date;

public class Produto {

	private String nome;
	private double preco;
	private double precoPromocional;
	private Date validade;
	private String codBarras;
	private int quantidade;
	
	
	public Produto(String nome, double preco, double precoPromocional, Date validade, String codBarras,
			int quantidade, Compra compra) {
		compra.getProduto().add(new Produto(nome, preco, precoPromocional, validade, codBarras, quantidade));
	}

	private Produto(String nome, double preco, double precoPromocional, Date validade, String codBarras,
			int quantidade) {
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
	public double getPreco() {
		return preco;
	}
	public double getPrecoPromocional() {
		return precoPromocional;
	}
	public Date getValidade() {
		return validade;
	}
	public String getCodBarras() {
		return codBarras;
	}
	public int getQuantidade() {
		return quantidade;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", precoPromocional=" + precoPromocional + ", validade="
				+ validade + ", codBarras=" + codBarras + ", quantidade=" + quantidade + "]";
	}

}
