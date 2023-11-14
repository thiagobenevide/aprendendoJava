package model;

public abstract class Funcionario {

	private String cpf;
	private String login;
	
	public Funcionario(String cpf, String login) {
		super();
		this.cpf = cpf;
		this.login = login;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return " cpf=" + cpf + ", login=" + login + "]";
	}
	
	
	
}
