package sistema.model;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String email;

	
//	public Pessoa() {}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Pessoa(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//tenho um m�todo e quero redefini-lo: sobreescrita: Heran�a-Polimorfismo
	public String exibirDados() {
		return "Pessoa: Nome = " + nome + ", CPF = " + cpf + ", email = " + email
				+ "]";
	}
}
