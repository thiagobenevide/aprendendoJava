package questao2;

import java.util.ArrayList;

public class App {
	static ArrayList<Funcionario>funcionarios;
	
	
	public static void main(String[] args) {
		funcionarios = new ArrayList<Funcionario>();
		
		Vendedor v1 = new Vendedor("130777354017", "thiago");
		Gerente g1 = new Gerente("12544477788", "jose");
		
		GerenciarVenda.calcularComissao(v1, 5000);
		funcionarios.add(v1);
		funcionarios.add(g1);
		
		System.out.println(v1.toString());
		System.out.println(g1.toString());
		
		
		
	}
	
}
