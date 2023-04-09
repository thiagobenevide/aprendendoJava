package sistema.model;

public abstract class Pessoa {
	public String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
}
