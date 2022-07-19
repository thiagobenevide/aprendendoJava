package sistemaPetShop;

import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Proprietario> proprietarios;
	private static ArrayList<Atendimento> atendimentos;
	private static ArrayList<Veterinario> veterinarios;
	
	public static void createBaseDados() {
		proprietarios = new ArrayList<Proprietario>();
		atendimentos  = new ArrayList<Atendimento>();
		veterinarios = new ArrayList<Veterinario>();
		inicializarBase();
	}
	
	private static void inicializarBase() {
		//passar os obj
		Veterinario veterinario = new Veterinario("Jose", "111.111.111-11", "8799999-9999", 1234);
		Proprietario proprietario = new Proprietario("Maria", "222.222.222-22", "87-88888-8888");
		Cachorro cachorro = new Cachorro(1, "REX", "dobermann", 1, 10, "desnutricao", proprietario);
		Gato gato1 = new Gato(1, "pixano", "angorá", 1, 2, "desnutricao", proprietario);
		Gato gato2 = new Gato(1, "pixano", "angorá", 1, 3, "saudavel", proprietario);
	}

	public static ArrayList<Proprietario> getProprietarios() {
		return proprietarios;
	}

	public static ArrayList<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public static ArrayList<Veterinario> getVeterinarios() {
		return veterinarios;
	}
	
}