package mpooSystem.model;

public class Usuario extends Pessoa{
	
	public String login;
	private String senha;
	
	
	public Usuario(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nome, String cpf, String sexo) {
		super(nome, cpf, sexo);
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nome, String cpf, String sexo, String login, String senha) {
		super(nome, cpf, sexo);
		this.login = login;
		this.senha = senha;
	}
	
	
	
	
}
