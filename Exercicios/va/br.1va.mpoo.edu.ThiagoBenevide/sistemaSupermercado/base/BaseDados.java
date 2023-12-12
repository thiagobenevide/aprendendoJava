package base;

import java.util.ArrayList;
import java.util.Calendar;

import entidade.Estoque;
import entidade.Produto;
import entidade.Vendedor;
import gui.Mensagem;
import util.Verificador;

public class BaseDados {
	private static ArrayList<Produto>produtos;
	
	public static void createBase() {
		produtos = new ArrayList<Produto>();
		inicializarBase();
	}
	
	public static void inicializarBase() { 
		Calendar datap1 = Calendar.getInstance();
		datap1.set(2024, Calendar.DECEMBER, 31);
		
		Calendar datap2= Calendar.getInstance();
		datap2.set(2024, Calendar.JUNE, 01);
		
		Calendar datap3 = Calendar.getInstance();
		datap3.set(2023, Calendar.DECEMBER, 10);
		
		Calendar datap4 = Calendar.getInstance();
		datap4.set(2023, Calendar.DECEMBER, 21);
		
		Produto p1 = new Produto("PROD001", "feijão da Serra", 10,datap1, false);
		new Estoque(50, p1);
		Produto p2 = new Produto("PROD002", "arroz da Serra", 5,datap2, false);
		new Estoque(50, p2);
		Produto p3 = new Produto("PROD003", "biscoito formoso", 2,datap3, false);
		new Estoque(50, p3);
		Produto p4 = new Produto("PROD004", "laranja mimosa", 0.50,datap4, false);
		new Estoque(50, p4);
		
		
		
		addProduto(p1);
		addProduto(p2);
		addProduto(p3);
		addProduto(p4);
		
		
	}
	
	public static Produto buscarProduto(String codBarras) {
		if(codBarras!=null)
			for(Produto produtoCurrent : produtos)
				if(produtoCurrent.codBarras.equals(codBarras))
					return produtoCurrent;
		
		return null;
	}
	
	
	public static boolean isProduto(String codBarras) {
		if(buscarProduto(codBarras)!=null)
			return true;
		return false;
	}
	
	
	public static boolean addProduto(Produto produto) {
		if(produto!=null) {
			if(isProduto(produto.codBarras)) {
				Mensagem.exibirMensagem(Mensagem.PRODUTO_ERRO);
				return false;
			}else if(Verificador.isVencido(produto)) {
				Mensagem.exibirMensagem(Mensagem.PRODUTO_ERRO);
				return false;
			}else {				
				produtos.add(produto);
				Mensagem.exibirMensagem(Mensagem.PRODUTO_SUCESSO);
			}
		}
		return false;
	}
	
	public static boolean removerProduto(Produto produto) {
		if(isProduto(produto.codBarras)) {
			produtos.remove(produtos.indexOf(buscarProduto(produto.codBarras)));
			return true;
		}
		return false;
	}
	
	public static ArrayList<String> exibirProduto(){
		ArrayList<String>produtosTemp = new ArrayList<String>();
		for(Produto produtoCurrent: produtos)
			produtosTemp.add(produtoCurrent.getNome());
		
		return produtosTemp;
		
	}
	
	
	
}
