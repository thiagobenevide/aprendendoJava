package model;

import java.util.Date;

public class Funcionario extends UsuarioAbstract {
	
	private int matricula;

	public Funcionario(String nome, String senha, String cpf,
			Date dataNascimento, int matricula) {
		super(nome, senha, cpf, dataNascimento);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
