package sistemaPetShop;

public class Pessoa {

	public String nome;
	private String cpf;
	private String fone;
	
	public Pessoa(String nome, String cpf, String fone) {
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getFone() {
		return fone;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", fone=" + fone + "]";
	}
	
}
