package model;

public class Funcionario extends UsuarioAbstract {

	private String matricula;


	public Funcionario(String login, String senha, String nome, String cpf, String telefone, String email, String sexo,
			String matricula) {
		super(login, senha, nome, cpf, telefone, email, sexo);
		this.matricula = matricula;
	}


	public String getMatricula() {
		return matricula;
	}
	
}
