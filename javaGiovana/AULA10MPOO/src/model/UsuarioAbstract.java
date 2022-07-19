package model;

public abstract class UsuarioAbstract {

	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String sexo;
	
	public UsuarioAbstract(String nome, String cpf, String telefone, String email, String sexo) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getSexo() {
		return sexo;
	}
	
}
