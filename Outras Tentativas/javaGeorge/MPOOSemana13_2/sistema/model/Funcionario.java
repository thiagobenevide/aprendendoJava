package model;

import java.util.Date;

public class Funcionario extends UsuarioAbstract{

	public Funcionario(String nome, String senha, String cpf,
			Date dataNascimento) {
		super(nome, senha, cpf, dataNascimento);
	}
}
