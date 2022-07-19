package questao4;

public class App {

	public static void main(String[] args) {
		
		BaseDados.inicializarBase();
		
		Cliente cliente = new Cliente("000.000.000-00", "Giovanna Alves", "87999999999", "giovanna@gmail.com");
		Cliente cliente2 = new Cliente("111.111.111-11", "David Carvalho", "87988888888", "david@gmail.com");
		
		System.out.println(BaseDados.adicionarCliente(cliente));
		System.out.println(BaseDados.adicionarCliente(cliente2));
		
		new Conta(10, 001, 200, "123456", BaseDados.buscarCliente(cliente));
		new Conta(11, 002, 135, "456789", BaseDados.buscarCliente(cliente));
		new Conta(12, 234, 0.35, "010101", BaseDados.buscarCliente(cliente2));
		
		System.out.println(Banco.depositar(10, BaseDados.buscarCliente(cliente).getContas().get(0)));
		
		System.out.println(Banco.sacar(150, BaseDados.buscarCliente(cliente).getContas().get(0)));
		
		System.out.println(Banco.transferir(10, BaseDados.buscarCliente(cliente).getContas().get(0), BaseDados.buscarCliente(cliente2).getContas().get(0)));
		
		
		System.out.println(BaseDados.buscarCliente(cliente));
		System.out.println(BaseDados.buscarCliente(cliente2));
		
		

	}

}
