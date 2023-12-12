package entidade;

import java.util.ArrayList;

import app.App;
import base.BaseDados;

public class Compra {
	public int id;
	private double valorTotal;
	private ArrayList<Produto>produtos;
	private static int proximoID = 0;
	public Compra() {
		this.id = proximoID + 1;
		proximoID++;
		this.produtos = new ArrayList<Produto>();
	}
	
	public boolean adicionarProduto(Produto produto) {
		if(produto!=null) 
			if(BaseDados.isProduto(produto.codBarras))
				if(BaseDados.buscarProduto(produto.codBarras).getEstoque().getQuantidade()>0)
					BaseDados.buscarProduto(produto.codBarras).getEstoque().setQuantidade(
							BaseDados.buscarProduto(produto.codBarras).getEstoque().getQuantidade()-1);
					this.valorTotal = valorTotal+produto.getPreco();
					produtos.add(produto);
		return false;
					
	}


	public double getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}



	public ArrayList<Produto> getProdutos() {
		return produtos;
	}



	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
	
}
