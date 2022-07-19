package questao7_2;

public class App {

	public static void main(String[] args) {
		
		BaseDados.createBase();
		
		//CRIAÇÃO DOS CLIENTES
		
		Cliente cliente1 = new Cliente("Giovanna", "123.456.789-10", "08799852574", "gmail");
		Cliente cliente2 = new Cliente("Marcos", "000.000.000-00", "08796352148", "123@gmail.com");
		
		//CRIAÇÃO DOS FUNCIONARIOS
		
		Funcionario funcionario1 = new Funcionario("Davi", "111.111.111-11", "08799635214","EMPRESA@OUTLOOK.COM.BR", "1232");
		Funcionario funcionario2 = new Funcionario("Jorge", "222.222.222-22", "08799336644","EMPRESA@OUTLOOK.COM.BR", "2213");
	
		
		// UTILIZACAO DOS METODOS
		BaseDados.adicionarCliente(cliente1);
		BaseDados.adicionarCliente(cliente2);
		BaseDados.adicionarFuncionario(funcionario1);
		BaseDados.adicionarFuncionario(funcionario2);
		
		// METODOS DE BUSCA
		System.out.println(BaseDados.buscarCliente(cliente1).getNome());
		System.out.println(BaseDados.buscarCliente("000.000.000-00"));
		System.out.println(BaseDados.isCliente(cliente2));
		
		System.out.println(BaseDados.buscarFuncionario(funcionario2).getNome());
		System.out.println(BaseDados.buscarFuncionario("111.111.111-11"));
		System.out.println(BaseDados.isFuncionario(funcionario2));
	
		
		// METODOS ATUALIZAR
		
		System.out.println(BaseDados.atualizarCliente(cliente1, new Cliente("Mary", "444.444.444-44", "08799554422", "mary@gmail")));
		System.out.println(BaseDados.atualizarFuncionario(funcionario1, new Funcionario("Marta", "333.333.333-33", "08796447582", "marta@gmail", "1478")));
		
		//METODOS DE REMOVER
		
		System.out.println(BaseDados.removerCliente(cliente2));
		System.out.println(BaseDados.removerFuncionario(funcionario2));
		
	
	}

}
