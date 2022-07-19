package questao7_2;

import java.util.ArrayList;

public class App {
	
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public static void main(String[] args) {
		funcionarios.add(new Gerente("222.222.222-22", "Ana Souza"));
		funcionarios.add(new Vendedor("111.111.111-11", "Jo�o Silva"));
		
		GerenciarVendas.calcularComissao((Vendedor)funcionarios.get(1), 30000); //downcast
		
		
		// OBS FALTA O READONLY
		funcionarios.get(1).calcularSalario();
		funcionarios.get(0).calcularSalario();
		
		for (Funcionario funcionarioCurrente:funcionarios)
			System.out.println(funcionarioCurrente.toString());//vincula��o din�mica 
		/*
		 * Questionamento: Por que as sa�das s�o diferentes uma vez que s�o exibidos os dados de Funcionario? 
		 * Resposta: Como resultado da vincula��o din�mica, o Java decide qual m�todo toString da classe � 
		 *           chamado em tempo de execu��o, em vez de em tempo de compila��o. 
		 *           Ou seja: 
		 *           - Gerente utiliza toString() herdado de Funcion�rio
		 *           - Vendedor utiliza toString() reescrito (@Override)
		 */
	}
}