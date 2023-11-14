package sistemaSupermercado;

import java.util.ArrayList;

public class Compra {
	public static int id;
	private double valor;
	private ArrayList<Produto>produtos;
	
	
	private Compra(double valor, ArrayList<Produto> produtos) {
		super();
		this.valor = valor;
		this.produtos = produtos;
	}
	
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Compra.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
}
