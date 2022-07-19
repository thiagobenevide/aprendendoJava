package questao7_2;

public class Gerente extends Funcionario{

	public Gerente(String cpf, String login) {
		super(cpf, login);
	}
	

	@Override
	public void calcularSalario() {
		super.calcularSalario();
		this.setSalario(this.getSalarioBase() * 5);
	}

	@Override
	public String toString() {
		return "Gerente [Cpf=" + getCpf() + ", Login=" + getLogin() + ", Salario=" + getSalario() +"]";
	}

}
