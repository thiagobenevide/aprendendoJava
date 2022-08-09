package sistema;

import java.util.Date;

public class Funcionario extends Pessoa {
	private double salario;
	private int codMatricula;
	
	public Funcionario(String nome, 
			Telefone telefone, 
			Endereco endereco, 
			String sexo, 
			String cpf, 
			Date dataNascimento,
			double voucher, 
			double salario, 
			int codMatricula) 
			{
				super(nome, telefone, endereco, sexo, cpf, dataNascimento, voucher);
				this.salario = salario;
				this.codMatricula = codMatricula;
			}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getCodMatricula() {
		return codMatricula;
	}
	public void setCodMatricula(int codMatricula) {
		this.codMatricula = codMatricula;
	}
	
	
}
