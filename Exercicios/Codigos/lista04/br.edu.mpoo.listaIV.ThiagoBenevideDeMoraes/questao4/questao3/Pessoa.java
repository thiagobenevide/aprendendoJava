package questao3;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String senha;
	
	
	public Pessoa(String nome, String cpf, String telefone, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getCpf() {
		return cpf;
	}
	
	
	
	
	
}
