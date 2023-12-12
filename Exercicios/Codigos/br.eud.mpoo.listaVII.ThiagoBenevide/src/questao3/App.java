package questao3;

import java.util.ArrayList;

public class App {

	
	public static void main(String[] args) {
		Corrente cc1 = new Corrente();
		Corrente cc2 = new Corrente();
		Poupanca cp1 = new Poupanca();
		Poupanca cp2 = new Poupanca();
		
		cc1.depositar(2000);
		cc2.depositar(2000);
		cp1.depositar(2000);
		cp2.depositar(2000);
		
		Banco.setContas(new ArrayList<Conta>());
		
		Banco.getContas().add(cc1);
		Banco.getContas().add(cc2);
		Banco.getContas().add(cp1);
		Banco.getContas().add(cp2);
		
		Banco.transferir(cp1, cp2, 50);
		Banco.transferir(cp1, cc2, 50);
		Banco.transferir(cc1, cc2, 50);
		Banco.transferir(cc1, cp2, 50);
		
		
		
		
		
	}
}
