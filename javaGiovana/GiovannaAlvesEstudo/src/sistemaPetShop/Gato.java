package sistemaPetShop;

public class Gato extends Animal {
	
	public Gato(int id, String nome, String raca, int idade, double peso, String estado) {
		super(id, nome, raca, idade, peso, estado);

	}

	@Override
	public String tipoAlimento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int quantidadeAlimento() {
		// TODO Auto-generated method stub
		return 0;
	}

}
