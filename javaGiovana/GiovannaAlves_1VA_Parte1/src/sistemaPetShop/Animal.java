package sistemaPetShop;

public abstract class Animal implements Alimentacao {

	private int id;
	private String nome;
	private String raca;
	private int idade;
	private double peso;
	private String estado;
	private int receita;
	
	public Animal(int id, String nome, String raca, int idade, double peso, String estado, Proprietario proprietario) {	
	}

	public Animal (int id, String nome, String raca, int idade, double peso, String estado) {
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
		this.estado = estado;
	}
	
	public abstract String tipoAlimento();
	
	public abstract int quantidadeAlimento(Animal animal);
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

	public String getEstado() {
		return estado;
	}
	
	public int getReceita() {
		return receita;
	}

	public void setReceita(int receita) {
		this.receita = receita;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + ", raca=" + raca + ", idade=" + idade + ", peso=" + peso
				+ ", estado=" + estado + "]";
	}
	
}
