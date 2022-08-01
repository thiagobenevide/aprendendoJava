package entidades;

import java.util.Date;

public class Funcionario extends Pessoa {
	private int codMatricula;
	private double salario;
	
	
	public Funcionario(String nome, Telefone telefone, Endereco endereco, String sexo, String cpf, Date dataNascimento,
			double voucher, int codMatricula, double salario) {
		super(nome, telefone, endereco, sexo, cpf, dataNascimento, voucher);
		this.setCodMatricula(codMatricula);
		this.setSalario(salario);
	}

	
	
	
	
	public int getCodMatricula() {
		return codMatricula;
	}


	public void setCodMatricula(int codMatricula) {
		this.codMatricula = codMatricula;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
