package questao1;

public class App {

	public static void main(String[] args) {
		
		Sabonete sabonete = new Sabonete("Sabonete", "Dove", "01010101001", 2.5, "Jasmin", 3.2, "Composição Jasmin ");
		Xampu xampu = new Xampu("Loreal","Unileve", "01010101002", 7.25, "Liso", 7, "Sem sal");
		
		BaseDados.inicializarBase();
		
		new Estoque(10, sabonete);
		new Estoque(7, xampu);
		
		System.out.println(BaseDados.adicionarProduto(xampu));
		System.out.println(BaseDados.adicionarProduto(sabonete));
		
		System.out.println(BaseDados.buscarProduto(xampu));
		System.out.println(BaseDados.buscarProduto(sabonete.getCodBarras()));
		System.out.println(BaseDados.isProduto(sabonete));
		
		System.out.println(Vender.vender(xampu, 1));
		System.out.println(Vender.vender(sabonete, 3));
		
		System.out.println("XAMPU"+xampu.getEstoque().getQuantidade());
		System.out.println("SABONETE"+sabonete.getEstoque().getQuantidade());
	}

}
