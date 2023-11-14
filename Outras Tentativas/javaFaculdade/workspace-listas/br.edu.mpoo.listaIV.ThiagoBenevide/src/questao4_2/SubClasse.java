package questao4_2;

public class SubClasse extends SuperClasse {

	public SubClasse(String nome, int idade, String cidade) {
		super(nome, idade, cidade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isCustodia() {
		return false;
	}

/*
 * @Override public String toString() { return "SubClasse [getNome()=" +
 * getNome() + ", getIdade()=" + getIdade() + ", getCidade()=" + getCidade() +
 * "]"; }
 */
	
	
  

}
