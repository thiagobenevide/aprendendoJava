package model;

public class Funcionario extends UsuarioAbstract {

	private String matricula;

	public Funcionario(String nome, String cpf, String telefone, String email, String sexo, String matricula) {
		super(nome, cpf, telefone, email, sexo);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}
	
}
