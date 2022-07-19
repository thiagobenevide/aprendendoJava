package questao1;

public class Vender {

	public static boolean vender(Produto produto, int quantidade) {
		
		if(produto != null && BaseDados.isProduto(produto) == true) {
			if (produto.getEstoque().getQuantidade() > 0) {
				BaseDados.atualizarEstoque(produto, -quantidade);
				return true;
				}
			return false;
		}
		return false;
	}
}
