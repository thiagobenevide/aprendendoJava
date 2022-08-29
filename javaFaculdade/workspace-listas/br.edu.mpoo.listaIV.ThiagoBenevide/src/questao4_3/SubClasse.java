package questao4_3;

public class SubClasse extends SuperClasse {

	public SubClasse(String nome, int idade, String cidade) {
		super(nome, idade, cidade);
		// TODO Auto-generated constructor stub
	}


	public boolean isCustodia() {
		if (this.getCidade().equalsIgnoreCase("custodia")){
			return true;
		}
		return false;
	}
	

/*
 * @Override public String toString() { return "SubClasse [getNome()=" +
 * getNome() + ", getIdade()=" + getIdade() + ", getCidade()=" + getCidade() +
 * "]"; }
 */
	
	
  

}
