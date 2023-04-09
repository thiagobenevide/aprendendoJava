package sistema.model;

public abstract class PessoaFisica extends Pessoa{
	private String cpf;
	private String sexo;
	
	public PessoaFisica(String nome, String cpf, String sexo) {
		super(nome);
		this.cpf = cpf;
		this.sexo = sexo;
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
	
	
}
