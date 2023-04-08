package mpooSystem.model;

public abstract class Pessoa {
	public String nome;
	private String cpf;
	protected String sexo;
	
	
	public Pessoa(String nome, String cpf, String sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + "]";
	}
	
	
	
	
}
