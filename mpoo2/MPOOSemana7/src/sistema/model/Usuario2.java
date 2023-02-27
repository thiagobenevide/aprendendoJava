
package sistema.model;

public abstract class Usuario2 extends Pessoa {

	private String login;
	private String senha;
//	public int cpf; //n�o � aconselh�vel! Sobreposi��o de atributo
	
//	public Usuario(String nome, String cpf, String login, String senha) {
//		super(nome, cpf);
//		this.login = login;
//		this.senha = senha;
//	}
	
//	public Usuario(String nome, String cpfString, String email, String login, String senha, int cpfInt) {
//		super(nome, cpfString, email);
//		this.login = login;
//		this.senha = senha;
//		this.cpf=cpfInt;
//	}
	
	public Usuario2(String nome, String cpf, String email, String login, String senha) {
		super(nome, cpf, email);
		this.login = login;
		this.senha = senha;
	
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	//tenho um m�todo e quero redefini-lo: sobreescrita: Heran�a-Polimorfismo
	public String exibirDados() {
		//return
		return "Exibir outra coisa";
	}

//	public int getCpf_2() { //sobreescrita n�o admite mudar o tipo de retorno!
//		return cpf;
//	}
//

}
