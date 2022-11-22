package sistemaSupermercado;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class BaseDados {
	private static ArrayList<Produto>produtos;
	
	
	public static void createBase() {
		produtos = new ArrayList<Produto>();
	}
	
	public static void inicializarBase() {
		Produto p1 = new Produto("PROD001","Feijão da Serra",9.00, new Date("12-10-2022"),false);
		Produto p2 = new Produto("PROD003","Laranja Formosa", 0.50, new Date("30-08-2022"), true);
		new Estoque(p1,10);
		new Estoque(p2,40);
		BaseDados.addProduto(p1);
		BaseDados.addProduto(p2);
	}
	
	private static Produto buscarProduto(Produto produto) {
		if (produto!=null) {
			for(Produto produtoCurrent:produtos) {
				if(produtoCurrent.getCodBarras().equalsIgnoreCase(produto.getCodBarras())) {
					return produtoCurrent;
				}
			}
			return null;
		}
		return null;
	}
	
	
	public static boolean isProduto(String codBarras) {
		return produtos.contains(buscarProduto(new Produto(codBarras)));
	}
	
	public static boolean addProduto(Produto produto) {
		Verificador verificado = new Verificador();
		if(produto!=null && isProduto(produto.codBarras)) {
			if(verificado.) {
				produtos.add(produto);
				return true;
			}
			JOptionPane.showMessageDialog(null,"Erro ao cadastrar produto: Produto vencido!");
		}			
		return false;
	}
	
	public static boolean removerProduto(Produto produto) {
		if(produto!=null && isProduto(produto.codBarras)) {
			produtos.remove(produtos.indexOf(buscarProduto(produto)));
			return true;
		}
		return false;
	}
	
	public static ArrayList<String> exibirProduto(){
		ArrayList<String> nomeProdutos = new ArrayList<String>();
		for(Produto produtoCurrent: produtos) {
			nomeProdutos.add(produtoCurrent.getCodBarras());
		}
		return nomeProdutos;
		
	}
	
	
	public static boolean alterarEstoque(String codBarras, int quantidade) {
		if(isProduto(codBarras)) {
			produtos.get(produtos.indexOf(buscarProduto(new Produto(codBarras)))).getEstoque().setQuantidade(quantidade);
			return true;
		}
		return false;
	}
	
	
}
