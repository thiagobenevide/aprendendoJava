package arrays;

public class Cliente {

	private String telefone;
	private String nome;
	private String email;
	private Endereco endereco;
	private String sexo;
	private boolean aceitaProdutoPromocional;
	
	public Cliente(String telefone, String nome, String email, Endereco endereco, String sexo,
			boolean aceitaProdutoPromocional) {
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.sexo = sexo;
		this.aceitaProdutoPromocional = aceitaProdutoPromocional;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public String getSexo() {
		return sexo;
	}

	public boolean isAceitaProdutoPromocional() {
		return aceitaProdutoPromocional;
	}

	@Override
	public String toString() {
		return "Cliente [telefone=" + telefone + ", nome=" + nome + ", email=" + email + ", sexo=" + sexo
				+ "]";
	}
	
}
