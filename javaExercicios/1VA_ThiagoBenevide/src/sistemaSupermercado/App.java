package sistemaSupermercado;

import java.util.Calendar;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		Supermercado super1 = new Supermercado("Supermarket");
		Gerente g1 = new Gerente(super1, "José Santos", "111.111.111-11");
		
		System.out.println(super1.getGerente().getNome());
		System.out.println(g1.getSalario());
		
		Produto p3 = new Produto("PROD002", "Biscoito treloso", 1.50, new Date("01-02-2023"),false);
		new Estoque(p3,50);
		
		BaseDados.createBase();
		
		BaseDados.addProduto(p3);

		
		
	}

}
