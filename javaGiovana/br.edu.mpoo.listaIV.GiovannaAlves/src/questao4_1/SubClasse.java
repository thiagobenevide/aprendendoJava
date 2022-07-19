package questao4_1;

public class SubClasse extends SuperClasse {

	public SubClasse(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public String toString() {
		return "CPF: " + this.getCpf();
	}

	
	
}
