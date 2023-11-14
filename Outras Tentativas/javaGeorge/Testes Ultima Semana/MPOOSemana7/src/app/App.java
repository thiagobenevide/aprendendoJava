package app;

import sistema.BaseDados;
import sistema.Funcionario;
import sistema.Pessoa;

public class App {
	
	public static void main(String[] args) {
		
		
		BaseDados.createBase();
		
		
		for(Pessoa pessoa:BaseDados.getPessoas()) {
			if(pessoa instanceof Funcionario) {
				System.out.println(((Funcionario)pessoa).getCodMatricula());				
			}
		}
	}
	
	
	
}
