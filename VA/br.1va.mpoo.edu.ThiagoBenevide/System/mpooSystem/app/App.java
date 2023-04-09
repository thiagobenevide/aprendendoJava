package mpooSystem.app;

import mpooSystem.controller.MenuController;
import mpooSystem.model.Administrador;
import mpooSystem.model.BaseDados;
import mpooSystem.model.Pessoa;
import mpooSystem.model.Usuario;

public class App {

	public static void main(String[] args) {
		BaseDados.createBase();
		
		Administrador admin1 = new Administrador("Thiago","13077735409", "masculino", "admin", "admin", "ADMIN001");
		Administrador admin2 = new Administrador("Godofredo", "35825183027", "masculino", "admin", "admin", "ADMIN002");
		
		BaseDados.adicionarPessoa(admin1);
		BaseDados.adicionarPessoa(admin2);
		
		Usuario user1 = new Usuario("Maria Silva", "83353316334", "feminino", "mariasilva", "mAriA");
		Usuario user2 = new Usuario("Joao Silva", "833533163334", "masculino", "joaoSilva", "joseSilva");
		Usuario user3 = new Usuario("José Santos", "12345678900", "masculino", "joseSantos", "joseSantos");
		Usuario user4 = new Usuario("Benevide", "50144704080", "masculino", "thiagobenevide", "159287");
		
		BaseDados.adicionarPessoa(user1);
		BaseDados.adicionarPessoa(user2);
		BaseDados.adicionarPessoa(user3);
		BaseDados.adicionarPessoa(user4);
		System.out.println(BaseDados.listPessoas());
		System.out.println(BaseDados.listUsuario());
		
		new MenuController();
		
	}
	
	
}
