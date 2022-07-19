package questao3;

public class App {

	public static void main(String[] args) {
		
		BaseDadosClientes.inicializarBase();
		
		BaseDadosEnderecos.inicializarBase();
		
		Cliente cliente1 = new Cliente("000.000.000-00", "87999999999", "Giovanna", "giovanna@gmail.com", "Feminino");
		
		Cliente cliente2 = new Cliente("111.111.111-11", "87988888888", "Marta", "marta@gmail.com", "Feminino");
		
		new Endereco("Rua dos Cactos", 100, "Cactolândia", "Serra Talhada", "PE", "56970-000", cliente2);
		
		new Endereco("Rua dos Cactos", 100, "Cactolândia", "Serra Talhada", "PE", "56970-000", cliente1);
		
		new Endereco("Av. Gregório Ferraz Nogueira", 20, "José Tomé de Souza Ramos", "Serra Talhada", "PE", "56909-535", cliente2);
		
		new Endereco("Rua dos Cactos", 100, "Cactolândia", "Serra Talhada", "PE", "56970-000", cliente1);
		
		BaseDadosClientes.adicionarCliente(cliente1);
		BaseDadosClientes.adicionarCliente(cliente2);
		
		BaseDadosEnderecos.listarEnderecos();

	}

}
