package arrays4;

public abstract class Usuario {

	private String cpf;
	private String nome;
	private String telefone;
	private String email;
	
	public Usuario(String cpf, String nome, String telefone, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
}
