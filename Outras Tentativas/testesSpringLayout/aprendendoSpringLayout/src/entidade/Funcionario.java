package entidade;

public class Funcionario extends UsuarioAbstract{
	private String matricula;

	public Funcionario(String nome, String cpf, String telefone, String email, String matricula) {
		super(nome, cpf, telefone, email);
		this.matricula = matricula;
		// TODO Auto-generated constructor stub
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	
	
}
