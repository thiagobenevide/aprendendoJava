package questao7_1;

public class Gerente extends Funcionario{

	public Gerente(String cpf, String login) {
		super(cpf, login);
	}

	@Override
	public String toString() {
		return "Gerente [Cpf=" + getCpf() + ", Login=" + getLogin() + "]";
	}
}
