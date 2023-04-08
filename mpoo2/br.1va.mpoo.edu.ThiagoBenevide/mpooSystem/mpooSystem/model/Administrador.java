package mpooSystem.model;

public class Administrador extends Usuario{
	private String chaveAcesso;

	public Administrador(String nome, String cpf, String sexo, String login, String senha) {
		super(nome, cpf, sexo, login, senha);
		// TODO Auto-generated constructor stub
	}

	public Administrador(String nome, String cpf, String sexo) {
		super(nome, cpf, sexo);
		// TODO Auto-generated constructor stub
	}

	public Administrador(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	
}
