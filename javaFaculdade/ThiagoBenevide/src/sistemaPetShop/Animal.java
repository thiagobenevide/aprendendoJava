package sistemaPetShop;

public abstract class Animal {
	private int id;
	private String nome;
	private String raca;
	private int idade;
	private double peso;
	private String estado;
	
	
	public Animal(String nome, String raca, int idade, double peso, String estado) {
		super();
		this.setId(BaseDados.quantidadeAnimais()+1);
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
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
