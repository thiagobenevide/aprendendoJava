package questao2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseDados.createBase();
		
		Cliente c1 = new Cliente("13077735407","99026780","Thiago","thiagobenevide@live.com", new ArrayList<Endereco>(), "masculino");
		new Endereco(c1, "Avenida Inocencio Lima", 1592, "Cruzeiro", "Custodia", "Pernambuco", "56640000");
		new Endereco(c1, "Avenida Inocencio Lima", 1594, "Cruzeiro", "Custodia", "Pernambuco", "56640000");
		BaseDados.adicionarCliente(c1);
		
		
		System.out.println(c1.getEnderecos());
	}

}
