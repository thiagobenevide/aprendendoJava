package sistemaPetShop;

public abstract class Animal {

	private int id;
	private String nome;
	private String raca;
	private int idade;
	private double peso;
	private String estado;
	
	public Animal(int id, String nome, String raca, int idade, double peso, String estado) {
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
		this.estado = estado;
	}
	
	public abstract String tipoAlimento();
	
	public abstract int quantidadeAlimento();

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

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + ", raca=" + raca + ", idade=" + idade + ", peso=" + peso
				+ ", estado=" + estado + "]";
	}
	
	
}
