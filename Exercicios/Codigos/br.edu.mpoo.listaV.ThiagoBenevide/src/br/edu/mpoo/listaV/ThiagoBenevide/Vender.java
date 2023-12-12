package br.edu.mpoo.listaV.ThiagoBenevide;

public class Vender {

	public static boolean vender(Produto produto) {
		if(produto!=null)
			if(BaseDados.atualizarEstoque(produto.getEstoque()))
				return true;
		return false;
		
	}
	
	
}
