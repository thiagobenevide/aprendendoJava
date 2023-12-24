package model;

public class Funcionario2 extends UsuarioAbstract3 {
	private double salario;
	private String matricula;
	
	public Funcionario2(String nome, String cpf, String telefone, String email, String senha) {
		super(nome, cpf, telefone, email, senha);
		// TODO Auto-generated constructor stub
	}
	public Funcionario2(String nome, String cpf, String telefone, String email, String senha, double salario,
			String matricula) {
		super(nome, cpf, telefone, email, senha);
		this.salario = salario;
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
}
