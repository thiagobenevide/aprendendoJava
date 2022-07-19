package model;

public abstract class Usuario extends Pessoa {
	
	private String login;
	private String senha;
	
	public Usuario(String nome, String cpf, String telefone, String email, String sexo, String login, String senha) {
		super(nome, cpf, telefone, email, sexo);
		this.login = login;
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}

	
}
