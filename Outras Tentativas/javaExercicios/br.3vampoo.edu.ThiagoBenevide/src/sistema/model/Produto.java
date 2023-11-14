package sistema.model;

import java.util.Date;

public class Produto {
	public int id;
	private static int ultimo;
	private String nome;
	private String codBarras;
	private int quantidade;
	private double preco;
	private Estoque estoque;
	private Date validade;
	
	public Produto(String nome, String codBarras, double preco, int quantidade, Date validade) {
		super();
		this.nome = nome;
		this.codBarras = codBarras;
		this.preco = preco;
		this.validade = validade;
		this.estoque = new Estoque(this, quantidade);
	}
	
	public boolean aplicarDesconto(Double desconto) {
		return false;
	}

	@Override
	public String toString() {
		return "Id" + id + ", nome=" + nome + ", codBarras=" + codBarras + ", preco=" + preco
				+ ", quantidade=" + quantidade + ", validade=" + validade + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public int getId() {
		return id;
	}

	public static int getUltimo() {
		return ultimo;
	}
	
	
	
}
