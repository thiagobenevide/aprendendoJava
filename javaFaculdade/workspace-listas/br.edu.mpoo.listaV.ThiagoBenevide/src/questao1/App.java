package questao1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseDados.createBase();
		
		Produto x1 = new Xampu("Elseve Hidra", "Lorel Paris", "XAMP001", 12.00, "Cabelos Desidratados", 400, "Ácido Hialurônico");
		Produto s1 = new Sabonete("Equilibrio", "Francis", "SHAP001", 3.50, "Afazema", 85, "Essências Florais");
		
		new Estoque(10, x1);
		new Estoque(20, s1);
		
		BaseDados.adicionarProduto(x1);
		BaseDados.adicionarProduto(s1);
		System.out.println(BaseDados.adicionarProduto(s1));
		
		System.out.println(BaseDados.getProdutos());
		
		System.out.println(x1.getEstoque().getQuantidade());
		System.out.println(s1.getEstoque().getQuantidade()); 

		
		System.out.println(Vender.venderProduto(x1, 5));
		System.out.println(Vender.venderProduto(s1, 3));
		
		System.out.println(x1.getEstoque().getQuantidade());
		System.out.println(s1.getEstoque().getQuantidade()); 

	}

}
