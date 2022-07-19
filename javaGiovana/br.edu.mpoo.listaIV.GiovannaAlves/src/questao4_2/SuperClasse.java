package questao4_2;

public class SuperClasse {

	private String nome;
	private String cpf;
	private int idade;
	
	public SuperClasse(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public boolean metodoSubstituido(SuperClasse superClasse, int idade) {
		this.idade = idade;
		return true;
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
