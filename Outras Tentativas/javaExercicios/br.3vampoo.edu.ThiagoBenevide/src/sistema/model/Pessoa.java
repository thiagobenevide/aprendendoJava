package sistema.model;

public abstract class Pessoa extends Fornecedor{
	private String nome;
	private String cpf;
	
	
	public Pessoa(String cnpj, String nomeFantasia, String nome, String cpf) {
		super(cnpj, nomeFantasia);
		this.nome = nome;
		this.cpf = cpf;
		
		// TODO Auto-generated constructor stub
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
	
	
	
	
}
