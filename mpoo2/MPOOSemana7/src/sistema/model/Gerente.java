package sistema.model;

public class Gerente extends Funcionario{
	private String senhaGerente;

	public Gerente(String nome, String cpf, String email, String login,
			String senha, String matricula, double salario, String senhaGerente) {
		super(nome, cpf, email, login, senha, matricula, salario);
		this.senhaGerente = senhaGerente;
	}

	public String getSenhaGerente() {
		return senhaGerente;
	}

	public void setSenhaGerente(String senhaGerente) {
		this.senhaGerente = senhaGerente;
	}
	
	


}
