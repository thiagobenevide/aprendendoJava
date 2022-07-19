package model;

public class Administrador extends Usuario {

	private String matricula;

	public Administrador(String nome, String cpf, String telefone, String email, String sexo, String login,
			String senha, String matricula) {
		super(nome, cpf, telefone, email, sexo, login, senha);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Administrador [matricula=" + matricula + ", getLogin()=" + getLogin() + ", getSenha()=" + getSenha()
				+ ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getTelefone()=" + getTelefone()
				+ ", getEmail()=" + getEmail() + ", getSexo()=" + getSexo() + "]";
	}
	
	
	
}
