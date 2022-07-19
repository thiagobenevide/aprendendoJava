package questao4_3;

public abstract class SuperClasse {

	private String nome;
	private String cpf;
	private int idade;
	
	public SuperClasse(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public abstract void metodoSubstituido(SuperClasse superClasse);

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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Nome é: " + nome;
	}
}
