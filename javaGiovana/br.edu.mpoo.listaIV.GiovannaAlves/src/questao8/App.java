package questao8;

public class App {

	public static void main(String[] args) {
		
		Banco.Base();
		
		Corrente corrente1 = new Corrente(100);
		Corrente corrente2 = new Corrente(500);
		
		Poupanca poupanca1 = new Poupanca(250);
		Poupanca poupanca2 = new Poupanca(750);
		
		Banco.adicionarConta(poupanca1);
		Banco.adicionarConta(poupanca2);
		Banco.adicionarConta(corrente1);
		Banco.adicionarConta(corrente2);
		
		System.out.println(Banco.tranferir(poupanca2, poupanca1, 150));
		System.out.println(Banco.tranferir(poupanca1, corrente1, 50));
		System.out.println(Banco.tranferir(corrente2, corrente1, 200));
		System.out.println(Banco.tranferir(corrente2, poupanca1, 50));
		
		System.out.println(corrente1.getSaldo());
		System.out.println(corrente2.getSaldo());
		System.out.println(poupanca1.getSaldo());
		System.out.println(poupanca2.getSaldo());
		
		corrente2.correrJuros(10);
		poupanca1.renderJuros(8);
		

		System.out.println(corrente2.getSaldo());
		System.out.println(poupanca1.getSaldo());

	}

}
