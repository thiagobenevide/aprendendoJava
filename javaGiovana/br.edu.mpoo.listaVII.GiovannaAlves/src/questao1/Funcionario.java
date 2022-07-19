package questao1;

public class Funcionario extends UsuarioAbstract {
	
	private String matricula;

	public Funcionario(String nome, String cpf, String telefone, String email, String matricula) {
		super(nome, cpf, telefone, email);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", getNome()=" + getNome() + ", getCpf()=" + getCpf()
				+ ", getTelefone()=" + getTelefone() + ", getEmail()=" + getEmail() + "]";
	}
	
}
