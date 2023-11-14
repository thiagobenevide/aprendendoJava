package questao4_1;

public class SuperClasse {
	private String nome;
	private int idade;
	private String cidade;
	
	
	public SuperClasse(String nome, int idade, String cidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return "SubClasse [nome=" + nome + ", idade=" + idade + ", cidade=" + cidade + "]";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	

}
