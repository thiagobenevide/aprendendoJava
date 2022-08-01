package entidades;

public abstract class Campanha implements Cliente{
	private String nome;
	private int ano;
	private int numero;
	
	public Campanha(String nome, int ano, int numero) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.numero = numero;
	}

	public abstract Produto indicarProduto(Cliente cliente);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
