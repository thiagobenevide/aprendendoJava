package sistemaPetShop;

public class Cachorro extends Animal{

	public Cachorro(String nome, String raca, int idade, double peso, String estado) {
		super(nome, raca, idade, peso, estado);
	}

	@Override
	public String tipoAlimento() {
		String alimento = "racao";
		return alimento;
	}

	@Override
	public int quantidadeAlimento() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
