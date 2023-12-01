package questao5;

public class App {
	public static void main(String[] args) {
		BaseDados.createBase();
		
		Usuario usuario1 = new Usuario("José Santos", "941.860.760-30", "josesantos@gmail.com", "jose123");
		Endereco endereco1 = new Endereco("Av. dos Cactos", 100, "Cactolândia", 56970000, "Serra Talhada", "PE", null);
		Telefone telefone1 = new Telefone(55, 87, 999990000);
		
		usuario1.setEndereco(endereco1);
		usuario1.getTelefones().add(telefone1);
		
		//--------------------------
		
		Usuario usuario2 = new Usuario("Maria Silva", "575.373.110-4830", "mariasilva@gmail.com", "mariamaria");
		Endereco endereco2 = new Endereco("Rua Flores", 50, "Encruzilhada", 52041430, "Recife", "PE", null);
		Telefone telefone2 = new Telefone(55, 87, 999990001);
		
		usuario2.setEndereco(endereco2);
		usuario2.getTelefones().add(telefone2);
		
		//---------------------
		Usuario usuario3 = new Usuario("João Mamão", "080.075.880-35", "jmamao@gmail.com", "mamãoDocE");
		Endereco endereco3 = new Endereco("Rua Mamão Doce", 100, "Saudade", 56870000, "Triunfo", "PE", null);
		Telefone telefone3 = new Telefone(55, 87, 999990002);
		
		usuario2.setEndereco(endereco2);
		usuario2.getTelefones().add(telefone2);
		
		
		BaseDados.adicionarCliente(usuario1);
		BaseDados.adicionarCliente(usuario2);
		BaseDados.adicionarCliente(usuario3);
		
		
		//Sobre a segurança temos problema na base de dados pois os métodos estão públicos
		//Se for realizar alterações na base via métodos tempos o problema de alterar um usuário por completo, tentei amenizar deixando alterar apenas alterar alguns campos como nome e email
		
		//Deveria retirar o princípio de agregação e colocar composição entre o telefone de usuario e endereço, pois não faz sentido ter um telefone ou endereço sem a obrigatorieddade de um usuário
	}
}
