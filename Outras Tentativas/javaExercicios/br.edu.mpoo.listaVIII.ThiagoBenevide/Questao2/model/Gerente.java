package model;

public class Gerente extends Funcionario {
	private double salario = 5000;
	
	
	public Gerente(String cpf, String login) {
		super(cpf, login);
		// TODO Auto-generated constructor stub
	}


	public double getSalario() {
		return salario;
	}


	@Override
	public String toString() {
		return "Gerente [getSalario()=" + getSalario() + ", " + super.toString() + "]";
	}

	




	
}
