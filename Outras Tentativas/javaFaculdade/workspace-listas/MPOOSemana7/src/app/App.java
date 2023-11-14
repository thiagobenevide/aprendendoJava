package app;

import sistema.BaseDados;

public class App {
	
	public static void main(String[] args) {
		
		
		BaseDados.createBase();
		//System.out.println((Cliente)BaseDados.pessoas.get(0).isAceitaReceberPromocao());
		//System.out.println((Funcionario)BaseDados.pessoas.get(1).isAceitaReceberPromocao());
		
		
		for(Pessoa pessoa:BaseDados.pessoas) {
			if(pessoa instanceof Funcionario) {
				System.out.println(((Funcionario)pessoa).getMatricula());				
			}
		}
		
		//Pequisa: O conceito de polimorfismo de objeto aplica-se apenas entre classes?
		//			Caso contrario justufuqye sua resposta
	}
	
	
	
}
