package questao4_3;

public class SubClasse extends SuperClasse {

	public SubClasse(String nome, String cpf, int idade) {
		super(nome, cpf, idade);
	}
	
	@Override
	public void metodoSubstituido(SuperClasse superClasse) {
		int anoDeNascimento = (2022 - superClasse.getIdade());
		System.out.println("Ano de Nascimento: " + anoDeNascimento);
	}
	
}
