package questao4_1;

public class SuperClasse {

	private String nome;
	private String cpf;
	
	public SuperClasse(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	
	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	@Override
	public String toString() {
		return "Nome é: " + nome;
	}
	
	
}
