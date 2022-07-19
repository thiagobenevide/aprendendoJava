package questao6_1;

public class App {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra("Feijao", "01", (float) (2.5));
		Produto produto1 = new Produto("Arroz", "02", (float)(3.0));
		
		Funcionario funcionario = new Funcionario("AA20", 5541, "Giovanna", "gerente", "123456");
		compra1.adicionarProduto(produto1);
		compra1.registrar(compra1);
		funcionario.desconto(compra1, funcionario, (float)(2.1));
		compra1.registrar(compra1);
		System.out.println(compra1.resumir(compra1));
	}

}
