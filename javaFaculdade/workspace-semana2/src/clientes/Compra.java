package clientes;

public class Compra {
	public final static int numero;
	private int id;
	private double valor;
	Cliente cliente;
	Produto produto;
	
	public Compra(int id, double valor, Cliente cliente, Produto produto) {
		this.id = id;
		this.valor = valor;
		this.cliente = cliente;
		this.produto = produto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
