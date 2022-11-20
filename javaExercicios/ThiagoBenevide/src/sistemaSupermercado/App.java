package sistemaSupermercado;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseDados.inicializarBase();
		
		Xampu x1 = new Xampu("Delux", "Seda", "CHAMP001", 12.50, "Cacheados", 500, "Ervas Naturais");
		Estoque ex1 = new Estoque(x1, 40);
		Sabonete s1 = new Sabonete("Freus", "Even", "SABO001", 2.50, "Flores de Jardim", 20, "Essencia Orquidea");
		Estoque ex2 = new Estoque(s1,50);
		
		BaseDados.adicionarProduto(x1);
		BaseDados.adicionarProduto(s1);
		
		
		System.out.println("Quantidade na base de dados");
		System.out.println(BaseDados.buscarProduto(s1).getEstoque().getQuantidade());
		System.out.println(BaseDados.buscarProduto(x1).getEstoque().getQuantidade());
		
		System.out.println("Vendas");
		Vender.vender(x1, 10);
		Vender.vender(s1, 7);
		
		System.out.println("Quantidade na base de dados pós venda");
		System.out.println(BaseDados.buscarProduto(s1).getEstoque().getQuantidade());
		System.out.println(BaseDados.buscarProduto(x1).getEstoque().getQuantidade());
		
		BaseDados.atualizarProduto(x1, s1);
		
		System.out.println("Quantidade na base de dados pós venda");
		System.out.println(BaseDados.buscarProduto(s1).getEstoque().getQuantidade());
		System.out.println(BaseDados.buscarProduto(s1).getEstoque().getQuantidade());

		
		System.out.println(BaseDados.getProdutos());
	}

}
