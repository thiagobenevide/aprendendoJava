package questao2;

public class App {

	public static void main(String[] args) {
		
		BaseDados.createBase();
		
		Cliente c1 = new Cliente("13077735407", "87999026780", "Thiago Benevide", "thiagobenevide@live.com", "masculino");
		new Endereco("Avenida Inocêncio Lima", 1592, "Cruzeiro", "Custódia", "Pernambuco", "56640000", c1);

		Cliente c2 = new Cliente("45781979256", "00087967954", "Jose da Silva", "joseSilva@gmail.com", "masculino");
		new Endereco("Principal Redencao", 152, "Redencao", "Custódia", "Pernambuco", "56640000", c1);
		
		
		BaseDados.adicionarCliente(c1);
		BaseDados.adicionarCliente(c2);
		BaseDados.adicionarCliente(c2);
		
		
		System.out.println(BaseDados.getClientes());
		System.out.println(c1.toString());
	}

}
