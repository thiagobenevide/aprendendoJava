package clientes;

public class Produto {
	
	private String nome;
	private double preco;
	private double precoPromocional;
	private String codBarras;
	private int quantidade;
	private String tipo;
	private Date dataValidade;
	
	public Produto(String nome, double preco, double precoPromocional, String codBarras, int quantidade, String tipo,
			Date dataValidade) {
		this.nome = nome;
		this.preco = preco;
		this.precoPromocional = precoPromocional;
		this.codBarras = codBarras;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.dataValidade = dataValidade;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDataValidade() {
		return dataValidae;
	}

	public void setDataValidae(Date dataValidae) {
		this.dataValidae = dataValidae;
	}
	
	
	
	
}