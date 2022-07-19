package model;

public class Funcionario extends Pessoa {

	private String matricula;

	public Funcionario(String nome, String cpf, String telefone, String email, String sexo, String matricula) {
		super(nome, cpf, telefone, email, sexo);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", getNome()=" + getNome() + ", getCpf()=" + getCpf()
				+ ", getTelefone()=" + getTelefone() + ", getEmail()=" + getEmail() + ", getSexo()=" + getSexo() + "]";
	}
	
	
	
}
