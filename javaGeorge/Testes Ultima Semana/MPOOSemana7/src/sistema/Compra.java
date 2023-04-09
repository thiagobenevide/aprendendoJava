package sistema;

import java.util.ArrayList;

public class Compra {
	private static int numero;
	private int id;
	private double valor;
	private static int ultima;
	Cliente cliente;
	Produto produto;
	private ArrayList<Produto>produtos;
	
	
	public Compra(Cliente cliente, Produto produto) {
		numero++;
		this.id = numero;
		this.cliente = cliente;
		this.produto = produto;
	}
	
	
	public void adicionarProduto(Produto produto) {
		if (produto!=null) {
			produtos.add(produto);
		}
		valorCompra();
	}

	private void valorCompra() {
		if(cliente.isAceitaProdutoPromocional()) {
			valor+=produtos.get(produtos.size()-1).getPrecoPromocional();
		}else {
			valor+=produtos.get(produtos.size()-1).getPreco();
		}
	}
	
	//Questionamento: Como seria remover um produto da compra?
	//Qual elemento vai remover? Envolve uma busca
	
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
	public static int getUltima() {
		return ultima;
	}
	public static void setUltima(int ultima) {
		Compra.ultima = ultima;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
