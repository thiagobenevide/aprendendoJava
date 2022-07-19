package questao9;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		
		Produto desodorante = new Produto("Desodorante", 5, new Date(22/02/2000), "COD0101", 1);
		
		Caixa caixa = new Caixa("Maria","111.111.111-11", "0001");
		
		caixa.registarCompra(desodorante, new Vendedor("Joao", "222.222.222-22", "0002"), new GerenteVendas("Raul", "333.333.333-33", "0003", "123456"), true);
		caixa.registarCompra(desodorante, new Vendedor("Joao", "222.222.222-22", "0002"), new GerenteVendas("Raul", "333.333.333-33", "0003", "123456"), false);

	}

}
