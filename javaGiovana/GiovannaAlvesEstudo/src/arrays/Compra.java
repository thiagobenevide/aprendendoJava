package arrays;

import java.util.ArrayList;

public class Compra {

	private static int ultima;
	private int id;
	private Cliente cliente;
	private ArrayList<Produto> produto;
	private double valor;
	
	public Compra(int id, Cliente cliente, double valor) {
		this.id = id;
		this.cliente = cliente;
		this.produto = new ArrayList<Produto>();
		this.valor = valor;
	}

	public static int getUltima() {
		return ultima;
	}

	public int getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public ArrayList<Produto> getProduto() {
		return produto;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", cliente=" + cliente + ", produto=" + produto + ", valor=" + valor + "]";
	}
	
}
