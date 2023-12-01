package br.edu.mpoo.listaV.ThiagoBenevide;

public class Produto {
	private String nome;
	private String fabricante;
	private String codBarras;
	private double preco;
	private Estoque estoque;
	
	
	public Produto(String nome, String fabricante, String codBarras, double preco) {
		/**
		 * @author thiagobenevide
		 * <HTML>
		 * <Body>
		 * <ul>
			 * <li>String nome | Nome do produto_</li>
			 * <li>String fabricante | Fabricante do produto</li>
			 * <li>String codBarras | Codigo de Barras do Produto</li>
			 * <li>double preco | Preço do produto</li>
		 * </ul>
		 * 
		 * 
		 * </Body>
		 * <HTML>
		 * 
		 * 
		 * 
		 * */
		super();
		this.nome = nome;
		this.fabricante = fabricante;
		this.codBarras = codBarras;
		this.preco = preco;
		this.estoque = new Estoque(this);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
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


	public Estoque getEstoque() {
		return estoque;
	}


	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	
	
	
	
	

	
}
