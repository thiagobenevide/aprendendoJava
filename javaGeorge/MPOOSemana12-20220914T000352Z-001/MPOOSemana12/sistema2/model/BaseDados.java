package model;

import java.util.ArrayList;

public class BaseDados {
	
	static ArrayList<Produto> produtos;
	
	public static void createBase(){
		produtos = new ArrayList<Produto>();
	}
	
	/*Aten��o:
	 * Podemos e devemos usar outros m�todos para evitar duplicidade de c�digo
	 *  - buscarProduto  
	 *  - isProduto 
	 */

//Solu��o "sem Tratamento de Exce��o":	
//	public static boolean adicionarProduto(Produto produto){
//		boolean status=false;
//		for (Produto produtoCurrent:produtos)
////			if (produtoCurrent.getCodBarras().equalsIgnoreCase(produto.getCodBarras()))
//			if (produtoCurrent.getCodBarras()==produto.getCodBarras())
//				status=true;
//		if(!status)
//			return produtos.add(produto);
//		return false;
//	}
	
//Solu��o "com Tratamento de Exce��o":
	public static boolean adicionarProduto(Produto produto) throws DuplicatedProductException{
		boolean status=false;
		for (Produto produtoCurrent:produtos)
//			if (produtoCurrent.getCodBarras().equalsIgnoreCase(produto.getCodBarras()))
//Redefini��o para codBarras: int 
			if (produtoCurrent.getCodBarras()==produto.getCodBarras()){
				status=true;
				throw new DuplicatedProductException("Produto j� cadastrado!");
			}
		if(!status)
			return produtos.add(produto);
		return false;
	}
}