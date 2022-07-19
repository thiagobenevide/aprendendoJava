package questao3;

public abstract class Empregado implements Pagamento {

	private String nome;
	private String cpf;
	private double salario;
	
	public Empregado(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
}
