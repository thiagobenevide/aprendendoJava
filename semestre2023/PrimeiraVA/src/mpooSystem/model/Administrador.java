package mpooSystem.model;

public class Administrador extends Usuario{
	private String chaveAcesso;

	
	
	public Administrador(String nome, String cpf, String sexo, String login, String senha, String chaveAcesso) {
		super(nome, cpf, sexo, login, senha);
		this.chaveAcesso = chaveAcesso;
	}

	public Administrador(String nome, String cpf, String sexo, String login, String senha) {
		super(nome, cpf, sexo, login, senha);
		// TODO Auto-generated constructor stub
	}

	public Administrador(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}

	public String getChaveAcesso() {
		return chaveAcesso;
	}

	public void setChaveAcesso(String chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}
	
	
	
	
	
	
}
