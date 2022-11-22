package sistemaSupermercado;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	
	
	
	public Funcionario(Supermercado supermercado) {
		super();
	}
	
	public Funcionario(Supermercado supermercado, String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public Funcionario(Supermercado supermercado, String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Funcionario(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public abstract void calcularSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
