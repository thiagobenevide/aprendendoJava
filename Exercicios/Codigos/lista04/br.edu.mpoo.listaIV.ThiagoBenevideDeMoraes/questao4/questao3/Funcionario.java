package questao3;

public class Funcionario extends Pessoa{
	private double salario;
	private String matricula;
	
	public Funcionario(String nome, String cpf, String telefone, String email, double salario, String matricula) {
		super(nome, cpf, telefone, email);
		this.salario = salario;
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
}
