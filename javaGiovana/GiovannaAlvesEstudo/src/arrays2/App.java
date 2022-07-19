package arrays2;

public class App {

	public static void main(String[] args) {

		
		Cliente cliente = new Cliente("01", "87", "Gio", "gmail", "Fem");
		Cliente cliente2 = new Cliente("01", "87", "Gio", "gmail", "Fem");
		
		System.out.println(BaseDados.adicionarCliente(cliente));
		System.out.println(BaseDados.adicionarCliente(cliente2));
		
		new Endereco("Major", 01, "Centro", "Custódia", "PE", "56640000", BaseDados.buscarCliente(cliente));
		
		System.out.println(cliente);
		
		
	}

}
