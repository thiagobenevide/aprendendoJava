package sistemaPetShop;

public class Gato extends Animal {

	public Gato (int id, String nome, String raca, int idade, double peso, String estado,
			Proprietario proprietario) {
		super(id, nome, raca, idade, peso, estado, proprietario);
		
		proprietario.getAnimais().add(new Gato (id, nome, raca, idade, peso, estado));

	}

	private Gato (int id, String nome, String raca, int idade, double peso, String estado) {
		super(id, nome, raca, idade, peso, estado);
	}

	@Override
	public String informacaoAlimentacao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String tipoAlimento() {
		String alimento = "comida de gato";
		return alimento;
	}

	@Override
	public int quantidadeAlimento(Animal gato) {
		if (gato.getPeso() == 2) {
			return 130;
		}
		if (gato.getPeso() == 3) {
			return 175;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Gato [getId()=" + getId() + ", getNome()=" + getNome() + ", getRaca()=" + getRaca()
				+ ", getIdade()=" + getIdade() + ", getPeso()=" + getPeso() + ", getEstado()=" + getEstado()
				+ ", getReceita()=" + getReceita() + "]";
	}
	
}
