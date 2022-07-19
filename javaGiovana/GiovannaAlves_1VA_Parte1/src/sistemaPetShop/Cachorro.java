package sistemaPetShop;

public class Cachorro extends Animal {


	public Cachorro(int id, String nome, String raca, int idade, double peso, String estado,
			Proprietario proprietario) {
		super(id, nome, raca, idade, peso, estado, proprietario);
		
		proprietario.getAnimais().add(new Cachorro(id, nome, raca, idade, peso, estado));

	}

	private Cachorro(int id, String nome, String raca, int idade, double peso, String estado) {
		super(id, nome, raca, idade, peso, estado);
	}

	@Override
	public String tipoAlimento() {
		String alimento = "racao";
		return alimento;
	}

	@Override
	public int quantidadeAlimento(Animal cachorro) {
		if (cachorro.getPeso() == 2) {
			return 130;
		}
		if (cachorro.getPeso() == 3) {
			return 175;
		}
		return 0;
	}

	@Override
	public String informacaoAlimentacao() {
		return tipoAlimento();
	}

	@Override
	public String toString() {
		return "Cachorro [getId()=" + getId() + ", getNome()=" + getNome() + ", getRaca()=" + getRaca()
				+ ", getIdade()=" + getIdade() + ", getPeso()=" + getPeso() + ", getEstado()=" + getEstado()
				+ ", getReceita()=" + getReceita() + "]";
	}

	
}
