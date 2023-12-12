package questao2;

public class App {

	
	public static void main(String[] args) {
		BaseDados.createBase();
		
		Cliente c1 = new Cliente("111.111.111.04", "99026780", "Thiago", "thiagobenevide@live.com", "masculino");
		Cliente c2 = new Cliente("111.111.111.05", "99026748", "Maria", "mariaAlves@live.com", "feminino");
		new Endereco("Rua dos Cactos", 100, "Cactolândia", "Serra Talhada", "PE", "59970-000", c1);
		new Endereco("Av Gregorio Ferraz Nogueira", 20, "José Tomé de Souza Ramos", "Serra Talhada", "CE", "56909-535", c2);
		new Endereco("Av Gregorio Ferraz Nogueira", 20, "José Tomé de Souza Ramos", "Serra Talhada", "CE", "56909-535", c2);
		
		
		BaseDados.adicionarCliente(c1);
		BaseDados.adicionarCliente(c2);
		
		System.out.println(BaseDados.isCliente(c1));
		System.out.println(BaseDados.isCliente(c2));
		System.out.println(c1.getEnderecos());
		System.out.println(c2.getEnderecos());
	}
}
