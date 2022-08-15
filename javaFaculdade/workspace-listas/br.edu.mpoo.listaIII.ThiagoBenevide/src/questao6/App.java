package questao6;

import java.util.Date;

public class App {

	public static void main(String[] args) {		
		Cliente c1 = new Cliente("Thiago");
		Vendedor f1 = new Funcionario(12, "vendedor", 11223344, "brasil2002");
		Vendedor g1 = new Gerente(1, "gerente", 12454812, "dono22");
		
		Produto p1 = new Produto(663772, "Barbeador", 7.00);
		Produto p2 = new Produto(1288591, "Escova de Dentes", 10.00);
		Produto p3 = new Produto(4128384, "Arroz Caçarola", 5.55);
		
		Descricao descricao = new Descricao(f1, c1);
		
		descricao.adicionarProdutos(p1);
		descricao.adicionarProdutos(p2);
		descricao.adicionarProdutos(p3);
		
		Compra compra = f1.realizarVenda(c1, descricao);
		
		compra.registrarCompra(descricao);
		compra.criarNota(null);
		
		System.out.println(compra.toString());
		
		
		
		
		
		
	}
	
	
}
