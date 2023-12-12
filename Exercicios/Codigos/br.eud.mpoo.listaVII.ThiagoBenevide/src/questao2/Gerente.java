package questao2;

public class Gerente extends Funcionario{

	public Gerente(String cpf, String login) {
		super(cpf, login);
		// TODO Auto-generated constructor stub
	}

		
	@Override
	public void calcularSalario() {
		setSalario(getSalariobase());
		
	}


	@Override
	public String toString() {
		return "Gerente [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
}
