package sistema;

import java.util.ArrayList;

public class Compra {
	private int id;
	private double valor;
	private static int ultima;
	private ArrayList<Produto>produtos;
	
	public Compra(int id, double valor, int ultima) {
		numero++;
		this.id = id;
		this.valor = valor;
	}
	
	
	public Compra(int id, double valor, ArrayList<Produto> produtos) {
		super();
		this.id = id;
		this.valor = valor;
		this.produtos = produtos;
	}
	
	
	public void adicionarProduto(Produto produto) {
		if (produto!=null) {
			produtos.add(produto);
		}
		valorCompra();
	}

	private void valorCompra() {
		if(cliente.isAceitaReceberPromocao()) {
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
