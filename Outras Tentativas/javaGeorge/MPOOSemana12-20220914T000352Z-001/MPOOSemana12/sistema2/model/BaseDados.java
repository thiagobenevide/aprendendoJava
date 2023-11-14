package model;

import java.util.ArrayList;

public class BaseDados {
	
	static ArrayList<Produto> produtos;
	
	public static void createBase(){
		produtos = new ArrayList<Produto>();
	}
	
	/*Atenção:
	 * Podemos e devemos usar outros métodos para evitar duplicidade de código
	 *  - buscarProduto  
	 *  - isProduto 
	 */

//Solução "sem Tratamento de Exceção":	
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
	
//Solução "com Tratamento de Exceção":
	public static boolean adicionarProduto(Produto produto) throws DuplicatedProductException{
		boolean status=false;
		for (Produto produtoCurrent:produtos)
//			if (produtoCurrent.getCodBarras().equalsIgnoreCase(produto.getCodBarras()))
//Redefinição para codBarras: int 
			if (produtoCurrent.getCodBarras()==produto.getCodBarras()){
				status=true;
				throw new DuplicatedProductException("Produto já cadastrado!");
			}
		if(!status)
			return produtos.add(produto);
		return false;
	}
}