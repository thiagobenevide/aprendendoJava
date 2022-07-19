package questao4_2;

public class SubClasse extends SuperClasse {

	public SubClasse(String nome, String cpf) {
		super(nome, cpf);
	}


	@Override
	public boolean metodoSubstituido(SuperClasse superClasse, int idade) {
		int anoDeNascimento = (2022 - idade);
		System.out.println("Ano de Nascimento: " + anoDeNascimento);
		return true;
	}
	
}
