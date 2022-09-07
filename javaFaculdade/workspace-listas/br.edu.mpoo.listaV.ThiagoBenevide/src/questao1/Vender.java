package questao1;

public class Vender {
	
	public static boolean venderProduto(Produto produto, int quantidade) {
		if (produto!=null) {
			if (BaseDados.isProduto(produto)) {
				if(produto.getEstoque().getQuantidade() > 0) {
					BaseDados.atualizarEstoque(produto, quantidade);
					return true;
				}	
			}
		}
		return false;
	}
}
