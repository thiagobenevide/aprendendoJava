package questao9;

import java.util.Date;

public class Produto {

	private String nome;
	private double preco;
	private Date validade;
	private String codBarras;
	private int quantidade;
	
	public Produto(String nome, double preco, Date validade, String codBarras, int quantidade) {
		this.nome = nome;
		this.preco = preco;
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
		return "Produto [nome=" + nome + ", preco=" + preco + ", validade=" + validade + ", codBarras=" + codBarras
				+ ", quantidade=" + quantidade + "]";
	}
	
	
	
}
