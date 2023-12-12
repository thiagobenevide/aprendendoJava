package questao9;

public class Vender {
	public static boolean vender(Produto produto, int quantidade) {
		if(produto!=null && BaseDados.isProduto(produto)) {
			if(produto.getEstoque().getQuantidade()>=quantidade) {
				BaseDados.atualizarEstoque(produto, quantidade);
				return true;
			}
		}
		return false;
		
	}
	
	
}
