package arrays3;

public class Cliente {

	private String cpf;
	private String telefone;
	private String nome;
	private String email;
	private Endereco endereco;
	private String sexo;
	
	public Cliente(String cpf, String telefone, String nome, String email, String sexo) {
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.endereco = new Endereco(this);
		this.sexo = sexo;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public Endereco getEnderecos() {
		return endereco;
	}
	public String getSexo() {
		return sexo;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", telefone=" + telefone + ", nome=" + nome + ", email=" + email + ", endereco="
				+ endereco + ", sexo=" + sexo + "]";
	}
	
}
